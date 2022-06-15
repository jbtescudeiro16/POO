package Ex1;
import java.util.Scanner;

public class Circulo {
    private double x ;
    private double y ;
    private double raio;

    public Circulo(){
    }

    public Circulo(double x , double y , double raio) {
        this.raio = raio;
        this.x=x;
        this.y=y;
    }
    public Circulo (Circulo circulo){
        this.x = circulo.getx();
        this.raio=circulo.getraio();
        this.y=circulo.gety();
    }

    public double getx(){
        return this.x;
    }
    public double gety(){
        return this.y;
    }
    public double getraio(){
        return this.raio;
    }

    public void setx(double x){
        this.x=x;
    }
    public void sety(double y){
        this.y=y;
    }
    public void setraio(double raio){
        this.raio=raio;
    }


    public void alteracentro (double x,double y) {
        this.x=x;
        this.y=y;
    }

    public double area(){
        return (Math.PI*(this.raio*this.raio));
    }

    public double perimetro() {
        return (2*Math.PI*this.raio);
    }

    public String toString(){
        return ("Este ciclo tem x : " + this.x +  " y " +this.y + " raio " + this.raio);
    }

    public  Circulo clone () {
        return  new Circulo(this);
    }

    public boolean equals(Object obj){
        if (obj==this) return true;
        if (obj==null||obj.getClass() !=this.getClass()) return false;

        Circulo a = (Circulo) obj;
        return (a.getraio()==this.raio && a.getx()==this.x && a.gety()==this.y);
    }
}
