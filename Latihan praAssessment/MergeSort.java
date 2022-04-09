import java.util.Arrays;

public class MergeSort {
    static void merge(int[] array, int p, int q, int r) {
        int n1 = q - p + 1;
        int n2 = r - q;

        int[] L = new int[n1];
        int[] M = new int[n2];

        for (int i = 0; i < n1; i++) {
            L[i] = array[p + i];
        }
        for (int j = 0; j < n2; j++) {
            M[j] = array[q + 1 + j];
        }
        int i, j, k;
        i = 0;
        j = 0;
        k = p;
        while (i < n1 && j < n2) {
            if (L[i] <= M[j]) {
                array[k] = L[i];
                i++;
            } else {
                array[k] = M[j];
                j++;
            }
            k++;
        }
        while (i < n1) {
            array[k] = L[i];
            i++;
            k++;
        }
        while (j < n2) {
            array[k] = M[j];
            j++;
            k++;
        }
    }
    static void sorting(int[] array, int l, int r) {
        if (l < r) {
            int m = (l + r) / 2;

            sorting(array, l, m);
            sorting(array, m + 1, r);
            merge(array, l, m, r);
        }
    }
    public static void main(String[] args) {
        int[] array = {6, 22, 2, 10, 8, 7, 100, 1, 3, 5};

        MergeSort.sorting(array, 0, array.length -1);
        System.out.println("\n Setelah di Sorting : ");
        System.out.println(Arrays.toString(array));
    }
}
