package com.OnCreators.TypeLess;

public class Const {

    private Object value;
    private int type;
    /*
     * 0 - String
     * 1 - Integer
     * 2 - Character
     * 3 - Float
     * 4 - Double
     * 5 - Boolean
     */

    // Utility Functions
    private String getTypeString(int t) {
        switch (t) {
            case 4: return "double";
            case 1: return "integer";
            case 2: return "char";
            case 3: return "float";
        }
        return "String";
    }

    // Constructors
    public Const(String value) {
        this.value = value;
        type = 0;
    }
    public Const(int value) {
        this.value = value;
        type = 1;
    }
    public Const(char value) {
        this.value = value;
        type = 2;
    }
    public Const(float value) {
        this.value = value;
        type = 3;
    }
    public Const(double value) {
        this.value = value;
        type = 4;
    }
    public Const(Boolean value) {
        this.value = value;
        type = 5;
    }

    // getters
    public int getType() {
        return type;
    }
    public String type() {
        return getTypeString(type);
    }
    public Object get() {
        return value;
    }
    public String get(String s) {
        if (type==0) {
            return (String) value;
        } else {
            System.out.print("TypeMismatchException: Contained datatype is  " + getTypeString(type));
            return s;
        }
    }
    public int get(int i) {
        if (type==1) {
            return (int) value;
        } else {
            System.out.print("TypeMismatchException: Contained datatype is  " + getTypeString(type));
            return i;
        }
    }
    public char get(char c) {
        if (type==2) {
            return (char) value;
        } else {
            System.out.print("TypeMismatchException: Contained datatype is  " + getTypeString(type));
            return c;
        }
    }
    public float get(float f) {
        if (type==3) {
            return (float) value;
        } else {
            System.out.print("TypeMismatchException: Contained datatype is  " + getTypeString(type));
            return f;
        }
    }
    public double get(double d) {
        if (type==4) {
            return (double) value;
        } else {
            System.out.print("TypeMismatchException: Contained datatype is  " + getTypeString(type));
            return d;
        }
    }
    public Boolean get(Boolean d) {
        if (type==5) {
            return (Boolean) value;
        } else {
            System.out.print("TypeMismatchException: Contained datatype is  " + getTypeString(type));
            return d;
        }
    }

}
