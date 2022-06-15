import java.util.Scanner;

public class Maior_new {
    public static void main (String[] args) {

        System.out.println("Insira dois doubles");
        Scanner ler = new Scanner(System.in);
        double a = ler.nextDouble();
        double b = ler.nextDouble();
        double resposta = Math.max(a,b);
        System.out.println("O double maior é :"+resposta);

        ler.close();
    }
}
