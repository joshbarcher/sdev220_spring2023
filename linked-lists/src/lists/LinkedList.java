package lists;

import adts.IList;

public class LinkedList implements IList
{
    private Node head;

    //this tracks the number of elements in the
    //list
    private int size = 0;

    @Override
    public void add(String element)
    {
        //our list is currently empty!
        if (head == null)
        {
            head = new Node(element, null);
            size++;
        }
        else
        {
            //while there is a next node in the list
            Node current = head;
            while(current.next != null)
            {
                //move to the next element
                current = current.next;
            }

            //now at the end of the list
            current.next = new Node(element, null);
        }
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
    public boolean remove(String element)
    {
        return false;
    }

    @Override
    public int size()
    {
        return 0;
    }

    @Override
    public void clear()
    {

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
    }
}







