package Aula1.Ficha4.Ex1;

import java.util.ArrayList;
import java.util.Iterator;

public class Stack {

    private ArrayList <String> stack = new ArrayList<>();


    public boolean Empty(){
        if (this.stack.isEmpty()) return true;
        else return false;
    }

    public String top(){
        return this.stack.get(stack.size()-1);
    }
    public void push(String a ){
        this.stack.add(a);
    }
     public void pop(){
        if (this.stack.isEmpty()){

        }
        else {
            this.stack.remove(this.stack.get(this.stack.size()-1));
        }
     }

    public  void printStack() {

        Iterator value = stack.iterator();

        System.out.println("The iterator values are: ");
        while (value.hasNext()) {
            System.out.println(value.next());
        }
    }
    public int  length(){
        return this.stack.size();
    }

}
