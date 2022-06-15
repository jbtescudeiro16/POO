package Aula1.Fciha2;

import java.util.Arrays;
import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        String arr[] = new String[10];


        for (int i = 0; i < 10; i++) {
            System.out.println("Insira as strings para o array");
            arr[i] = ler.nextLine();
        }


        System.out.println("Insira o número correspondente à opçao que pretende realizar");
        System.out.println("1->Determinar o array resultante sem string repetidas");
        System.out.println("2->Determinar a maior string inserida ");
        System.out.println("3->Determinar o array com as strings que aparecem mais que uma vez ");
        System.out.println("4->Determinar quantas vezes umaa string ocorre no array ");


        int k = ler.nextInt();


        switch (k) {
            case 1:
                nonrep(arr);
                //printarr(arr);
                break;

            case 2:
                biggest(arr);
                break;

            case 3:
                onemore(arr);
                break;
            case 4:
                System.out.println("Insira a string que pretende  verrificar : ");
                howmany(arr);
                break;
        }

    }

    public static void nonrep(String arr[]) {
        String newarr[] = new String[10];
        int j = 0;

        for (int i = 0; i < 10; i++) {
            if (pertence1(newarr, arr[i], j) == false) {
                //System.out.println( arr[i] +" nao pertence ao array");
                newarr[j] = arr[i];
                j++;
                // printarr2(newarr,j);
            }
        }

        for (int i = 0; i < j; i++) {
            arr[i] = newarr[i];
        }
        printarr2(newarr, j);
    }

    public static boolean pertence1(String arr[], String a, int j) {
        for (int i = 0; i < j; i++) {/*
         if (arr[i].compareTo(a)==0)
         {


         }*/

            boolean result = Arrays.stream(new String[]{arr[i]}).anyMatch(a::equals);
            if (result) {
                //   System.out.println(arr[i]  + " " + a + " São iguais ");
                return true;
            }
        }
        return false;
    }


    public static void printarr(String arr[]) {
        for (int i = 0; i < 10; i++) {
            System.out.println("array result " + arr[i]);
        }
    }

    public static void printarr2(String arr[], int k) {
        for (int i = 0; i < k; i++) {
            System.out.println("array resultado esta : " + arr[i]);
        }
    }

    public static void biggest(String arr[]) {
        String maior = arr[0];
        int size = arr[0].length();

        for (int i = 1; i < 10; i++) {
            if (arr[i].length() > size) {
                size = arr[i].length();
                maior = arr[i];
            }
        }
        System.out.println(" A maior string do array é : " + maior + " com size de  " + size);
    }


    public static void onemore(String arr[])
    {
        String newarr[] = new String[10];
        int j=0;
         int r=0;
        for(int i =0;i<10;i++)
        {
            if (pertence(arr[i],newarr,j)==false)
            {
                r=pertence2(arr[i],arr);
                if (r>1)
                {
                    newarr[j]=arr[i];
                    j++;
                }
            }
        }

        for (int i=0;i<j;i++)
        {
            arr[i] = newarr[i];
        }
        printarr2(arr,j);
    }


    public static boolean pertence(String a , String arr[],int j)
    {

        for (int i=0;i<j;i++)
        {
            if (arr[i].equals(a))  return true;
        }
        return false;
    }

    public static int pertence2(String a , String arr[])
    {
    int count =0;
    for (int i=0;i<10;i++)
    {
        if (arr[i].equals(a)) count ++;
    }
    return count;
    }


    public static void howmany(String arr[])
    {
        Scanner ler = new Scanner(System.in);
        String aux = ler.nextLine();


        int count = 0;

        for (int i = 0; i < 10; i++)
        {
            if (arr[i].equals(aux)) count ++;
        }
        System.out.println(" A string "+aux +" ocorre "+count +" vezes no array ");
    }
}


