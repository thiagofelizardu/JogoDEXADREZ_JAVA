package com.game.br.chess.pieces;

import com.game.br.boardgame.Board;
import com.game.br.chess.ChessPiece;
import com.game.br.chess.Color;

public class King extends ChessPiece {
    public King(Board board, Color color) {
        super(board, color);
    }

    @Override
    public String toString() {
        return "K";
    }
}
