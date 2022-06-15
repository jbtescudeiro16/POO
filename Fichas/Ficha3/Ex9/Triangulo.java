package Ex9;

public class Triangulo {
    private Ponto a;
    private Ponto b;
    private Ponto c;



    public Triangulo() {
        this.a=new Ponto();
        this.b=new Ponto();
        this.c=new Ponto();
    }
    public Triangulo(Ponto a,Ponto b,Ponto c) {
        this.a=a;
        this.b=b;
        this.c=c;
    }

    public Triangulo(Triangulo tri){
        this.a=tri.geta();
        this.b=tri.getb();
        this.c=tri.getc();
    }

    public Ponto geta() {
        return this.a;
    }

    public void seta(Ponto a) {
        this.a = a;
    }

    public Ponto getb() {
        return this.b;
    }

    public void setb(Ponto b) {
        this.b = b;
    }

    public Ponto getc() {
        return c;
    }

    public void setc(Ponto c) {
        this.c = c;
    }

    public Triangulo clone(){
        return new Triangulo(this);
    }
    public boolean equals(Object obj) {
        if (obj == this) return true;
        if (obj==null|| obj.getClass()!=this.getClass()) return  false;
        Triangulo tri=(Triangulo) obj;
        return (this.a.equals(tri.geta()) && this.b.equals(tri.getb()) && this.c.equals(tri.getc()));
    }

    public double dist(Ponto p1, Ponto p2) {
        double dx = Math.abs(p1.getX() - p2.getX());
        double dy = Math.abs(p1.getY() - p2.getY());
        return Math.sqrt(Math.pow(dx,2) + Math.pow(dy,2));
    }


    public double[] getSides() {
        double[] sides = {dist(this.a,this.b),dist(this.b,this.c),dist(this.a,this.c)};
        return sides;
    }
    public double calculaPerimetroTriangulo() {
        double[] sides = getSides();
        return sides[0] + sides[1] + sides[2];
    }
    //não está acabado
}
