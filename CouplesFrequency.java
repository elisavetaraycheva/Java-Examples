package couplesFrequency;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
public class CouplesFrequency {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		try{
			String sLine = scanner.nextLine();
			String[] numbers = sLine.split(" ");
			Map<String, Integer> couples = new LinkedHashMap<String, Integer>();
			int totalCouple = numbers.length - 1;
			for(int i = 0; i < numbers.length - 1; i++){
				String s = String.format("%s %s", numbers[i], numbers[i + 1]);
				if (!couples.containsKey(s)){
					couples.put(s, 1);
				}
				else{
					int times = couples.get(s) + 1;
					couples.put(s, times);
				}
			}
			
			for(String key: couples.keySet()){
				System.out.println(String.format("%s -> %.2f%%", key, couples.get(key) * (100.0 / totalCouple)));

			}
		}
		finally{
			scanner.close();
		}

	}

}
