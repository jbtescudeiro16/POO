package Ex6;

public class Auxautomovel {
    public static void main(String[] args) {
        Automovel a = new Automovel("Dacia",2010,"Duster", 7.0,10000.0,5.0,100.0,9.0,8.0,0);
        a.print();
        a.ligaCarro();
        a.avancaCarro(7.0,75.0);
        a.print();
    }
}
