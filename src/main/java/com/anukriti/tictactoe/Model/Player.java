package com.anukriti.tictactoe.Model;

import com.anukriti.tictactoe.Strategy.PlayerStrategy;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class Player {
    private Symbol symbol;
    private PlayerStrategy playerStrategy;
}
