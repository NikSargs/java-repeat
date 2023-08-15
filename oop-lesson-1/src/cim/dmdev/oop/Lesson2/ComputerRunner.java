package cim.dmdev.oop.Lesson2;

public class ComputerRunner {
    public static void main(String[] args) {
        Computer computer = new Computer();
        computer.printState();


        Computer computer2 = new Computer(1050);
        computer2.printState();


        Computer computer3 = new Computer(1240, 1000);
        computer3.printState();
        computer3.load(true);
    }
}
