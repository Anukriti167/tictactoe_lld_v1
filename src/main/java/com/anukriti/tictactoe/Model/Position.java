package com.anukriti.tictactoe.Model;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Position {
    int row;
    int col;

    @Override
    public String toString(){
        return "(" + row + "," + col + ")";
    }

    @Override
    public boolean equals(Object obj){
        if(this == obj) return true;
        if(!(obj instanceof Position)) return false; //If the other obj is not position
        Position other = (Position) obj;
        return this.row == other.row && this.col == other.col;
    }

    @Override
    public int hashCode(){
        return 31 * row + col;
    }
}
