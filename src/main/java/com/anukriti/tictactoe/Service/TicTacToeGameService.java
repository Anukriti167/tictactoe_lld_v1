package com.anukriti.tictactoe.Service;

import com.anukriti.tictactoe.Model.Board;
import com.anukriti.tictactoe.Model.Player;
import com.anukriti.tictactoe.Model.Position;
import com.anukriti.tictactoe.Model.Symbol;
import com.anukriti.tictactoe.State.Context.GameContext;
import com.anukriti.tictactoe.State.GameState;
import com.anukriti.tictactoe.State.Implementation.OWonState;
import com.anukriti.tictactoe.State.Implementation.XWonState;
import com.anukriti.tictactoe.Strategy.PlayerStrategy;

public class TicTacToeGameService implements BoardGames{
    private Board board;
    private Player playerX;
    private Player playerO;
    private Player currentPlayer;
    private GameContext gameContext;
    public TicTacToeGameService(PlayerStrategy xStrategy, PlayerStrategy yStrategy, int rows, int columns){
        this.board = new Board(rows, columns);
        playerX = new Player(Symbol.X, xStrategy);
        playerO = new Player(Symbol.O, yStrategy);
        currentPlayer = playerX;
        gameContext = new GameContext();
    }

    @Override
    public void play() {
        do{
            board.printBoard();
            Position move = currentPlayer.getPlayerStrategy().makeMove(board);
            board.makeMove(move, currentPlayer.getSymbol());
            board.checkGameState(gameContext, currentPlayer);
            switchPlayer();
        } while (!gameContext.isGameOver());
        announceResult();
    }

    private void announceResult() {
        GameState state = gameContext.getCurrentState();
        board.printBoard();
        if(state instanceof XWonState){
            System.out.println("Player X Wins!");
        } else if (state instanceof OWonState) {
            System.out.println("Player O Wins!");
        } else {
            System.out.println("Its a draw!");
        }
    }

    private void switchPlayer() {
        currentPlayer = (currentPlayer == playerX) ? playerO : playerX;
    }
}
