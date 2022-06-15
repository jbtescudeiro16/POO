import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Equipa {
    private String clube;

    private Map<String,Jogador> jogadores;
    private List<Jogador>convocadosw;


    public Equipa(){
this.clube="";

    }


    public Equipa(String clube) {
        this.clube = clube;
        this.jogadores = new HashMap<String,Jogador>();
    }

    public Map<String, Jogador> getJogadores() {
        return jogadores;
    }

    public void setJogadores(Map<String, Jogador> jogadores) {
        this.jogadores=jogadores.entrySet().stream().collect(Collectors.toMap(k->k.getKey(),k->k.getValue()));
    }
    public void add(String b ,Jogador a){
        if(this.jogadores.containsKey(b)){

        }
        else {
            this.jogadores.put(b,a);
        }
    }

    public double mediaGolos(String num) {
        double m = 0;
        Jogador jog = this.jogadores.get(num);
        if (jog != null) {
            m = jog.mediaGolos();
        }
        return m;
    }
   /* public List<Jogador> getConvocados() {
        List<Jogador> conv = new ArrayList();
        for(Jogador j: this.convocados) {
            conv.add(j.clone());
        }
        return conv;
    }
*/

}
