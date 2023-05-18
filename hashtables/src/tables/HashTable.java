package tables;

import java.util.Arrays;

public class HashTable
{
    private static final int INIT_TABLE_SIZE = 15;

    //a hash table is just an array that places elements using hash codes
    private Object[] table;

    public HashTable()
    {
        table = new Object[INIT_TABLE_SIZE];
    }

    //add() does not allow duplicates
    public boolean add(Object newElement)
    {
        if (contains(newElement))
        {
            return false;
        }

        //otherwise, get the hash code and put element in the table
        int code = newElement.hashCode();
        code = Math.abs(code);
        int index = code % table.length;

        table[index] = newElement;
        return true;
    }

    //reports (true or false) whether the input element is in the table
    public boolean contains(Object element)
    {
        return false;
    }

    public String toString()
    {
        return Arrays.toString(table);
    }
}
