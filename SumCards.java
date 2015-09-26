package sumCards;

import java.util.Scanner;
public class SumCards {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		try{
			String line = scanner.nextLine();
			String[] cards = line.split(" ");
			int total = 0;
			int currentTotal = 0;
			int currentCount = 0;

			String card = cards[0];
			card = card.replace('S', ' ');
			card = card.replace('H', ' ');
			card = card.replace('D', ' ');
			card = card.replace('C', ' ');
			card = card.trim();
			
			String previosCard = card;			
			for(int i = 0; i < cards.length; i++){
				card = cards[i];
				card = card.replace('S', ' ');
				card = card.replace('H', ' ');
				card = card.replace('D', ' ');
				card = card.replace('C', ' ');
				card = card.trim();
				
				if (!previosCard.equals(card)){
					if (currentCount > 1)
						currentCount = 2;
					total += currentTotal * currentCount;
					currentTotal = 0;
					currentCount = 0;
					previosCard = card;
				}
				
				switch(card){
					case "2": { currentTotal += 2; currentCount += 1; break;}
					case "3": { currentTotal += 3; currentCount += 1; break;}
					case "4": { currentTotal += 4; currentCount += 1; break;}
					case "5": { currentTotal += 5; currentCount += 1; break;}
					case "6": { currentTotal += 6; currentCount += 1; break;}
					case "7": { currentTotal += 7; currentCount += 1; break;}
					case "8": { currentTotal += 8; currentCount += 1; break;}
					case "9": { currentTotal += 9; currentCount += 1; break;}
					case "10": { currentTotal += 10; currentCount += 1; break;}
					case "J": { currentTotal += 12; currentCount += 1; break;}
					case "Q": { currentTotal += 13; currentCount += 1; break;}
					case "K": { currentTotal += 14; currentCount += 1; break;}
					case "A": { currentTotal += 15; currentCount += 1; break;}
				}
			}
			
			if (currentCount > 1)
				currentCount = 2;
			total += currentTotal * currentCount;

			
			System.out.println(total);
		}
		finally{
			scanner.close();
		}
	}

}
