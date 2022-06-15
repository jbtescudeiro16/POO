import java.util.Scanner;

public class Ex2_1 {


    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);
        int ano1 = ler.nextInt();
        int mes1 = ler.nextInt();
        int dia1 = ler.nextInt();
        int hor1 = ler.nextInt();
        int min1 = ler.nextInt();
        int seg1 = ler.nextInt();
        int ano2 = ler.nextInt();
        int mes2 = ler.nextInt();
        int dia2 = ler.nextInt();
        int hor2 = ler.nextInt();
        int min2 = ler.nextInt();
        int seg2 = ler.nextInt();

        int anores = ano1 + ano2;
        int mesres = mes1 + mes2;
        if (mesres > 12) {
            mesres = mesres - 12;
            anores += 1;
        }
        int diares = dia1 + dia2;
        if (diares > 31) {
            mesres += 1;
            diares = diares - 31;
        }
        int horares = hor1 + hor2;
        if (horares > 24) {
            horares = horares - 24;
            diares += 1;
        }
        int minres = min1 + min2;
        if (minres > 60) {
            horares += 1;
            minres = minres - 60;
        }
        int segres = seg1 + seg2;
        if (segres > 60) {
            minres += 1;
            segres = segres - 60;
        }
        System.out.println("ANO: " + anores + "|Mes " + mesres + "|Dia " + diares + " |HORA " + horares + "|MINUTO " + minres + "|Segundo " + segres);
    }
}