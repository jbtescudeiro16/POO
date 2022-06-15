public class Canoagem {

private String embarcacao;
private double vel;
private String direcao;
private double distance;
private int voltas;


public Canoagem(){
    this.embarcacao="";
    this.vel=0.0;
    this.direcao="";
    this.distance=0.0;
    this.voltas=0;
}

public Canoagem(String embarcacao,double vel,String direcao,double distance,int voltas){
    this.embarcacao=embarcacao;
    this.vel=vel;
    this.direcao=direcao;
    this.distance=distance;
    this.voltas=voltas;
}


public Canoagem(Canoagem canoagem)
{
    this.embarcacao=canoagem.getEmbarcacao();
    this.voltas= canoagem.getVoltas();
    this.distance= canoagem.getDistance();
    this.vel= canoagem.getVel();
    this.direcao=canoagem.getDirecao();
}

    public String getEmbarcacao() {
        return this.embarcacao;
    }

    public void setEmbarcacao(String embarcacao) {
        this.embarcacao = embarcacao;
    }

    public double getVel() {
        return this.vel;
    }

    public void setVel(double vel) {
        this.vel = vel;
    }

    public String getDirecao() {
        return this.direcao;
    }

    public void setDirecao(String direcao) {
        this.direcao = direcao;
    }

    public double getDistance() {
        return this.distance;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }

    public int getVoltas() {
        return this.voltas;
    }

    public void setVoltas(int voltas) {
        this.voltas = voltas;
    }

    public boolean equals(Canoagem a){
    if (a==this) return true;
    if (a==null || a.getClass() != this.getClass()) return false;
    return (a.getDirecao()==this.direcao &&
            a.getDistance()==this.distance &&
            a.getEmbarcacao() == this.embarcacao &&
            a.getVel() == this.vel &&
            a.getVoltas()==this.voltas);
    }
    public Canoagem clone(){
    return new Canoagem(this);
    }

    @Override
    public String toString() {
        return "Canoagem{" +
                "embarcacao='" + this.embarcacao + '\'' +
                ", vel=" + this.vel +
                ", direcao='" + this.direcao + '\'' +
                ", distance=" + this.distance +
                ", voltas=" + this.voltas +
                '}';
    }
}
