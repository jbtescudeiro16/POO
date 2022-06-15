package Aula1.Fciha2;

import java.util.Scanner;

public class Ex6 {

    public static void main(String[] args) {
       Scanner ler = new Scanner(System.in);

        int matrix [] [] = new int[5][5];

        auxler(matrix);

        printmatrix(matrix);
        System.out.println("Insira o número correspondente À opçao que pretende ");
        System.out.println("1->Somar duas matrizes");
        System.out.println("2->verificar se duas matrizes são iguais ");
        System.out.println("3->verificar se duas são opostas ");

        int k = ler.nextInt();

        switch (k)
        {

            case 1:
                int matrix2 [] [] = new int[5][5];
                auxler(matrix2);
                printmatrix(matrix2);
                soma(matrix,matrix2);
                break;

                case 2:
                    int matrix3 [] [] = new int[5][5];
                auxler(matrix3);
                printmatrix(matrix3);
                equals(matrix,matrix3);
                break;

            case 3:
                findopos(matrix);
                break;
        }
    }


    public static void auxler(int matrix[][])
    {
        Scanner ler = new Scanner(System.in);
        for(int i=0;i<5;i++)
        {
            for (int j =0;j<5;j++)
            {
                System.out.println(" Insira o valor correspondente aos linides linha : "+i + " coluna "+j);
                matrix[i][j]= ler.nextInt();
            }
        }
    }

    public static void printmatrix(int matrix[][])
    {
        System.out.println("Matriz resultado :");
        System.out.println("-----------------");
        for(int i=0;i<5;i++)
        { System.out.print("|");
            for (int j =0;j<5;j++)
            {
                System.out.print(" "+matrix[i][j] +" ");
            }
            System.out.println("|");
        }
        System.out.println("-----------------");
    }

    public static void soma (int m1[][],int m2[][])
    {
        int result[] [] = new int[5][5];
        for(int i=0;i<5;i++)
        {
            for (int j=0;j<5;j++)
            {
              result[i][j] = m1[i][j]+m2[i][j];
            }
        }
        printmatrix(result);
    }

    public static void equals(int m1[][],int m2[][])
    {
        int res=1;
        for(int i=0;i<5 && res!=0;i++)
        {
            for (int j=0;j<5 && res!=0;j++)
            {
                if (m1[i][j]!=m2[i][j]) res  =0;
            }
        }
        if (res ==0) System.out.println("AS MATRIZES SAÕ DIFERENTES");
        else System.out.println("AS MATRIZES SAÕ iguais");
    }

    public static void findopos(int m1[][])
    {
        int result[][] =new int[5][5];

        for(int i=0;i<5 ;i++)
        {
            for (int j=0;j<5 ;j++)
            {
                result[i][j] = -(m1[i][j]);
            }
        }
        printmatrix(result);
    }
}
