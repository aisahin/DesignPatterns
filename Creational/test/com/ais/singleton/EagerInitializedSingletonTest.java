/*
 * Copyright (C) 2018 aliihsan.sahin
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package com.ais.singleton;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author aliihsan.sahin
 */
public class EagerInitializedSingletonTest {
    
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_RED = "\u001B[31m";

    @Test
    public void testGetInstance() {
        
        System.out.println("==============================");        
        System.out.println(String.format(ANSI_BLUE + "Test for method: %s", "getInstance()"));
        
        EagerInitializedSingleton instance01 = EagerInitializedSingleton.getInstance();
        EagerInitializedSingleton instance02 = EagerInitializedSingleton.getInstance();
        EagerInitializedSingleton instance03 = EagerInitializedSingleton.getInstance();
        
        System.out.println(String.format(ANSI_RED + "The hash code for %s is: %s", "instance01", instance01.hashCode() ));
        System.out.println(String.format(ANSI_RED + "The hash code for %s is: %s", "instance02", instance03.hashCode() ));
        System.out.println(String.format(ANSI_RED + "The hash code for %s is: %s", "instance03", instance03.hashCode() ));
        
        assertSame(instance01, instance02);
        assertSame(instance01, instance03);
        assertSame(instance02, instance03);
    }   
}