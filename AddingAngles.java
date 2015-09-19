package dozenOfEggs;

import java.util.Scanner;

public class AddingAngles {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int CountAngles = scanner.nextInt();
		scanner.nextLine();
		String line = scanner.nextLine();
		String[] angles = line.split(" ");
		boolean IsDivisible = false;
		for(int i = 0; i < CountAngles; i++){
			for(int j = i + 1; j < CountAngles; j++){
				for(int k = j + 1; k < CountAngles; k++){
					if ((i != j) && (i != k) && (j != k)){
						int a = Integer.parseInt(angles[i]);
						int b = Integer.parseInt(angles[j]);
						int c = Integer.parseInt(angles[k]);
						if ((a + b + c) % 360 == 0){
							IsDivisible = true;
							System.out.println(String.format("%d + %d + %d = %d degrees", a, b, c, a + b + c));
						}
					}
				}
			}
			
		}
		if (!IsDivisible){
			System.out.println("No");
		}
	}
}
