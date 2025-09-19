package lollo.pompili;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    static Board board = new Board();
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        boolean victory = false;
        int turn = 0;

        while(!victory){
            Board.print();
            System.out.println("Player: " + turn % 2);
            System.out.print("Enter the row to place your mark: ");
            int rigaScelta = sc.nextInt();
            System.out.print("Enter the column to place your mark: ");
            int colonnaScelta = sc.nextInt();

            if(checkCoord(board, rigaScelta, colonnaScelta)){
                Board.setCell(rigaScelta, colonnaScelta, getMark(turn));
                System.out.println("Valid position");
                turn++;
            }else{
                System.out.println("Invalid position");
            }
            if(Board.checkVictory(board)){
                victory = true;
                System.out.println("Player " + ((turn + 1) % 2) + " has won!");
                Board.print();
            }
        }

    }

    private static char getMark(int turn){
        return turn % 2 == 0 ? 'X' : 'O';
    }
    private static boolean checkCoord(Board board, int riga, int colonna){
        if (riga < 0 || riga > 2 || colonna < 0 || colonna > 2) {
            return false;
        }else return board.getCell(riga, colonna) == '-';
    }


}