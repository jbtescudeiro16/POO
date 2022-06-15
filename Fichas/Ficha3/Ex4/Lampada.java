
package Ex4;
public class Lampada {

    double consumo;
    double resetpoint;
    int modo;//0-Desligada 1-Ligada 2-eco


    public  Lampada () {
    this.modo =0;
    this.consumo=0;
}
    public Lampada(double consumo,double resetpoint,int modo) {
        this.consumo=consumo;
        this.resetpoint=resetpoint;
        this.modo=modo;
    }

    public Lampada clone(){
        return new Lampada(this);
    }

    public boolean equals(Object obj){
        if (obj==this) return true;
        if (obj==null || obj.getClass() != this.getClass()) return  false ;

        Lampada a =(Lampada) obj;

        if (a.getconsumo() == this.consumo &&
                a.getmodo() == this.modo &&
                a.getResetpoint() == this.resetpoint) return  true;
        else return  false;
    }

public Lampada (Lampada lamp){
        this.consumo = lamp.getconsumo();
        this.modo= lamp.getmodo();
}
public double getconsumo(){
        return this.consumo;
}
public int getmodo(){
        return this.modo;
}

    public double getResetpoint(){return this.resetpoint;}
    public void setResetpoint(double resetpoint) {
        this.resetpoint = resetpoint;
    }


    public  void setmodo(int modo){
        this.modo= modo;
    }
    public  void setConsumo(int consumo){
        this.consumo= consumo;
    }

    public void print(){
        System.out.println(" O MODO É : "+ this.modo);
        System.out.println(" O Consumo  É : "+ this.consumo);
    }
    public void lampON() {
        this.modo = 1;
        this.consumo ++;
    }
    public void lampOFF(){this.modo=0;}
    public void lampECO(){
        this.modo=2;
    }
    public double totalConsumo(){
    return  this.consumo;
    }
    public void resettotalConsumo(){
        this.resetpoint = this.consumo;
    }
    public double periodoConsumo(){
        return  (this.consumo-this.resetpoint);
    }

}
