package dozenOfEggs;

import java.util.*;
import java.math.BigInteger;

public class Tribonacci {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		try{
			ArrayList<BigInteger> numbers = new ArrayList<BigInteger>();
			numbers.add(scanner.nextBigInteger());
			numbers.add(scanner.nextBigInteger());
			numbers.add(scanner.nextBigInteger());
			int index = scanner.nextInt();
			if (index == 1){
				System.out.println(numbers.get(0));
				return;
			}
			if (index == 2){
				System.out.println(numbers.get(1));
				return;
			}
			if (index == 3){
				System.out.println(numbers.get(2));
				return;
			}
			
			for(int i = 3; i < index;i++){
				numbers.add(numbers.get(i - 1).add(numbers.get(i - 2)).add(numbers.get(i - 3)));
			}
			System.out.println(numbers.get(index - 1));
		
		}
		finally{
			scanner.close();
		}

	}

}
