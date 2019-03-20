import java.util.ArrayList;
import java.util.List;

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

    public static ArrayList<String> removeLongString(int maxLen, List<String> arr)
    {
        ArrayList<String> rmedItem = new ArrayList<String>();
        int i = 0;
        while (i < arr.size())
        {
            if(arr.get(i).length() > maxLen)
                rmedItem.add(arr.remove(i));
            else
                i++;
        }
        return rmedItem;
    }

    public static void insertionSort(int[] elements)
    {
        for (int j = 1; j < elements.length; j++)
        {
            int temp = elements[j];
            int possibleIndex = j;
            while (possibleIndex > 0 && temp < elements[possibleIndex - 1])
            {
                elements[possibleIndex] = elements[possibleIndex - 1];
                possibleIndex--;
            }
            elements[possibleIndex] = temp;
        }
    }

    public static int getRandomNum(int maxLen)
    {
        return (int)(Math.random() * Math.pow(10, maxLen));
    }

    public static int[] arrayBuild(int arrLen)
    {
        int[] arr = new int[arrLen];
        for (int i = 0; i < arr.length; i++)
            arr[i] = getRandomNum(6);
        return arr;
    }

    public static int[] copyIntArr(int[] arr)
    {
        int[] copiedArr = new int[arr.length];
        for (int i = 0; i < copiedArr.length; i++)
            copiedArr[i] = arr[i];
        return copiedArr;
    }

    public static void mergeSort(int[] elements)
    {
        int n = elements.length;
        int[] temp = new int[n];
        mergeSortHelper(elements, 0, n - 1, temp);
    }

    private static void mergeSortHelper(int[] elements, int from, int to, int[] temp)
    {
        if (from < to)
        {
            int middle = (from + to) / 2;
            mergeSortHelper(elements, from, middle, temp);
            mergeSortHelper(elements, middle + 1, to, temp);
            merge(elements, from, middle, to, temp);
        }
    }

    private static void merge(int[] elements,
                              int from, int mid, int to, int[] temp)
    {
        int i = from;
        int j = mid + 1;
        int k = from;
        while (i <= mid && j <= to)
        {
            if (elements[i] < elements[j])
            {
                temp[k] = elements[i];
                i++;
            }
            else
            {
                temp[k] = elements[j];
                j++;
            }
            k++;
        }
        while (i <= mid)
        {
            temp[k] = elements[i];
            i++;
            k++;
        }
        while (j <= to)
        {
            temp[k] = elements[j];
            j++;
            k++;
        }
        for (k = from; k <= to; k++)
        {
            elements[k] = temp[k];
        }
    }
}
