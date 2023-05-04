package stacks;

import java.util.Stack;

public class StackPractice
{
    public static void main(String[] args)
    {
        Stack<String> choresStack = new Stack<>();

        //FILO structure
        choresStack.push("vacuuming");
        choresStack.push("laundry");
        choresStack.push("dishes");

        //get some work done
        System.out.println(choresStack.pop()); //do something...
        System.out.println(choresStack.pop()); //do something...

        choresStack.push("feeding cats");
        choresStack.push("dusting");
        choresStack.push("clean cat sand");

        System.out.println(choresStack.pop()); //do something...

        //how many chores do I have left?
        for (String remainingChore : choresStack)
        {
            System.out.println(remainingChore);
        }
        System.out.println("Total: " + choresStack.size());

        //what is my next chore...
        System.out.println(choresStack.peek());
        System.out.println(choresStack.peek());
        System.out.println(choresStack.peek());
        System.out.println(choresStack.pop());
        System.out.println(choresStack.peek());
        System.out.println(choresStack.peek());

        //force stack underflow
        while(!choresStack.isEmpty())
        {
            System.out.println(choresStack.pop());
        }
    }
}















