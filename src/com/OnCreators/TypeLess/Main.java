package com.OnCreators.TypeLess;

import java.lang.*;

public class Main {

    public static void main(String[] args) {
        Var obj1 = new Var("Anirban");
        Perform.print(obj1);
        obj1.set(4);
        Perform.print(obj1);
        obj1.toBoolean();
        Perform.print(obj1);
    }
}
