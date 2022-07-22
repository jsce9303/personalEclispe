package test;

public class 구구단 {

	public static void main(String[] args) {
		int[][] table = new int[9][9];
		int row, column, it;
		for (row = 0; row < 9; row++)
            for (column = 0; column < 9; column++)
                table[row][column] = (row + 1) * (column + 1);
		
		System.out.println("X   1   2   3   4   5   6   7   8   9");
		for(row = 0; row < 9; row++) {
			System.out.print(row + 1);
			for(column = 0; column < 9; column++) {
				it = table[row][column];
				if (it < 10)
					System.out.print("   " + it);
				else
					System.out.print(" " + it);
					
			}
			System.out.println();
		}

	}

}
