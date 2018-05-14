import java.security.SecureRandom;

public class RollDie 
{
	public static void main(String[] args) {
		SecureRandom randomNumbers = new SecureRandom();
		
		int frequency1 = 0;
		int frequency2 = 0;
		int frequency3 = 0;
		int frequency4 = 0;
		int frequency5 = 0;
		int frequency6 = 0;
		
		for (int roll = 1; roll <= 6000000; roll++) {
			int face = 1 + randomNumbers.nextInt(6);
			switch (face) 
			{
			case 1:
				++frequency1;
				break;
			case 2:
				++frequency2;
				break;
			case 3:
				++frequency3;
				break;
			case 4:
				++frequency4;
				break;
			case 5:
				++frequency5;
				break;
			case 6:
				++frequency6;
				break;
			}
		}
		
		System.out.println("Face\tFrequency");
		System.out.printf("1\t%d%n2\t%d%n3\t%d%n4\t%d%n5\t%d%n6\t%d%n", 
				frequency1, 
				frequency2, 
				frequency3, 
				frequency4, 
				frequency5, 
				frequency6);
		
		// User Array
		
		System.out.println("Use Array: ");
		
		int[] frequency = new int[7];
		
		for (int roll = 1; roll <= 6000000; roll++) {
			++frequency[1 + randomNumbers.nextInt(6)];
		}
		
		System.out.printf("%s%10s%n", "Face", "Frequency");
		
		for (int face = 1; face < frequency.length; face++) {
			System.out.printf("%4d%10d%n", face, frequency[face]);
		}
		
		System.out.println(frequency[0]);
		
	}
}