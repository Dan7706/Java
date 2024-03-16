import java.util.Arrays;

// binary search = Search algorithm that finds the position
//                 of a target value within a sorted array.
//                 Half of the array is eliminated during each "step"


class Main 
{
    public static void main(String[] args)
    {
        int array[] = new int[1000000];
        int target = 123456;
        for (int i = 0; i < 1000000; i++)
        {
            array[i] = i;
        }
        
        //int index = Arrays.binarySearch(array, target);  //Built in binarySearch. more effective
        int index = binarySearch(array, target);

        if (index != -1)
        {
            System.out.println("Found at: " + index);
        }
        else
        {
            System.out.println("Not Found");
        }
    }



    private static int binarySearch(int[] array, int target)
    {
        int low = 0;
        int high = array.length - 1;

        while (low <= high)
        {
            int middle = low + (high - low) / 2;
            int value = array[middle];
            
            //System.out.println("Middle: " + value); // You can print out to count the steps

            if (value < target) low = middle + 1;

            else if (value > target) high = middle - 1;

            else return middle;
        }
        return -1;
    }
}







