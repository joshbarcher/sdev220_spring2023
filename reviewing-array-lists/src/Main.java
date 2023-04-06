import java.util.ArrayList;

public class Main
{
    public static void main(String[] args)
    {
        //list of strings
        ArrayList<String> list = new ArrayList<String>();
        String[] colorsArray = {"green", "fuscha", "red", "cyan", "black",
                                "purple", "blue", "white", "magenta", "beige"};

        for (int i = 0; i < colorsArray.length; i++)
        {
            list.add(colorsArray[i]);
        }

        list.add("chartruese");
        list.add("silver");

        //use the toString() method to print out the list
        System.out.println(list.toString());

        //use a loop to print our colors (one per line)
        for (int i = 0; i < list.size(); i++)
        {
            System.out.println(list.get(i));
        }
        System.out.println(); //new line!

        for (String color : list)
        {
            System.out.println(color);
        }
    }
}

