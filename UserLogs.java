package userLogs;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;
public class UserLogs {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		try{
			Map<String, Map<String, Integer>> log = new TreeMap<String, Map<String, Integer>>();
			String line = scanner.nextLine();
			while(!line.toUpperCase().equals("END")){
				String[] parts = line.split("=");
				String user = parts[3];
				String ip = parts[1].substring(0, parts[1].length() - " message".length());
				if (!log.containsKey(user)){
					Map<String, Integer> ips = new LinkedHashMap<String, Integer>();
					ips.put(ip, 1);
					log.put(user, ips);
				}
				else{
					Map<String, Integer> ips = log.get(user);
					if(ips.containsKey(ip)){
						int count = ips.get(ip) + 1;
						ips.put(ip, count);
					}
					else{
						ips.put(ip, 1);
					}
						
					log.put(user, ips);
				}
				line = scanner.nextLine();
			}
			for(String key: log.keySet()){
				System.out.println(key + ":");
				String sDetails = "";
				for(String ip: log.get(key).keySet()){
					sDetails += String.format("%s => %d, ", ip, log.get(key).get(ip));
				}
				if (sDetails.endsWith(", ")){
					sDetails = sDetails.substring(0, sDetails.length() - 2) + "."; 
				}
				System.out.println(sDetails);
			}
			
			
		}
		finally
		{
			scanner.close();
		}

	}

}
