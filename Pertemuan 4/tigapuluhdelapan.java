import java.lang.String;
import java.util.*;

public class tigapuluhdelapan {
    private static int fibonacci(int n, String daun){
        System.out.println("daun " + daun);
        System.out.println("Fibonacci ke - " + n);
        if (n == 1 || n == 0){
            return n;
        }
        else {
            return fibonacci(n - 1, "kiri") + fibonacci(n - 2, "kanan");
        }
    }

    public static void main (String[] args){

        Scanner scan = new Scanner(System.in);
        System.out.print("masukan nilai n = ");
        int nilai = scan.nextInt();
        int nilai_fibonacci = fibonacci(nilai, "atas");
        System.out.println("nilai fibonacci ke-"+ nilai +" adalah " + nilai_fibonacci);
    }
}
