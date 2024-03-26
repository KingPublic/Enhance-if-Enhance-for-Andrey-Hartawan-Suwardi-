public class contoh {

    public static void main(String[] args){

        // Dimana for ini tidak membutuhkan array atau membutuhkan variabel yang akan menyimpan semua value array tersebut      

        for (int i = 0 ; i < 10;i++ ){

        }

        String[] value = {"a", "b", "c", "d", "e", "f"};

        // For enhance tidak dapat mengambil salah satu indeks pada array 

        for (int i = 0 ; i < value.length ; i++){
            System.out.println(value[i+1]);
            
        }

    }

}
