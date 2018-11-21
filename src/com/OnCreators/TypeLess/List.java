package com.OnCreators.TypeLess;

import com.OnCreators.TypeLess.Var;

public class List extends Var implements Cloneable{
    public List[] data;
    private int size;
    private int length;
    public List(){
        size = 5;
        length = 0;
        data = new List[5];
        type = 6;
    }

    public int length() {
        return length;
    }

    protected List(int i){
        super(i);
    }

    protected List(double i){
        super(i);
    }

    protected List(boolean i){
        super(i);
    }

    protected List(String i){
        super(i);
    }

    public void append(int i){
        if (length == size){
            List temp[] = new List[size*2];
            size = size*2;
            for (int j = 0; j<size; j++) {
                temp[j] = data[j];
            }
            data = temp;
        }
        data[length] = new List(i);
        length++;
    }

    public void append(double i){
        if (length == size){
            List temp[] = new List[size*2];
            size = size*2;
            for (int j = 0; j<size; j++) {
                temp[j] = data[j];
            }
            data = temp;
        }
        data[length] = new List(i);
        length++;
    }

    public void append(String i){
        if (length == size){
            List temp[] = new List[size*2];
            size = size*2;
            for (int j = 0; j<size; j++) {
                temp[j] = data[j];
            }
            data = temp;
        }
        data[length] = new List(i);
        length++;
    }

    public void append(Boolean i){
        if (length == size){
            List temp[] = new List[size*2];
            size = size*2;
            for (int j = 0; j<size; j++) {
                temp[j] = data[j];
            }
            data = temp;
        }
        data[length] = new List(i);
        length++;
    }

    public Object clone() throws CloneNotSupportedException{
        return super.clone();
    }

    public void append(List obj){
        if (length == size){
            List temp[] = new List[size*2];
            size = size*2;
            for (int j = 0; j<size; j++) {
                temp[j] = data[j];
            }
            data = temp;
        }

        try{
            data[length] = (List) obj.clone();
        }

        catch (CloneNotSupportedException e){

        }


        length++;
    }

    public void print(){
        System.out.print("[");
        for (int i=0; i<length; i++){
            if (data[i].type==6){
                data[i].print();
            }
            else if (data[i].type==0){
                System.out.print(" \""+data[i].get()+"\"");
            }
            else{
                System.out.print(" "+data[i].get());
            }
            if (i!=length-1){
                System.out.print(",");
            }
        }
        System.out.print(" ]");
    }
}
