import java.util.ArrayList;

public class Test
{
    public static void main(String[] arr)
    {
        int[] testarr = {101,190,21,301,501,4140,1821,152,10,846,11};
        for (int num : testarr)
        {
            System.out.print(num + " ");
        }
        System.out.println();
        Sorts.ascendingSort(testarr);
        for (int num : testarr)
        {
            System.out.print(num + " ");
        }
        System.out.println();
        Sorts.decendingSort(testarr);
        for (int num : testarr)
        {
            System.out.print(num + " ");
        }
        System.out.println();
        String[] testNames = {"Drive", "Ex-Aid", "Ghost", "Zi-O", "Double", "Gaim", "Wizard", "Build", "OOO", "Fourze", "Kuuga", "Agito", "Ryuki", "Faiz", "Blade", "Hibiki", "Kabuto", "Kiva", "Den-O", "Decade"};
        for (String num : testNames)
        {
            System.out.print(num + " ");
        }
        System.out.println();
        Sorts.ascendingSort(testNames);
        for (String num : testNames)
        {
            System.out.print(num + " ");
        }
        System.out.println();
        Sorts.decendingSort(testNames);
        for (String num : testNames)
        {
            System.out.print(num + " ");
        }
        System.out.println();
        ArrayList<String> testNameArr = new ArrayList<>();
        for (String name : testNames)
            testNameArr.add(name);
        System.out.println(testNameArr);
        Sorts.ascendingSort(testNameArr);
        System.out.println(testNameArr);
        System.out.println(Sorts.removeLongString(5, testNameArr));
        System.out.println(testNameArr);
        int[] testarr2 = {101,190,21,301,501,4140,1821,152,10,846,11};
        for (int num : testarr2)
        {
            System.out.print(num + " ");
        }
        System.out.println();
        Sorts.insertionSort(testarr2);
        for (int num : testarr2)
        {
            System.out.print(num + " ");
        }
        System.out.println();
        int[] timetestarr1 = Sorts.arrayBuild(100000);
        //int[] timetestarr2 = Sorts.copyIntArr(timetestarr1);
        int[] timetestarr2 = timetestarr1.clone();

        long start1 = System.currentTimeMillis();
        Sorts.ascendingSort(timetestarr1);
        long end1 = System.currentTimeMillis();
        long unsorted1 = end1 - start1;
        System.out.println("Selection Unsorted: " + unsorted1);

        long start1a = System.currentTimeMillis();
        Sorts.ascendingSort(timetestarr1);
        long end1a = System.currentTimeMillis();
        long sorted1 = end1a - start1a;
        System.out.println("Selection sorted: " + sorted1);

        long start2 = System.currentTimeMillis();
        Sorts.insertionSort(timetestarr2);
        long end2 = System.currentTimeMillis();
        long unsorted2 = end2 - start2;
        System.out.println("Insertion unsorted: " + unsorted2);

        long start2a = System.currentTimeMillis();
        Sorts.insertionSort(timetestarr2);
        long end2a = System.currentTimeMillis();
        long sorted2 = end2a - start2a;
        System.out.println("Insertion sorted: " + sorted2);

    }
}
