//package Aula1.FIcha1.Secs_ex;

import java.util.Scanner;

public class Ex5_2 {

    public static void main(String[] args) {
        Scanner ler = new Scanner( System.in);
        System.out.println("Insira dois numeros");
        int k = ler.nextInt();
        int j = ler.nextInt();

        System.out.println("String :"+aux (k,j));
        System.out.println("Média :"+mean(k,j));
    }


    public static  String aux(int k,int j) {
        if (k>j) return (k+" "+j);
        else return (j+" "+k);

    }

    public static double mean(int k,int j) {
        return ((k+j)/2);

    }
}
