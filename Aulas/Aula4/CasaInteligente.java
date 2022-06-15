package Aula4;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class CasaInteligente{

    private ArrayList<Lampada>casa ;

    public CasaInteligente() {
        this.casa = new ArrayList<Lampada>();

    }

    public CasaInteligente(ArrayList<Lampada> b) {
        this.casa =b;

    }

    public CasaInteligente(CasaInteligente a) {
        this.casa = getl(a);

    }

    public ArrayList<Lampada> getl(CasaInteligente a){
        return this.casa;
    }

    public String toString () {
        String aux="";
        Iterator<Lampada> it = this.casa.iterator();
        while(it.hasNext()){
            Lampada lampada =it.next();
            aux=aux+lampada.toString();
        }
        return aux;
    }
/*
    public boolean equals(CasaInteligente a) {
    }
*/

    public void addLampada(Lampada l){
        this.casa.add(l);
    }

    public void ligaLampadaNormal(int index)
    {
    this.casa.get(index).lampON();
    }

    public void ligaLampadaEco(int index) {
        this.casa.get(index).lampECO();
    }

    public int qtEmEco(){
        int count =0;
        Iterator<Lampada> it = this.casa.iterator();
        while(it.hasNext()){
            Lampada lampada =it.next();
            if(lampada.getModo()== Lampada.Modo.ECO) count++;
        }
        return count;
    }

    public void removeLampada(int index) {
        this.casa.remove(this.casa.get(index));
    }

    public void ligaTodasEco()
    {

        Iterator<Lampada> it = this.casa.iterator();
        while(it.hasNext()){
            it.next().lampECO();
        }
        return count;

    }



}