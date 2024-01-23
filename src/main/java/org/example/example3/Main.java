package org.example.example3;

import org.example.example3.entity.Animal;
import org.example.example3.entity.Bone;
import org.example.example3.entity.Feed;
import org.example.example3.entity.Fish;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Animal dog = new Animal();

        List<Feed> feeds = new ArrayList<>();
        feeds.add(new Bone());
        feeds.add(new Fish());
        feeds.add(new Bone());
        feeds.add(new Fish());

        dog.eat(feeds);

    }
}
