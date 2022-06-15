package Ex3;
import java.time.LocalDate;
import java.util.ArrayList;

public class Testeex3 {
    public static void main(String[] args) {
        LocalDate a = LocalDate.of(2022,4,2);
        ArrayList <String> aux = new ArrayList<String>(2);
        aux.add("LOuco ");
        aux.add ("fascinante");
        //("OLHA NO Q DEU",20,a,1080,10,20, aux,2,3)
        String str = "olha no q deu";
        int res = 20;
        int b=1;
        int c = 2;
        int e = 4 ;
         int j= 40;
         int p = 90;
         int f = 8;

        Youtube ka=new Youtube(aux,a,str,res,b,c,e,f,j,p);
        ka.insereComentario("Adorei");
        ka.thumbsUp();
        ka.qtsDiasDepois();
       // ka.print();

    }
}
