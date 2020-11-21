import java.util.*;

public class tugas9 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        String input[]=new String[9];
        int list[] = new int[10];
        System.out.println("masukkan 10 data dengan batas spasi :");
        String in= scan.nextLine();
        input= in.split(" ");

        for (int i=0;i<input.length;i++){
            list[i] = Integer.parseInt(input[i]);
        }

        cariArray cr=new cariArray(list);

        System.out.println("masukkan data yang ingin dicari: ");
        int cari= scan.nextInt();
        cr.getArrayContent(cari);
    }
}
