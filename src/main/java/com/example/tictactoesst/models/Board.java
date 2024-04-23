package com.example.tictactoesst.models;

import lombok.Getter;
import lombok.Setter;

import java.util.List;
@Setter
@Getter
public class Board {
    private int size;
    private List<List<Cell>> cell;
}
