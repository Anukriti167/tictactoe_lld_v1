package com.anukriti.tictactoe.State;

import com.anukriti.tictactoe.Model.Player;
import com.anukriti.tictactoe.State.Context.GameContext;

public interface GameState {
    void next(GameContext context, Player player, boolean hasWon);
    boolean isGameOver();
}
