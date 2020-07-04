import java.util.Scanner;

public class InsertionSort {
    public static void insertionSort(int array[]) {
        int n = array.length;
        for (int j = 1; j < n; j++) {
            int key = array[j];
            int i = j - 1;
            while ((i > -1) && (array[i] > key)) {
                array[i + 1] = array[i];
                i--;
            }
            array[i + 1] = key;
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of Array: ");
        int l = sc.nextInt();
        int[] arr1 = new int[l]; 
        System.out.println("Enter array elements: ");                 //{ 9, 14, 3, 2, 43, 11, 58, 22 };
        for(int i=0; i<arr1.length; i++)
        {
            arr1[i] = sc.nextInt();
        }
        sc.close();
        System.out.println("Before Insertion Sort");
        for (int i : arr1) {
            System.out.print(i + " ");
        }
        System.out.println(); // just to print a line

        long st, ft;
        st = System.nanoTime();
        insertionSort(arr1);// sorting array using insertion sort
        ft = System.nanoTime();

        System.out.println("After Insertion Sort");
        for (int i : arr1) {
            System.out.print(i + " ");
        }

        System.out.println("\nTime Taken:" + (ft - st));
    }
}