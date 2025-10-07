public class Main {
    public static void main(String[] args) {

        mhsw[] daftarMhs = new mhsw[3];
        dosen[] daftarDosen = new dosen[2];

        daftarMhs[0] = new mhsw("M001", "Indah", "indah@student.unram.ac.id", "F1D02310004", "Teknik Informatika");
        daftarMhs[1] = new mhsw("M002", "Karin", "karin@student.unram.ac.id", "F1D02310066", "Arsitektur");
        daftarMhs[2] = new mhsw("M003", "Anca", "anca@student.unram.ac.id", "F1D02310015", "Ilmu Komunikasi");

        daftarDosen[0] = new dosen("D001", "Bu Nana", "nana@unram.ac.id", "197802032002", "Pemrograman Berorientasi Objek");
        daftarDosen[1] = new dosen("D002", "Bu Santi", "santi@unram.ac.id", "197906052001", "Algoritma dan Struktur Data");

        System.out.println("=== Data Mahasiswa ===");
        for (int i = 0; i < daftarMhs.length; i++) {
            System.out.println((i + 1) + ". " + daftarMhs[i].tampilInfo());
        }

        System.out.println();

        System.out.println("=== Data Dosen ===");
        for (int i = 0; i < daftarDosen.length; i++) {
            System.out.println((i + 1) + ". " + daftarDosen[i].tampilInfo());
        }

        System.out.println();

        System.out.println("Jumlah Mahasiswa: " + daftarMhs.length);
        System.out.println("Jumlah Dosen: " + daftarDosen.length);

        System.out.println();

        SIA sistem = new SIA();
        sistem.login("Indah", "password123");
        sistem.logout();
    }
}

