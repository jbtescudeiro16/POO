
import java.util.Scanner;

public class Ex2_2 {

    public static  void main (String []args)
    {
        Scanner ler = new Scanner(System.in);
        System.out.println (" Insira um número");
        int a  = ler.nextInt();
        System.out.println (" Insira outro número");
        int b  = ler.nextInt();
        System.out.println (" O maior é : "+ maximoNumeros(a,b));
    }


    public static int maximoNumeros(int a, int b)
    {
    if (a>b) return a ;
    else return b ;
    }
}
