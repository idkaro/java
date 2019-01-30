package Inheritance;

public class Fish extends Animal{
    private int gills, eyes, fins;

    public Fish(String name, int brain, int body, int size, int weight, int gills, int eyes, int fins) {
        super(name, 1, 1, size, weight);
        this.eyes = eyes;
        this.fins = fins;
        this.gills = gills;
    }

    private void rest() {

    }

    private void sweem(int speed) {
        moveMuscles();
        moveBackfin();
        super.move(speed);
    }

    private void moveMuscles() {

    }

    private void moveBackfin() {

    }
}
