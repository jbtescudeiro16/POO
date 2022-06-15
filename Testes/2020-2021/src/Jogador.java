import java.util.ArrayList;
import java.util.List;

public abstract class Jogador {
    private String numero;
    private String nome;
    private List<Integer> golos; // lista com os golos em cada jogo
    //...

    public Jogador(){
        this.numero="";
        this.nome="";
        this.golos=new ArrayList<Integer>();
    }

    public Jogador(String numero, String nome) {
        this.numero = numero;
        this.nome = nome;
        this.golos=new ArrayList<Integer>();
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Integer> getGolos() {
        return golos;
    }

    public void setGolos(List<Integer> golos) {
        this.golos = golos;
    }

    public double mediaGolos() {
       return 0;
    }


}
