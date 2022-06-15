import java.time.LocalDate;

public class Encomenda {
    private String codigo;
    private String description;
    private double price;
    private int quantity;
    private double tax;
    private double discount ;
    //

    private String name;
    private int nif;
    private  String morada;
    private int num;
    private LocalDate data;
    int []linhas;
    int indice;

    public Encomenda () {

    }

    public Encomenda (String codigo,String disc , double price,int quantity,double tax , double discount)
    {
    this.codigo=codigo;
    this.description=disc;
    this.price=price;
    this.quantity=quantity;
    this.tax=tax;
    this.discount=discount;
    }
    public Encomenda(Encomenda a){
        this.codigo=a.getcodigo();
        this.description=a.getdescription();
        this.price=a.getprice();
        this.quantity=a.getquantity();
        this.tax=a.getTax();
        this.discount=a.getDiscount();
    }
    public String getcodigo(){
        return this.codigo;
    }
    public String getdescription(){
        return this.description;
    }
    public double getprice(){
        return this.price;
    }
    public int getquantity(){
        return this.quantity;
    }
    public double getTax(){
        return this.tax;
    }
    public double getDiscount(){
        return this.discount;
    }
    //nao fiz os setters

    public void print(){
        System.out.println("Codigo do protduto "+this.codigo);
        System.out.println("Descrição do protduto "+this.description);
        System.out.println("preco do protduto "+this.price);
        System.out.println("quantidade do protduto "+this.quantity);
        System.out.println("Taxa do protduto "+this.tax);
        System.out.println("Desconto do protduto "+this.discount);

    }

    public double calculaValorLinhaEnc(){
        double total = this.price;
        total+=(this.price) * this.tax;
        total-=(total*(this.discount));
        System.out.println("preço fianl" + total);
        return total;
    }
    public double calculaValorDesconto(){
        return this.price*this.discount;

    }


}
