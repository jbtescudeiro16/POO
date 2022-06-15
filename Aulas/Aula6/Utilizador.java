import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class Utilizador {

private String email;
private String password;
private String nome;
private String genero;
private  int altura;
private double peso;
private LocalDate nascimento;
private String fav_sport;


private ArrayList<String> sportsDone;




public Utilizador(){
    this.email="";
    this.password="";
    this.nome="";
    this.altura=0;
    this.genero="";
    this.peso=0.0;
    this.nascimento=LocalDate.of(0,0,0);
    this.fav_sport="";
    this.sportsDone=new ArrayList<>();
}

public Utilizador(String email,String password,String nome,int altura,String genero,double peso,LocalDate nascimento,String fav_sport,ArrayList<String> sportsDone){
    this.email=email;
    this.password=password;
    this.nome=nome;
    this.altura=altura;
    this.genero=genero;
    this.peso=peso;
    this.nascimento=nascimento;
    this.fav_sport=fav_sport;
    this.sportsDone= sportsDone;
}


public Utilizador(Utilizador a){
    this.sportsDone=a.getSportsDone();
    this.email=a.getEmail();
    this.password=a.getPassword();
    this.nome=a.getNome();
    this.genero=a.getGenero();
    this.altura=a.getAltura();
    this.peso=a.getPeso();
    this.nascimento=a.getNascimento();
    this.fav_sport=a.getFav_sport();

}

    public String getEmail() {
        return this.email;
    }

    public String getPassword() {
        return this.password;
    }

    public String getNome() {
        return this.nome;
    }

    public String getGenero() {
        return this.genero;
    }

    public int getAltura() {
        return this.altura;
    }

    public double getPeso() {
        return this.peso;
    }
    public LocalDate getNascimento() {
        return this.nascimento;
    }
    public String getFav_sport() {
        return this.fav_sport;
    }
    public ArrayList<String> getSportsDone() {
        return this.sportsDone;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void setNascimento(LocalDate nascimento) {
        this.nascimento = nascimento;
    }

    public void setFav_sport(String fav_sport) {
        this.fav_sport = fav_sport;
    }

    public void setSportsDone(ArrayList<String> sportsDone) {
        this.sportsDone = sportsDone;
    }
    public boolean equals(Utilizador a) {
    if (a ==this) return true;
    if (a==null || a.getClass() !=this.getClass()) return  false;
    return (a.getAltura()==this.altura &&
            a.getEmail().equals(this.email) &&
            a.getFav_sport().equals(this.fav_sport) &&
            a.getGenero().equals(this.genero) &&
            a.getNome() .equals(this.nome) &&
            a.getPeso()==this.peso &&
            a.getPassword().equals(this.password) &&
            a.getNascimento().equals(this.nascimento) &&
            a.getSportsDone().equals(this.sportsDone)
            );
    }

    public Utilizador clone(){
    return (new Utilizador(this));
    }
}