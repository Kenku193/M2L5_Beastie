package org.example.example2_animals;

import org.example.example2_animals.entity.Animal;
import org.example.example2_animals.entity.Bone;
import org.example.example2_animals.entity.Feed;
import org.example.example2_animals.entity.Fish;

import javax.swing.plaf.basic.BasicLookAndFeel;

public class Main {

    public static void main(String[] args) {

        Animal<Bone> dog = new Animal();
        dog.eat(new Bone());

        Animal<Fish> cat = new Animal();
        cat.eat(new Fish());

        Animal<Feed> superDog = new Animal();
        superDog.eat(new Fish());
        superDog.eat(new Bone());
        superDog.eat(new Feed());



    }
}
