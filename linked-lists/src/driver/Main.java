package driver;

import lists.MyLinkedList;

import java.util.ArrayList;
import java.util.LinkedList;

public class Main
{
    public static void main(String[] args)
    {
        MyLinkedList list = new MyLinkedList("A", "B", "C", "D", "E", "F");

        list.printList();
        System.out.println("remove(A): " + list.remove("A"));
        list.printList();
        System.out.println("remove(F): " + list.remove("F"));
        list.printList();
        System.out.println("remove(G): " + list.remove("G"));
        list.printList();
        System.out.println("remove(D): " + list.remove("D"));
        list.printList();
    }

    private static void practice()
    {
        //                                    0    1    2    3    4    5
        MyLinkedList list = new MyLinkedList("a", "b", "c", "d", "e", "f");

        //test contains on an empty list
        System.out.println("Empty list:");
        System.out.println("contains(a): " + list.contains("a"));
        System.out.println("contains(e): " + list.contains("e"));

        //test contains on an occupied list
        System.out.println("Occupied list:");
        System.out.println("contains(a): " + list.contains("a"));
        System.out.println("contains(c): " + list.contains("c"));
        System.out.println("contains(d): " + list.contains("d"));
        System.out.println("contains(e): " + list.contains("e"));

        System.out.println("size(): " + list.size()); //???
        list.printList();
        System.out.println(list.get(3)); //d
        System.out.println(list.get(1)); //b
        //System.out.println(list.get(-10)); //b

        System.out.println("clear()");
        list.clear();
        list.printList();

        LinkedList javaList = new LinkedList();
        System.out.println("Adding 1,000,000 elements");
        for (int i = 1; i <= 1000000; i++)
        {
            javaList.add(0, "e");
        }
        System.out.println("Done!");

        System.out.println("Accessing all elements");
        for (int i = 0; i < javaList.size(); i++)
        {
            Object value = javaList.get(i);
            //do something with "e"
        }
        System.out.println("Done!");
    }
}

