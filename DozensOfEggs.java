package dozenOfEggs;

import java.util.Scanner;

public class DozensOfEggs {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int TotalEggs = 0;
		for(int i = 0; i < 7;i++){
			String[] line = scanner.nextLine().split(" ");
			if (line[1].equals("dozens")){
				TotalEggs += Integer.parseInt(line[0]) * 12;	
			}
			else{
				TotalEggs += Integer.parseInt(line[0]);
			}
		}
		scanner.close();
		
		System.out.println(String.format("%d dozens + %d eggs", TotalEggs / 12, TotalEggs % 12));
	}

}
