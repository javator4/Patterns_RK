package com.sda.patterns;

public class Singleton {

    //static jet ponieważ metoda getInstance musi byś ststyczna (konstruktor prywatny)
    private static Singleton instance;

    // private - prywatny konsstruktor uniemożliwia aby programista mógł zronbić Singleton singletoan = new Singleton
    private Singleton() {

    }

    // synchronized - jest po to aby instancja została utworzona tylko raz nie zależnie od ilości wątków
    // static - ponieważ metoda musi być statyczna przy konstruktorze prywatnym
    public synchronized static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
            System.out.println("Tworzenie instancje");
        }

        return instance;
    }

}
