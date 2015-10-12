package exam;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class DragonArmy {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		try{
			int countLines = scanner.nextInt();
			scanner.nextLine();
			Map<String, Map<String, String>> dragonTypes = new LinkedHashMap<String, Map<String, String>>();
			for(int i = 0; i < countLines; i++){
				String[] line = scanner.nextLine().split(" ");
				if (line[2].toUpperCase().equals("NULL")){
					line[2] = "45";
				}
				if (line[3].toUpperCase().equals("NULL")){
					line[3] = "250";
				}
				if (line[4].toUpperCase().equals("NULL")){
					line[4] = "10";
				}
				String stats = String.format("damage: %s, health: %s, armor: %s", line[2], line[3], line[4]);
				
				if (!dragonTypes.containsKey(line[0])){
					Map<String, String> dragons = new TreeMap<String, String>();
					dragons.put(line[1], stats);
					dragonTypes.put(line[0], dragons);
				}
				else{
					Map<String, String> dragons = dragonTypes.get(line[0]);
					dragons.put(line[1], stats);
					dragonTypes.put(line[0], dragons);
				}
			}
			for(String key: dragonTypes.keySet()){
				int countDragons = 0;
				double damage = 0;
				double health = 0;
				double armor = 0;
				for(String dragon: dragonTypes.get(key).keySet()){
					String[] stats = dragonTypes.get(key).get(dragon).split(", ");
					String[] stat = stats[0].split(": ");
					damage += Double.parseDouble(stat[1]);
					stat = stats[1].split(": ");
					health += Double.parseDouble(stat[1]);
					stat = stats[2].split(": ");
					armor += Double.parseDouble(stat[1]);
					
					countDragons++;
					
				}
				System.out.println(String.format("%s::(%.2f/%.2f/%.2f)", key, damage / countDragons, health / countDragons, armor / countDragons));
				for(String dragon: dragonTypes.get(key).keySet()){
					System.out.println(String.format("-%s -> %s", dragon, dragonTypes.get(key).get(dragon)));
				}
			}
			
		}
		finally{
			scanner.close();
		}

	}

}
