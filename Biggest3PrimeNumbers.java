package dozenOfEggs;

import java.util.*;
public class Biggest3PrimeNumbers {

	public static void main(String[] args) {
		Scanner scanner =  new Scanner(System.in);
		String line = scanner.nextLine();
		
		String[] digits = line.split("[( )]+");
		ArrayList<Integer> primeNumbers = new ArrayList<Integer>();
 
		for(int i = 0; i < digits.length; i++){
			if(!digits[i].trim().equals("")){
				int number = Integer.parseInt(digits[i].trim());
				if (IsPrime(number))
					if (primeNumbers.indexOf(number) == -1)
						primeNumbers.add(number);
			}
		}
		
		Collections.sort(primeNumbers);
		int cnt = primeNumbers.size();
		if (cnt < 3)
			System.out.println("No");
		else	
			System.out.println(primeNumbers.get(cnt - 1) + primeNumbers.get(cnt - 2) + primeNumbers.get(cnt - 3));
		
		
	}
	
	public static boolean IsPrime(int number){
		if (number <= 1)
			return false;
		if (number == 2)
			return true;
		for(int i = 2; i < number - 1; i++){
			if ((number % i) == 0)
				return false;
		}
			
		return true;
	}

}
