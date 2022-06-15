package Aula4;

import java.util.Comparator;

public class COmparadorAluno implements Comparator<Aluno> {


    public int compare(Aluno o1,Aluno o2){
    return o1.compareTo(o2);
    }

}
