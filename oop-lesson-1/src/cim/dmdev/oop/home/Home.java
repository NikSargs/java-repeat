package cim.dmdev.oop.home;

public class Home {
    private int home;
    private Level level[];

    public Home(int home, Level[] level) {
        this.home = home;
        this.level = level;
    }
    public void print(){
        System.out.println("Дом " + home + ", количество этажей " + level.length);
    }
    public int getHome() {
        return home;
    }

    public void setHome(int home) {
        this.home = home;
    }

    public Level[] getLevel() {
        return level;
    }

    public void setLevel(Level[] level) {
        this.level = level;
    }

}
