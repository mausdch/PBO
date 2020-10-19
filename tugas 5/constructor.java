class Polos{
    String dataString;
    int dataInteger;
}

class Mahasiswa {
    String nama;
    String NIM;
    String jurusan;

    Mahasiswa(String nama, String nim, String jurusan){
        this.nama=nama;
        this.NIM=nim;
        this.jurusan=jurusan;

        System.out.println(this.nama);
        System.out.println(this.NIM);
        System.out.println(this.jurusan+"\n");
    }
}

public class constructor {
    public static void main(String[] args) throws Exception {
        Mahasiswa mahasiswa1 = new Mahasiswa("ucup","12345678","teknik teknikan");
        Mahasiswa mahasiswa2 = new Mahasiswa("otong", "09876543", "teknik renang");


    }

}
