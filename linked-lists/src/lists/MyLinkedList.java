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
    public void printList()
    {
        if (head == null)
        {
            System.out.println("Empty list!");
        }

        Node current = head;
        while (current != null)
        {
            System.out.print(current.toString());
            current = current.next;
        }
        System.out.println(); //new line!
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
    public void clear()
    {
        head = tail = null;
        size = 0;
    }

    @Override
    public String get(int index)
    {
        if (index < 0 || index >= size)
        {
            throw new IndexOutOfBoundsException("Bad index!");
        }

        Node current = head;
        for (int i = 0; i < index; i++)
        {
            current = current.next;
        }
        return current.data;
    }

    @Override
    public boolean remove(String element)
    {
        //what if the list is empty?
        if (head == null)
        {
            return false;
        }
        else if (head.data.equals(element)) //removing the first element?
        {
            head = head.next;
            return true;
        }
        else
        {
            //we need to scan for the element
            Node current = head;

            //while there is a next node and it isn't our search value
            while (current.next != null && !current.next.data.equals(element))
            {
                //move to the next node
                current = current.next;
            }

            //we should remove current.next from the linked list
            if (current.next == null)
            {
                //not found!
                return false;
            }
            else
            {
                //remove current.next from the linked list
                current.next = current.next.next;
                return true;
            }
        }
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







