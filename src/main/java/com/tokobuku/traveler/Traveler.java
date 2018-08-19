package com.tokobuku.traveler;

public class Traveler implements People {

    Human human;

    public Traveler(Human human) {
        this.human = human;
    }

    @Override
    public void startJourney() {
        System.out.println(human);
    }
}
