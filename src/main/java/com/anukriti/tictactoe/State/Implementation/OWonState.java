package com.anukriti.tictactoe.State.Implementation;

import com.anukriti.tictactoe.Model.Player;
import com.anukriti.tictactoe.State.Context.GameContext;
import com.anukriti.tictactoe.State.GameState;

public class OWonState implements GameState {
    @Override
    public void next(GameContext context, Player player, boolean hasWon) {
        //Game Over, no next context
    }

    @Override
    public boolean isGameOver() {
        return true;
    }
}
