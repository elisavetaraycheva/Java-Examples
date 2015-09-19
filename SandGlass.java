package dozenOfEggs;

import java.util.*;

public class SandGlass {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		try{
			int n = scanner.nextInt();
			int k = 0;
			for(int i = 0; i < n; i++){
				for(int j = 0; j < n; j++){
					if ((j < k)||(j >= n - k))
						System.out.printf(".");
					else
						System.out.printf("*");
				}
				System.out.println();
				if (i < n / 2)
					k++;
				else
					k--;
			}
			
		}
		finally{
			scanner.close();
		}

	}

}
