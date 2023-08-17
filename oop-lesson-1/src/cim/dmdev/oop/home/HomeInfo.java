package cim.dmdev.oop.home;

public class HomeInfo {
    public static void main(String[] args) {
        Room room = new Room(true);
        Apartment apartment = new Apartment(25, new Room[3]);
        Level level = new Level(5, new Apartment[4]);
        Home home = new Home(1,new Level[5]);
        home.print();
        level.print();
        apartment.print();
        room.print();
    }
}
