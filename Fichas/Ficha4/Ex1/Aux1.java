package Aula1.Ficha4.Ex1;

public class Aux1 {
    public static void main(String[] args) {

        Stack stack = new Stack();
        stack.push("Gyan");
        stack.push("Vivek");
        stack.push("Rochit");
        stack.push("Panda");

        stack.printStack();
        System.out.println("O elemento que está neste momento no topo é :" +stack.top() );
        System.out.println("Vou fazer um pop E UM PUSH DE CONA");


        stack.pop();
        stack.push("cona    ");
        System.out.println("O elemento que está neste momento no topo é :" +stack.top() );
        stack.printStack();
        System.out.println("Está vazia: " + stack.Empty());
        System.out.println("O TAMANHO É : "+stack.length());



    }
}
