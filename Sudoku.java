import java.util.Scanner;

public class Sudoku {
    private Board board;

    public Sudoku() {
        board = new Board();
    }

    public void play() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bem-vindo ao Sudoku!");
        while (true) {
            board.printBoard();
            System.out.print("Digite linha (0-8), coluna (0-8) e número (1-9), ou -1 para sair: ");
            int row = scanner.nextInt();
            if (row == -1) break;
            int col = scanner.nextInt();
            int number = scanner.nextInt();
            if (!board.setNumber(row, col, number)) {
                System.out.println("Entrada inválida, tente novamente.");
            }
        }
        System.out.println("Jogo encerrado.");
    }
}
