package driver;

import trees.GenericTree;

public class GenericMain
{
    public static void main(String[] args)
    {
        GenericTree<String> stringsTree = new GenericTree<>();

        stringsTree.add("Lexicographical");
        stringsTree.add("Graduated");
        stringsTree.add("Ignominious");
        stringsTree.add("Panegyrize");
        stringsTree.add("Feckless");
        stringsTree.add("Cantankerous");
        stringsTree.add("Encapsulated");
        stringsTree.add("Instantiating");
        stringsTree.add("Monotonous");

        System.out.println(stringsTree);
        System.out.println();

        GenericTree<Car> carTree = new GenericTree<Car>();
        carTree.add(new Car("white", 40));
        carTree.add(new Car("blue", 20));
        carTree.add(new Car("red", 50));
        carTree.add(new Car("beige", 25));
        carTree.add(new Car("yellow", 30));
        carTree.add(new Car("orange", 45));
        System.out.println(carTree);
    }
}
