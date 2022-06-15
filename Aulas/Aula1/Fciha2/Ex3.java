package Aula1.Fciha2;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Scanner;

import static java.time.temporal.ChronoUnit.DAYS;

public class Ex3 {

    public static void main(String[] args)
    {

        LocalDate arr[] = new LocalDate[6];
        Scanner ler  = new Scanner(System.in);
        for (int i=0;i<3;i++)
        {
            insereData(arr, i);
        }
        pdata(arr);
        dataMaisProxima(arr);
        returnstr(arr);
    }



    public  static void  insereData(LocalDate data[],int i)
    {
        Scanner ler  = new Scanner(System.in);
        System.out.println("Insira o ano : para o indice " + i);
        int year = ler.nextInt();
        System.out.println("Insira o mes : para o indice " + i);
        int month = ler.nextInt();
        System.out.println("Insira o dia :para o indice " + i);
        int day = ler.nextInt();
        LocalDate date= LocalDate.of(year,month,day);
        data[i] =date;
    }

    public static void pdata(LocalDate data [] )
    {
        for (int i=0;i<3;i++)
        {
            System.out.println(data[i]);
        }
    }

    public static void dataMaisProxima(LocalDate data [])
    {
        System.out.println(" Insira a data :");
        Scanner ler  = new Scanner(System.in);
        System.out.println("Insira o ano : ");
        int year = ler.nextInt();
        System.out.println("Insira o mes : " );
        int month = ler.nextInt();
        System.out.println("Insira o dia : " );
        int day = ler.nextInt();
        LocalDate date= LocalDate.of(year,month,day);

        long shortestDiff = Math.abs(DAYS.between(date, data[0]));
        LocalDate maisprox = LocalDate.of(data[0].getYear(),data[0].getMonth(),data[0].getDayOfMonth());

        for(int i=1;i<3;i++)
        {
            LocalDate aux = data[i];
            long days = Math.abs(DAYS.between(date, aux));
            if (days<shortestDiff){
                maisprox=aux;
                shortestDiff=days;
            }

        }
        System.out.println(" A data mais proxima de " + date + " é : " + maisprox);

    }

    public static String returnstr(LocalDate arr [])
    {
        String a = "";
    for (int i =0;i<3;i++){
        a=a+" "+ arr[i];
    }
        System.out.println(" A STRING RESULTANTE É : " + a );
    return  a;

    }

}
