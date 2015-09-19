package dozenOfEggs;

import java.util.*;
public class PythagoreanNumbers {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		try{
			boolean hasPythagoreanNumbers = false;
			int numbersCount = scanner.nextInt();
			int[] numbers = new int[numbersCount];
			for(int i = 0; i < numbersCount; i++){
				numbers[i] = scanner.nextInt();
			}
			Arrays.sort(numbers);
			for(int i = 0; i < numbersCount; i++){
				for(int j = i; j < numbersCount; j++){
					for(int k = 0; k < numbersCount; k++){
						if (numbers[i] * numbers[i] + numbers[j] * numbers[j] == numbers[k] * numbers[k]){
							System.out.println(String.format("%d*%d + %d*%d = %d*%d", numbers[i], numbers[i], numbers[j], numbers[j], numbers[k], numbers[k]));
							hasPythagoreanNumbers = true;
						}
					}	
				}	
			}
			if (!hasPythagoreanNumbers){
				System.out.println("No");
			}
				
		}
		finally{
			scanner.close();
		}
		

	}

}
