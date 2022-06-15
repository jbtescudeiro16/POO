import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {


        Veiculo a = new Veiculo("Dacia", "Duster", "20-19-Ab", 2018, 2.9, 6.0, new ArrayList<Integer>(), 10000, 100);
        Veiculo b = new Veiculo("Mercedes", "Benz", "20-19-Ac", 2018, 2.9, 6.0, new ArrayList<Integer>(), 10000, 100);
        Veiculo c = new Veiculo("Citroen","Cactus","20-19-Ad",2018,2.9,6.0,new ArrayList<Integer>(),10000,100);
        Veiculo e = new Veiculo("Dacia","Cactus","AA-19-Ad",2018,2.9,6.0,new ArrayList<Integer>(),10000,100);
        Veiculo f = new Veiculo("Dacia","Cactus","AD-19-Ad",2018,2.9,6.0,new ArrayList<Integer>(),10000,100);
        Map<String,Veiculo> mapa=new HashMap<String,Veiculo>();
        mapa.put(c.getMatricula(),c);
        mapa.put(a.getMatricula(),a);
        mapa.put(b.getMatricula(),b);
        mapa.put(e.getMatricula(),e);
        mapa.put(f.getMatricula(),f);

        DriveIt d=new DriveIt(mapa);
        System.out.println( d.veiculosDaMarca("Dacia"));
    }


}