import java.util.*;

public class DriveIt {
    private Map<String, Veiculo> viaturas;

    public DriveIt(Map<String, Veiculo> viaturas) {
        this.viaturas = viaturas;
    }

    public Map<String, Veiculo> getViaturas() {
        return viaturas;
    }

    public void setViaturas(Map<String, Veiculo> viaturas) {
        this.viaturas = viaturas;
    }


    public Set<Veiculo> veiculosDaMarca(String marca){
        List<Veiculo> r = new ArrayList<>();
        for (Map.Entry<String, Veiculo> e : this.viaturas.entrySet()) {
            Veiculo v = e.getValue();
            if (v.getMarca().equals(marca)) r.add(v.clone());
            r.sort((v1, v2) -> v1.getMatricula().compareTo(v2.getMatricula()));
        }
        return r;
    }

}
