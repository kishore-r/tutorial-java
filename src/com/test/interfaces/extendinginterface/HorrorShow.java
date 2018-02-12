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
package com.test.interfaces.extendinginterface;

public class HorrorShow {
    static void u(Monster monster) {
        monster.menace();
    }

    static void v(DangerousMonster dangerousMonster) {
        dangerousMonster.menace();
        dangerousMonster.destroy();

    }

    static void w(Lethal l) {
        l.kill();
    }

    public static void main(String args[]) {
        DangerousMonster dm = new DragonZilla();
        u(dm);
        v(dm);
        Vampire vampire = new VeryBadVampire();
        u(vampire);
        v(vampire);
        w(vampire);

    }

}
