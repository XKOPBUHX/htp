package by.htp.course_1.start.actors;

import java.util.ArrayList;
import java.util.List;

public class ActorsDemo {
    public static void main(String[] args) {
        List<Actor> list = new ArrayList<>();
        list.add(new Actor("Alex", "Pupkin", 100));
        list.add(new Actor("Nina", "Dudka", 120));
        list.add(new Actor("Ivan", "Pipin", 190));
        list.add(new Actor("Ira", "Supkin", 150));

        printList(list);
        fire(list);
        printList(list);
    }

    private static void fire(List<Actor> list) {
        if (list.isEmpty()) {
            return;
        }
        Actor firedActor = list.get(0);
        for (Actor actor : list) {
            if (actor.getFee() > firedActor.getFee()) {
                firedActor = actor;
            }
        }
        list.remove(firedActor);
    }

    private static void printList(List<Actor> list) {
        System.out.println("============");
        for (Actor actor : list) {
            System.out.println(actor);
        }
    }
}
