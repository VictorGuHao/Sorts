import java.util.ArrayList;

public class Sorts
{
    public static void ascendingSort(int[] arr)
    {
        for(int i = 0; i < arr.length - 1; i++)
        {
            int lowNumPos = i;
            for (int j = i + 1; j < arr.length; j++)
            {
                if (arr[j] < arr[lowNumPos])
                    lowNumPos = j;
            }
            swap(i, lowNumPos, arr);
        }
    }

    public static void decendingSort(int[] arr)
    {
        for(int i = 0; i < arr.length - 1; i++)
        {
            int highNumPos = i;
            for (int j = i + 1; j < arr.length; j++)
            {
                if (arr[j] > arr[highNumPos])
                    highNumPos = j;
            }
            swap(i, highNumPos, arr);
        }
    }

    private static void swap(int index1, int index2, int[] arr)
    {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }

    public static void ascendingSort(String[] arr)
    {
        for(int i = 0; i < arr.length - 1; i++)
        {
            int lowNumPos = i;
            for (int j = i + 1; j < arr.length; j++)
            {
                if (arr[j].compareTo(arr[lowNumPos]) < 0)
                    lowNumPos = j;
            }
            swap(i, lowNumPos, arr);
        }
    }

    public static void decendingSort(String[] arr)
    {
        for(int i = 0; i < arr.length - 1; i++)
        {
            int lowNumPos = i;
            for (int j = i + 1; j < arr.length; j++)
            {
                if (arr[j].compareTo(arr[lowNumPos]) > 0)
                    lowNumPos = j;
            }
            swap(i, lowNumPos, arr);
        }
    }

    public static void ascendingSort(ArrayList<String> arr)
    {
        for(int i = 0; i < arr.size() - 1; i++)
        {
            int lowNumPos = i;
            for (int j = i + 1; j < arr.size(); j++)
            {
                if (arr.get(j).compareTo(arr.get(lowNumPos)) < 0)
                    lowNumPos = j;
            }
            arr.set(i, arr.set(lowNumPos, arr.get(i)));
        }
    }

    private static void swap(int index1, int index2, String[] arr)
    {
        String temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
}
