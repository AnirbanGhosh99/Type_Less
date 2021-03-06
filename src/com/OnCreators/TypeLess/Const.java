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
    public String getString() {
        if (type==0) {
            return (String) value;
        } else {
            System.out.print("TypeMismatchException: Contained datatype is  " + getTypeString(type));
            return Perform.STR;
        }
    }
    public int getInt() {
        if (type==1) {
            return (int) value;
        } else {
            System.out.print("TypeMismatchException: Contained datatype is  " + getTypeString(type));
            return Perform.INT;
        }
    }
    public char getChar() {
        if (type==2) {
            return (char) value;
        } else {
            System.out.print("TypeMismatchException: Contained datatype is  " + getTypeString(type));
            return Perform.CHR;
        }
    }
    public float getFloat() {
        if (type==3) {
            return (float) value;
        } else {
            System.out.print("TypeMismatchException: Contained datatype is  " + getTypeString(type));
            return Perform.FLT;
        }
    }
    public double getDouble() {
        if (type==4) {
            return (double) value;
        } else {
            System.out.print("TypeMismatchException: Contained datatype is  " + getTypeString(type));
            return Perform.DBL;
        }
    }
    public Boolean getBoolean() {
        if (type==5) {
            return (Boolean) value;
        } else {
            System.out.print("TypeMismatchException: Contained datatype is  " + getTypeString(type));
            return Perform.BLN;
        }
    }

}
