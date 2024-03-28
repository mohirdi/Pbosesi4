package Overriding;

public class Main {
    public static void main(String[] args) {
        Animal Hero1 = new Bristleback();
        Animal hero2 = new Axe();
        Hero1.sound();
        hero2.sound(); 
    }
}