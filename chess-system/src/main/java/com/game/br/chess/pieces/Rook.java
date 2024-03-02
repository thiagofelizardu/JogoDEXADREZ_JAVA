package com.game.br.chess.pieces;

import com.game.br.boardgame.Board;
import com.game.br.chess.ChessPiece;
import com.game.br.chess.Color;

public class Rook extends ChessPiece {

    public Rook(Board board, Color color) {
        super(board, color);
    }

    @Override
    public String toString() {
        return "R";
    }
}
