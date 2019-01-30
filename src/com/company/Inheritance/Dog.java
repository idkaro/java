package Inheritance;

public class Dog extends Animal {

    private int eyes, legs, tail, teeth;
    private String coat;

    private void chew() {
        System.out.println("Dog chew");
    }

    public void walk() {
        System.out.println("Dog walk");
        super.move(5);
    }

    public void run() {
        System.out.println("Dog run");
        move(10);
    }

    public Dog(String name, int brain, int body, int size, int weight, int eyes, int legs, int tail, int teeth, String coat) {
        super(name, 1, 1, size, weight);
        this.eyes = eyes;
        this.coat = coat;
        this.tail = tail;
        this.teeth = teeth;
        this.legs = legs;
    }

    @Override
    public void eat() {
        System.out.println("Dog.eat called");
        chew();
        super.eat();
    }

    private void moveLegs(int speed) {
        System.out.println("moveLegs called");
    }

    @Override
    public void move(int speed) {
        System.out.println("Dog.move");
        moveLegs(speed);
        super.move(speed);
    }
}
