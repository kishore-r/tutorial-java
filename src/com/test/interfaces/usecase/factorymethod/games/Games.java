/************************************************************************
 *                                                                      *
 *                                                                      *
 *                                                                      *
 *  (c) Copyright by     - all rights reserved                          *
 *                                                                      *
 ************************************************************************
 *
 * Initial Creation:
 *    Author      rak
 *    Created on  Jan 17, 2015
 *
 ************************************************************************/
package com.test.interfaces.usecase.factorymethod.games;

public class Games {
    public static void playGames(GameFactory gameFactory) {
        Game game = gameFactory.getGame();
        while (game.move())
            ;

    }

    public static void main(String args[]) {
        playGames(new ChessFactory());
        playGames(new CheckersFactory());

    }

}
