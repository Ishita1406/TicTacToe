package com.example.tictactoesst.models;

import java.util.List;

public class Game {
    private Board board;
    private List<Player> player;
    private int nextPlayerMoveIndex;
    private List<Moves> moves;
    private GameState gameState;
    private Player winner;
}
