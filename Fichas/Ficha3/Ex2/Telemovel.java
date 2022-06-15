package Ex2;
import Ex6.Automovel;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Semaphore;

public class Telemovel {
    private String marca;
    private String modelo;
    private int resx, rexy;
    private int dimensaomsg;
    private int dimensaofoto;
    private int dimensaoapp;
    private int dimensaototal = dimensaoapp + dimensaofoto+dimensaomsg;
    private int espaço;
    private int numfotos;
    private int numapps;
    private ArrayList<String> nameapps;
    private ArrayList<String> msgs;

    public  Telemovel(  ) {
        this.marca = "";
        this.modelo = "";
        this.resx = 0;
        this.rexy = 0;
        this.dimensaomsg = 0;
        this.dimensaoapp = 0;
        this.dimensaofoto = 0;
        this.espaço = 0;
        this.numapps = 0;
        this.numfotos = 0;
        this.nameapps = new ArrayList<String>() ;
        this.msgs=new ArrayList<String>();
    }

    public  Telemovel(String marca, String modelo, int resx, int rexy, int dimensaomsg, int dimensaofoto, int dimensaoapp, int espaço, int numfotos, int numapps, String[] nameapps,String[]msgs) {
        this.marca = marca;
        this.modelo = modelo;
        this.resx = resx;
        this.rexy = rexy;
        this.dimensaomsg = dimensaomsg;
        this.dimensaoapp = dimensaoapp;
        this.dimensaofoto = dimensaofoto;
        this.espaço = espaço;
        this.numapps = numapps;
        this.numfotos = numfotos;
        this.nameapps = new ArrayList<String>(List.of(nameapps));
        this.msgs=new ArrayList<String>(List.of(msgs));
    }
    public  Telemovel(Telemovel phone) {
        this.nameapps=phone.getnameapps();
        this.marca = phone.getmarca();
        this.modelo=getmodelo();
        this.resx = getX();
        this.rexy=getY();
        this.dimensaomsg=getdimensaomsg();
        this.dimensaofoto=getdimensaofoto();
        this.dimensaoapp=getdimensaoapp();
        this.espaço = getespaco();
        this.numapps=getnumapps();
        this.numfotos=getnumfotos();
    }
    public ArrayList<String> getnameapps(){
        return this.nameapps;
    }
    public String getmarca(){
        return this.marca;
    }
    public String getmodelo(){
        return this.modelo;
    }
    public int getX(){
        return this.resx;
    }
    public int getY(){
        return this.rexy;
    }
    public int getdimensaomsg(){
        return this.dimensaomsg;
    }
    public int getdimensaofoto(){
        return this.dimensaofoto;
    }
    public int getdimensaoapp(){
        return this.dimensaoapp;
    }
    public int getespaco(){
        return this.espaço;
    }
    public int getnumapps(){
        return this.numapps;
    }
    public int getnumfotos(){
        return this.numfotos;
    }


    public void setX(int resx){
        this.resx=resx;
    }
    public void sety(int resy){
        this.rexy=resy;
    }
    public void setdimensaomsg(int dimensaomsg){
         this.dimensaomsg=dimensaomsg;
    }
    public void setdimensaofoto(int dimensaofoto){
        this.dimensaofoto = dimensaofoto;
    }
    public void setdimensaoapp(int dimensaoapp){
        this.dimensaoapp = dimensaoapp;
    }
    public void setespaco(int espaço){
        this.espaço= espaço;
    }
    public void  setnumapps(int numapps){
        this.numapps = numapps;
    }
    public void setnumfotos(int numfotos)  {
       this.numfotos=numfotos;
    }


    public Telemovel clone() {
        return new Telemovel(this);
    }

    //falta cenas pq n me apeteceu
    public boolean equals(Object obj){

        if ( obj ==null || obj.getClass()!=this.getClass()) return false;
        if (obj ==this) return true;
        Telemovel a =(Telemovel) obj;
        return ( a.getdimensaoapp() == this.dimensaoapp &&
                a.getdimensaofoto()==this.dimensaofoto &&
                a.getmarca()==this.marca&&
                a.getmodelo() ==this.modelo &&
                a.getespaco() ==this.espaço &&
                a.getmodelo() == this.modelo );
    }

    public boolean existeEspaco(int numeroBytes){
        if ( this.espaço + numeroBytes < this.dimensaototal ) return  true;
        else return  false;
    }
    public void instalaApp(String nome, int tamanho) {
        if (existeEspaco(tamanho)) {
            this.dimensaoapp+=tamanho;
            this.numapps++;
            this.nameapps.add(nome);
        }
        else System.out.println("NO SPACE");
    }


    public void recebeMsg(String msg){
        this.dimensaomsg=msg.length();
        this.msgs.add(msg);
        System.out.println(msg);
    }

    public double tamMedioApps() {
        double val=0.0;
        val = dimensaoapp/numapps;
        return  val;
    }

    public String maiorMsg() {
        int maxsize=0;
        String big=";";
        for (Iterator<String> iterator = msgs.iterator(); iterator.hasNext(); ) {
            String c = iterator.next();
            if (c.length()>maxsize){
                maxsize=c.length();
                big=c;
            }
        }
        return big;
    }

public void removeApp(String nome, int tamanho){
    this.dimensaoapp-=tamanho;
    this.numapps--;
    this.nameapps.remove(nome);
}




}
