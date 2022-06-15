package Aula1.FIcha1.Secs_ex;

import java.util.Scanner;

public class Ex3_2 {

    public static void main (String []args)
    {
        Scanner ler = new Scanner(System.in);
        String name = ler.nextLine();
        double saldo = ler.nextDouble();
        System.out.println(criaDescricaoConta(name,saldo));
    }


    public static String criaDescricaoConta (String nome, double saldo)
    {
        return (nome+ " " +saldo);
    }
}
