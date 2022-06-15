package Ex7;


import java.time.LocalDate;

public class LinhaEncomenda {
    private String codigo;
    private String description;
    private double price;
    private int quantity;
    private double tax;
    private double discount ;


    public LinhaEncomenda () {
        this.codigo="";
        this.description="";
        this.price=0;
        this.quantity=0;
        this.tax=23.0;
        this.discount=0;
    }

    public LinhaEncomenda (String codigo,String disc , double price,int quantity,double tax , double discount)
    {
        this.codigo=codigo;
        this.description=disc;
        this.price=price;
        this.quantity=quantity;
        this.tax=tax;
        this.discount=discount;
    }
    public LinhaEncomenda(LinhaEncomenda a){
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


    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setTax(double tax) {
        this.tax = tax;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }


    public LinhaEncomenda clone(){
        return  (new LinhaEncomenda(this));
    }
    public void print(){
        System.out.println("Codigo do produto "+this.codigo);
        System.out.println("Descrição do produto "+this.description);
        System.out.println("preco do produto "+this.price);
        System.out.println("quantidade do produto "+this.quantity);
        System.out.println("Taxa do produto "+this.tax);
        System.out.println("Desconto do produto "+this.discount);
    }

    public double calculaValorLinhaEnc(){
        double total = this.price;
        //System.out.println("total " + total);
        total+=(this.price) * (this.tax)*0.01;
       // System.out.println("o TOTAL ESTA " +total);
        total-=(this.price*(this.discount)*0.01);
      //  System.out.println("preço final" + total);
       // System.out.println("preço final para todos " + total*this.quantity);
        return (total *this.quantity);
    }
    public double calculaValorDesconto(){
        double disc = this.price*this.discount*0.01;
        //System.out.println("o desconto é : " +disc*this.quantity);
        return (disc*this.quantity);

    }


}