package magicCarNumbers;

import java.util.Scanner;
public class MagicCarNumbers {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		char[] letters = { 'A', 'B', 'C', 'E', 'H', 'K', 'M', 'P', 'T', 'X' };
		int[] letters_weights = {10, 20, 30, 50, 80, 110, 130, 160, 200, 240};
		
		try{
			int weight = scanner.nextInt();
			int carNumberweight;
			int countCars = 0;
			for(int k = 0; k < letters.length; k++){
				char x = letters[k];
				for(int l = 0; l < letters.length; l++){
					char y = letters[l];
					for(int i = 0; i < 10; i++){
						for(int j = 0; j < 10; j++){
							
							carNumberweight = 40 + 4 * i + letters_weights[k] + letters_weights[l];
							if (carNumberweight == weight){
								//System.out.println(String.format("CA%d%d%d%d%c%c", i, i, i, i, x, y));
								countCars++;
								break;
							}
							if (i != j){
								carNumberweight = 40 + i + 3 * j + letters_weights[k] + letters_weights[l];
								if (carNumberweight == weight){
									//System.out.println(String.format("CA%d%d%d%d%c%c", i, j, j, j, x, y));
									countCars++;
								}
								
								carNumberweight = 40 + 3 * i + j + letters_weights[k] + letters_weights[l];
								if (carNumberweight == weight){
									//System.out.println(String.format("CA%d%d%d%d%c%c", i, i, i, j, x, y));
									countCars++;
								}
			
								carNumberweight = 40 + 2 * i + 2 * j + letters_weights[k] + letters_weights[l];
								if (carNumberweight == weight){
									//System.out.println(String.format("CA%d%d%d%d%c%c", i, i, j, j, x, y));
									//System.out.println(String.format("CA%d%d%d%d%c%c", i, j, i, j, x, y));
									//System.out.println(String.format("CA%d%d%d%d%c%c", i, j, j, i, x, y));
									countCars += 3;
								}
							}
							
						}
					}
				}
			}
			System.out.println(countCars);
		}
		finally{
			scanner.close();
		}
	}

}
