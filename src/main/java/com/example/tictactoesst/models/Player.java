package com.example.tictactoesst.models;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Player {
    private String name;
    private Symbol symbol;
    private EPlayerType ePlayerType;
}
