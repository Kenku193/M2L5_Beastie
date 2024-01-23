package org.example.example4_wildcards.entity;

import javax.management.ObjectName;
import java.util.List;

public class Animal {

    public void eat(List<? extends Feed> feeds){}

    public void voice(){}

}
