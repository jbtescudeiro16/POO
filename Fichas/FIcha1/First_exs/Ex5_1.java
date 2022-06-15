import java.util.Scanner;


public class Ex5_1 {

    public static void main(String[] args) {


        System.out.println("Insira a Base  e caso queira terminar insira 0.0");
        Scanner ler = new Scanner(System.in);
        double base = ler.nextDouble();

        while (base != 0.0) {
            System.out.println("Insira a altura");
            double altura = ler.nextDouble();
            double area = (base*altura) /2;


            double cat =  Math.sqrt (Math.pow(base, 2) + Math.pow(altura, 2));
            double perimetro = cat + altura + base ;

            System.out.printf("Área : %.5f \n" ,area   );
            System.out.printf("perimetro : %.5f \n", perimetro );

            System.out.println("Insira a Base  e caso queira terminar insira 0.0");

           base = ler.nextDouble();
        }
        ler.close();

    }
}