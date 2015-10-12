package exam;

import java.util.ArrayList;
import java.util.Scanner;
public class DragonTrap {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		try{
			int countLines = scanner.nextInt();
			int countCol = 0;
			scanner.nextLine();
			char[][] matrix = new char[countLines][];
			char[][] resultMatrix = new char[countLines][];
			for(int i = 0; i < countLines; i++){
				matrix[i] = scanner.nextLine().toCharArray();
				resultMatrix[i] = matrix[i];
				countCol = matrix[i].length;
			}
			int countChangeSymbol = 0;
			String line = scanner.nextLine();
			while(!line.toUpperCase().equals("END")){
				line = line.replace("(", "");
				line = line.replace(")", "");
				String[] params = line.split(" ");
				int row = Integer.parseInt(params[0]);
				int column = Integer.parseInt(params[1]);
				int radius = Integer.parseInt(params[2]);
				int rotations = Integer.parseInt(params[3]);
				
				int startI = row - radius;
				int endI = row + radius;
				int startJ = column - radius;
				int endJ = column + radius;
				ArrayList<Character> chars = new ArrayList<Character>();
				
				for(int i = 0; i < countLines; i++){
					for(int j = 0; j < countCol; j++){
						// горе
						if ((i == startI) && (j > startJ && j < endJ)){
							chars.add(matrix[i][j]);
						}		
					}
				}
				for(int i = 0; i < countLines; i++){
					for(int j = 0; j < countCol; j++){	
						// дясно
						if ((i >= startI && i <= endI) && (j == endJ)){
							chars.add(matrix[i][j]);
						}
					}
				}
				for(int i = countLines - 1; i > -1; i--){
					for(int j = countCol - 1; j > -1; j--){						
						// долу
						if((i == endI) && (j > startJ && j < endJ)){
							chars.add(matrix[i][j]);
						}
					}
				}
				for(int i = countLines - 1; i > -1; i--){
					for(int j = countCol - 1; j > -1; j--){						
						// ляво
						if ((i >= startI && i <= endI) && (j == startJ)){
							chars.add(matrix[i][j]);
						}
					}
				}
				
				int k = chars.size() - 1;
				for(int i = 0; i < countLines; i++){
					for(int j = 0; j < countCol; j++){
						// горе
						if ((i == startI) && (j > startJ && j < endJ)){
							if (resultMatrix[i][j] != chars.get(k)){
								countChangeSymbol++;
							}
							resultMatrix[i][j] = chars.get(k);
							k++;
							if (k > chars.size() - 1)
								k = 0;
						}		
					}
				}
				for(int i = 0; i < countLines; i++){
					for(int j = 0; j < countCol; j++){	
						// дясно
						if ((i >= startI && i <= endI) && (j == endJ)){
							if (resultMatrix[i][j] != chars.get(k)){
								countChangeSymbol++;
							}
					
							resultMatrix[i][j] = chars.get(k);
							k++;
							if (k > chars.size() - 1)
								k = 0;
						}
					}
				}
				for(int i = countLines - 1; i > -1; i--){
					for(int j = countCol - 1; j > -1; j--){						
						// долу
						if((i == endI) && (j > startJ && j < endJ)){
							if (resultMatrix[i][j] != chars.get(k)){
								countChangeSymbol++;
							}
					
							resultMatrix[i][j] = chars.get(k);
							k++;
							if (k > chars.size() - 1)
								k = 0;
						}
					}
				}
				for(int i = countLines - 1; i > -1; i--){
					for(int j = countCol - 1; j > -1; j--){						
						// ляво
						if ((i >= startI && i <= endI) && (j == startJ)){
							if (resultMatrix[i][j] != chars.get(k)){
								countChangeSymbol++;
							}
					
							resultMatrix[i][j] = chars.get(k);
							k++;
							if (k > chars.size() - 1)
								k = 0;
						}
					}
				}
				
				line = scanner.nextLine();
			}
			// print matrix
			for(int i = 0; i < countLines; i++){
				for(int j = 0; j < matrix[i].length; j++){
					System.out.print(resultMatrix[i][j]);
				}
				System.out.println();
			}
			System.out.printf("Symbols changed: %d", countChangeSymbol);
		}
		finally{
			scanner.close();
		}
	}

}
