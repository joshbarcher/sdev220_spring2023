package driver;

import model.GameConsole;

public class Main
{
    public static void main(String[] args)
    {
        //two variables holding playstation console objects
        GameConsole ps4 = new GameConsole("PS4", false, false, 1000);
        GameConsole other = ps4;
        GameConsole another = new GameConsole("PS4", false, false, 1000);
        GameConsole ps5 = new GameConsole("PS5", true, false, 800);
        GameConsole third = new GameConsole("PS4", true, true, 500);

        //== uses memory addresses to make comparisons (only the same objects match)
        System.out.println("Are they ==? " + (ps4 == other));
        System.out.println("Are they ==? " + (ps4 == another));
        System.out.println("Are they ==? " + (other == another));
        System.out.println();

        System.out.println("Are they .equals()? " + ps4.equals(other));
        System.out.println("Are they .equals()? " + ps4.equals(another));
        System.out.println("Are they .equals()? " + other.equals(another));
        System.out.println("Are they .equals()? " + ps5.equals(ps4));
        System.out.println();

        //reflexive?
        System.out.println("Reflexive?");
        System.out.println("Are they .equals()? " + ps4.equals(ps4));
        System.out.println("Are they .equals()? " + ps5.equals(ps5));
        System.out.println();

        //symmetric?
        System.out.println("Symmetric?");
        System.out.println("Are they .equals()? " + ps4.equals(another));
        System.out.println("Are they .equals()? " + another.equals(ps4));
        System.out.println();

        //transitive?
        System.out.println("Transitive?");
        System.out.println("Are they .equals()? " + ps4.equals(another));
        System.out.println("Are they .equals()? " + another.equals(third));
        System.out.println("Are they .equals()? " + ps4.equals(third));
        System.out.println();
    }
}

