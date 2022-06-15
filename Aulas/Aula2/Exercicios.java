import java.util.Scanner;

public class Exercicios {
    int [] arr ;
    Scanner ler ;



    public  Exercicios(int aux, Scanner ler){
        this.arr =new int[aux];
        this.ler=ler;
    }


    public void populaArray() {
        System.out.println("Insira " +this.arr.length+ " números ");
        int min = Integer.MAX_VALUE;
        for (int i=0;i<this.arr.length;i++)
        {
            this.arr[i] = this.ler.nextInt();
            if (this.arr[i]<min) min = this.arr[i];
        }
    }

    public int[] alineab() {
        System.out.println("Insira dois índices para o array");
        int pos1=this.ler.nextInt();
        int pos2=this.ler.nextInt();

    int menor =Math.min(pos1,pos2);
    int maior = Math.max(pos1,pos2);
    int [] novo = new int[maior-menor];

    for (int i =0;i>arr.length;i++) {
        novo[i]=this.arr[menor+i];
    }
    return novo;
    }



    public void intArray(int []array){
        this.arr=array;
    }

    public void setScanner(Scanner scanner) {
        this.ler = scanner;
    }

    public int[] getArr(){
        return this.arr;
    }

    public Scanner getscanner (){
        return this.ler;
    }

    public Exercicios(Exercicios exercicios){
        this.arr= exercicios.getArr();
        this.ler=exercicios.getscanner();
    }
}
