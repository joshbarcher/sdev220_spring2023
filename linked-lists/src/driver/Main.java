package driver;

import lists.LinkedList;

public class Main
{
    public static void main(String[] args)
    {
        LinkedList list = new LinkedList();

        //test contains on an empty list
        System.out.println("Empty list:");
        System.out.println("contains(a): " + list.contains("a"));
        System.out.println("contains(e): " + list.contains("e"));

        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");

        //test contains on an occupied list
        System.out.println("Occupied list:");
        System.out.println("contains(a): " + list.contains("a"));
        System.out.println("contains(c): " + list.contains("c"));
        System.out.println("contains(d): " + list.contains("d"));
        System.out.println("contains(e): " + list.contains("e"));
    }
}