package Aula1.Ficha4.Ex3;


import java.util.*;
import java.util.stream.Collectors;

public class CasaInteligente {

//private ArrayList<Lampada> casa;

private Map<String,Lampada> devices;
private Map<String,List<String>> rooms;


public CasaInteligente(){
    this.devices=new HashMap<>();
    this.rooms=new HashMap<>();
}


    public CasaInteligente(CasaInteligente a){

    this.devices=a.getDevices();
    this.rooms=new HashMap<>();
    }

    public  Map<String,Lampada>  getDevices() {
        return this.devices;
    }

  /*  public void setCasa(ArrayList< Lampada> casa) {
        this.casa = casa;
    }

    public void addLampada(Lampada l){
        this.casa.add(l);
    }

    public void ligaLampadaNormal(int index){
    this.casa.get(index).lampON();
    }


    public void ligaLampadaEco(int index){
        this.casa.get(index).lampECO();
    }

    public int qtEmEco(){
        int count =0;
        Iterator<Lampada> value = this.casa.iterator();

        while (value.hasNext()) {
        if (value.next().getModo().equals(Lampada.Modo.ECO)) count++;
        }
        System.out.println("Quantas em eco" +count);
        return count;
    }

    public void ligaTodasEco(){
        Iterator<Lampada> value = this.casa.iterator();
        while (value.hasNext()) {
            value.next().setModo(Lampada.Modo.ECO);
        }
    }

    public void ligaTodasMax(){
    Iterator<Lampada>value=this.casa.iterator();
        while (value.hasNext()){
            value.next().setModo(Lampada.Modo.ON);
        }
    }


    public double consumoTotal(){
    double total=0;
    Iterator<Lampada> value = this.casa.iterator();
    while (value.hasNext()){
      total+=value.next().getConsumoTotal();
    }
    return total;
    }
*/
    /*
    public Lampada maisGastadora(){
        Lampada a =new Lampada();
        double gasto=0.0;
        Iterator<Lampada> value = this.casa.iterator();
        while (value.hasNext()){
            if (value.next().getConsumoTotal()>gasto){
                gasto=value.next().getConsumoTotal();
                a=value.next();
            }
        }
        System.out.println(""+a);
        return a;
    }
*/


    // public Set<Lampada> podiumEconomia()

 /*   public void reset(){
        Iterator<Lampada> value = this.casa.iterator();
        while (value.hasNext()){
            value.next().setPeriodoConsumo(0.0);
        }
    }
*/
    public String toString() {
        System.out.println( "CasaInteligente{" +
                "aparelhos"+devices+
                "rooms"+rooms+
                '}');
        return "CasaInteligente{" +
                '}';
    }

    public CasaInteligente(Collection<Lampada> devices){
        this.devices=new HashMap<String,Lampada>();
        for(Lampada atual : devices.stream().collect(Collectors.toList()))
        {
        this.devices.put(atual.getId(),atual.clone());
        }
        this.rooms=new HashMap<>();

    }

//for (Map.Entry<String,List<Lampada>> atual : rooms.entrySet()){
    public void addtoroom(String room,Lampada a)
    {
        if (this.rooms.containsKey(room)){
            System.out.println("vou add " + a.getId());
            this.rooms.get(room).add(a.getId());
        }
        else {
            List<String> aux=new ArrayList<>();
            aux.add(a.getId());
            System.out.println("VOU ADD :" +room + " " + a.getId());
            this.rooms.put(room,aux);
        }
    }

    public String getroom(String id){
    for (Map.Entry<String,List<String>> atual : rooms.entrySet()){
        for(String atua : atual.getValue())
            System.out.println(atua);

        //System.out.println("COntains o " + id);
        System.out.println(atual.getValue());
        if (atual.getValue().contains(id)) return atual.getKey();
    }
    return null;
    }

    public Map<String,List<String>> printcol(){
        return this.rooms;
    }
    public void remove(String id) {

        if( devices.containsKey(id)){
            this.rooms.get(getroom(id)).remove(id);
            this.devices.remove(id);

        }
        else System.out.println("Nao existe este id");
    }

 public String divmaieco(){
        double count=0; ;
        double min=100;
        int i=0;
        String div="";

        for(Map.Entry<String,List<String>> aux: this.rooms.entrySet()){
            for (String a : aux.getValue()) {
                count+=devices.get(a).getConsumoTotal();
            }
            if (i==0){
            min=count;
            div=aux.getKey();
            }
            if (count ==min){
                    min=count;
                    div=aux.getKey();
            }
            if (count<min){
                min=count;
                div= aux.getKey();
            }
            i++;
    count=0;
        }
        return div;

 }

 public boolean apenasnuma()
 {
     for(Map.Entry<String,List<String>> a: this.rooms.entrySet()){
         for(String aux :a.getValue() ){

             if (count(aux)>1) return false;

         }
     }
    return true;
    }

    public  int count (String id){
        int count=0;
        for(Map.Entry<String,List<String>> a: this.rooms.entrySet()){
            if (a.getValue().contains(id)) count++;

        }

        //this.rooms.get(id) ++;
        return count;
    }


    public boolean count2() {
        Map<String, Integer> lista = new HashMap<>();
        for (Map.Entry<String, List<String>> a : this.rooms.entrySet()) {

            for (String aux : a.getValue()) {

           lista.put(aux,0);
            }
        }
        for (Map.Entry<String, List<String>> a : this.rooms.entrySet()) {

            for (String aux : a.getValue()) {

                int i = lista.get(aux) + 1;
                lista.remove(aux);
                lista.put(aux,i);
            }
        }






        for (int j : lista.values()) {
            if (j > 1) return false;
        }
        return true;


    }

}
