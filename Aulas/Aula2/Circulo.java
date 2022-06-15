import java.util.Scanner;

public class Circulo {

    private int x ;
    private int y ;
    private int raio;

    public Circulo(){

    }

    public Circulo(int x , int y , int raio) {
    this.raio = raio;
    this.x=x;
    this.y=y;
    }
    public Circulo (Circulo circulo){
    this.x = circulo.getx();
    this.raio=circulo.getraio();
    this.y=circulo.gety();
    }

    public int getx(){
        return this.x;
    }
    public int gety(){
        return this.y;
    }
    public int getraio(){
        return this.raio;
    }

    public void setx(int x){
        this.x=x;
    }
    public void sety(int y){
        this.y=y;
    }
    public void setraio(int raio){
        this.raio=raio;
    }

    //mudar para double
    public void alteracentro (int x,int y) {
        this.x=x;
        this.y=y;
    }

    public double area(int x, int y){
        return (Math.pow(Math.PI*this.raio,2));
    }

    public double perimetro(int x, int y) {
    return (2*Math.PI*this.raio);
    }

    public String toString(){
        return "Este ciclo tem x : " + this.x +  " y " +this.y + " raio " + this.raio);
    }

    public  Circulo clone () {
        return  new Circulo(this);
    }
}

