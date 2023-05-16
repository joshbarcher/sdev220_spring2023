package trees;

public class GenericTree<T extends Comparable<T>>
{
    private Node root;
    private int size;

    public boolean add(T element)
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
    private boolean add(Node current, T element)
    {
        int comparison = element.compareTo(current.data);

        //base case
        if (comparison == 0)
        {
            return false; //no dups!
        }
        else if (comparison < 0)
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

    public boolean contains(T element)
    {
        //start searching at root...
        return contains(root, element);
    }

    private boolean contains(Node current, T element)
    {
        if (current == null) //didn't find it!
        {
            return false;
        }

        int comparison = element.compareTo(current.data);
        if (comparison == 0) //found it!
        {
            return true;
        }
        else if (comparison < 0) //right
        {
            return contains(current.right, element);
        }
        else //left
        {
            return contains(current.left, element);
        }
    }

    public int getSize()
    {
        return size;
    }

    private class Node
    {
        private T data;
        private Node left;
        private Node right;

        public Node(T data)
        {
            this.data = data;
        }

        public Node(T data, Node left, Node right)
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
