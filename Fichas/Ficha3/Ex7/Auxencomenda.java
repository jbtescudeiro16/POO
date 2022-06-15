package Ex7;
import java.time.LocalDate;

public class Auxencomenda {
    public static void main(String[] args) {
        LinhaEncomenda b = new LinhaEncomenda("Telemovel","Cea para usar redes sociais",27.0,3,2.0,5.0);
       // b.print();
        //b.calculaValorLinhaEnc();
        LinhaEncomenda k = new LinhaEncomenda("COLUNA","Cea para OUVIR MUSICA",29.0,3,4.0,9.0);
        LinhaEncomenda o = new LinhaEncomenda("pulseira","Cea para por no braço",4.0,1,8.0,10.0);
        LocalDate v=LocalDate.of(2020,10,9);
        Encomenda c =new Encomenda("Rodrigo ", 196676878,"Rua de Barros", 27,v);
        c.add(b);
        c.add(k);
        c.add(o);
        c.print();
        c.calculaValorTotal();
        c.calculaValorDesconto();
        c.numeroTotalProdutos();

       /* c.existeProdutoEncomenda("Telemovel");
        c.existeProdutoEncomenda("COLUNA");
        c.existeProdutoEncomenda("aaaa");
*/
        c.removeProduto("Telemovel");
        c.print();
    }
}
