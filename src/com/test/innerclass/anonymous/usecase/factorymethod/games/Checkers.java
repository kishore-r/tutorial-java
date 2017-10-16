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

public class Checkers implements Game {
    private int moves = 0;
    private static final int MOVES = 3;

    @Override
    public boolean move() {
        System.out.println("Checkers moves " + moves);
        return ++moves != MOVES;
    }

    public static GameFactory factory = new GameFactory() {

        @Override
        public Game getGame() {
            return new Checkers();
        }
    };

}
