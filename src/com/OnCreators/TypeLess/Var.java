package com.OnCreators.TypeLess;

public class Var {

    private Object value;
    private int type = -1;
    /*
    -1 - Not Used
    0  - String
    1  - Integer
    2  - Character
    3  - Float
    4  - Double
    5  - Boolean
    */

    // Utility Functions
    private String getTypeString(int t) {
        switch (t) {
            case 4: return "double";
            case 1: return "integer";
            case 2: return "char";
            case 3: return "float";
            case -1: return "Unset";
        }
        return "String";
    }

    // Constructors
    public Var() {}
    public Var(String value) {
        this.value = value;
        type = 0;
    }
    public Var(int value) {
        this.value = value;
        type = 1;
    }
    public Var(char value) {
        this.value = value;
        type = 2;
    }
    public Var(float value) {
        this.value = value;
        type = 3;
    }
    public Var(double value) {
        this.value = value;
        type = 4;
    }
    public Var(Boolean value) {
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

    // setters
    public void set(String value) {
        this.value = value;
        type = 0;
    }
    public void set(int value) {
        this.value = value;
        type = 1;
    }
    public void set(char value) {
        this.value = value;
        type = 2;
    }
    public void set(float value) {
        this.value = value;
        type = 3;
    }
    public void set(double value) {
        this.value = value;
        type = 4;
    }
    public void set(Boolean value) {
        this.value = value;
        type = 5;
    }

    // Convertors
    public void convertTo(String check) {
        if (type!=-1) {
            int Type = type;
            try {
                switch (check) {
                    case "s": {
                        switch (type) {
                            case 1:
                                value = String.valueOf((int) value);
                                break;
                            case 2:
                                value = String.valueOf((char) value);
                                break;
                            case 3:
                                value = String.valueOf((float) value);
                                break;
                            case 4:
                                value = String.valueOf((double) value);
                                break;
                            case 5: {
                                if ((Boolean) value) {
                                    value = "true";
                                } else {
                                    value = "false";
                                }
                                break;
                            }
                        }
                        type = 0;
                        break;
                    }
                    case "i": {
                        switch (type) {
                            case 0:
                                value = Integer.parseInt((String) value);
                                break;
                            case 2:
                                value = Integer.parseInt(String.valueOf((char) value));
                                break;
                            case 3:
                                value = (int) (float) value;
                                break;
                            case 4:
                                value = (int) (double) value;
                                break;
                            case 5: {
                                if ((Boolean) value) {
                                    value = 1;
                                } else {
                                    value = 0;
                                }
                                break;
                            }
                        }
                        type = 1;
                        break;
                    }
                    case "f": {
                        switch (type) {
                            case 0:
                                value = Float.parseFloat((String) value);
                                break;
                            case 1:
                                value = (float) (int) value;
                                break;
                            case 2:
                                value = Float.parseFloat(String.valueOf((char) value));
                                break;
                            case 4:
                                value = (float) (double) value;
                                break;
                            case 5: {
                                if ((Boolean) value) {
                                    value = 1.0f;
                                } else {
                                    value = 0f;
                                }
                                break;
                            }
                        }
                        type = 3;
                        break;
                    }
                    case "d": {
                        switch (type) {
                            case 0:
                                value = Double.parseDouble((String) value);
                                break;
                            case 1:
                                value = (double) (int) value;
                                break;
                            case 2:
                                value = Double.parseDouble(String.valueOf((char) value));
                                break;
                            case 3:
                                value = (double) (float) value;
                                break;
                            case 5: {
                                if ((Boolean) value) {
                                    value = 1.0;
                                } else {
                                    value = 0.0;
                                }
                                break;
                            }
                        }
                        type = 4;
                        break;
                    }
                    case "c": {
                        switch (type) {
                            case 0:
                                value = ((String) value).charAt(0);
                                break;
                            case 1:
                                value = String.valueOf((int) value).charAt(0);
                                break;
                            case 3:
                                value = String.valueOf((float) value).charAt(0);
                                break;
                            case 4:
                                value = String.valueOf((double) value).charAt(0);
                                break;
                            case 5: {
                                if ((Boolean) value) {
                                    value = 't';
                                } else {
                                    value = 'f';
                                }
                                break;
                            }
                        }
                        type = 2;
                        break;
                    }
                    case "b": {
                        switch (type) {
                            case 0: {
                                value = value.equals("true");
                                break;
                            }
                            case 1: {
                                value = (((int) value) != 0);
                                break;
                            }
                            case 3: {
                                value = (((float) value) != 0);
                                break;
                            }
                            case 4: {
                                value = (((double) value) != 0);
                                break;
                            }
                            case 2: {
                                value = (((char) value) != 'f');
                                break;
                            }
                        }
                        type = 5;
                        break;
                    }
                    default: System.out.println(check + " is not valid. \ns - String\ni - int/Integer\nc - char/character\nf - float\nd - double\nb - Boolean"); break;
                }
            } catch (Exception e) {
                type = Type;
                System.out.print(e.toString());
            }
        } else {System.out.println("The variable has not been set to any value");}
    }

}
