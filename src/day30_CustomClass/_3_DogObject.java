package day30_CustomClass;

import java.util.ArrayList;

public class _3_DogObject {
    public static void main(String[] args) {
     Dog dog1 = new Dog();
     dog1.name="Lucy";
     dog1.breed="Husky";
     dog1.colour="White";
     dog1.gender='F';
     dog1.size="Small";
     dog1.age=5;

     Dog dog2=new Dog();

        dog2.name="Ace";
        dog2.breed="Husky";
        dog2.colour="White";
        dog2.gender='M';
        dog2.size="Large";
        dog2.age=5;


        Dog dog3=new Dog();
        dog3.setInfo("Jack","German Shepard",2,'M',"Large","Black");


        System.out.println(dog1);
        System.out.println(dog2);
        System.out.println(dog3);

        dog1.eat();
        dog2.bark();

        Dog dog4=new Dog();
        dog4.setInfo("Bullet","Pit-Bull",6,'M',"Large","Black");

        Dog dog5=new Dog();
        dog5.setInfo("Sully","Labrador",3,'M',"Extra Large","Yellow");

        System.out.println("-----------------------------------------");
        Dog [] dogs={dog1,dog2,dog3,dog4,dog5};

        ArrayList<Dog> femaleDogs=new ArrayList<>();
        ArrayList<Dog> maleDogs=new ArrayList<>();








    }



}
