package Aula1.Ficha4.Ex4;

import java.time.LocalDate;

public class aux {

    public static void main(String[] args) {
        Posts a = new Posts("jbtescudeiro","Bernas Escudas", LocalDate.of(2020,2,1),30,"Adorei");
        Posts b = new Posts("mteixvaz","Mariana Vaz", LocalDate.of(2010,1,1),10,"Fantastico");
        Posts c = new Posts("jbtescudeiro","Bernas Escudas", LocalDate.of(2020,2,1),90,"Adorei");
        Timeline k = new Timeline();
        k.add(a);
        k.add(b);
        k.add(c);
        k.nrPosts("jbtescudeiro");
        k.postsOf("jbtescudeiro");

    }
}
