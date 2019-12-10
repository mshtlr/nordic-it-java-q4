package com.zoo;

import com.zoo.animal.Elephant;
import com.zoo.animal.Giraffe;
import com.zoo.animal.Monkey;
import com.zoo.animal.Parrot;
import com.zoo.animal.Tiger;

public class Zoo {

    public static void main(String[] args) {
        var elephant = new Elephant ("Puppy", "Zzzz", 100, 2000, 5, 100);
        var giraffe = new Giraffe ("Tom", "Mha", 110, 4000, 4, 32);
        var monkey = new Monkey ("Chucha", "Uh-uh", 30, 1650, 10, "Kikka");
        var parrot = new Parrot ("Coco", "Ah-ah-ah", 1, 350, 13, "loud");
        var tiger = new Tiger ("Jill", "Argh", 84, 750, 18, true);

    }

}
