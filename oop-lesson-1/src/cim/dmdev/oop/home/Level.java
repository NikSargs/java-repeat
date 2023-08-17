package cim.dmdev.oop.home;

public class Level {
    private int level;
    private Apartment apartment[];

    public Level(int level, Apartment[] apartment) {
        this.level = level;
        this.apartment = apartment;
    }
    public void print(){
        System.out.println("Этаж " + level + ", количество квартир " + apartment.length);
    }
    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public Apartment[] getApartment() {
        return apartment;
    }

    public void setApartment(Apartment[] apartment) {
        this.apartment = apartment;
    }
}
