package dozenOfEggs;

import java.util.*;
public class ActivityTracker {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int linesCount = scanner.nextInt();
		scanner.nextLine();
		
		Map<String, Map<String, Double>> tracker = new TreeMap<String, Map<String, Double>>();
		for(int i = 0; i < linesCount; i++){
			String line = scanner.nextLine();
			line = line.substring(3);
			String[] items = line.split(" ");
			if (!tracker.containsKey(items[0])){
				Map<String, Double> temp = new TreeMap<String, Double>();
				temp.put(items[1], Double.parseDouble(items[2]));
				tracker.put(items[0], temp);
			}
			else{
				Map<String, Double> temp = tracker.get(items[0]);
				if (!temp.containsKey(items[1])){
					temp.put(items[1], Double.parseDouble(items[2]));
				}
				else{
					double a = temp.get(items[1]) + Double.parseDouble(items[2]);
					temp.put(items[1], a);
				}
				tracker.put(items[0], temp);
			}
				
		}

		//System.out.println(tracker);
		
		for (String key : tracker.keySet()) {
		  System.out.print(Integer.parseInt(key.substring(0, 2)) + ": ");
		  int i = 0;
		  for(String a: tracker.get(key).keySet()){
			  if (i > 0){
				  System.out.print(", ");
			  }
			  System.out.print(String.format("%s(%.0f)", a, tracker.get(key).get(a)));
			  i++;
		  }
		  System.out.println();
		}

		
	}

}
