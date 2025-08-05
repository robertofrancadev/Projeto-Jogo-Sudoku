public class Board {
    private int[][] board;

    public Board() {
        board = new int[9][9];
        generateSampleBoard();
    }

    private void generateSampleBoard() {
        board[0][0] = 5;
        board[0][1] = 3;
        board[1][0] = 6;
    }

    public void printBoard() {
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                System.out.print((board[i][j] == 0 ? "." : board[i][j]) + " ");
            }
            System.out.println();
        }
    }

    public boolean setNumber(int row, int col, int number) {
        if (row >= 0 && row < 9 && col >= 0 && col < 9 && number > 0 && number <= 9) {
            board[row][col] = number;
            return true;
        }
        return false;
    }
}
