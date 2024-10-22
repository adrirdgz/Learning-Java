package com.campusdual.abstractclass;

public class Zoo {
    public static void main(String[] args) {
        //Animal a = new Animal("Cat");
        Cat c = new Cat("Cat");
        Fox f = new Fox("Fox");
        AngoraCat ac = new AngoraCat("Angora Cat");

        c.wakeUp();
        f.wakeUp();
        ac.wakeUp();

        c.sleep();
        f.sleep();
        ac.sleep();

        c.makeSound();
        f.makeSound();
        ac.makeSound();

        c.climbing();
        ac.climbing();
    }
}
