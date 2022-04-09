public class InsertionSort {
    public static void sorting(int array[]){
        int panjang = array.length;
        for (int i = 1; i < panjang; i++) {
            int kunci = array[i];
            int temp = i - 1;
            while(temp >= 0 && kunci < array[temp]){
                array [temp + 1] = array [temp];
                temp--;
            }
            array[temp + 1] = kunci;
        }
    }
    public static void main(String[] args) {
        int[] arrayy = {6, 22, 2, 10, 8, 7, 100, 1, 3, 5};
        System.out.println("Sebelum Insertion Sort : ");
        for (int i : arrayy) {
            System.out.print(i + " ");
        }
        System.out.println();
        sorting(arrayy);
        System.out.println("Setelah Insertion Sort : ");
        for (int i : arrayy) {
            System.out.print(i + " ");
        }
    }
}

