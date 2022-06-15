import java.util.Scanner;

public class Maior_em_10 {

    public static void main (String[] args){
    System.out.println("O valor da soma é :"+soma());

    }
    public static int soma (){

        Scanner ler = new Scanner(System.in);

        int soma =0;

        for (int i =0;i<10;i++) {
            System.out.println("Insira o próximo inteiro");
              int aux = ler.nextInt();
              soma = soma + aux ;
        }
        return soma;
    }
}
