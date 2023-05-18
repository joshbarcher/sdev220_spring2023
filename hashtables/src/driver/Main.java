package driver;

import tables.HashTable;

import java.util.HashSet;

public class Main
{
    public static void main(String[] args)
    {
        HashTable hobbies = new HashTable();
        String[] elements = {
            "reading sci/fi fantasy", "soccer",
            "gardening", "hiking", "legos", "fishing",
            "sleeping", "painting", "music"
        };

        for (String hobby : elements)
        {
            hobbies.add(hobby);
            System.out.println(hobbies);
        }

        HashSet set;
    }
}