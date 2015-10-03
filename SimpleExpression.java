package simpleExpression;

import java.util.Locale;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.math.BigDecimal;

public class SimpleExpression {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		try{
			String line = scanner.nextLine();
			String pattern = "[-]{0,1}\\s*[\\d.]+";

		      // Create a Pattern object
		    Pattern r = Pattern.compile(pattern);
		    Matcher m = r.matcher(line);
		    
			BigDecimal sum = new BigDecimal(0);
			while(m.find()) {
				String number = m.group(0).trim();
				
				if (number.contains("-")){
					number = number.replace("-", " ").trim();	
					sum = sum.subtract(BigDecimal.valueOf(Double.parseDouble(number)));
				}
				else{
					sum = sum.add(BigDecimal.valueOf(Double.parseDouble(number))); 
				}
		     }
			
			System.out.printf(Locale.US, "%.7f", sum);
		}
		finally{
			scanner.close();
		}

	}

}
