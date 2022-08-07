package week10.week11;

import java.util.ArrayList;

public class TestTv {
    public static void main(String[] args) {
        // we will createva TV object
        TV Samsung=new TV(); // new keyword invokes our constructor with no parameters
        System.out.println(Samsung);

        Samsung.turnOn();
        Samsung.setChannel(7);
        Samsung.setVolume(3);
        System.out.println(Samsung); // toString is redundant


        TV LG=new TV();
        LG.setVolume(4);
        LG.setChannel(10);
        System.out.println(LG);

        TV Sony=new TV();

        //ArrayList
        ArrayList<TV> tvList=new ArrayList<>();

        tvList.add(Samsung);
        tvList.add(LG);
        tvList.add(Sony);



        for (TV eachTv : tvList) {    // each TV becomes obj referance for our TV obects
            System.out.println("Each the TV on ? "+eachTv.on);
        }


    }
}
