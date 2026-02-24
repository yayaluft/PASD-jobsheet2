## PERCOBAAN 1
1. Sebutkan dua karakteristik class atau object!
2.	Perhatikan class Mahasiswa pada Praktikum 1 tersebut, ada berapa atribut yang dimiliki oleh class Mahasiswa? Sebutkan apa saja atributnya!
3.	Ada berapa method yang dimiliki oleh class tersebut? Sebutkan apa saja methodnya
4.	Perhatikan method updateIpk() yang terdapat di dalam class Mahasiswa. Modifikasi isi method tersebut sehingga IPK yang dimasukkan valid yaitu terlebih dahulu dilakukan pengecekan apakah IPK yang dimasukkan di dalam rentang 0.0 sampai dengan 4.0 (0.0 <= IPK <= 4.0). Jika IPK tidak pada rentang tersebut maka dikeluarkan pesan: "IPK tidak valid. Harus antara 0.0 dan 4.0".
5.	Jelaskan bagaimana cara kerja method nilaiKinerja() dalam mengevaluasi kinerja mahasiswa,  kriteria apa saja yang digunakan untuk menentukan nilai kinerja tersebut, dan apa yang dikembalikan (di-return-kan) oleh method nilaiKinerja() tersebut?
6.	Commit dan push kode program ke Github
# Jawaban:
1. karakteristik class atau object :
- mempunyai data yang dimiliki object
- mempunyai langkah yang bisa dilakukan object
2. atribut yang dimiliki ada 4, diantaranya: 
- String nama
- String nim
- String kelas
- double ipk
3. method yang dimiliki ada 4, diantaranya:
- tampilkanInformasi()
- ubahKelas(String kelasBaru)
- updateIpk(double ipkBaru)
- nilaiKinerja()
4. Sudah saya modifikasi
5. method ini menggunakan if-else, kriteria yang digunakan: 
- IPK >= 3.5 = "Kinerja sangat baik"
- IPK >= 3.0 = "Kinerja baik"
- IPK >= 2.0 = "Kinerja cukup"
- IPK < 2.0 = "Kinerja kurang"  
(nilai yang di return adalah String dari pernyataan tiap if-else tersebut apabila telah memenuhi kriteria).
6. Sudah saya modifikasi.

## PERCOBAAN 2
1.	Pada class MahasiswaMain, tunjukkan baris kode program yang digunakan untuk proses instansiasi! Apa nama object yang dihasilkan?
2.	Bagaimana cara mengakses atribut dan method dari suatu objek?
3.	Mengapa hasil output pemanggilan method tampilkanInformasi() pertama dan kedua berbeda?
# Jawaban:
1. ```Mahasiswaa10 mhs1 = new Mahasiswa10();``` 
object yang dihasilkan adalah mhs1
2. Cara mengakses atribut dan method dari suatu objek dengan menggunakan format namaObjek.namaAtribut  
contoh : mhs1.nama, mhs1.ipk
3. Karena data di dalam objek setelah pemanggilan pertama diubah, sehingga ketika pemanggilan kedua mengikuti perubahan data tersebut.

## PERCOBAAN 3
1.	Pada class Mahasiswa di Percobaan 3, tunjukkan baris kode program yang digunakan untuk mendeklarasikan konstruktor berparameter!
2.	Perhatikan class MahasiswaMain. Apa sebenarnya yang dilakukan pada baris program berikut? 
```Mahasiswa10 mhs2 = new Mahasiswa10("Annisa Nabila", "2141720160", 3.25, "TI 2L");```
3.	Hapus konstruktor default pada class Mahasiswa, kemudian compile dan run program. Bagaimana hasilnya? Jelaskan mengapa hasilnya demikian!
4.	Setelah melakukan instansiasi object, apakah method di dalam class Mahasiswa harus diakses secara berurutan? Jelaskan alasannya!
5.	Buat object baru dengan nama mhs<NamaMahasiswa> menggunakan konstruktor berparameter dari class Mahasiswa!
6.	Commit dan push kode program ke Github

# Jawaban:
1. ```
public Mahasiswa10(String nm, String nim double ipk, String kls) {
        nama = nm;
        this.nim = nim;
        this.ipk = ipk;
        kelas = kls;
    }```
2. Baris tersebut membuat objek baru dari class Mahasiswa dan menyimpan objek ke atribut mhs2.
3. Output yang dihasilkan error karena class hanya memiliki konstruktor berparameter, sehingga objek mhs1 tidak bisa dibuat karena pemanggillan parameter tidak dapat ditemukan.
4. Tidak, karena method akan dieksekusi ketika dipanggil saja.
5. saya menambahkan object mhs3  
```Mahasiswa10 mhs3 = new Mahasiswa10("Luthfiyanna Nuha Syahada", "254107060077", 4.00, "SIB 1F");```
6. Sudah saya modifikasi.