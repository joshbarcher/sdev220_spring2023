package driver;

import lists.MyLinkedList;

import java.util.LinkedList;

public class Main
{
    public static void main(String[] args)
    {
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

        MyLinkedList javaList = new MyLinkedList();
        System.out.println("Adding 1,000,000 elements");
        for (int i = 1; i <= 1000000; i++)
        {
            javaList.add("e");
        }
        System.out.println("Done!");
    }
}