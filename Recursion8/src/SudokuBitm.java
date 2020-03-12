
public class SudokuBitm {

	public static void main(String[] args) {
		int[][] arr = { { 3, 0, 6, 5, 0, 8, 4, 0, 0 }, 
				        { 5, 2, 0, 0, 0, 0, 0, 0, 0 },
				        { 0, 8, 7, 0, 0, 0, 0, 3, 1 },
				        { 0, 0, 3, 0, 1, 0, 0, 8, 0 },
				        { 9, 0, 0, 8, 6, 3, 0, 0, 5 }, 
				        { 0, 5, 0, 0, 9, 0, 6, 0, 0 },
				        { 1, 3, 0, 0, 0, 0, 2, 5, 0 }, 
				        { 0, 0, 0, 0, 0, 0, 0, 7, 4 }, 
				        { 0, 0, 5, 2, 0, 6, 3, 0, 0 }
		              };
		rowbm = new int[9];
		colbm = new int[9];
		subbm = new int[9];
		for(int i = 0; i < arr.length; i++){
			for(int j = 0; j < arr.length; j++){
				if(arr[i][j] != 0){
					makethechoice(arr, i, j, arr[i][j]);
				}
			}
		}
		sudokubm(arr,1);

	}
	
	static int[] rowbm;
	static int[] colbm;
	static int[] subbm;
	
	public static void sudokubm(int[][] arr, int bno) {
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
				if (canplacebm(arr, row, col, i) == true) {
					makethechoice(arr, row, col, i);
					sudokubm(arr, bno + 1);
					unmakethechoice(arr, row, col,i);
				}
			}
		} else
			sudokubm(arr, bno + 1);
	}
	
	private static void makethechoice(int[][] arr, int row, int col, int choice) {
		rowbm[row] ^= (1 << choice);
		colbm[col] ^= (1 << choice);
		subbm[3 * (row / 3) + (col / 3)] ^= (1 << choice);
		arr[row][col] = choice;
	}
	
	private static void unmakethechoice(int[][] arr, int row, int col, int choice) {
		rowbm[row] ^= (1 << choice);
		colbm[col] ^= (1 << choice);
		subbm[3 * (row / 3) + (col / 3)] ^= (1 << choice);
		arr[row][col] = 0;
	}
	
	public static boolean canplacebm(int[][] arr,int row,int col,int i){
		int rbm=rowbm[row];
		int cbm=colbm[col];
		int sbm = subbm[3 * (row / 3) + (col / 3)];
		int obm = rbm | cbm | sbm;
		
		return ((1 << i) & obm) == 0;
	}

}
