package com.game.br.application;

import com.game.br.boardgame.Board;
import com.game.br.chess.ChessMatch;

public class Program {
    public static void main(String[] args) {

        ChessMatch chessMatch = new ChessMatch();
        UI.printBoard(chessMatch.getPieces());

    }
}