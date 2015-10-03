package cartesianCoordinateSystem;

import java.math.BigDecimal;
import java.util.Scanner;
public class CartesianCoordinateSystem {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		try{
			BigDecimal x = scanner.nextBigDecimal();
			BigDecimal y = scanner.nextBigDecimal();
			if ((x.compareTo(new BigDecimal("0")) == 0) && (y.compareTo(new BigDecimal("0")) == 0)){
				System.out.println(0);
			}
			else if (x.compareTo(new BigDecimal("0")) == 0){
				System.out.println(5);
			}
			else if (y.compareTo(new BigDecimal("0")) == 0){
				System.out.println(6);
			}
			else if ((x.compareTo(new BigDecimal("0")) < 0) && (y.compareTo(new BigDecimal("0")) < 0)){
				System.out.println(3);
			}
			else if ((x.compareTo(new BigDecimal("0")) > 0) && (y.compareTo(new BigDecimal("0")) > 0)){
				System.out.println(1);
			}
			else if ((x.compareTo(new BigDecimal("0")) > 0) && (y.compareTo(new BigDecimal("0")) < 0)){
				System.out.println(4);
			}
			else if ((x.compareTo(new BigDecimal("0")) < 0) && (y.compareTo(new BigDecimal("0")) > 0)){
				System.out.println(2);
			}
		}
		finally{
			scanner.close();
		}
	}

}
