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
        this.status = status;

    }

    public String getmarca() {
        return this.marca;
    }

    public int getano() {
        return this.ano;
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
        this.kms = (this.kms + metros);
        this.medialast = velocidade / metros;
        this.kmslast = metros;
    }

    public void travaCarro(double metros){
        this.kms = (this.kms + metros);
        this.kmslast = 0;
}

}
