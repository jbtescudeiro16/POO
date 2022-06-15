
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import java.util.Scanner;


public class Ex7_1 {
    public static void main(String args[])
    {



        Scanner ler = new Scanner(System.in);
        System.out.println("Insira o ano");
        int ano = ler.nextInt();
        System.out.println("Insira o mes");
        int mes = ler.nextInt();
        System.out.println("Insira o dia");
        int dia = ler.nextInt();
        System.out.println("Insira as horas");
        int horas = ler.nextInt();
/*
        DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("yy/MM/dd HH:mm:ss");
        System.out.println("Idade Atual: "+dtf2.format(LocalDateTime.now()-dtf2.format(data)));
*/


    }
}
