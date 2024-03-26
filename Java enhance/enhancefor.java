public class enhancefor {

    public static void main(String[] args){
        // Membuat array 1 dimensi untuk for each loop
        int [] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        // Membuat for loop biasa 
        for (int i = 0; i < 10; i++){
            System.out.println(i);
        }
        // Membuat for each loop
        for (int number : numbers){
            System.out.println(number);
        }



    }
    
}
