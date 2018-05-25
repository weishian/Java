//import java.util.Scanner;
import javax.swing.JOptionPane;

public class Addition
{
	public static void main( String[] args )
	{
		/*
		Scanner input = new Scanner( System.in );
		
		int number1;
		int number2;
		int sum;
		System.out.print("Enter first integer: ");
		number1 = input.nextInt();
		
		System.out.print("Enter second integer: ");
		number2 = input.nextInt();
		
		sum = number1 + number2;
		
		System.out.printf( "Sum is %d\n", sum);
		
		input.close();
		*/
		String firstNumber = JOptionPane.showInputDialog("Enter first integer");
		String secondNumber = JOptionPane.showInputDialog("Enter second integer");
		
		int number1 = Integer.parseInt(firstNumber);
		int number2 = Integer.parseInt(secondNumber);
		
		int sum = number1 + number2;
		
		JOptionPane.showMessageDialog(null, "The sum is " + sum, "Sum of Two Integers", JOptionPane.PLAIN_MESSAGE);
	}
}