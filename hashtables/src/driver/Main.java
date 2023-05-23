package driver;

import model.DictionaryEntry;
import tables.HashTable;

import java.util.HashSet;

public class Main
{
    public static void main(String[] args)
    {
        DictionaryEntry favorite = new DictionaryEntry("gerrymander", "the dividing of a state, county, etc., into election " +
                "districts so as to give one political party a majority");

        DictionaryEntry[] entries = {
            new DictionaryEntry("bamboozle", "to deceive or get the better of (someone) by trickery, " +
                                "flattery, or the like."),
            new DictionaryEntry("phantasm", "an apparition or specter."),
            new DictionaryEntry("obfuscate", "to make obscure or unclear: "),
            new DictionaryEntry("demystify", "to rid of mystery or obscurity; clarify."),
            favorite,
            new DictionaryEntry("nefarious", "extremely wicked or villainous; iniquitous."),
            new DictionaryEntry("persnickety", "snobbish or having the aloof attitude of a snob."),
            new DictionaryEntry("elephant", "a long nose (large) mammal.")
        };

        HashTable table = new HashTable();
        for (DictionaryEntry entry : entries)
        {
            table.add(entry);
        }
        System.out.println(table);

        System.out.println("contains('gerrymander'): " + table.contains(favorite));
        System.out.println("contains('onomatopoeia'): " + table.contains(
            new DictionaryEntry("onomatopoeia", "the sound of words.")
        ));
    }

    public static void testingTable()
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
    }
}