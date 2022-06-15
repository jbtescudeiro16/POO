import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;

public class Faixa {

    private String nome;
    private String autor;
    private double duracao;
    private int classificacao;
    private ArrayList<String>letra;
    private int numerivezes;
    private LocalDateTime ultimavez;

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getAutor() {
        return this.autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public double getDuracao() {
        return this.duracao;
    }

    public void setDuracao(double duracao) {
        this.duracao = duracao;
    }

    public int getClassificacao() {
        return this.classificacao;
    }

    public void setClassificacao(int classificacao) {
        this.classificacao = classificacao;
    }

    public ArrayList<String> getLetra() {
        return this.letra;
    }

    public void setLetra(ArrayList<String> letra) {
        this.letra = letra;
    }

    public int getNumerivezes() {
        return this.numerivezes;
    }

    public void setNumerivezes(int numerivezes) {
        this.numerivezes = numerivezes;
    }

    public LocalDateTime getUltimavez() {
        return this.ultimavez;
    }

    public void setUltimavez(LocalDateTime ultimavez) {
        this.ultimavez = ultimavez;
    }


    //a
    public Faixa(Faixa f){
        this.nome=f.getNome();
        this.autor=f.getAutor();
        this.duracao=f.getDuracao();
        this.classificacao=f.getClassificacao();
        this.letra=f.getLetra();
        this.numerivezes=f.getNumerivezes();
        this.ultimavez=f.getUltimavez();
    }

    //B
     public boolean equals(Object a) {
        if (a ==this) return true;
        else if (a ==null || a.getClass()!=this.getClass() ) return false;
        Faixa aux = (Faixa) a;
        return (aux.getAutor()==this.autor &&
                aux.getClassificacao()==this.classificacao &&
                aux.getDuracao() == this.duracao &&
                aux.getLetra()==this.letra &&
                aux.getUltimavez() ==this.ultimavez &&
                aux.getNumerivezes()==this.numerivezes &&
                aux.getNome()==this.nome);
    }
}
