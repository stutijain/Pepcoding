
public class Sudoku {

	public static void main(String[] args) {

		int[][] arr = { { 3, 0, 6, 5, 0, 8, 4, 0, 0 }, { 5, 2, 0, 0, 0, 0, 0, 0, 0 }, { 0, 8, 7, 0, 0, 0, 0, 3, 1 },
				{ 0, 0, 3, 0, 1, 0, 0, 8, 0 }, { 9, 0, 0, 8, 6, 3, 0, 0, 5 }, { 0, 5, 0, 0, 9, 0, 6, 0, 0 },
				{ 1, 3, 0, 0, 0, 0, 2, 5, 0 }, { 0, 0, 0, 0, 0, 0, 0, 7, 4 }, { 0, 0, 5, 2, 0, 6, 3, 0, 0 }

		};
		sudoku(arr, 1);

	}

	public static void sudoku(int[][] arr, int bno) {
		if (bno >= arr.length * arr.length + 1) {
			for (int i = 0; i < arr.length; i++) {
				for (int j = 0; j < arr.length; j++) {
					System.out.print(arr[i][j]);
				}
				System.out.println();
			}
			return;
		}
		int row = (bno - 1) / arr.length;
		int col = (bno - 1) % arr.length;

		if (arr[row][col] == 0) {
			for (int i = 1; i <= 9; i++) {
				if (isBvalid(arr, row, col, i) == true) {
					arr[row][col] = i;
					sudoku(arr, bno + 1);
					arr[row][col] = 0;
				}
			}
		} else
			sudoku(arr, bno + 1);
	}

	public static boolean isBvalid(int[][] arr, int row, int col, int numb) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i][col] == numb)
				return false;
		}
		for (int i = 0; i < arr.length; i++) {
			if (arr[row][i] == numb)
				return false;
		}
		//find submatrix corner---> 3*r/3,c/3
		int x = 0;
		int y = 0;
		if (row % 3 == 0)
			x = row;
		else {
			for (int i = row - 1; i >= 0; i--) { 
				if (i % 3 == 0) {
					x = i;
					break;
				}
			}
		}

		if (col % 3 == 0)
			y = col;
		else {
			for (int i = col - 1; i >= 0; i--) {
				if (i % 3 == 0) {
					y = i;
					break;
				}
			}
		}
		for (int i = x; i < x + 3; i++) {
			for (int j = y; j < y + 3; j++) {
				if (arr[i][j] == numb)
					return false;
			}
		}
		return true;
	}
	//complete
	//public static void sudokuBitmask()

}
