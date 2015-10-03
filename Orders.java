package orders;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;
public class Orders {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		try{
			int countLine = scanner.nextInt();
			scanner.nextLine();
			Map<String, Map<String, Integer>> products = new LinkedHashMap<String, Map<String, Integer>>();
			for(int i = 0; i < countLine; i++){
				String line = scanner.nextLine();
				String[] lineItem = line.split(" ");
				
				if (!products.containsKey(lineItem[2])){
					Map<String, Integer> customers = new TreeMap<String, Integer>();
					customers.put(lineItem[0], Integer.parseInt(lineItem[1]));
					products.put(lineItem[2], customers);
				}
				else{
					Map<String, Integer> customers = products.get(lineItem[2]);
					if(!customers.containsKey(lineItem[0])){
						customers.put(lineItem[0], Integer.parseInt(lineItem[1]));
					}
					else{
						int quantity = customers.get(lineItem[0]) + Integer.parseInt(lineItem[1]);
						customers.put(lineItem[0], quantity);
					}
					products.put(lineItem[2], customers);
				}
			}
			
			for(String key: products.keySet()){
				String line = "";
				for(String customer: products.get(key).keySet()){
					line += String.format("%s %d, ", customer, products.get(key).get(customer));
				}
				if (line.endsWith(", ")){
					line = line.substring(0, line.length() - 2);
				}
				System.out.println(key + ": " + line);
			}
			
		}
		finally{
			scanner.close();
		}

	}

}
