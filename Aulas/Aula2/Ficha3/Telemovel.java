import java.lang.reflect.Array;
import java.util.ArrayList;
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

    public void Telemovel(String marca, String modelo, int resx, int rexy, int dimensaomsg, int dimensaofoto, int dimensaoapp, int espaço, int numfotos, int numapps, String[] nameapps) {
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
    }
    public void Telemovel(Telemovel phone) {
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
    /////////////////////77


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
    public double tamMedioApps() {
        double val=0.0;
        val = dimensaoapp/numapps;
        return  val;
    }
/*
    public String maiorMsg() {

    }
*/
public void removeApp(String nome, int tamanho){
    this.dimensaoapp-=tamanho;
    this.numapps--;
    this.nameapps.remove(nome);
}




}
