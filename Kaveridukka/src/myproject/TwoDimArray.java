package myproject;

public class TwoDimArray {
	public static void main(String[] args) {

		int rows = 4;
		int columns = 4;

		int[][] array = new int[rows][columns];

		int value = 3;
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < columns; j++) {
				array[i][j] = value;
				value++;
			}
		}

		System.out.println("The Two Dimensional array is: ");
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < columns; j++) {
				System.out.print(array[i][j] + " ");
			}
			System.out.println();
		}
	}

}