package trees;

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
        return false;
    }

    public String toString()
    {
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
