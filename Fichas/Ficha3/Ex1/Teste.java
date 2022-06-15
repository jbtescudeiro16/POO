package Ex1;
public class Teste {

    public static void main(String[] args) {
        Circulo circulo = new Circulo(3.0,4.0,2.0);
        double area2 = circulo.area();
        System.out.println("area2 : " +area2 );


        Circulo a = new Circulo( 3.0,5.0 ,9.0);
        String aux = a.toString();

        double area = a.area();
        double perimetro = a.perimetro();

        System.out.println("area : " +area );
        System.out.println("perimetro : " +perimetro );

        System.out.println(aux);
    }
}
