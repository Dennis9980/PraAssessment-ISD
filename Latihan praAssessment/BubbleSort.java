public class BubbleSort{
    public static void main(String[] args) {
        int array[] = {6, 22, 2, 10, 8, 7, 100, 1, 3, 5}; 
        int panjang = array.length;
        int temp = 0;
        

        System.out.print("Sebelum sorting = ");
        for (int i = 0; i < panjang; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();

        for (int i = 0; i < panjang; i++) {
            for (int j = 1; j < (panjang - i); j++) {
                if(array[j-1] > array[j]){
                    temp = array[j-1];
                    array[j-1] = array[j];
                    array[j] = temp;
                }
            }
        }
        System.out.print("Sesudah sorting = ");
        for (int i = 0; i < panjang; i++) {
            System.out.print(array[i] + " ");
        }
    }
}