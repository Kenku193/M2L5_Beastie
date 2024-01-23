package org.example.example4_wildcards;

import org.example.example4_wildcards.entity.Animal;
import org.example.example4_wildcards.entity.Bone;
import org.example.example4_wildcards.entity.Feed;
import org.example.example4_wildcards.entity.Fish;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Animal dog = new Animal();

        List<Feed> feeds = new ArrayList<>();
        feeds.add(new Fish());
        feeds.add(new Fish());
        feeds.add(new Fish());
        feeds.add(new Bone());

        dog.eat(feeds);

        // КАК ЗАПИСАТЬ?
//        List<? extends Feed> anotherFeed = new ArrayList<>();
//        anotherFeed.add(new Bone());
//        anotherFeed.add(new Fish());
//        anotherFeed.add(new Bone());
//        anotherFeed.add(new Fish());

        // PECS - producer extends, consumer super
        List<? super Feed> anotherFeed = new ArrayList<>();
        anotherFeed.add(new Bone());
        anotherFeed.add(new Fish());
        anotherFeed.add(new Bone());
        anotherFeed.add(new Fish());

    }
}
