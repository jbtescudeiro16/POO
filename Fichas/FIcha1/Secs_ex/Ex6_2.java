//package Aula1.FIcha1.Secs_ex;

import java.util.Scanner;

public class Ex6_2 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int k = ler.nextInt();
        System.out.println("O fatorial é : "+factorial(k));
    }

    public static long factorial(int num) {
        long res=1;
        for (int i=num;i>0;i--) {
            res*=i;
        }
        return  res;
    }
}
