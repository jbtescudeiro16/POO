package Aula1.Ficha4.Ex3;

import java.util.function.Consumer;

public class LampadaMOnstra extends Lampada{

private int inttensidade;

public LampadaMOnstra(int inttensidade,Modo x, double cpsE, double cpsO, double cT, double pC,String id){
    super(x,cpsE,cpsO,cT,pC,id);
    this.inttensidade=inttensidade;
}

    @Override
    public double totalConsumo() {

    return super.totalConsumo()/2;
    }


    public void turnOn(){

        Consumer<Lampada> it;
    }
}
