public class WhileCounter
{
	public static void main(String[] agrs) {
		int counter = 1;
		while (counter <= 10) {
			System.out.printf("%d ", counter);
			++counter;
		}
		System.out.println();
	}
}