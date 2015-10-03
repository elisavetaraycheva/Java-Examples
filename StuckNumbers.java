package stuckNumbers;

import java.util.Scanner;
public class StuckNumbers {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		try{
			int numbersCount = scanner.nextInt();
			scanner.nextLine();
			String[] numbers = scanner.nextLine().split(" ");
			boolean HasStuck = false;
			for(int i = 0; i < numbersCount; i++){
				int a = Integer.parseInt(numbers[i]);
				for(int j = 0; j < numbersCount; j++){
					int b = Integer.parseInt(numbers[j]);
					if (a == b){ 
						continue;
					}
					for(int k = 0; k < numbersCount; k++){
						int c = Integer.parseInt(numbers[k]);
						if ((a == c) || (b == c)){
							continue;
						}
							
						for(int l = 0; l < numbersCount; l++){
							int d = Integer.parseInt(numbers[l]);
							
							if ((a != d) && (b != d) && (c != d)){
								String str_1 = String.format("%d%d", a, b);
								String str_2 = String.format("%d%d", c, d);
								if (str_1.equals(str_2)){
									System.out.println(String.format("%d|%d==%d|%d", a, b, c, d));
									HasStuck = true;
								}	
							}
						}
					}
				}
			}
			if (!HasStuck){
				System.out.println("No");
			}
		}
		finally{
			scanner.close();
		}

	}

}
