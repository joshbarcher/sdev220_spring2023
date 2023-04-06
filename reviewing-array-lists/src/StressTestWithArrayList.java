import java.util.ArrayList;
import java.util.Random;

public class StressTestWithArrayList
{
    public static void main(String[] args)
    {
        ArrayList<Integer> randomNumsList = new ArrayList<Integer>();

        System.out.println("Adding numbers!");
        for (int i = 1; i <= 1000000; i++)
        {
            Random random = new Random();
            randomNumsList.add(0, random.nextInt());
        }
        System.out.println("Done adding!");
    }
}
