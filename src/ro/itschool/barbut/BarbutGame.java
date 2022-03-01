package ro.itschool.barbut;

import java.util.Scanner;

public class BarbutGame {
    private JucatorBarbut player1 = new JucatorBarbut();
    private JucatorBarbut player2 = new JucatorBarbut();

    public BarbutGame() {

    }

    private void checkWinner(JucatorBarbut player1, JucatorBarbut player2) {
        if (player1.getDicesResult() == player2.getDicesResult()) {
            System.out.println("is a draw");
        } else if (player1.getDicesResult() > player2.getDicesResult()) {
            System.out.println("player1 wins");
        } else {
            System.out.println("player2 wins");
        }
    }

    public void startGame() {
        System.out.println("player1 rolled " + player1.getDicesResult());
        System.out.println("player2 rolled " + player2.getDicesResult());
        checkWinner(player1, player2);
    }


}
