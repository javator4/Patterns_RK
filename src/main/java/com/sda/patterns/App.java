package com.sda.patterns;

public class App {


    static class Task1 implements Runnable{

        @Override
        public void run() {
            Singleton singleton = Singleton.getInstance();
            SingletonEnum singletonEnum = SingletonEnum.INSTANCE;

            singletonEnum.connection();
            System.out.println(singleton);

        }
    }

    static class Task2 implements Runnable{

        @Override
        public void run() {
            Singleton singleton = Singleton.getInstance();
            SingletonEnum singletonEnum = SingletonEnum.INSTANCE;

            singletonEnum.connection();
            System.out.println(singleton);
        }
    }

    public static void main(String[] args) {

        Thread thread = new Thread(new Task1());
        Thread thread1 = new Thread(new Task2());

        thread.start();
        thread1.start();

        Singleton singleton = Singleton.getInstance();
        Singleton singleton1 = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();

        System.out.println(singleton);
        System.out.println(singleton1);
        System.out.println(singleton2);




    }
}
