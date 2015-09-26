package examScore;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;
public class ExamScore {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		try{
			scanner.nextLine();
			scanner.nextLine();
			scanner.nextLine();
			String line = scanner.nextLine();
			Map<String, Map<String, Double>> studentScore = new TreeMap<String, Map<String, Double>>();
			while(!line.substring(0, 1).equals("-")){
				String[] student = line.split("\\|");
				
				if (!studentScore.containsKey(student[2].trim())){
					Map<String, Double> studentGrade = new TreeMap<String, Double>();
					studentGrade.put(student[1].trim(), Double.parseDouble(student[3].trim()));
					studentScore.put(student[2].trim(), studentGrade);
				}
				else{
					Map<String, Double> studentGrade = studentScore.get(student[2].trim());
					studentGrade.put(student[1].trim(), Double.parseDouble(student[3].trim()));
					studentScore.put(student[2].trim(), studentGrade);
				}
					
				line = scanner.nextLine();
			}
			
			for(String key: studentScore.keySet()){
				double avg = 0.0;
				String names = "";
				for(String name: studentScore.get(key).keySet()){
					avg += studentScore.get(key).get(name);
					names += name + ", ";  
				}
				if (names.endsWith(", ")){
					names = names.substring(0, names.length() - 2);
				}
				System.out.printf("%s -> [%s]; avg=%.2f", key, names, avg / studentScore.get(key).keySet().size());
				
				System.out.println();
			}

		}
		finally{
			scanner.close();
		}

	}

}
