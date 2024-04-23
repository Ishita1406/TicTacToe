package com.example.tictactoesst.models;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Cell {
    private int row;
    private int column;
    private Player player;
    private ECellState eCellState;
}
