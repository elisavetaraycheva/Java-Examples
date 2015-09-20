package stashOfGandalf;

import java.util.Scanner;

public class StashOfGandalf {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		try{
			int firstMode = scanner.nextInt();
			scanner.nextLine();
			String line = scanner.nextLine().toUpperCase();
			String[] foods = line.split("[\\W_\\s]+");
			for(String food: foods){
				if(food.equals("CRAM")){
					firstMode += 2;
				}
				else if(food.equals("LEMBAS")){
					firstMode += 3;
				}
				else if(food.equals("APPLE")){
					firstMode += 1;
				}
				else if(food.equals("MELON")){
					firstMode += 1;
				}
				else if(food.equals("HONEYCAKE")){
					firstMode += 5;
				}
				else if(food.equals("MUSHROOMS")){
					firstMode += -10;
				}
				else{
					firstMode += -1;
				}
			}

			if (firstMode < -5){
				System.out.printf("%d\nAngry", firstMode);
			}
			else if((firstMode >= -5) && (firstMode <= 0)){
				System.out.printf("%d\nSad", firstMode);
			}
			else if((firstMode > 0) && (firstMode <= 15)){
				System.out.printf("%d\nHappy", firstMode);
			}
			else if(firstMode > 15){
				System.out.printf("%d\nSpecial JavaScript mood", firstMode);
			}
				
		}
		finally{
			scanner.close();
		}

	}

}
