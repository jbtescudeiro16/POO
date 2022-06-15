package Ex6;

import java.time.LocalDate;

public class Automovel {

    private String marca;
    private int ano;
   private  String modelo;
    private double consumo;
    private double kms;
    private double media;
    private double kmslast;
    private double medialast;
    private double capacity;
    private int status;

    public Automovel() {
        this.consumo = 0.0;
        this.kms = 0.0;
        this.media = 0.0;
        this.kmslast = 0;
        this.medialast = 0.0;
        this.capacity = 0.0;
        this.status = 0;
    }

    public Automovel(String marca, int ano, String modelo, double consumo, double kms, double media, double kmslast, double medialast, double capacity, int status) {
        this.marca = marca;
        this.ano = ano;
        this.modelo = modelo;
        this.consumo = consumo;
        this.kms = kms;
        this.media = media;
        this.kmslast = kmslast;
        this.medialast = medialast;
        this.capacity = capacity;
        this.status=status;
    }

    public Automovel(Automovel a) {
        this.marca = a.getmarca();
        this.ano = a.getano();
        this.modelo = a.getmodelo();
        this.consumo = a.getConsumo();
        this.kms = a.getkms();
        this.media = a.getMedia();
        this.kmslast = a.getkmslast();
        this.medialast = a.getMedialast();
        this.capacity = a.getCapacity();
        this.status = a.getstatus();

    }

    public String getmarca() {
        return this.marca;
    }

    public int getano() {
        return this.ano;
    }

    public int getstatus() {
        return this.status;
    }

    public String getmodelo() {
        return this.modelo;
    }

    public double getConsumo() {
        return this.consumo;
    }

    public double getkms() {
        return this.kms;
    }

    public double getMedia() {
        return this.media;
    }

    public double getkmslast() {
        return this.kmslast;
    }

    public double getMedialast() {
        return this.medialast;
    }

    public double getCapacity() {
        return this.capacity;
    }

///////
    public void setmarca(String marca) {
        this.marca=marca;
    }

    public void setano(int ano) {
        this.ano = ano;
    }

    public void setModelo(String modelo) {
         this.modelo=modelo;
    }

    public void setConsumo(double consume){ this.consumo=consume;}


    public void setkms(double kms) {
    this.kms=kms;
    }

    public void setMedia(double media) {
    this.media=media;
    }

    public void  setkmslast(double kmslast) {
        this.kmslast=kmslast;
    }

    public void setMedialast(double medialast) {
    this.medialast=medialast;
    }

    public void setCapacity(double capacity) {
        this.capacity=capacity;
    }

    public void setstatus(int status) {
        this.status = status;
    }



    public void print() {
        System.out.println("Marca : " + this.marca);
        System.out.println("Modelo : " + this.modelo);
        System.out.println("Ano : " + this.ano);
        System.out.println("Consumo : " + this.consumo);
        System.out.println("KMS TOTAIS  : " + this.kms);
        System.out.println("Média : " + this.media);
        System.out.println("Kms na ultima volta  : " + this.kmslast);
        System.out.println("Media na utima volta : " + this.medialast);
        System.out.println("Capacidade : " + this.capacity);
        System.out.println("Status : " + this.status);

    }

    public Automovel clone() {
        return  new Automovel(this);
    }

    public boolean equals(Object obj) {
    if ( obj ==null || obj.getClass()!=this.getClass()) return false;
    if (obj ==this) return true;
    Automovel a =(Automovel) obj;
    return ( a.getano() == this.ano &&
            a.getCapacity()==this.capacity &&
            a.getConsumo()==this.consumo&&
            a.getkms() ==this.kms &&
            a.getmarca() ==this.marca &&
            a.getmodelo() == this.modelo &&
            a.getstatus() == this.status &&
            a.getkmslast() ==this.kmslast &&
            a.getMedialast() ==this.medialast &&
            a.getMedia() ==this.media );
    }

    public void ligaCarro() {
        resetUltimaViagem();
        this.status = 1;
    }

    public void desligaCarro() {
        this.status = 0;
    }

    public void resetUltimaViagem() {
        this.kmslast = 0.0;
        this.medialast = 0.0;
    }

    public void avancaCarro(double metros, double velocidade) {
        this.kms = (this.kms + 0.001*metros);
        this.medialast = velocidade / metros;
        this.kmslast = 0.001*metros;
    }

    public void travaCarro(double metros){
        this.kms = (this.kms + metros);
        this.kmslast = 0;
}

}
