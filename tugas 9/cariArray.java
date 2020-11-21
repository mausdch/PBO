import java.util.*;

public class cariArray {
    int list[];

    cariArray(int list[]){
        this.list=list;
    }

    void getArrayContent(int content){
        boolean ada=false;
        int in=0;
        for (int i =0;i<list.length;i++){
            if (list[i]==content){
                ada=true;
                in=i;
                break;
            }
        }

        if (ada==true){
            System.out.println("Data "+content+" ada didalam Array pada indeks ke-"+in);
        }
        else{
            System.out.println("Tidak ada data ditemukan");
        }

    }

    void menu(){

    }

}
