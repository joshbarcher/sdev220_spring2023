package driver;

import trees.BinarySearchTree;

public class Main
{
    public static void main(String[] args)
    {
        BinarySearchTree tree = new BinarySearchTree();

        tree.add(16);
        tree.add(9);
        tree.add(12);
        tree.add(22);
        tree.add(20);
        tree.add(15);

        System.out.println(tree);
    }
}