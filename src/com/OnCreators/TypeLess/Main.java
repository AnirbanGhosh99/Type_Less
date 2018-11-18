package com.OnCreators.TypeLess;

import java.lang.*;
import java.util.*;

public class Main {

    // Controller Constants
    public static final String STR = "";
    public static final int INT = 1;
    public static final char CHAR = 'a';
    public static final float FLT = 1.5f;
    public static final double DBL = 1.59;

    public static void main(String[] args) {
        Var obj1 = new Var("Anirban");
        Perform.print(obj1);
        obj1.set(4);
        Perform.print(obj1);
        obj1.convertTo("b");
        Perform.print(obj1);
    }
}
