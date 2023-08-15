package cim.dmdev.oop.Lesson2;

public class Computer {
    int ssd = 500;
    int ram = 1024;

    public Computer() {
        System.out.println("Я был создан");
    }
    Computer(int newSsd){
        ssd = newSsd;
    }
    Computer(int newSsd, int newRam){
        ssd = newSsd;
        ram = newRam;
    }
    void load() {
        System.out.println("Я загрузился");
    }
    void load(boolean open){
        System.out.println("Я загрузился");
        if (open) {
            System.out.println("Я открыл крышку");
        }
    }
    void printState(){
        System.out.println("ssd: " + ssd);
        System.out.println("ram: " + ram);
        System.out.println();
    }
}
