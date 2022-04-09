import java.util.Arrays;
import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] array = {30, 4, 7, 10, 8, 100, 33};
        System.out.println(Arrays.toString(array));
        System.out.print("Input angka yang dicari : ");
        int nomor = input.nextInt();
        int index;

        for (index = 0; index < array.length; index++) {
            if(array[index] == nomor){
                System.out.print("Angka ditemukan pada index : " + index );
                break;
            }
        }
        if(index == array.length){
            System.out.print("Angka tidak ditemukan");
        }
        System.out.println();
    }
}
