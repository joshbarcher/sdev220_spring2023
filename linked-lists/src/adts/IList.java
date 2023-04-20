package adts;

public interface IList
{
    void add(String element);
    boolean contains(String element);

    //this prints the elements of the list in order to the console
    void printList();
    //returns the number of elements in the list
    int size();
    //remove all elements in the list
    void clear();
    //returns the element at the index given to the method
    String get(int index);

    void replace();

    boolean remove(String element);
    void set(int index, String newElement);
    void sort();
}
