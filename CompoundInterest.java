package compoundInterest;

import java.util.Scanner;
public class CompoundInterest {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		try{
			double p = scanner.nextDouble();
			int n = scanner.nextInt();
			double i = scanner.nextDouble();
			double f = scanner.nextDouble();
			double bankFutureValue = p * Math.pow((1 + i), n);
			double friendFutureValue = p * (1 + f);
			if (bankFutureValue < friendFutureValue){
				System.out.printf("%.2f Bank", bankFutureValue);
			}
			else{
				System.out.printf("%.2f Friend", friendFutureValue);
			}
		}
		finally{
			scanner.close();
		}
	}

}
