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
    }
}
