package Aula1.Fciha2;

import java.util.Arrays;
import java.util.Scanner;

public class Ex4 {


    public static void main(String[] args)
    {


        Scanner ler = new Scanner(System.in);
        int arr [] = new int[10];
        int k =0;
        for(int i=0;i<10;i++) {
            System.out.println("Insira os numeros para preencher o array");
            k=ler.nextInt();
            arr[i] = k;
        }

        sort(arr);
        printarr(arr);
        binsearch(arr);
    }

    public static void sort(int arr [] )
    {
        Arrays.sort(arr);
    }

    public static void printarr(int arr[])
    {
        for (int i =0;i<10;i++)
        {
            System.out.println("Array ordenado " + arr[i]);
        }
    }

    public static void binsearch(int arr[])
    {
        System.out.println(" Insira o valor que pretende encontrar");
        Scanner ler = new Scanner(System.in);
        int k = ler.nextInt();

       int a =  Arrays.binarySearch(arr,k);

        if (a<0 ) System.out.println(" Não encontrado");
       else  System.out.println(" O valor " + k + " ocorre na posição  " + a  );
    }
}
