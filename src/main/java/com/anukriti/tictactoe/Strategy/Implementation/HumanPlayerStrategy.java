package com.anukriti.tictactoe.Strategy.Implementation;

import com.anukriti.tictactoe.Model.Board;
import com.anukriti.tictactoe.Model.Position;
import com.anukriti.tictactoe.Strategy.PlayerStrategy;

import java.util.Scanner;

public class HumanPlayerStrategy implements PlayerStrategy {
    private Scanner scanner;
    private String playerName;
    public HumanPlayerStrategy(String playerName){
        this.playerName = playerName;
        this.scanner = new Scanner(System.in);
    }

    @Override
    public Position makeMove(Board board) {
        while (true){
            System.out.printf("%s, Enter your move (row [0-2] and column [0-2])", playerName);
            try{
                int row = scanner.nextInt();
                int col = scanner.nextInt();
                Position move = new Position(row, col);

                if(board.isValidMove(move)){
                    return move;
                }
                System.out.println("Invalid Move. Try Again.");
            } catch (Exception e){
                System.out.println("Invalid input. Please enter rows and columns as numbers: ");
                scanner.nextLine();
            }
        }
    }
}
