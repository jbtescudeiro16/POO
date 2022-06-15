import java.time.LocalDate;

public class Encomenda2 {
    private String name;
    private int nif;
    private  String morada;
    private int num;
    private LocalDate data;
    int []linhas;
    int indice;



    public Encomenda2(){

    }
    public Encomenda2(String nome,int nif ,String morada, int num , LocalDate data){
    this.name=nome;
    this.nif=nif;
    this.morada=morada;
    this.num=num;
    this.data=data;
    }
    public Encomenda2(Encomenda2 a){
        this.name = a.getname();
        this.nif=a.getnif();
        this.morada=a.getmorada();
        this.num=a.getnum();
        this.data=a.getdata();
    }
    public  String getname(){
        return this.name;
    }
    public  int getnif(){
        return this.nif;
    }
    public  String getmorada(){
        return this.morada;
    }
    public  int getnum(){
        return this.num;
    }
    public  LocalDate getdata(){
        return this.data;
    }

    public void print (){
        System.out.println("Nome : "+name);
        System.out.println("nif : "+nif);
        System.out.println("Morada : "+ morada);
        System.out.println("NUmero da encomenda " + num );
        System.out.println("DATA : " + data);
    }
}
