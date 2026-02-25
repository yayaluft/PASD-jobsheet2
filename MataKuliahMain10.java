public class MataKuliahMain10 {
    public static void main(String[] args) {
        MataKuliah10 mk1 = new MataKuliah10();
        mk1.kodeMK = "AB01";
        mk1.nama = "Pemrograman Dasar";
        mk1.sks = 3;
        mk1.jumlahJam = 6;

        mk1.tampilkanInformasi();
        System.out.println();
        mk1.ubahSKS(4);
        mk1.tambahJam(2);
        mk1.tampilkanInformasi();

        MataKuliah10 mk2 = new MataKuliah10("IF02", "Basis Data", 4, 8);
        
        mk2.tampilkanInformasi();
        mk2.kurangiJam(2);
        mk2.ubahSKS(3);
        System.out.println();
        mk2.tampilkanInformasi();

        MataKuliah10 mk3 = new MataKuliah10("AC97", "Algoritma dan Struktur data", 2, 4);
        mk3.tampilkanInformasi();
    }
}
