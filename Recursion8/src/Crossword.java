import java.util.Scanner;

public class Crossword {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		char[][] board = new char[10][10];
		for (int i = 0; i < 10; i++) {
			board[i] = scn.nextLine().toCharArray();
		}
		String[] words = scn.nextLine().split(";");
		crossword(board, words, 0);
	}

	// attack by words
	public static void crossword(char[][] board, String[] words, int wsf) {
		if (wsf == words.length) {
			for (int i = 0; i < board.length; i++) {
				for (int j = 0; j < board.length; j++) {
					System.out.print(board[i][j]);
				}
				System.out.println();
			}
			return;
		}

		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board.length; j++) {
				if (board[i][j] == '-' || board[i][j] == words[wsf].charAt(0)) {
					if (canPlaceWordV(board, i, j, words[wsf]) == true) {
						boolean[] reset = placeWordV(board, i, j, words[wsf]);
						crossword(board, words, wsf + 1);
						unPlaceV(board, i, j, reset);
					}

					if (canPlaceWordH(board, i, j, words[wsf]) == true) {
						boolean[] reset = placeWordH(board, i, j, words[wsf]);
						crossword(board, words, wsf + 1);
						unPlaceH(board, i, j, reset);
					}
				}
			}
		}
		
		
	}

	public static boolean canPlaceWordV(char[][] board, int i, int j, String word) {
		if (i > 0 && board[i - 1][j] != '+') {
			return false;
		} else if (i + word.length() < board.length && board[i + word.length()][j] != '+') {
			return false;
		}
		for (int r = 0; r < word.length(); r++) {
			if (i + r == board.length || (board[i + r][j] != '-' && board[i + r][j] != word.charAt(r))) {
				return false;
			}
		}
		return true;
	}

	public static boolean[] placeWordV(char[][] board, int i, int j, String word) {
		boolean[] ret = new boolean[word.length()];
		for (int r = 0; r < word.length(); r++) {
			if (board[i + r][j] == '-') {
				board[i + r][j] = word.charAt(r);
				ret[r] = true;
			}
		}
		return ret;

	}

	public static void unPlaceV(char[][] board, int i, int j, boolean[] reset) {
		for (int r = 0; r < reset.length; r++) {
			if (reset[r])
				board[i + r][j] = '-';
		}
	}

	public static boolean canPlaceWordH(char[][] board, int i, int j, String word) {
		if (j > 0 && board[i][j - 1] != '+') {
			return false;
		} else if (j + word.length() < board.length && board[i][j + word.length()] != '+') {
			return false;
		}
		for (int r = 0; r < word.length(); r++) {
			if (j + r == board.length || (board[i][j + r] != '-' && board[i][j + r] != word.charAt(r))) {
				return false;
			}
		}
		return true;
	}

	public static boolean[] placeWordH(char[][] board, int i, int j, String word) {
		boolean[] ret = new boolean[word.length()];
		for (int r = 0; r < word.length(); r++) {
			if (board[i][j + r] == '-') {
				board[i][j + r] = word.charAt(r);
				ret[r] = true;
			}
		}
		return ret;

	}

	public static void unPlaceH(char[][] board, int i, int j, boolean[] reset) {
		for (int r = 0; r < reset.length; r++) {
			if (reset[r])
				board[i][j + r] = '-';
		}
	}

}
