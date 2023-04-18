package adts;

public interface IList
{
    void add(String element);
    boolean contains(String element);
    boolean remove(String element);
    int size();
    void clear();

    String get(int index);
    void set(int index, String newElement);

    void sort();
}
