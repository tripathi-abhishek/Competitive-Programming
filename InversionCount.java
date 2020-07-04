import java.util.Scanner;

class InversionCount {

    static int mergeSort(int a[], int left, int right) {
        int mid;
        int count = 0;
        if (right > left) {
            mid = (right + left) / 2;
            count = mergeSort(a, left, mid);
            count += mergeSort(a, mid + 1, right);

            count += Merge(a, left, mid + 1, right);
        }
        return count;
    }

    static int Merge(int a[], int l, int m, int r) {

        int length = r - l + 1;
        int c[] = new int[length];
        int i = 0, j = l, k = m;
        int count = 0;
        while (j <= m - 1 && k <= r) {
            if (a[j] <= a[k]) {
                c[i] = a[j];
                i++;
                j++;
            } else {
                c[i] = a[k];
                count += m - j;
                i++;
                k++;
            }
        }

        while (j <= m - 1) {
            c[i] = a[j];
            i++;
            j++;
        }

        while (k <= r) {
            c[i] = a[k];
            i++;
            k++;
        }
        i = 0;
        while (l <= r) {
            a[l] = c[i];
            l++;
            i++;
        }
        return count;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements : ");
        int n = sc.nextInt();
        System.out.print("Enter " + n + " elements :");
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        sc.close();
        InversionCount ob = new InversionCount();
        long st,ft;
        st = System.nanoTime();
        int count = ob.mergeSort(a, 0, n-1);
        ft = System.nanoTime(); 
        //System.out.println("\nNumber of Inversion = " + mergeSort(a, 0, n - 1));
        System.out.println("\nNumber of Inversion = " + count);
        System.out.println("Time Taken:" + (ft-st));
    }

}