package trees;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BinarySearchTree
{
    private Node root;
    private int size;

    public boolean add(int element)
    {
        //what if the tree is empty?
        if (root == null)
        {
            root = new Node(element);
            size++;
            return true;
        }
        else
        {
            //recursively search
            return add(root, element);
        }
    }

    //private, recursive add()
    private boolean add(Node current, int element)
    {
        //base case
        if (element == current.data)
        {
            return false; //no dups!
        }
        else if (element < current.data)
        {
            if (current.left != null) //looking left!
            {
                return add(current.left, element); //recursive call!
            }
            else
            {
                current.left = new Node(element);
                size++;
                return true;
            }
        }
        else //element must be greater
        {
            if (current.right != null) //looking right!
            {
                return add(current.right, element); //recursive call!
            }
            else
            {
                current.right = new Node(element);
                size++;
                return true;
            }
        }
    }

    public boolean contains(int element)
    {
        //start searching at root...
        return contains(root, element);
    }

    private boolean contains(Node current, int element)
    {
        if (current == null) //didn't find it!
        {
            return false;
        }
        else if (current.data == element) //found it!
        {
            return true;
        }
        else if (current.data < element) //right
        {
            return contains(current.right, element);
        }
        else //if (current.data > element) //left
        {
            return contains(current.left, element);
        }
    }

    public int getSize()
    {
        return size;
    }

    public List<Integer> bfs()
    {
        List<Integer> traversal = new ArrayList<>();

        //#1
        Queue<Node> queue = new LinkedList<>();
        //#2
        queue.add(root);

        //#3
        while (!queue.isEmpty())
        {
            //#4
            Node next = queue.remove();
            traversal.add(next.data);

            //#5
            if (next.left != null)
            {
                queue.add(next.left);
            }
            if (next.right != null)
            {
                queue.add(next.right);
            }
        }

        return traversal;
    }

    public List<Integer> inOrder()
    {
        List<Integer> traversal = new ArrayList<>();

        //start the search at the root, pass in my list to hold elements
        inOrder(root, traversal);

        return traversal;
    }

    //this type of method is a good design for our tree-exercises hw!!!!
    private void inOrder(Node current, List<Integer> traversal)
    {
        if (current != null)
        {
            //left, node, right
            inOrder(current.left, traversal);
            traversal.add(current.data);
            inOrder(current.right, traversal);
        }
    }

    //implement postOrder()?
    public List<Integer> postOrder()
    {
        List<Integer> traversal = new ArrayList<>();

        //start the search at the root, pass in my list to hold elements
        postOrder(root, traversal);

        return traversal;
    }

    //this type of method is a good design for our tree-exercises hw!!!!
    private void postOrder(Node current, List<Integer> traversal)
    {
        if (current != null)
        {
            //left, right, node
            postOrder(current.left, traversal);
            postOrder(current.right, traversal);
            traversal.add(current.data);
        }
    }

    //this is a toString() for the tree
    public String toString()
    {
        if (root == null)
        {
            return "<empty tree>";
        }
        return root.toString();
    }

    private class Node
    {
        private int data;
        private Node left;
        private Node right;

        public Node(int data)
        {
            this.data = data;
        }

        public Node(int data, Node left, Node right)
        {
            this.data = data;
            this.left = left;
            this.right = right;
        }

        private StringBuilder toString(StringBuilder prefix, boolean isTail, StringBuilder builder)
        {
            if(right!=null)
            {
                right.toString(new StringBuilder().append(prefix).append(isTail ? "│   " : "    "), false, builder);
            }

            builder.append(prefix).append(isTail ? "└── " : "┌── ").append(data).append("\n");

            if(left!=null)
            {
                left.toString(new StringBuilder().append(prefix).append(isTail ? "    " : "│   "), true, builder);
            }

            return builder;
        }

        /**
         * Builds a visualization of the tree on the Java console.
         *
         * @see https://stackoverflow.com/questions/4965335/how-to-print-binary-tree-diagram-in-java/8948691#8948691
         * @return a diagram of the tree
         */
        @Override
        public String toString()
        {
            return toString(new StringBuilder(), true, new StringBuilder()).toString();
        }
    }
}
