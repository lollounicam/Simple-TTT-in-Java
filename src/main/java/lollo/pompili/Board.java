package lollo.pompili;

public class Board {
    private static final char[][] cells = new char[3][3];
    public Board() {
        for (int r = 0; r < 3; r++) {
            for (int c = 0; c < 3; c++) {
                cells[r][c] = '-';
            }
        }

    }

    public static void print() {
        for (int r = 0; r < 3; r++) {
            StringBuilder line = new StringBuilder();
            for (int c = 0; c < 3; c++) {
                line.append('[').append(cells[r][c]).append(']');
            }
            System.out.println(line);
        }
    }

    // optional: method to place a mark, if needed later
    public static void setCell(int row, int col, char mark) {
        cells[row][col] = mark;
    }

    public static Boolean checkVictory(Board board) {
        // Check rows
        for (int r = 0; r < 3; r++) {
            char a = cells[r][0];
            char b = cells[r][1];
            char c = cells[r][2];
            if (a != '-' && a == b && b == c) {
                return true;
            }
        }
        // Check columns
        for (int c = 0; c < 3; c++) {
            char a = cells[0][c];
            char b = cells[1][c];
            char d = cells[2][c];
            if (a != '-' && a == b && b == d) {
                return true;
            }
        }
        // Check diagonals
        char center = cells[1][1];
        if (center != '-') {
            // main diagonal
            if (cells[0][0] == center && cells[2][2] == center) {
                return true;
            }
            // anti-diagonal
            if (cells[0][2] == center && cells[2][0] == center) {
                return true;
            }
        }
        return false;
    }

    // optional: getter if needed
    public char getCell(int row, int col) {
        return cells[row][col];
    }


}