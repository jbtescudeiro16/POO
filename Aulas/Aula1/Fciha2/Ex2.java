package Aula1.Fciha2;

import java.util.Scanner;

public class Ex2 {

    public static void main(String[] args)
    {

        Scanner ler = new Scanner(System.in);


        int arr[][] = new int[5][5];
        preenche(arr);

        System.out.println("Insira a opção que pretende realizar");
        System.out.println("OPC 1 - Atualizar uma nota");
        System.out.println("OPC 2 - calcular a media de um aluno");
        System.out.println("OPC 3 - calcular a media de uma uc");
        System.out.println("OPC 4 - calcular a nota máxima");
        System.out.println("OPC 5 - calcular a nota minima");
        System.out.println("OPC 6 - Array acima de um dado valor");
        System.out.println("OPC 7 - String notas todas ");
        System.out.println("OPC 8 - Indice da UC com maior média");


        int k = ler.nextInt();

        switch (k) {
            case 1:
                update(arr);
                imprime(arr);
                break;
            case 2 :
                media(arr);
                break;
            case 3 :
                mediaUC(arr);
                break;
            case 4 :
                max(arr);
                break;
            case 5 :
                min(arr);
                break;
            case 6 :
                findarr(arr);
                break;
            case 7 :
                auxstr(arr);
                break;
            case 8 :
                medind(arr);
                break;

         }

    }

    public static void preenche(int arr[][])
    {
        Scanner ler = new Scanner(System.in);

        for(int i=0;i<5;i++)
        {
            for(int k=0;k<5;k++)
            {
            System.out.println("Insira a nota da uc " +k + " do aluno "+i);
            int l = ler.nextInt();
            arr[i][k] = l;
            }
        }
    }

    public static void update (int arr[][])
    {
        Scanner ler = new Scanner(System.in);
        System.out.println("Insira o aluno ");
        int k = ler.nextInt();
        System.out.println("Insira a UC  ");
        int c = ler.nextInt();
        System.out.println("Insira a nota");
        int l = ler.nextInt();

        if (k>5||c>5 ) {
            System.out.println("Impossivel");
        }
        else {
            arr[k][c] = l;
        }
    }

    public static void imprime(int arr[][])
    {
        for (int i = 0; i < 5; i++)
        {
            for (int k = 0; k < 5; k++)
            {
                System.out.println("Nota do aluno " + i + " À UC " + k + " " + arr[i][k]);
            }
        }
    }

    public static void media ( int arr[][])
    {

            Scanner ler = new Scanner(System.in);
            System.out.println("Insira o aluno ");
            int k = ler.nextInt();
            double count= 0.0;

            for (int i = 0; i < 5; i++) {
                count += arr[k][i];
            }
            System.out.println("A media do aluno " + k + " foi " + count / 5);

    }

    public static void mediaUC ( int arr[][])
    {

        Scanner ler = new Scanner(System.in);
        System.out.println("Insira a UC");
        int k = ler.nextInt();
        double count= 0.0;

        for (int i = 0; i < 5; i++) {
            count += arr[i][k];
        }
        System.out.println("A media da UC " + k + " foi " + count / 5);

    }

    public static void max(int arr[][])
    {
        int l=0 ,col=0;
        int maxim=arr[0][0];

        for (int i=0;i<5;i++)
        {
            for (int c=0;c<5;c++)
            {
                if (arr[i][c] >maxim)
                {
                     maxim = arr[i][c];
                     l=i;
                     col = c;
                }
            }
        }
        System.out.println("A nota mais alta foi " + maxim + " do aluno "+ l + " da uc "+ col);
    }

    public static void min(int arr[][])
    {
        int l=0 ,col=0;
        int  min=arr[0][0];

        for (int i=0;i<5;i++)
        {
            for (int c=0;c<5;c++)
            {
                if (arr[i][c] <min)
                {
                    min = arr[i][c];
                    l=i;
                    col = c;
                }
            }
        }
        System.out.println("A nota mais baixa foi " + min + " do aluno "+ l + " da uc "+ col);
    }

    public static void findarr(int arr[][]) {

        Scanner ler = new Scanner(System.in);
        System.out.printf("Imprima  a nota correspondente ao teto mínimo :");
        int q= ler.nextInt();
        int p = 0;

        int novo[] = new int[50];

        for (int i=0;i<5;i++)
        {
            for (int k=0;k<5;k++)
            {
                if (arr[i][k]>q)
                {
                    novo[p] = arr[i][k];
                    p++;
                }
            }
        }
        for (int i=0;i<p;i++)
        {
            System.out.println("Array  com notas superiores a "+ q + " : " + novo[i]);
        }
    }


    public static void auxstr(int arr[][])
    {
    String aux=" Notas  : ";
        for (int i=0;i<5;i++)
        {
            for (int k=0;k<5;k++)
            {
            aux = aux+" "+arr[i][k]+ " ";
            }
        }
        System.out.println(aux);
    }

    public static void medind(int arr[][])
    {
        double novo[] = new double[5];
        double count=0.0;
        int maxind=0;

        for (int i=0;i<5;i++)
        {
            for (int k=0;k<5;k++)
            {
                count+=arr[k][i];
            }
            novo[i] = count/5;
            count=0.0;
        }

        for(int i=0;i<5;i++)
        {
            if (novo[i]>maxind)  maxind=i;

        }
        System.out.println("A uc com a maior média é : " + maxind);
    }
}
