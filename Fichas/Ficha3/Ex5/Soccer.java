package Ex5;
public class Soccer {
    private  int status;
    private int goloscasa;
    private  int golosvis;
    private String result;

   public Soccer(){
        this.status =0;
        this.goloscasa=0;
        this.golosvis =0;
    }

    public Soccer(int status,int goloscasa,int golosvis){
        this.status =status;
        this.goloscasa=goloscasa;
        this.golosvis=golosvis ;
    }
    public Soccer(Soccer a){
       this.status = a.getstatus();
       this.golosvis=a.getgolosvis();
       this.goloscasa=a.getgoloscasa();
       this.result=a.getresult();
    }
    public int getstatus(){
       return this.status;
    }
    public int getgolosvis(){
        return this.golosvis;
    }
    public int getgoloscasa(){
        return this.goloscasa;
    }
    public String getresult(){
        return this.result;
    }
    public void setres() {
       this.result=("#    Casa : "+goloscasa + " -  " + golosvis+ " :Visitante    #");
    }
    public void toStr(){
        System.out.println("######### Resultado ################");
        System.out.println(this.result);
        System.out.println("###################################");
        System.out.println("Status do game : " + this.status);

    }
    public void startGame(){
       this.status = 1;
       setres();
    }
    public void endGame(){
        this.status = 2;
        setres();
    }

    public void goloVisitado(){
       this.goloscasa=(this.goloscasa+1);
        System.out.println("Golo da equipa da casa ");
        setres();
    }
    public void goloVisitante(){
       this.golosvis = (this.golosvis+1);
        System.out.println("Golo do visitante ");
       setres();
    }
    public String resultadoActual(){
       return this.result;
    }


    public void valida(int x)
    {
    if (this.status!=0){
        if (x==1) getgoloscasa();
        if (x==2) getgolosvis();
        if (x==3) getresult();
        if (x==4) goloVisitante();
        if (x==5) goloVisitado();
        if (x==6) toStr();
    }
    else System.out.println("Impossivel,Jogo ainda por iniciar");
    }


}
