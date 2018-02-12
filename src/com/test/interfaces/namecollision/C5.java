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
package com.test.interfaces.namecollision;


/**
 * Enabling the blow comments will result in compiler error : "The return types are incompatible for the inherited methods I3.f(), C.f()"
 *
 * The difficulty occurs because overriding, implementation, and overloading get unpleasantly
 * mixed together. Also, overloaded methods cannot differ only by return type. When the last
 * two lines are uncommented, the error messages say it all:
 *
 *  f() in C cannot implementf() in It; attempting to use
 *  incompatible return type
 *  found: int
 *   required: void
 *
 *  : Interfaces I3 andh are incompatible; both define f(), but with
 *  different return type
 *
 */
public class C5 extends C /*implements I3*/{

}
