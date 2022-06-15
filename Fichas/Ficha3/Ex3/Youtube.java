package Ex3;
import java.sql.SQLOutput;
import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.time.chrono.ChronoLocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.lang.String;
import java.util.List;
import java.util.SortedMap;


import static java.util.concurrent.TimeUnit.DAYS;


public class Youtube {

    private String nomevid;
    private int bytes;
    private  LocalDate date ;
    private int resolution;
    private int durmin;
    private int dursec;
    private ArrayList<String> comms;
    private int likes ;
    private int dislikes;

    public Youtube(){
        this.nomevid="";
        this.bytes=0;
        this.date=LocalDate.of(0,0,0 );
        this.resolution=0;
        this.durmin=0;
        this.dursec=0;
        this.comms = new ArrayList<String>();
        this.dislikes = 0;
        this.likes=0;
    }
    public  Youtube(Youtube aux){
        this.nomevid=aux.getnomevid();
        this.bytes=aux.getbytes();
        this.date=aux.getdata();
        this.resolution=aux.getres();
        this.durmin=aux.getdurmin();
        this.dursec=aux.getDursec();
        this.comms = aux.getComms();
        this.dislikes = aux.getdislikes();
        this.likes=aux.getlikes();
    }

    public Youtube(ArrayList<String> aux, LocalDate a,String name, int res, int b, int c, int e, int f, int j, int p) {
        this.comms=aux;
        this.date=a;
            this.nomevid=name;
            this.durmin=res;
            this.bytes=b;
            this.resolution=c;
            this.likes = f;
            this.dislikes = j;
            this.dursec=p;
    }

    public String getnomevid(){
        return this.nomevid;
    }
    public int getbytes(){
        return this.bytes;
    }
    public LocalDate getdata(){
        return this.date;
    }
    public int getres(){
        return this.resolution;
    }
    public int getdurmin(){
        return this.durmin;
    }
    public int getDursec(){
        return this.dursec;
    }
    public int getlikes(){
        return this.likes;
    }
    public int getdislikes(){
        return this.dislikes;
    }
    public ArrayList<String> getComms(){
        return this.comms;
    }

    //setters
    public void setnomvid(String nomevid){
        this.nomevid=nomevid;
    }
    public void setBytes(int bytes){
        this.bytes=bytes;
    }
    public void setBytes(LocalDate date){
        this.date=date;
    }
    public void setres(int res){
        this.resolution=res;
    }
    public void setDurmin(int durmin){
        this.durmin=durmin;
    }
    public void setdursec(int dursec){
        this.dursec=dursec;
    }
    public void setlikes(int likes){
        this.likes=likes;
    }
    public void setdislikes(int dislikes){
        this.dislikes=dislikes;
    }
    public void setcoms(String[]coms  ){
        this.comms=new ArrayList<String>(List.of(coms));
    }


    public boolean equals(Object obj) {
        if (obj==this) return true;
        if (obj ==null || obj.getClass()!=this.getClass() ) return false;
         Youtube a = (Youtube) obj;
         return (a.getbytes()==this.bytes &&
                 a.getdata() == this.date &&
                 a.getdislikes()==this.dislikes &&
                 a.getdurmin() == this.durmin&&
                 a.getComms() == this.comms &&
                 a.getDursec() == this.dursec &&
                 a.getlikes() == this.likes &&
                 a.getres() == this.resolution&&
                 a.getnomevid() == this.nomevid);
    }

    public Youtube clone() {
        return (new Youtube(this));
    }

    //é basicamente igual ao toStr
public void print(){
    System.out.println("NOME VIDEO :"+this.nomevid);
    System.out.println("byes :"+this.bytes);
    System.out.println("data:"+this.date);
    System.out.println("res:"+this.resolution);
    System.out.println("duraçaominutos :"+this.durmin);
    System.out.println("duraçaosegundos :"+this.dursec);
    System.out.println("likes :"+this.likes);
    System.out.println("dislikes :"+this.dislikes);
    System.out.println("COmentarios :");
    for (int i = 0; i < comms.size(); i++) {
        System.out.println(comms.get(i) + " ");
    }
}
    public void insereComentario(String comentario) {
        this.comms.add(comentario);
    }

    public long qtsDiasDepois() {
        LocalDate now = LocalDate.now();
        long total ;
        total=0;
        LocalDate aux = this.date;
        long noOfDaysBetween = ChronoUnit.DAYS.between(aux, now);
        System.out.println("O número de dias que passaram é :" +noOfDaysBetween);
        return noOfDaysBetween;
    }


    public void thumbsUp(){
        this.likes=(this.likes+1);
    }


    public String processa() {
        return (""+this.bytes);
    }

}
