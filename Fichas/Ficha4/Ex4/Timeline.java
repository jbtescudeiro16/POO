package Aula1.Ficha4.Ex4;

import Aula1.Ficha4.Ex3.Lampada;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Timeline {
    ArrayList<Posts> feed;


    public Timeline() {
        this.feed = new ArrayList<Posts>();
    }

    public Timeline(ArrayList<Posts> feed) {
        this.feed = feed;
    }

    public Timeline(Timeline a) {
        this.feed = a.getFeed();
    }

    public ArrayList<Posts> getFeed() {
        return this.feed;
    }


    public void add(Posts a) {
        this.feed.add(a);
    }

    public void setFeed(ArrayList<Posts> feed) {
        this.feed = feed;
    }

    @Override
    public String toString() {
        System.out.println("Timeline{" +
                "feed=" + feed +
                '}');
        return "Timeline{" +
                "feed=" + feed +
                '}';
    }

    public int nrPosts(String user) {
        int count = 0;
        Iterator<Posts> value = this.feed.iterator();
        while (value.hasNext()) {
            if (value.next().getId().equals(user)) {
                count++;
            }
        }
        System.out.println("Posts do user  totais" + count);
        return count;
    }

    public List<Posts> postsOf(String user) {

        List<Posts> aux = new ArrayList<Posts>();
        Iterator<Posts> value = this.feed.iterator();
        while (value.hasNext()) {
            if (value.next().getId().equals(user)) {
                Posts a = new Posts(value.next());
                aux.add(a);
            }
        }
        System.out.println("Lista de posts " + aux);
        return aux;
    }
}
