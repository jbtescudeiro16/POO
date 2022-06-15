package Aula1.Ficha4.Ex3;

import java.util.ArrayList;
import java.util.List;

public class princip {

    public static void main(String[] args) {
        Lampada k = new Lampada(Lampada.Modo.ECO,2.9,1.8,8.9,9.8,"0");
        Lampada lampada = new Lampada(Lampada.Modo.ON,3,1.8,20.9,9.8,"1");
        Lampada ka = new Lampada(Lampada.Modo.ECO,2.8,1.8,8.9,9.9,"2");
        Lampada ka1 = new Lampada(Lampada.Modo.ECO,21.9,7.8,8.9,9.9,"3");
        CasaInteligente a = new CasaInteligente();
      /*  a.addLampada(k);
        a.addLampada(lampada);
        a.toString();
        a.qtEmEco();
        a.ligaTodasEco();
        a.toString();
        System.out.println("O consumo total é:"+a.consumoTotal());
        a.reset();
        a.toString();
*/
        List<Lampada> list= new ArrayList<>();
        list.add(k);
        list.add(lampada);
        list.add(ka);
        list.add(ka1);

      CasaInteligente dois=  new CasaInteligente(list);

        //System.out.println(dois);
        System.out.println("-----------------------------------");
        dois.addtoroom("Sala",k);
        dois.addtoroom("Rua",lampada);
        dois.addtoroom("Sala",ka);
       dois.addtoroom("Quarto",ka1);
        //dois.addtoroom("Sala",ka1);

    dois.toString();

       // System.out.println(dois.divmaieco());

        System.out.println(dois.count2());


       // System.out.println(dois.apenasnuma());
    }
}
