package com.game.br.chess;

import com.game.br.boardgame.Board;
import com.game.br.boardgame.Piece;

public class ChessPiece extends Piece {

    private Color color;

    public ChessPiece(Board board,Color color) {
        super(board);
        this.color = color;
    }

    public Color getColor() {
        return color;
    }




}
