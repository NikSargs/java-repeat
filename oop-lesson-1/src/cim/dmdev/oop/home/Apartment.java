package cim.dmdev.oop.home;

public class Apartment {
    int apartment;
    Room[] room;

    public Apartment(int apartment, Room[] room) {
        this.apartment = apartment;
        this.room = room;
    }

    public int getApartment() {
        return apartment;
    }

    public void setApartment(int apartment) {
        this.apartment = apartment;
    }

    public Room[] getRoom() {
        return room;
    }

    public void setRoom(Room[] room) {
        this.room = room;
    }

    public void print() {
        System.out.println("Квартира " + apartment + ", количество комнат " + room.length);
    }
}
