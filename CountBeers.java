package countBeers;

import java.util.Scanner;

public class CountBeers {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		try{
			String line = scanner.nextLine();
			int totalBeers = 0;
			while(! line.toUpperCase().equals("END")){
				String[] beers = line.split(" ");
				if (beers[1].equals("stacks")){
					totalBeers += Integer.parseInt(beers[0]) * 20;
				}
				else{
					totalBeers += Integer.parseInt(beers[0]);
				}
				line = scanner.nextLine();
			}
			System.out.printf("%d stacks + %d beers", totalBeers / 20, totalBeers % 20);
		}
		finally{
			scanner.close();
		}
		
		

	}

}
