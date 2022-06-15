package Aula1.Ficha4.Ex4;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Objects;

public class Posts {
    private  String id;
    private String name;
    private  LocalDate create;
    private String content;
    private int likes;
    private ArrayList<String >comms;


public Posts(){
    this.id="";
    this.name="";
    this.create=LocalDate.of(0,0,0);
    this.likes=0;
    this.comms= new ArrayList<String>();
}
    public Posts(String id,String name,LocalDate create,int likes,String comment1){
        this.id=id;
        this.name=name;
        this.create=create;
        this.likes=likes;
        this.comms= new ArrayList<String>();
        this.comms.add(comment1);
    }


    public Posts(Posts a){
    this.id=a.getId();
    this.name=a.getName();
    this.create=a.getCreate();
    this.likes=a.getLikes();
    this.comms=a.getComms();
    }


    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getCreate() {
        return this.create;
    }

    public void setCreate(LocalDate create) {
        this.create = create;
    }

    public String getContent() {
        return this.content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public int getLikes() {
        return this.likes;
    }

    public void setLikes(int likes) {
        this.likes = likes;
    }

    public ArrayList<String> getComms() {
        return this.comms;
    }

    public void setComms(ArrayList<String> comms) {
        this.comms = comms;
    }

    @Override
    public String toString() {
        System.out.println("Posts{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", create=" + create +
                ", content='" + content + '\'' +
                ", likes=" + likes +
                ", comms=" + comms +
                '}');
        return "Posts{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", create=" + create +
                ", content='" + content + '\'' +
                ", likes=" + likes +
                ", comms=" + comms +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Posts posts = (Posts) o;
        return (this.likes == posts.getLikes() &&
                this.id.equals(posts.getId()) &&
                this.name.equals(posts.getName()) &&
                this.create.equals(posts.getCreate()) &&
                this.content.equals(posts.getContent()) &&
                this.comms.equals(posts.getComms()));

    }

    public Posts clone(){
    return new Posts(this);
    }


}
