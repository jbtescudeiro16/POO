

import java.util.Scanner;

public class Ex6_1 {


    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("Insira o número e caso queira terminar  insira -1 " );
        int m = ler.nextInt();

        while (m!=-1) {
            for (int k = m; k > 0; k--) {
                if (primo(k)) System.out.println("Primo " + k);
            }
            System.out.println("Insira o número e caso queira terminar  insira -1 " );
            m = ler.nextInt();
        }

    }

    public static boolean primo(int valor) {

        int contador = 0;
        for (int j = 1; j <= valor; j++) {
            if (valor % j == 0) contador++;
        }

        if (contador > 2) return false;
        else return true;
    }
}