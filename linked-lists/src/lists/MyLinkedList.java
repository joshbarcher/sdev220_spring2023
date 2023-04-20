package lists;

import adts.IList;

public class MyLinkedList implements IList
{
    private Node head;
    private Node tail;

    //this tracks the number of elements in the list
    private int size = 0;

    //String... is variable length parameters
    public MyLinkedList(String... elements)
    {
        for (int i = 0; i < elements.length; i++)
        {
            String element = elements[i];
            add(element);
        }
    }

    @Override
    public void add(String element)
    {
        //our list is currently empty!
        if (head == null)
        {
            //assign head and tail to the new Node
            head = tail = new Node(element, null);
        }
        else
        {
            //move to the last node in the linked list (all done!)
            tail.next = new Node(element, null);
            tail = tail.next;
        }
        size++;
    }

    @Override
    public boolean contains(String element)
    {
        //if the list is empty, it can't contain the search element
        if (head == null)
        {
            return false;
        }
        else
        {
            Node current = head;
            while (current != null)
            {
                //check if the current node has our search element?
                if (current.data.equals(element))
                {
                    //we found it!
                    return true;
                }

                //otherwise, move to the next node
                current = current.next;
            }
        }
        return false;
    }

    @Override
    public void replace()
    {
        Node current = head;
        while (current != null)
        {
            //current is visiting one of the nodes in the list
            current.data = "hello";

            current = current.next;
        }
    }

    @Override
    public int size()
    {
        return size;
    }

    @Override
    public void printList()
    {
        Node current = head;
        while (current != null)
        {
            System.out.print(current);
            current = current.next;
        }
        System.out.println(); //new line!
    }

    @Override
    public void clear()
    {

    }

    @Override
    public boolean remove(String element)
    {
        return false;
    }

    @Override
    public String get(int index)
    {
        return null;
    }

    @Override
    public void set(int index, String newElement)
    {

    }

    @Override
    public void sort()
    {

    }

    private class Node
    {
        private String data;
        private Node next;

        public Node(String data, Node next)
        {
            this.data = data;
            this.next = next;
        }

        public String toString()
        {
            return data + " -> ";
        }
    }
}







