import java.util.Scanner;

public class Ex1_2 {

    public static  void main ( String[] args) {
        System.out.println("Insira a temperatura em graus celsius:");
        Scanner ler = new Scanner(System.in);
        double k = ler.nextDouble();
        System.out.println ("O resultado é : " +celsiusParaFarenheit(k));
    }
    public static double celsiusParaFarenheit(double graus) {
       double k =  (((graus  *9) / 5) + 32);
    return k;
    }
}
