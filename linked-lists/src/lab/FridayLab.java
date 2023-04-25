package lab;

public class FridayLab
{
    public static void main(String[] args)
    {
        Node list = createCircular(new int[] {1, 2, 3, 4 ,5});
        System.out.println(list);
    }

    public static Node createCircular(int[] elements)
    {
        //create the head reference
        Node head = new Node(elements[0]);

        //add the remaining nodes
        Node current = head;
        for (int i = 1; i < elements.length; i++)
        {
            current.next = new Node(elements[i]);
            current = current.next;
        }

        //make it circular...

        return head;
    }

    public static Node[] split(Node head)
    {
        return null;
    }

    public static Node[] split(Node head, int length)
    {
        return null;
    }
}













