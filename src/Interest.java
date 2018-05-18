import java.math.BigDecimal;
import java.text.NumberFormat;

public class Interest
{
	public static void main(String[] agrs) {
//		double amount;
//		double principal = 1000.0;
//		double rate = 0.05;
		
		BigDecimal principal = BigDecimal.valueOf(1000.0);
		BigDecimal rate = BigDecimal.valueOf(0.05);
		
		System.out.printf("%s%20s%n", "Year", "Amount on deposit");
		
//		for (int year = 1; year <= 10; ++year) {
//			amount = principal * Math.pow(1.0 + rate, year);
//			System.out.printf("%4d%,20.2f%n", year, amount);
//		}
		
		for (int year = 1; year <= 10; year++) {
			BigDecimal amount = principal.multiply(rate.add(BigDecimal.ONE).pow(year));
			System.out.printf("%4d%20s%n", year, NumberFormat.getCurrencyInstance().format(amount));
		}
		
		
	}
}