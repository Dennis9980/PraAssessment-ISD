public class BinarySearch {
    private final int [] data = {4, 7, 10, 8, 9, 30, 33, 100};
    private void cetak(){
        for (int i : data) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
    public String metodeBinary(int kunci){
        int bawah = 0;
        int atas = data.length -1;

        while (atas >= bawah){
            int tengah = (bawah + atas) / 2;
            if(kunci < data[tengah]){
                atas = tengah -1;
            }else if (kunci == data[tengah]){
                return "Nomor " + kunci + " Berada Pada Urutan Ke-" + (tengah + 1); 
            }else{
                bawah = tengah + 1;

            }
        }
        return "Data Tidak Ditemukan";
    }
    public static void main(String[] args) {
        BinarySearch object = new BinarySearch();
        object.cetak();
        System.out.println(object.metodeBinary(33));
    }
}
