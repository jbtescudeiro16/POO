package Aula4;
import java.util.*;


//assumindo que já existe uma classe aluno


import java.util.Iterator;
import java.util.stream.Collectors;

public class Turma {

    private String nome;
    private List<Aluno> turma ;



    public Turma ()
    {
        this.nome="PL9";
        this.turma = new ArrayList<Aluno>();

    }

    public Turma (String nome , ArrayList<Aluno> turma) {
        this.nome  = nome;
        this.turma = new ArrayList<Aluno>();
        /*
        for (Aluno iteracao:turma) {
            this.turma.add(iteracao.clone);
        }*/

        /*
        Iterator <Aluno> iterator = turma.iterator();
        while (iterator.hasNext()) {

            Aluno aux = iterator.next();
            this.turma.add(iterator.clone());
        }
        */

        this.turma=turma.stream().map(Aluno::clone).collect(Collectors.toList());

    }

    public boolean verificaaluno(String numero) {

        boolean existe =false;
        Iterator<Aluno> it = this.turma.iterator();
        while(it.hasNext() && !existe){
            Aluno aux =it.next();
            if (aux.getnumero.equals(numero)) existe = true;
        }
        return existe;
    }


    public boolean verificaalunoIteradorinterno(String numero)
    {
        //neste caso aluno é uma variavel;
    boolean existe=this.turma.stream().anyMatch(aluno -> aluno.getnumero.equals(numero));
    return existe;
    }

    public Set<Aluno> ordenaNumero(){
        Set<Aluno> turma_ordenada=new TreeSet<Aluno>();
        turma_ordenada=this.turma.stream().map(Aluno::clone).collect(Collectors.toSet());
        return turma_ordenada;
    }



    public Set<Aluno> ordenacomparador(Comparator<Aluno> comparator) {
        Set<Aluno> turma_ordenada=new TreeSet<Aluno>(comparador);

    }


}

