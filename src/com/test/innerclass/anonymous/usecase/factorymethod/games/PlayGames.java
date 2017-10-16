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
 *    Created on  Oct 16, 2015
 *
 ************************************************************************/
package com.test.innerclass.anonymous.usecase.factorymethod.games;

public class PlayGames {
    public static void playGame(GameFactory gameFactory) {
        Game game = gameFactory.getGame();
        while (game.move())
            ;
    }

    public static void main(String args[]) {
        playGame(Chess.factory);
        playGame(Checkers.factory);
    }

}
