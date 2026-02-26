public class Dosen10 {
    String idDosen;
    String nama;
    boolean statusAktif;
    int tahunBergabung;
    String bidangKeahlian;

    void tampilInformasi() {
        
        System.out.println("ID Dosen        : " + idDosen);
        System.out.println("Nama            : " + nama);
        System.out.print("Status Aktif    : ");
        if (statusAktif) {
            System.out.println("Aktif");
        } else {
            System.out.println("Tidak Aktif");
        }
        System.out.println("Tahun Bergabung : "+tahunBergabung);
        System.out.println("Bidang Keahlian : " + bidangKeahlian);
    }

    void setStatusAktif(boolean status) {
        statusAktif = status;
        if (statusAktif) {
            System.out.println("Aktif");
        } else {
            System.out.println("Tidak Aktif");
        }
    }

    int hitungMasaKerja(int tahunTerkini) {
        int masaKerja = tahunTerkini - tahunBergabung;
        return masaKerja;
    }

    void UbahKeahlian(String bidang) {
        bidangKeahlian = bidang;
    }

    public Dosen10() {

    }

    public Dosen10(String idDosen, String nama, boolean statusAktif, int tahunBergabung, String bidangKeahlian) {
        this.idDosen = idDosen;
        this.nama = nama;
        this.statusAktif = statusAktif;
        this.tahunBergabung = tahunBergabung;
        this.bidangKeahlian = bidangKeahlian;
    }
}
