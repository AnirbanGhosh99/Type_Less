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

        List obj2 = new List();
        obj2.append(1);
        obj2.append("abc");
        obj2.append(5.5);
        obj2.append(true);
        System.out.println("\nList :");
        obj2.print();

        List obj3 = new List();
        obj3.append(2);
        obj3.append("xyz");
        obj3.append(6.5);
        obj3.append(false);
        System.out.println("\nList :");
        obj3.print();

        List obj4 = new List();
        obj4.append(obj2);
        obj4.append(obj3);
        System.out.println("\nNested List :");
        obj4.print();

        obj4.data[1].data[1].set("pqr");

        System.out.println("\nNested List :");
        obj4.print();

        System.out.println("\nList :");
        obj3.print();
    }
}
