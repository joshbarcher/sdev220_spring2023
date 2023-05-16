package driver;

import trees.BinarySearchTree;

import java.util.TreeSet;

public class Main
{
    public static void main(String[] args)
    {
        BinarySearchTree tree = new BinarySearchTree();

        tree.add(16);
        tree.add(9);
        tree.add(12);
        tree.add(22);
        System.out.println(tree);

        tree.add(20);
        System.out.println(tree);

        tree.add(15);
        System.out.println(tree);

        tree.add(31);
        tree.add(0);
        tree.add(11);

        System.out.println(tree);

        System.out.println(tree.contains(9));
        System.out.println(tree.contains(15));
        System.out.println(tree.contains(11));
        System.out.println(tree.contains(45));
        System.out.println();

        System.out.println(tree);
        System.out.println(tree.postOrder());

        //do the same thing with Java's Tree classes
        TreeSet<Integer> otherTree = new TreeSet<>();

        otherTree.add(16);
        otherTree.add(9);
        otherTree.add(12);
        otherTree.add(22);
        otherTree.add(20);
        otherTree.add(15);
        otherTree.add(31);
        otherTree.add(0);
        otherTree.add(11);

        //how do you perform a traversal of the TreeSet class?
        System.out.println(otherTree);

        for (int number : otherTree)
        {
            System.out.println(number);
        }

        TreeSet<String> stringsTree;
        TreeSet<Car> carsInTree;
    }
}