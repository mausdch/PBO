class mahasiswa{
        String nama, NIM, jurusan;
        double IPK;
        int umur;
        }

public class pengenalan_class {
    public static void main(String[] args) {
        mahasiswa mahasiswa1 = new mahasiswa();

        mahasiswa1.nama="ucup";
        mahasiswa1.NIM="13305041";
        mahasiswa1.jurusan="teknik teknikan";
        mahasiswa1.IPK=3.5;
        mahasiswa1.umur=17;

        System.out.println(mahasiswa1.nama);
        System.out.println(mahasiswa1.NIM);
        System.out.println(mahasiswa1.jurusan);
        System.out.println(mahasiswa1.IPK);
        System.out.println(mahasiswa1.umur);

        System.out.println("");
        mahasiswa mahasiswa2 = new mahasiswa();

        mahasiswa2.nama="otong";
        mahasiswa2.NIM="13305041";
        mahasiswa2.jurusan="teknik renang";
        mahasiswa2.IPK=4.0;
        mahasiswa2.umur=32;

        System.out.println(mahasiswa2.nama);
        System.out.println(mahasiswa2.NIM);
        System.out.println(mahasiswa2.jurusan);
        System.out.println(mahasiswa2.IPK);
        System.out.println(mahasiswa2.umur);

    }
}
