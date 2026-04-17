package com.anukriti.tictactoe.Strategy;

import com.anukriti.tictactoe.Model.Board;
import com.anukriti.tictactoe.Model.Position;

public interface PlayerStrategy {
    Position makeMove(Board board);
}
