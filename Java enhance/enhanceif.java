import java.util.Scanner;

public class enhanceif {
    

    public static void main(String[] args){
        // Deklarasi dan inisialisasi variabel terlebih dahulu
        int x = 5;
        // Membuat if conditional biasa
        if (x > 5){
            System.out.println("lol");
        }
        else{
            System.out.println("wkwk");
        }

        // Membuat variabel yang akan menampung nilai yang akan keluar jika kondisinya benar atau salah (sebenarnya tidak harus begini bisa juga seperti dibawah)
        String hasil = (x > 5) ? "lol" : "wkwk";
        System.out.println(hasil);
        // Membuat if enhance secara langsung keluar di output tanpa variabel penampung 
        System.out.println((x > 5) ? "lol" : "wkwk");

        Scanner inputko = new Scanner (System.in);
        int angka = inputko.nextInt();

        //Membuat contoh lain 
        System.out.println((angka>70) ? "Goodjob" : (angka>=70) ?  "Badjob" : "waduh kok gitu");
       






    }

}
