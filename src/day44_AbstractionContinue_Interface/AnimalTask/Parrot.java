package day44_AbstractionContinue_Interface.AnimalTask;

public final class Parrot extends  Animal implements Playable , Flayable{


    public Parrot(String name, String breed, char gender, int age, String size, String color) {
        super(name, breed, gender, age, size, color);
    }

    @Override
    public void eat() {
        System.out.println(getName()+" is eating chocolate");
    }

    @Override
    public void play() {

    }

    @Override
    public void fly() {
        System.out.println(getName()+" can fly 20 km/h");
    }

}
