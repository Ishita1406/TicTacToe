package com.example.tictactoesst.models;

import lombok.Getter;
import lombok.Setter;

import java.util.List;
@Setter
@Getter

public class Game {
    private Board board;
    private List<Player> player;
    private int nextPlayerMoveIndex;
    private List<Moves> moves;
    private EGameState eGameState;
    private Player winner;
}
