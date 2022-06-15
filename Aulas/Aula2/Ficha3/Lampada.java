public class Lampada {

    double consumo ;
    double resetpoint;
    int modo;//0-Desligada 1-Ligada


    public  Lampada () {
    this.modo =0;
    this.consumo=0;
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
    public void lampECO(){
        this.modo=0;
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
