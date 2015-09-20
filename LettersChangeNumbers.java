package lettersChangeNumbers;

import java.util.Scanner;
public class LettersChangeNumbers {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		try{
			String sLine = scanner.nextLine();
			String[] words = sLine.split("\\s+");
			double totalSum = 0.0;
			for(String word: words){
				byte a = word.getBytes()[0];
				byte b = word.getBytes()[word.length() - 1];
				double c = Integer.parseInt(word.substring(1, word.length() - 1));
				double total = 0;
				if (a < 97){
					// upper
					total = c / (a - 64); 
				}
				else{
					total = c * (a - 96);
				}
				
				if (b < 97){
					// upper
					total = total - (b - 64); 
				}
				else{
					total = total + (b - 96);
				}
				
				totalSum += total;
			}
			System.out.printf("%.2f", totalSum);
		}
		finally{
			scanner.close();
		}

	}

}
