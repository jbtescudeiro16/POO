import org.w3c.dom.ls.LSOutput;

public class Corrida {
    private double distance;
    private  double altimetria;
    private String percurso;



public Corrida(){
    this.distance=0;
    this.altimetria=0;
    this.percurso="";
}

public Corrida(double distance,double altimetria,String percurso){

this.distance=distance;
this.altimetria=altimetria;
this.percurso=percurso;
}

public Corrida(Corrida a) {
    this.altimetria=a.getAltimetria();
    this.percurso=a.getPercurso();
    this.distance=a.getDistance();
}

    public double getDistance() {
        return this.distance;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }

    public double getAltimetria() {
        return this.altimetria;
    }

    public void setAltimetria(double altimetria) {
        this.altimetria = altimetria;
    }

    public String getPercurso() {
        return this.percurso;
    }

    public void setPercurso(String percurso) {
        this.percurso = percurso;
    }


    public boolean equals(Corrida a){
    if (a==this) return true;
    if (a==null || a.getClass() !=this.getClass()) return false;
    return (a.getAltimetria() == this.altimetria &&
            a.getDistance() == this.distance &&
            a.getPercurso()==this.getPercurso()
            );
    }

    public  Corrida clone(){
    return  (new Corrida(this));
    }


    public String toString() {
        return ("Corrida{" +
                "distance=" + this.distance +
                ", altimetria=" + this.altimetria +
                ", percurso='" + this.percurso + '\'' +
                '}');
    }
}
