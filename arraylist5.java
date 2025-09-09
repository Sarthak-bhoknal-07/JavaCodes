// Arraylist with user defined objects

// pojo class - is the class which includes setter and getter. 

import java.util.*;

class Player {
    private int id;
    private String name;
    private int runs;

    public Player() {
        // default constructor
    }

    public Player(int id, String name, int runs) {
        this.id = id;
        this.name = name;
        this.runs = runs;
    }

    public void setid(int id) {
        this.id = id;
    }

    public int getid() {
        return id;
    }

    public void setname(String name) {
        this.name = name;
    }

    public String getname() {
        return name;
    }

    public void setruns(int runs) {
        this.runs = runs;
    }

    public int getruns() {
        return runs;
    }

    public void display() {
        System.out.println("Id - " + id + "\nName - " + name + "\nRuns - " + runs);
    }
}

public class arraylist5 {
    public static void main(String[] args) {
        // Create the object of any Collection (Now for ex. Arraylist)

        List<Player> players = new ArrayList<>(); // OR
        // ArrayList players = new ArrayList<>();

        // Create Objects of Player class
        Player p1 = new Player();
        p1.setid(111);
        p1.setname("Sahil");
        p1.setruns(900);
        // System.out.println(p1.getid());
        // System.out.println(p1.getname());
        // System.out.println(p1.getruns());

        Player p2 = new Player();
        p2.setid(112);
        p2.setname("Rohan");
        p2.setruns(1400);
        // System.out.println(p2.getid());
        // System.out.println(p2.getname());
        // System.out.println(p2.getruns());

        Player p3 = new Player(113, "Sarthak", 1800);

        // Add objects to ArrayList
        players.add(p1);
        players.add(p2);
        players.add(p3);
        // Shortcut
        players.add(new Player(114, "Prasad", 700));

        // Traverse using for each loop
        System.out.println("Player list");
        // for (Player p : players) {
        // p.display();
        // }

        // OR
        // for (Object obj : players) {
        // Player p = (Player) obj;
        // System.out.println("Id - " + p.getid() + "\nName - " + p1.getname() + "\nRuns
        // - " + p.getruns());
        // }

        // OR
        for (Player p : players) {
            System.out.println("Id - " + p.getid() + "\nName - " + p1.getname() + "\nRuns - " + p.getruns());
        }
    }
}
