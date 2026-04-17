package com.anukriti.tictactoe.State.Implementation;

import com.anukriti.tictactoe.Model.Player;
import com.anukriti.tictactoe.Model.Symbol;
import com.anukriti.tictactoe.State.Context.GameContext;
import com.anukriti.tictactoe.State.GameState;

public class OTurnState implements GameState {
    @Override
    public void next(GameContext context, Player player, boolean hasWon) {
        if(hasWon){
            context.setState(player.getSymbol() == Symbol.O? new OWonState(): new XWonState());
        }else {
            context.setState(new XTurnState());
        }
    }

    @Override
    public boolean isGameOver() {
        return false;
    }
}
