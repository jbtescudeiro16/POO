package Aula1.Fciha2;

import java.util.Scanner;

public class Ex1 {

    public static void main(String[] args) {

        System.out.println("Insira o número da alinea : 1 , 2 OU 3");

        Scanner ler = new Scanner(System.in);
        int n = ler.nextInt();

        Aux1 a =new Aux1();

        switch (n)
        {
            case 1 :
                int k = a.min();
                System.out.println("o minimo é : " + k );
                break;

            case 2 :
                a.between();
                break;

            case 3:
                a.comuns();
                break;
        }




    }
}
