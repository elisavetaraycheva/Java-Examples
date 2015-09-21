package sunlight;

import java.util.Scanner;
public class Sunlight {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		try{
			int n = scanner.nextInt();
			char[][] sun = new char[3 * n / 2][3 * n];
			for(int i = 0; i < n * 3 / 2; i++){
				
				for(int j = 0; j < n; j++){
					if ((i == 3 * n / 2) || (i == j && i > 0)) {
						sun[i][j] = '*';
					}
					else{
						sun[i][j] = '.';
					}
				}
				
				for(int j = n; j < 2 * n; j++){
					if (((i >= n) && (i < 2 * n)) || (j == 3 * n / 2)){
						sun[i][j] = '*';
					}
					else{
						sun[i][j] = '.';
					}
				}
				for(int j = 2 * n; j < 3 * n; j++){
					if ((i == 3 * n / 2) || (i == 3 * n - 1 - j  && i > 0)){
						sun[i][j] = '*';
					}
					else
					{
						sun[i][j] = '.';
					}
				}
			}
			
			for(int i = 0; i < 3 * n / 2; i++){
				for(int j = 0; j < 3 * n; j++){
					System.out.print(sun[i][j]);
				}
				System.out.println();
			}
			for(int i = 0; i < 3 * n; i++){
				System.out.print("*");
			}
			System.out.println();
			
			for(int i = 3 * n / 2 - 1; i >= 0; i--){
				for(int j = 0; j < 3 * n; j++){
					System.out.print(sun[i][j]);
				}
				System.out.println();
			}
			
		}
		finally{
			scanner.close();
		}
		
	}

}
