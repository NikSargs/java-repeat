package cim.dmdev.oop.home;

public class Room {
    boolean roomPassage;

    public Room(boolean roomPassage) {
        this.roomPassage = roomPassage;
    }

    public void print(){
        if (roomPassage) {
            System.out.println("комната проходная");
        }
        else {
            System.out.println("комната не проходная");
        }
    }
}
