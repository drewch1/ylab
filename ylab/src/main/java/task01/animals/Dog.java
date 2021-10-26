package task01.animals;

public class Dog extends Animal {

    private String sound = "Гав";

    @Override
    public void sleep() {
        super.sleep();
    }

    @Override
    public void eat() {
        super.eat();
    }

    @Override
    public void speak() {
        if (!isSleep) {
            System.out.println(sound);
        }
    }
}