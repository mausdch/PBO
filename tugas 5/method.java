class Mahasiswa {
    String nama;
    String NIM;

    Mahasiswa(String nama, String nim){
        this.nama=nama;
        this.NIM=nim;
    }

    void print(){
        System.out.println("Nama: "+nama);
        System.out.println("NIM\t: "+NIM+"\n");

    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return nama;
    }

    public void setNIM(String NIM) {
        this.NIM = NIM;
    }

    public String getNIM() {
        return NIM;
    }

    String sayHi(String kata){
        return kata + " juga, nama saya adalah "+this.nama;
    }

}

public class method {
    public static void main(String[] args) {
        Mahasiswa mahasiswa1 = new Mahasiswa("ucup","12345678");

        mahasiswa1.print();
        mahasiswa1.setNama("Dobleh");
        mahasiswa1.print();
        System.out.println(mahasiswa1.getNama());
        System.out.println(mahasiswa1.getNIM());

        String kata=mahasiswa1.sayHi("cgtip");
        System.out.println(kata);
    }
}
