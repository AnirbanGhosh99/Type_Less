package com.OnCreators.TypeLess;

public class val {

    private String value = "";
    private int type = 0;
    /*
     * 0 - String
     * 1 - Integer
     * 2 - Character
     * 3 - Float
     * 4 - Double
     */

    // Utility Functions
    private String getTypeString(int t) {
        switch (t) {
            case 4: return "double";
            case 1: return "integer";
            case 2: return "char";
            case 3: return "float";
            default: return "String";
        }
    }

    // Contructors
    public val() {}
    public val(String value) {
        this.value = value;
        type = 0;
    }
    public val(int value) {
        this.value = String.valueOf(value);
        type = 1;
    }
    public val(char value) {
        this.value = String.valueOf(value);
        type = 2;
    }
    public val(float value) {
        this.value = String.valueOf(value);
        type = 3;
    }
    public val(double value) {
        this.value = String.valueOf(value);
        type = 4;
    }

    // getters
    public int getType() {
        return type;
    }
    public String get(String s) {
        if (type==0) {
            return value;
        } else {
            System.out.print("TypeMismatchException: Contained datatype is  " + getTypeString(type));
            return s;
        }
    }
    public int get(int i) {
        if (type==1) {
            return Integer.parseInt(value);
        } else {
            System.out.print("TypeMismatchException: Contained datatype is  " + getTypeString(type));
            return i;
        }
    }
    public char get(char c) {
        if (type==2) {
            return value.charAt(0);
        } else {
            System.out.print("TypeMismatchException: Contained datatype is  " + getTypeString(type));
            return c;
        }
    }
    public float get(float f) {
        if (type==3) {
            return Float.parseFloat(value);
        } else {
            System.out.print("TypeMismatchException: Contained datatype is  " + getTypeString(type));
            return f;
        }
    }
    public double get(double d) {
        if (type==4) {
            return Double.parseDouble(value);
        } else {
            System.out.print("TypeMismatchException: Contained datatype is  " + getTypeString(type));
            return d;
        }
    }

    // Enforced Getters
    public String Get() {
        return value;
    }
    public String Get(String s) {
        return value;
    }
    public int Get(int i) {
        try {
            return Integer.parseInt(value);
        } catch (Exception e) {
            System.out.print("TypeMismatchException: Contained datatype " + getTypeString(type) + " cannot be converted to integer");
            System.out.print(e.toString());
            return i;
        }
    }
    public char Get(char c) {
        if (value.length()>0) {
            return value.charAt(0);
        } else {
            System.out.print("TypeMismatchException: Contained datatype " + getTypeString(type) + " cannot be converted to char");
            return c;
        }
    }
    public float Get(float f) {
        try {
            return Float.parseFloat(value);
        } catch (Exception e) {
            System.out.print("TypeMismatchException: Contained datatype " + getTypeString(type) + " cannot be converted to float");
            System.out.print(e.toString());
            return f;
        }
    }
    public double Get(double d) {
        try {
            return Double.parseDouble(value);
        } catch (Exception e) {
            System.out.print("TypeMismatchException: Contained datatype " + getTypeString(type) + " cannot be converted to double");
            System.out.print(e.toString());
            return d;
        }
    }

}
