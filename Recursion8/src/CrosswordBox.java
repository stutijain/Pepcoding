import java.util.Scanner;

public class CrosswordBox {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		char[][] board = new char[10][10];
		for (int i = 0; i < 10; i++) {
			board[i] = scn.nextLine().toCharArray();
		}
		String[] words = scn.nextLine().split(";");
		crosswordB(board, 1);

	}
	public static void crosswordB(char[][] board,int bno){
		if(bno==board.length*board.length+1){
			for(int i=0;i<board.length;i++){
				for(int j=0;j<board.length;j++){
					System.out.print(board[i][j]);
				}
				System.out.println();
			}
			return;
		}
		int row=(bno-1)/board.length;
		int col=(bno-1)%board.length;
		
		if(board[row][col]=='+') crosswordB(board,bno+1);
		else{
			if(canPlaceH(board,row,col)==true){
				boolean[] reset=placeH(board,row,col);
				crosswordB(board,bno+1);
				unplaceH(board,row,col,reset);
			}
		}
		
	}
	public static boolean[] canPlaceH(char[][] board,int i,int j){
		
	}

}
