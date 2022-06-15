import java.time.LocalDate;

public class Auxencomenda {
    public static void main(String[] args) {
        Encomenda b = new Encomenda("Telemovel","Cea para usar redes sociais",27.0,3,2.0,5.0);
        b.print();
        b.calculaValorLinhaEnc();
        LocalDate v=LocalDate.of(2020,10,9);
        Encomenda2 c =new Encomenda2("Rodrigo ", 196676878,"Rua de Barros", 27,v);
        c.print();
    }
}
