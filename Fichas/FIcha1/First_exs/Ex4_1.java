import java.util.Scanner;

import static java.lang.Math.abs;

public class Ex4_1 {


    public static void main(String[] args) {
        System.out.println("Insira a temperaturn e caso queira terminar insira 500");
        Scanner ler = new Scanner(System.in);

        int temp = ler.nextInt();
        int i = 0;
        int maxv = 0;
        int maxd = 0;
        int soma = 0;

        while (temp != 500) {
            soma += temp;
            i++;

            if (abs(temp) > abs (maxv) ){

                maxv = temp;
                maxd = i;
            }
            System.out.println("Insira a temperaturn e caso queira terminar insira 500");
            temp = ler.nextInt();
        }
        double mean = soma / i;
        System.out.println("Media : " + mean);
        System.out.println("Maior variacão no dia  : " + maxd + " com temperatura de " + maxv);
    }


}
