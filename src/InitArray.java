public class InitArray
{
	public static void main(String[] args) {
//		int[] array = new int[10];
		
//		int[] array = {32,27,64,18,95,14,90,70,60,37};
		
		/*
		final int ARRAY_LENGTH = 10;
		int[] array = new int[ARRAY_LENGTH];
		
		for (int counter = 0; counter < array.length; counter++) {
			array[counter] = 2 + 2 * counter;
		}
		
		System.out.printf("%s%8s%n", "Index", "Value");
		
		for (int counter = 0; counter < array.length; counter++) {
			System.out.printf("%5d%8d%n", counter, array[counter]);
		}
		*/
		
		/*
		int[][] array1 = {{1, 2, 3}, {4, 5, 6}};
		int[][] array2 = {{1, 2}, {3}, {4, 5, 6}};
		
		System.out.println("Value in array1 by row are");
		outputArray(array1);
		
		System.out.println("Value in array2 by row are");
		outputArray(array2);
		*/
		
		if (args.length != 3) {
			System.out.printf(
					"Error: Please re-enter the entire command, including%n" + 
					"an array size, initail value and increment.%n");
		}
		else {
			int arrayLength = Integer.parseInt(args[0]);
			int[] array = new int[arrayLength];
			
			int initialValue = Integer.parseInt(args[1]);
			int increment = Integer.parseInt(args[2]);
			
			for (int counter = 0; counter < array.length; counter++) {
				array[counter] = initialValue + increment * counter;
			}
			
			System.out.printf("%s%8s%n", "Index", "Value");
			
			for (int counter = 0; counter < array.length; counter++) {
				System.out.printf("%5d%8d%n", counter, array[counter]);
			}
		}
	}
	
	public static void outputArray(int[][] array) {
		for (int row = 0; row < array.length; row++) {
			for (int column = 0; column < array[row].length; column++) {
				System.out.printf("%d  ", array[row][column]);
			}
			System.out.println();
		}
	}
}