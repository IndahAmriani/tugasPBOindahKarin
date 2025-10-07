public class Main {
    public static void main(String[] args) {

        mhsw[] daftarMhs = new mhsw[3]; //array untuk menyimpan objek mahasiswa
        dosen[] daftarDosen = new dosen[2]; //array untuk menyimpan objek dosen

        //mengisi data mahasiswa menggunakan constructor class Mhsw
        daftarMhs[0] = new mhsw("M001", "Indah", "indah@student.unram.ac.id", "F1D02310004", "Teknik Informatika");
        daftarMhs[1] = new mhsw("M002", "Karin", "karin@student.unram.ac.id", "F1D02310066", "Arsitektur");
        daftarMhs[2] = new mhsw("M003", "Anca", "anca@student.unram.ac.id", "F1D02310015", "Ilmu Komunikasi");

        //mengisi data dosen menggunakan constructor class Dosen
        daftarDosen[0] = new dosen("D001", "Bu Nana", "nana@unram.ac.id", "197802032002", "Pemrograman Berorientasi Objek");
        daftarDosen[1] = new dosen("D002", "Bu Santi", "santi@unram.ac.id", "197906052001", "Algoritma dan Struktur Data");

        //menampilkan data mahasiswa
        System.out.println("=== Data Mahasiswa ===");
        for (int i = 0; i < daftarMhs.length; i++) {
            System.out.println((i + 1) + ". " + daftarMhs[i].tampilInfo());  //Mengambil data menggunakan metode tampilinfo()
        }

        System.out.println();

        //menampilkan data dosen
        System.out.println("=== Data Dosen ===");
        for (int i = 0; i < daftarDosen.length; i++) {
            System.out.println((i + 1) + ". " + daftarDosen[i].tampilInfo()); //Mengambil data menggunakan metode tampilinfo()
        }

        System.out.println();

        //menampilkan jumlah mahasiswa dan dosen
        System.out.println("Jumlah Mahasiswa: " + daftarMhs.length);
        System.out.println("Jumlah Dosen: " + daftarDosen.length);

        System.out.println();

        SIA sistem = new SIA(); //membuat objek SIA
        sistem.login("Indah", "password123"); //melakukan login ke sistem
        sistem.logout();  //melakukan logout dari sistem
    }
}

