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
        Node list = createList(0, 20);
        printList(list);

        Node[] parts = split(list);
        System.out.println("Odd Positions: ");
        printList(parts[0]);
        System.out.println("Even Positions: ");
        printList(parts[1]);
    }

    public static Node[] split(Node head)
    {
        //assume we have at least 2 elements

        //head of two linked lists
        Node evenHead = new Node(head.data);
        Node oddHead = new Node(head.next.data);
        Node evenTail = evenHead;
        Node oddTail = oddHead;

        Node current = head.next.next;
        while (current != null)
        {
            //add the next element to the end of the even list
            evenTail.next = new Node(current.data);
            evenTail = evenTail.next;

            //move to the next node in the input list
            current = current.next;

            if (current != null)
            {
                oddTail.next = new Node(current.data);
                oddTail = oddTail.next;

                //move to the next node in the input list
                current = current.next;
            }
        }

        return new Node[] {evenHead, oddHead};
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













