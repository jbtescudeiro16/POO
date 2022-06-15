package Aula1.FIcha1.Secs_ex;

import java.util.Scanner;

public class Ex4_2 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("Insira os euros");
        double k = ler.nextDouble();
        System.out.println("Insira a taxa ");
        double j = ler.nextDouble();
        System.out.println( "o result é : "+eurosParaLibras(k,j));

    }
    public static double eurosParaLibras(double valor, double taxaConversao) {
        return  (valor*(taxaConversao/100));
    }
}
