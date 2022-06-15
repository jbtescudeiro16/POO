package Aula1.Fciha2;

import java.util.Scanner;

public class Aux1 {

    public int min() {

        int arr[] =new int[10];


        System.out.println("Insira os valores para o array");
        Scanner ler = new Scanner(System.in);
        arr[0]=ler.nextInt();
        int min = arr[0];
        for (int i=1;i<10 ;i++)
        {
            System.out.println("Insira os valores para o array");
            arr[i]=ler.nextInt();
            if (arr[i]<min) min = arr[i];
        }
    return min;

    }

    //Exluindo as pontas
    public void between() {

        Scanner ler = new Scanner(System.in);
        System.out.println("Insira o tamanho do array");
        int size = ler.nextInt();
        int arr[] =new int[size];


        System.out.println("Insira os valores para o array");
        arr[0]=ler.nextInt();
        for (int i=1;i<size ;i++)
        {
            System.out.println("Insira os valores para o array");
            arr[i]=ler.nextInt();

        }
        System.out.println("Insira o indice do primeiro elemento ");
        int fst = ler.nextInt();
        System.out.println("Insira o indice do segundo  elemento ");
        int snd = ler.nextInt();

        if (fst <0 || snd >size || fst>=snd) {
            System.out.println("Impossivel realizar ");
        }
        else {
            int dif = snd-fst;
            int novo[] = new int[dif];
            int k =0;
            for (int i = fst+1;i<snd;i++)
            {
                novo[k]=arr[i];
                k++;

            }
            for (int i = 0;i<dif-1 ;i++)
            {
                System.out.println("O valores no intervalo são :"+novo[i]);

            }
        }

    }

    public  void comuns() {

        Scanner ler = new Scanner(System.in);
        System.out.println("Insira o tamanho do  1ª array");
        int size1 = ler.nextInt();
        int arr1[] =new int[size1];


        System.out.println("Insira os valores para o array");
        arr1[0]=ler.nextInt();
        for (int i=1;i<size1 ;i++)
        {
            System.out.println("Insira os valores para o array");
            arr1[i]=ler.nextInt();

        }

        System.out.println("Insira o tamanho do  2ª array");
        int size2 = ler.nextInt();
        int arr2[] =new int[size2];

        System.out.println("Insira os valores para o array");
        arr2[0]=ler.nextInt();
        for (int i=1;i<size2 ;i++)
        {
            System.out.println("Insira os valores para o array");
            arr2[i]=ler.nextInt();
        }

        int min = Math.min(size1,size2);
        int count =0;
        int res[] = new int[min];

        for (int i=0;i<size1;i++)
        {
            for (int k=0;k<size2;k++)
            {
                if (arr1[i] == arr2[k])
                {

                    res[count] = arr1[i];
                    count ++;
                }
            }
        }
        if (count ==0) System.out.println("Não há comuns ");
        else {
            for (int i = 0; i < count; i++)
            {
                System.out.println("O valores no comuns  são :" + res[i]);
            }
        }
    }

}
