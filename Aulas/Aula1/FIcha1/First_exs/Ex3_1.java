import java.util.Scanner;

public class Ex3_1 {

    public static void main(String[] args) {
        System.out.println("Insira a nota  e caso queira terminar insira -1");
        Scanner ler = new Scanner(System.in);

        int nota = ler.nextInt();
        int zcinco = 0;
        int cdez=0;
        int dquinze = 0;
        int q20 = 0;
        while (nota!=-1) {
            if (nota >=0 && nota <5) zcinco++;
            if (nota >=5 && nota <10) cdez++;
            if (nota >=10 && nota <15) dquinze++;
            if (nota >=15 && nota <20) q20++;
            System.out.println("Insira a nota  e caso queira terminar insira -1");
             nota = ler.nextInt();
        }
        System.out.println("Total de classificações entre [0,5[ :"+zcinco);
        System.out.println("Total de classificações entre [5,10[ :"+cdez);
        System.out.println("Total de classificações entre [10,15[ :"+dquinze);
        System.out.println("Total de classificações entre [15,20[ :"+q20);
    }
}
