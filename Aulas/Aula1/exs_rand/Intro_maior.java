
import java.util.Scanner;
public class Intro_maior {

    public static void main (String[] args) {

        System.out.println("Insira dois doubles");
        Scanner ler = new Scanner(System.in);
        double a = ler.nextDouble();
        double b = ler.nextDouble();
        double resposta = maior(a,b);
        System.out.println("O double maior é :"+resposta);

        ler.close();



    }


    public static double maior(Double a ,Double b){
        if (a>b) {
            return a;
        }
        else {
            return b ;
        }

    }
}

