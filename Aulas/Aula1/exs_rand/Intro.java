public class Intro{
    /**
     *O meu primeiro método
     */
    public static void  main (String[] args){
        String saudacao = gerasaudacao(" Escudas");
        System.out.println(saudacao);
        //System.out.println(gerasaudacao(" Escudas"));


        int i =3;
        double k = 2.0;
        final double pi = 3.14 ;
        char a = 'a';

    }

    /**
     *
     * @param nome
     * @return String
     */
    public static String gerasaudacao(String nome) {
        return "Olá"+nome+"!";
    }

}

