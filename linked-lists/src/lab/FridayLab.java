package lab;

import java.io.File;
import java.util.Scanner;

/**
 * This is a Friday lab on linked lists.
 * @author Josh Archer
 * @version 1.0
 */
public class FridayLab
{
    public static void main(String[] args)
    {

    }

    public static Node createList(int min, int max)
    {
        Node head = new Node(min);
        Node current = head;
        for (int i = min + 1; i <= max; i++)
        {
            current.next = new Node(i);
            current = current.next;
        }
        return head;
    }

    public static void printList(Node head)
    {
        Node current = head;
        while (current != null)
        {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println();
    }

    public static Node[] split(Node head)
    {
        return null;
    }

    public static Node[] split(Node head, int length)
    {
        return null;
    }

    public static Node createCircular(int[] elements)
    {
        //create the head reference
        Node head = new Node(elements[0]);

        //add the remaining nodes
        Node current = head;
        for (int i = 1; i < elements.length; i++)
        {
            current.next = new Node(elements[i]);
            current = current.next;
        }

        //make it circular...

        return head;
    }
}













