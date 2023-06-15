package algorithms;

public class SearchingMain
{
    public static void main(String[] args)
    {
        int[] alreadySorted = {1, 2, 7, 9, 11, 13, 15};
        System.out.println("binarySearch(7): " + binarySearch(alreadySorted, 7));
        System.out.println("binarySearch(7): " + binarySearch(alreadySorted, 15));
        System.out.println("binarySearch(7): " + binarySearch(alreadySorted, 1));
        System.out.println("binarySearch(7): " + binarySearch(alreadySorted, 13));
        System.out.println("binarySearch(7): " + binarySearch(alreadySorted, 4));
    }

    private static int binarySearch(int[] array, int search)
    {
        int low = 0;
        int high = array.length - 1;

        //continue looping while low and high are in order
        while (low <= high)
        {
            int mid = (low + high) / 2;

            if (array[mid] == search)
            {
                return mid; //return the index where we found the search value!
            }
            else if (array[mid] > search)
            {
                //search left
                high = mid - 1;
            }
            else
            {
                //search right
                low = mid + 1;
            }
        }

        return -1; //not found!
    }
}
