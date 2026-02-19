
package tugasgithub;

public class TugasGithub {

    public static void main(String[] args) {
     int[] nilai = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        double jumlah = 0, rerata;
        
        for (int i = 0; i < 10; i++) {
            jumlah = jumlah + nilai[i];
        }
       rerata=jumlah/nilai.length;
        System.out.println("rerata nilai = "+rerata);
    }
    
}
