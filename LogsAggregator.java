package logsAggregator;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;
public class LogsAggregator {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		try{
			Map<String, Map<String, Integer>> log = new TreeMap<String, Map<String, Integer>>();
			int lineCount = scanner.nextInt();
			scanner.nextLine();
			for(int i = 0; i < lineCount; i++){
				String line = scanner.nextLine();
				String[] parts = line.split(" ");
				String user = parts[1];
				String ip = parts[0];
				int count = Integer.parseInt(parts[2]);
				if (!log.containsKey(user)){
					Map<String, Integer> ips = new TreeMap<String, Integer>();
					ips.put(ip, count);
					log.put(user, ips);
				}
				else{
					Map<String, Integer> ips = log.get(user);
					if(ips.containsKey(ip)){
						count = ips.get(ip) + count;
						ips.put(ip, count);
					}
					else{
						ips.put(ip, count);
					}
						
					log.put(user, ips);
				}
			}
			
			for(String key: log.keySet()){
				
				String sDetails = "";
				int total = 0;
				for(String ip: log.get(key).keySet()){
					total += log.get(key).get(ip);
					sDetails += String.format("%s, ", ip);
				}
				if (sDetails.endsWith(", ")){
					sDetails = sDetails.substring(0, sDetails.length() - 2); 
				}
				System.out.println(String.format("%s: %d [%s]", key, total, sDetails));
			}
			
			
		}
		finally
		{
			scanner.close();
		}

	}

}
