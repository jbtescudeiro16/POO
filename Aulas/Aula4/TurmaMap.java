package Aula4;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class TurmaMap {

    private Map<String,Aluno> turma ;
    private String nome;

    public TurmaMap () {
        this.turma = new HashMap();
        this.nome = "Pl8";
    }

    public TurmaMap ( HashMap<String,Aluno> turma , String nome) {

        for (String aluno : turma.keySet()) {
            this.turma.put(aluno, turma.get(aluno).clone());
        }


        this.turma = new HashMap<>();
        for (Map.Entry<String, Aluno> entry : turma.entrySet()) {
            this.turma.put(entry.getKey(), entry.getValue().clone());
        }

        if (this.turma.containsKey("a96076")){
            this.turma.get("a96076");
        }

        this.turma = new HashMap<>();
        //this.turma=turma.entrySet().stream().collect(Collectors.toMap(Map.Entry::getKey,Map.Entry::getValue));

    }

    public TurmaMap(TurmaMap umaturma){

    }
}
