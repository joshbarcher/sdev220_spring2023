package algorithms;

import java.util.Arrays;
import java.util.Random;

public class SortingMain
{
    public static void main(String[] args)
    {
        int[] toBeSorted = {4, 7, 550, 13, 27,  12, 13, 3, 1, 84, 42, 13, 2, -10};
        int[] alreadySorted = {1, 2, 7, 9, 11, 13, 15};
        int[] bigArray = generateArray(1000000);

        System.out.println(Arrays.toString(bigArray));
        bubbleSort(bigArray);
        System.out.println(Arrays.toString(bigArray));
    }

    public static void bubbleSort(int[] array)
    {
        //loop for each "pass" over the array
        for (int i = 0; i < array.length - 1; i++)
        {
            for (int j = 0; j < array.length - 1; j++)
            {
                //check if adjacent elements are out of order
                if (array[j] > array[j + 1])
                {
                    swap(array, j, j + 1); //swap the two elements at the indices passed in
                }
            }
        }
    }

    //generate an array with the given length and values in the range [0, length - 1]
    private static int[] generateArray(int length)
    {
        int[] result = new int[length];
        Random random = new Random();

        //for each spot in the array, place a random number
        for (int i = 0; i < result.length; i++)
        {
            result[i] = random.nextInt(length);
        }

        return result;
    }

    //swap elements at the two positions
    private static void swap(int[] array, int first, int second)
    {
        int temp = array[first];
        array[first] = array[second];
        array[second] = temp;
    }
}