package by.htp.course_1.start.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListsDemo {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(5);
        list.add(2);
        list.add(1);
        list.add(5);
        list.add(8);
        printList(list);

        List<Integer> other = new ArrayList<>();
        other.add(150);
        other.add(160);

        list.addAll(other);
        printList(list);

        list.remove(5);
        list.remove(new Integer(5));
        printList(list);

        list.removeAll(Collections.singletonList(5));
        printList(list);

        System.out.println(list.contains(5));
    }

    private static void printList(List<Integer> list) {
        System.out.println("===========");
        for (Object item : list) {
            System.out.println(item);
        }
    }
}
