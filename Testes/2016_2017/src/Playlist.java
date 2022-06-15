import java.util.List;
import java.util.Map;

public class Playlist {
    private String nome;
    private Map<String, List<Faixa>>musicas;

    public List<Faixa> getFaixas(String autor) {
        if (this.musicas.containsKey(autor)){
    return this.musicas.get(autor);
    return this.musicas.get(autor).stream().map(Faixa::)
        }
        else throw new AutorInexistenteXCEPTION()
    }
}
