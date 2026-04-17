package com.anukriti.tictactoe.State.Context;

import com.anukriti.tictactoe.Model.Player;
import com.anukriti.tictactoe.State.GameState;
import com.anukriti.tictactoe.State.Implementation.XTurnState;

public class GameContext {
    private GameState currentState;
    public GameContext() {
        currentState = new XTurnState();
    }

    public void setState(GameState state) {
        this.currentState = state;
    }

    public void next(Player player, boolean hasWon){
        currentState.next(this, player, hasWon);
    }

    public boolean isGameOver(){
        return currentState.isGameOver();
    }

    public GameState getCurrentState(){
        return currentState;
    }
}
