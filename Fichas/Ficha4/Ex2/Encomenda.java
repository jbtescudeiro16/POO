package Aula1.Ficha4.Ex2;
import javax.swing.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Objects;

public class Encomenda {
    private String name;
    private int nif;
    private String morada;
    private int num;
    private LocalDate data;
    private ArrayList<LinhaEncomenda> linhas;
    int size;


    public Encomenda() {
        this.name = "";
        this.nif = 0;
        this.morada = "";
        this.num = 0;
        this.data = LocalDate.of(0, 0, 0);
        this.linhas = new ArrayList<>();
        int indice = 0;
    }

    public Encomenda(String nome, int nif, String morada, int num, LocalDate data) {
        this.name = nome;
        this.nif = nif;
        this.morada = morada;
        this.num = num;
        this.data = data;
        this.linhas = new ArrayList<>();
    }

    public Encomenda(Encomenda a) {
        this.name = a.getname();
        this.nif = a.getnif();
        this.morada = a.getmorada();
        this.num = a.getnum();
        this.data = a.getdata();
        this.linhas = a.getLinhas();
    }

    public void add(LinhaEncomenda a) {
        this.linhas.add(a);
    }

    public String getname() {
        return this.name;
    }

    public int getnif() {
        return this.nif;
    }

    public ArrayList<LinhaEncomenda> getLinhas() {
        return this.linhas;
    }

    public String getmorada() {
        return this.morada;
    }

    public int getnum() {
        return this.num;
    }

    public int getsize() {
        return this.size;
    }

    public LocalDate getdata() {
        return this.data;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNif(int nif) {
        this.nif = nif;
    }

    public void setMorada(String morada) {
        this.morada = morada;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public void setLinhas(ArrayList<LinhaEncomenda> linhas) {
        this.linhas = linhas;
    }

    //a cena do equals da linha não ta bem
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Encomenda encomenda = (Encomenda) o;
        return (this.nif == encomenda.getnif()
                && this.num == encomenda.getnum()
                && this.size == encomenda.getsize()
                && this.morada == encomenda.getmorada()
                && this.data.equals(encomenda.getdata()));
    }

    public Encomenda clone() {
        return new Encomenda(this);
    }


    public void print() {
        System.out.println("Nome : " + name);
        System.out.println("nif : " + nif);
        System.out.println("Morada : " + morada);
        System.out.println("NUmero da encomenda " + num);
        System.out.println("DATA : " + data);

        Iterator<LinhaEncomenda> value = this.linhas.iterator();


        while (value.hasNext()) {
            value.next().print();
        }

        System.out.println("-------------------------------------");
    }

    public double calculaValorTotal() {

        double total = 0;

        Iterator<LinhaEncomenda> value = this.linhas.iterator();


        while (value.hasNext()) {
            total += value.next().calculaValorLinhaEnc();
        }
        System.out.println("O preço total das encomendas todas  é :" + total);
        return total;
    }

    public double calculaValorDesconto() {

        double total = 0;

        Iterator<LinhaEncomenda> value = this.linhas.iterator();


        while (value.hasNext()) {
            total += value.next().calculaValorDesconto();
        }
        System.out.println("O preço total de descontos  é :" + total);
        return total;
    }

    public int numeroTotalProdutos() {
        LinhaEncomenda a;
        int total = 0;

        Iterator<LinhaEncomenda> value = this.linhas.iterator();


        while (value.hasNext()) {
            total += value.next().getquantity();
        }

        System.out.println("O núemro total de itens encomendados é :" + total);
        return total;
    }

    public boolean existeProdutoEncomenda(String refProduto) {

        Iterator<LinhaEncomenda> value = this.linhas.iterator();


        while (value.hasNext()) {
            if (value.next().getcodigo().equals(refProduto)) {
                System.out.println("este produto existe " + refProduto);
                return true;
            }
        }

        System.out.println("este produto  não existe " + refProduto);
        return false;
    }

    /*
    public int  posiçãoexiste(String refProduto) {
        LinhaEncomenda a;
        int total=0,pos=0;

        Iterator<LinhaEncomenda> value  = this.linhas.iterator();

        while (value.hasNext()) {
            if (value.next().getcodigo().equals(refProduto)) {
               pos=value
                return  true;
            }
        }


        return pos;
    }
*/

    //ja tinha feito um parecido
    public void adicionaLinha(LinhaEncomenda linha) {
        this.linhas.add(linha);

    }

    public void removeProduto(String codProd) {


        int k = 0;

        int i = 0;

        if (existeProdutoEncomenda(codProd)) {
            for (Iterator<LinhaEncomenda> value = this.linhas.iterator(); value.hasNext(); k++) {
                LinhaEncomenda aux = value.next().clone();
                if (aux.getcodigo().equals(codProd)) {
                    i = k;
                }

            }
            this.linhas.remove(i);
            System.out.println("Removi o produto : " + codProd);
        }
    }
}
