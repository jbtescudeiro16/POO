package Ex7;
import javax.swing.*;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.Objects;

public class Encomenda {
    private String name;
    private int nif;
    private  String morada;
    private int num;
    private LocalDate data;
    private LinhaEncomenda []linhas;
    int size;



    public Encomenda(){
this.name="";
this.nif=0;
this.morada="";
this.num=0;
this.data=LocalDate.of(0,0,0);
this.linhas=new LinhaEncomenda[10];
int indice=0;
    }
    public Encomenda(String nome,int nif ,String morada, int num , LocalDate data){
    this.name=nome;
    this.nif=nif;
    this.morada=morada;
    this.num=num;
    this.data=data;
    this.linhas=new LinhaEncomenda[10];
    }
    public Encomenda(Encomenda a){
        this.name = a.getname();
        this.nif=a.getnif();
        this.morada=a.getmorada();
        this.num=a.getnum();
        this.data=a.getdata();
        this.linhas=a.getLinhas();
    }

    public void add(LinhaEncomenda a){
        int i;
        for( i=0; this.linhas[i]!=null;i++);
        this.linhas[i]=a;
        this.size++;
    }
    public  String getname(){
        return this.name;
    }
    public  int getnif(){
        return this.nif;
    }

    public LinhaEncomenda[] getLinhas(){
        return this.linhas;
    }
    public  String getmorada(){
        return this.morada;
    }
    public  int getnum(){
        return this.num;
    }
    public  int getsize(){
        return this.size;
    }
    public  LocalDate getdata(){
        return this.data;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNif(int nif) {
        this.nif = nif;
    }

    public void setMorada(String morada) {
        this.morada = morada;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public void setLinhas(LinhaEncomenda[] linhas) {
        this.linhas = linhas;
    }

//a cena do equals da linha não ta bem
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Encomenda encomenda = (Encomenda) o;
        return (this.nif == encomenda.getnif()
                && this.num == encomenda.getnum()
                && this.size == encomenda.getsize()
                &&  this.morada==encomenda.getmorada()
                &&this.data.equals(encomenda.getdata()));
    }

    public Encomenda clone(){
        return new Encomenda(this);
    }


    public void print (){
        System.out.println("Nome : "+name);
        System.out.println("nif : "+nif);
        System.out.println("Morada : "+ morada);
        System.out.println("NUmero da encomenda " + num );
        System.out.println("DATA : " + data);
        for(int i=0;i<this.size;i++){
            System.out.println("Artigo novo na linha ");
            System.out.println("---------------------------------- ");
            linhas[i].print();
        }
        System.out.println("-------------------------------------");
    }

    public double calculaValorTotal(){

        LinhaEncomenda a;
        double total=0;
        for(int i=0;i<this.size;i++){
            a=this.linhas[i];
            total+=a.calculaValorLinhaEnc();
        }
        System.out.println("O preço total das encomendas todas  é :" + total);
        return  total;
    }

    public double calculaValorDesconto() {
        LinhaEncomenda a;
        double total=0;
        for(int i=0;i<this.size;i++){
            a=this.linhas[i];
            total+=a.calculaValorDesconto();
        }
        System.out.println("O preço total de descontos  é :" + total);
        return  total;
    }
    public int numeroTotalProdutos(){
        LinhaEncomenda a;
        int total=0;
        for(int i=0;i<this.size;i++){
            a=this.linhas[i];
            total+=a.getquantity();
        }
        System.out.println("O núemro total de itens encomendados é :" + total);
       return total;
    }
    public boolean existeProdutoEncomenda(String refProduto) {
        LinhaEncomenda a;
        int total=0;
        for(int i=0;i<this.size;i++){
            a=this.linhas[i];
           if ( a.getcodigo().equals(refProduto)) {
               System.out.println("este produto existe " + refProduto);
               return  true;
           }
        }
        System.out.println("este produto  não existe " + refProduto);
        return false;
    }
    public int  posiçãoexiste(String refProduto) {
        LinhaEncomenda a;
        int total=0,pos=0;
        for(int i=0;i<this.size;i++){
            a=this.linhas[i];
            if ( a.getcodigo().equals(refProduto)) {
                pos= i;
            }
        }
        return pos;
    }


    //ja tinha feito um parecido
    public void adicionaLinha(LinhaEncomenda linha){
        int i;
        for( i=0; this.linhas[i]!=null;i++);
        this.linhas[i]=linha;
        this.size++;
    }
    public void removeProduto(String codProd) {
        if (this.existeProdutoEncomenda(codProd)){
       int k = this.posiçãoexiste(codProd);

          //  System.out.println("O k é : " +k);
            LinhaEncomenda[] copy = new LinhaEncomenda[this.size];

            for (int i = 0, j = 0; i < this.size; i++) {
                if (i != k) {
                    copy[j++] = linhas[i];
                }
            }
            for (int i = 0; i < this.size-1; i++) {

                    linhas[i] = copy[i];

            }
            this.size--;
            System.out.println("Removi o produto : " + codProd);
        }
        else System.out.println("não eiste o produto");
    }


}
