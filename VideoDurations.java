package dozenOfEggs;

import java.util.*;
public class VideoDurations {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String sLine = scanner.nextLine();
		int totalMinutes = 0;
		while(!sLine.toUpperCase().equals("END")){
			
			String[] time = sLine.split(":");
			totalMinutes += Integer.parseInt(time[0]) * 60 +  Integer.parseInt(time[1]);	
			sLine = scanner.nextLine();					
		}
		
		System.out.println(String.format("%d:%02d", totalMinutes / 60, totalMinutes % 60));

	}

}
