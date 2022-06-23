**Algoritma dan Struktur Data 2021-2022** 

**Nama : Andhito Galih Nur Cahyo**

**Kelas : 1F**

**No absen : 06**

**Nim : 2141720138**

**JOBSHEET XVI**

**Collection**

**16.1. Tujuan Praktikum**

Setelah melakukan praktikum ini, mahasiswa mampu:
1. memahami bentuk-bentuk collection dan hierarkinya;
2. menerapkan collection sesuai dengan fungsi dan jenisnya;
3. menyelesaikan kasus menggunakan collection yang sesuai.

**16.2. Kegiatan Praktikum 1**

**16.2.1. Percobaan 1**

**16.2.2. Verifikasi Hasil Percobaan**

![P1](Screenshot/P1.png)

**16.2.3. Pertanyaan Percobaan** 

1. Perhatikan baris kode 25-36, mengapa semua jenis data bisa ditampung ke dalam sebuah Arraylist?
2. Modifikasi baris kode 25-36 seingga data yang ditampung hanya satu jenis atau spesifik tipe 
tertentu!
3. Ubah kode pada baris kode 38 menjadi seperti ini
```
LinkedList<String> names = new LinkedList <>();
```

4. Tambahkan juga baris berikut ini, untuk memberikan perbedaan dari tampilan yang sebelumnya
```
names.push("Mei-mei");
System.out.printf("Elemen 0: %s total elemen: %s elemen terakhir: %s\n", 
    names.getFirst(), names.size(), names.getLast());
System.out.printf("Names: " + names.toString());

```

5. Dari penambahan kode tersebut, silakan dijalankan dan apakah yang dapat Anda jelaskan!

**Jawab :**
1. Karena pada baris kode 25-36 menggunakan list dengan tipe data dinamis (tidak diberi kurung sudut "<>") dan tidak dapat menentukan tipe data. Jadi, arraylist yang ditambahkan secara dinamis, dapat menampung semua data (tipe data).

2. Dengan mengganti intansiasi list array menjadi *List<Integer> l = new ArrayList<>();*

3. Jika diubah menjadi kode baris seperti di atas, maka akan terjadi error, seperti gambar di bawah ini:
   ![P1.no3](Screenshot/P1.no3.png)

4. 
![P1.no4](Screenshot/P1.no4.png)


5. 
![P1.no5](Screenshot/P1.no5.png)


**16.3. Kegiatan Praktikum 2**

**16.3.1. Tahapan Percobaan**

**16.3.2. Verifikasi Hasil Percobaan**

![P2](Screenshot/P2.png)

**16.3.3. Pertanyaan Percobaan**

1. Apakah perbedaan fungsi push() dan add() pada objek fruits?
2. Silakan hilangkan baris 43 dan 44, apakah yang akan terjadi? Mengapa bisa demikian?
3. Jelaskan fungsi dari baris 46-49?
4. Silakan ganti baris kode 25, Stack<String> menjadi List<String> dan apakah yang terjadi? 
Mengapa bisa demikian?
5. Ganti elemen terakhir dari dari objek fruits menjadi “Strawberry”!
6. Tambahkan 3 buah seperti “Mango”,”guava”, dan “avocado” kemudian dilakukan sorting!

**Jawab :**

1. Yang membedakan keduanya ialah pada jenis struktur data yang digunakan. Jika fungsi push() merupakan stack, sedangkan fungsi add() merupakan list.

2. Melon dan Durian akan terhapus karena tidak ada penambahan data (push) Melon dan Durian.

3. Fungsi dari baris 46-49 ialah untuk menginisialisasi fungsi iterator dengan tipe data String. `hashNext()` digunakan untuk mengecek apakah iterator memiliki elemet berikutnya atau tidak. Jika bernilai true, maka variabel fruit akan menyimpan nilai berikutnya. Kemudian ditampilkan elemen tersebu

4. Akan terjadi error, karena list tidak compatible dengan fungsi-fungsi dan inisialisasi dengan stack.

5. 
- code 
![P2.no5](Screenshot/P2.no5.png)

- Output
![P2.no5.1](Screenshot/P2.no5.1.png)

6. 
- code 
![P2.no6](Screenshot/P2.no6.png)

- Output
![P2.no6.1](Screenshot/P2.no6.1.png)

**16.4. Kegiatan Praktikum 3**

**16.4.1. Tahapan Percobaan**

**16.4.2. Verifikasi Hasil Percobaan**

![P3](Screenshot/P3.png)

**16.4.3. Pertanyaan Percobaan**

1. Pada fungsi tambah() yang menggunakan unlimited argument itu menggunakan konsep apa? 
Dan kelebihannya apa?
2. Pada fungsi linearSearch() di atas, silakan diganti dengan fungsi binarySearch() dari collection!
3. Tambahkan fungsi sorting baik secara ascending ataupun descending pada class tersebut!

**Jawab :**

1. **ArrayList**, alasannya ialah karena dengan konsep itu dapat memungkinkan metode untuk mengambil sejumlah argumen, dapat diakses sebagai array dalam method.

2. 
- Code :

```
package Praktikum3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;



public class Mahasiswa_No2 {
        String nim;
        String nama;
        String notelp;

        public Mahasiswa_No2 () {
            
        }

        public Mahasiswa_No2(String nim, String nama, String notelp){
                this.nim = nim;
                this.nama = nama;
                this.notelp = notelp;
        }

        @Override
        public String toString(){
                return "Mahasiswa{" + "nim= " + nim + ", nama=" + nama + ", notelp=" + notelp + '}';
        }
}

class ListMahasiswa {
        List<Mahasiswa> mahasiswas = new ArrayList<>();

        public void tambah(Mahasiswa... mahasiswa) {
            mahasiswas.addAll(Arrays.asList(mahasiswa));
        }
    
        public void hapus(int index) {
            mahasiswas.remove(index);
        }
        public void update(int index, Mahasiswa mhs) {
            mahasiswas.set(index, mhs);
        }
        public void tampil() {
            mahasiswas.stream().forEach(mhs -> {
                System.out.println("" + mhs.toString());
            });
        }
        int linearSearch(String nim) {
            for (int i = 0; i < mahasiswas.size(); i++) {
                if (nim.equals(mahasiswas.get(i).nim)) {
                    return i;
                }
            }
            return -1;
        }
        public static void main(String[] args) {
            ListMahasiswa lm = new ListMahasiswa();
            Mahasiswa m = new Mahasiswa("201234", "Noureen", "021xx1");
            Mahasiswa m1 = new Mahasiswa("201235", "Akhleena", "021xx2");
            Mahasiswa m2 = new Mahasiswa("201236", "Shannum", "021xx3");
            lm.tambah(m, m1, m2);
            lm.tampil();
    lm.update(lm.linearSearch("201235"), new Mahasiswa("201235", "Akhleena Lela", "021xx2"));
    System.out.println("");
    lm.tampil();
    
            // --------------------------------------------------//
            Mahasiswa key = new Mahasiswa("201235", null, null);
            lm.update(Collections.binarySearch(lm.mahasiswas, key, new MhsComparator()),
                    new Mahasiswa("201235", "Akhleema", "021xx2"));
            System.out.println("");
            lm.tampil();
        }
    }

 class MhsComparator implements Comparator<Mahasiswa> {

        public int compare(Mahasiswa mhs1, Mahasiswa mhs2) {
            if (mhs1.nim == mhs2.nim) {
                return 0;
            } else {
    
                return -1;
            }
        }
    
        @Override
        public Comparator<Mahasiswa> reversed() {
            return Comparator.super.reversed();
        }
}

```

- Output :

![P3.no2](Screenshot/P3.no2.png)

3. 
- Code :
```
package Praktikum3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;



class Mahasiswa {
        String nim;
        String nama;
        String notelp;

        public Mahasiswa () {
            
        }

        public Mahasiswa(String nim, String nama, String notelp){
                this.nim = nim;
                this.nama = nama;
                this.notelp = notelp;
        }

        @Override
        public String toString(){
                return "Mahasiswa{" + "nim= " + nim + ", nama=" + nama + ", notelp=" + notelp + '}';
        }
}

public class ListMahasiswa_No3 {
    List<Mahasiswa> mahasiswas = new ArrayList<>();

    public void tambah(Mahasiswa... mahasiswa) {
        mahasiswas.addAll(Arrays.asList(mahasiswa));
    }

    public void hapus(int index) {
        mahasiswas.remove(index);
    }

    public void update(int index, Mahasiswa mhs) {
        mahasiswas.set(index, mhs);
    }

    public void tampil() {
        mahasiswas.stream().forEach(mhs -> {
            System.out.println("" + mhs.toString());
        });
    }

    // -------------------------------------------------- //
    void ascendingSort() {
        this.mahasiswas.sort((Mahasiswa d1, Mahasiswa d2) -> d1.nama.compareTo(d2.nama));
    }

    void descending() {
        this.mahasiswas.sort((Mahasiswa d1, Mahasiswa d2) -> d2.nama.compareTo(d1.nama));

    }
    // --------------------------------------------------//

    int linearSearch(String nim) {
        for (int i = 0; i < mahasiswas.size(); i++) {
            if (nim.equals(mahasiswas.get(i).nim)) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        ListMahasiswa_No3 lm = new ListMahasiswa_No3();
        Mahasiswa m = new Mahasiswa("201234", "Noureen", "021xx1");
        Mahasiswa m1 = new Mahasiswa("201235", "Akhleena", "021xx2");
        Mahasiswa m2 = new Mahasiswa("201236", "Shannum", "021xx3");
        lm.tambah(m, m1, m2);
        lm.tampil();
        lm.update(lm.linearSearch("201235"), new Mahasiswa("201235", "Akhleena Lela", "021xx2"));
        System.out.println("");
        lm.tampil();

        // --------------------------------------------------//
        Mahasiswa key = new Mahasiswa("201235", null, null);
        lm.update(Collections.binarySearch(lm.mahasiswas, key, new MhsComparator()),
                new Mahasiswa("201235", "Akhleema", "021xx2"));
        System.out.println("");
        lm.tampil();

        System.out.println("\n");

        System.out.println("Ascending : ");
        lm.ascendingSort();
        lm.tampil();

        System.out.println("\n");

        System.out.println("Descending : ");
        lm.descending();
        lm.tampil();
    }
}

class MhsComparator implements Comparator<Mahasiswa> {

    public int compare(Mahasiswa mhs1, Mahasiswa mhs2) {
        if (mhs1.nim == mhs2.nim) {
            return 0;
        } else {

            return -1;
        }
    }

    @Override
    public Comparator<Mahasiswa> reversed() {
        return Comparator.super.reversed();
    }
}
```

- Output : 
![P3.no3](Screenshot/P3.no3.png)


**16.5. Tugas Praktikum**

1. Implementasikan stack menggunakan collection dengan contoh kasus tumpukan daftar film
sesuai dengan fitur-fitur yang ditunjukkan pada gambar di bawah ini!

- Code:

```
package Tugas1;

public class T1_Stack_Collection {
    String id, judul, director;
    int tahun;

    public T1_Stack_Collection(){

    }

    public T1_Stack_Collection(String id, String judul, int tahun, String director){
        this.id = id;
        this.judul = judul;
        this.tahun = tahun;
        this.director = director;
    }

    @Override
    public String toString() {
        return "Film{" + "ID Film=" + id + ", Judul Film=" + judul + ", Tahun Tayang=" + tahun
                + ", Director=" + director +"}";
    }
}
import java.util.Scanner;
import java.util.Stack;

public class T1_Stack_CollectionMain {
    static void menu(){
        System.out.println("====================================");
        System.out.println("Data Film Layar Lebar Sepanjang Masa");
        System.out.println("====================================\n");
        System.out.println("1. Input Judul Film");
        System.out.println("2. Hapus Data Film Teratas");
        System.out.println("3. Cek Judul Film Teratas");
        System.out.println("4. Info semua Judul Film");
        System.out.println("5. Keluar");
        System.out.println("====================================\n");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner input = new Scanner(System.in);
        Stack<T1_Stack_Collection> film = new Stack<>();
        int pilih;

        do {
            menu();
            System.out.println("Pilih: ");
            pilih = input.nextInt();

            switch (pilih) {
                case 1:
                    System.out.println("ID Film         :");
                    String id = sc.nextLine();
                    System.out.println("Judul Film      :");
                    String judul = sc.nextLine();
                    System.out.println("Tahun Tayang    :");
                    int tahun = input.nextInt();
                    System.out.println("Director        :");
                    String director = sc.nextLine();
                    
                    T1_Stack_Collection flm = new T1_Stack_Collection();
                    film.push(flm = new T1_Stack_Collection(id, judul, tahun, director));
                    System.out.println("");
                    break;
                case 2:
                    film.pop();
                    System.out.println("Film{" + "ID Film=" + (film.get(film.size()-1).id) + ", Judul Film=" + (film.get(film.size()-1).judul) + 
                    ", Tahun Tayang=" + (film.get(film.size()-1).tahun) + ", Director=" + (film.get(film.size()-1).director) +"}");
                    System.out.println("");
                    break;
                case 3:
                    System.out.println("Film{" + "ID Film=" + (film.get(film.size()-1).id) + ", Judul Film=" + (film.get(film.size()-1).judul) + 
                    ", Tahun Tayang=" + (film.get(film.size()-1).tahun) + ", Director=" + (film.get(film.size()-1).director) +"}");
                    break;
                case 4:
                    film.stream().forEach(f -> {
                        System.out.println("Film{" + "ID Film=" + f.id + ", judul=" + f.judul
                        + ", Tahun Tayang=" + f.tahun + ", Director=" + f.director + "}");
                     });
                     System.out.println("");
                     break;
                case 5:
                     System.out.println("Terima kasih");
                     System.exit(0);
                
                default:
                    System.out.println("Inputan yang Anda Masukkan Salah!");
                    break;
            }   
        } while (pilih > 0 && pilih < 6);
    }
}

```
- Output :

    **Menu Awal dan Tambah Data (Push)**

    ![T1.no1](Screenshot/T1.no1.png)

    ![T1.no1.1](Screenshot/T1.no1.1.png)

    **Cetak Semua Data Film**

    ![T1.no2](Screenshot/T1.no2.png)

    **Cek Judul Film di tumpukan teratas**

    ![T1.no3](Screenshot/T1.no3.png)

    **Hapus Film Teratas**

    ![T1.no4](Screenshot/T1.no4.png)


2. Buatlah implementasi program daftar nilai mahasiswa semester, minimal memiliki 3 class yaitu Mahasiswa, Nilai, dan Mata Kuliah. Khusus untuk data Mahasiswa dan Mata Kuliah harus sudah diinisialisasi, sehingga ketika memasukkan data nilai data mahasiswa dan mata kuliah cukup menginputkan nim ataupun kode mata kuliah. Yang paling penting adalah antara objek mahasiswa, matakuliah, dan nilai harus saling terhubung.

- Code : 
```
package Tugas2;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class T2_Collection_Mhs {
    
    String nim, nama, noHp;   

    public T2_Collection_Mhs(){

    }

    public T2_Collection_Mhs(String nim, String nama, String noHp) {
        this.nim  = nim;
        this.nama =  nama;
        this.noHp = noHp;
    }

    @Override
    public String toString() {
        return "Mahasiswa{" + "nim=" + nim + ", nama=" + nama + ", noTelp=" +noHp + "}";
    }
}

class Tugas2_Stack_Collection_Matakuliah {
    String kode, matkul, sks;
    
    public Tugas2_Stack_Collection_Matakuliah(String kode, String matkul, String sks){
        this.kode = kode;
        this.matkul = matkul;
        this.sks = sks;
    }
}

class Tugas2_Stack_Collection_Nilai {
    String kdNilai, kdMatkul, nimMhs;
    double nilai;

    public Tugas2_Stack_Collection_Nilai(String kdNilai, double nilai, String kdMatkul, String nimMhs) {
        this.kdNilai = kdNilai;
        this.kdMatkul = kdMatkul;
        this.nimMhs = nimMhs;
        this.nilai = nilai;
    }
}

class MainTugas2_Stack_Collection_Pertemuan_16 {
    List<T2_Collection_Mhs> mhs = new ArrayList<>();
    List<Tugas2_Stack_Collection_Matakuliah> mk = new ArrayList<>();
    List<Tugas2_Stack_Collection_Nilai> nil = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);

    void setData(){
        //Mahasiswa
        mhs.add(new T2_Collection_Mhs("20001", "Thalhah", "021xxx"));
        mhs.add(new T2_Collection_Mhs("20002", "Zubair", "021xxx"));
        mhs.add(new T2_Collection_Mhs("20003", "Abdur-Rahman", "021xxx"));
        mhs.add(new T2_Collection_Mhs("20004", "Sa'ad", "021xxx"));
        mhs.add(new T2_Collection_Mhs("20005", "Sa'id", "021xxx"));
        mhs.add(new T2_Collection_Mhs("20006", "Ubaidah", "021xxx"));
        
        //Matakuliah
        mk.add(new Tugas2_Stack_Collection_Matakuliah("00001", "Internet of Things", "3"));
        mk.add(new Tugas2_Stack_Collection_Matakuliah("00002", "Algoritma dan Struktur Data", "2"));
        mk.add(new Tugas2_Stack_Collection_Matakuliah("00003", "Algoritma dan Pemrograman", "2"));
        mk.add(new Tugas2_Stack_Collection_Matakuliah("00004", "Praktikum Algoritma dan Struktur Data", "3"));
        mk.add(new Tugas2_Stack_Collection_Matakuliah("00005", "Praktikum Algoritma dan Pemrograman", "3"));
    }
    void inputNilai() {
        System.out.println("Masukkan Data");
        System.out.print("Kode    :");
        String kode = sc.next();
        System.out.print("Nilai   :");
        double nilai = sc.nextDouble();
        System.out.println("");
        System.out.println("DAFTAR MAHASISWA");
        System.out.println("************************************************");
        System.out.printf("%-15s        %-15s   %-14s\n", "NIM", "Nama", "Telf");
        for(T2_Collection_Mhs mahasiswa : mhs) {
            System.out.printf("%-15s        %-15s   %-14s\n", mahasiswa.nim, mahasiswa.nama, mahasiswa.noHp);
        }
        boolean found = true;
        String pilMhs;
        int confirm = 0;
        do {
            System.out.print("Pilih Mahasiswa by NIM : ");
            pilMhs = sc.next();
            for(T2_Collection_Mhs mahasiswa : mhs) {
                if(pilMhs.equals(mahasiswa.nim)) {
                    found = false;
                    confirm++;
                }
            }
            if(confirm == 0) {
                System.out.println("Data Kode NIM Tidak Ditemukan");
            }
        } while (found);
        System.out.println("");
        System.out.println("DAFTAR MATA KULIAH");
        System.out.println("************************************************");
        System.out.printf("%-15s        %-40s   %-40s\n", "Kode", "Mata Kuliah", "SKS");
        for(Tugas2_Stack_Collection_Matakuliah matkul : mk) {
            System.out.printf("%-15s        %-40s   %-40s\n", matkul.kode, matkul.matkul, matkul.sks);
        }
        boolean found1 = true;
        String pilMatkul;
        int confirm2 = 0;
        do {
            System.out.print("Pilih Mata Kuliah By Kode: ");
            pilMatkul = sc.next();
            for (Tugas2_Stack_Collection_Matakuliah matkul : mk){
                if(pilMatkul.equals(matkul.kode)) {
                    found1 = false;
                    confirm2++;
                }
            }
            if (confirm2 == 0) {
                System.out.println("Data Kode Mata Kuliah Tidak Ditemukan");
            }
        } while (found1);
        nil.add(new Tugas2_Stack_Collection_Nilai(kode, nilai, pilMatkul, pilMhs));
    }

    void tampilNilai() {
        System.out.println("NIM\tNama Mahasiswa\t\tMata Kuliah\t\t\t\tSKS\tNilai");
        nil.forEach(ns -> {
            System.out.print(ns.nimMhs + "\t");
            for(T2_Collection_Mhs mahasiswa : mhs) {
                if(mahasiswa.nim.equals(ns.nimMhs)) {
                    System.out.print(mahasiswa.nama + "\t\t");
                }
            }
            for(Tugas2_Stack_Collection_Matakuliah matkul : mk) {
                if(matkul.kode.equals(ns.kdMatkul)) {
                    System.out.print(matkul.matkul + "\t\t" + matkul.sks + "\t");
                }
            }
            System.out.println(ns.nilai);
        });
    }

    void cariNilai() {
        tampilNilai();
        System.out.print("Masukkan Data Mahasiswa[nim] : ");
        String searchNIM = sc.next();
        int confirm3 = 0;
        System.out.println("DAFTAR NILAI MAHASISWA");
        System.out.println("************************************************");
        System.out.println("NIM\t\tNama\t\tMata Kuliah\t\t\t\tSKS\tNilai");
        for(Tugas2_Stack_Collection_Nilai searchNilai : nil) {
            if(searchNilai.nimMhs.equals(searchNIM)) {
                System.out.print(searchNilai.nimMhs + "\t\t");
                for(T2_Collection_Mhs mahasiswa : mhs) {
                    if(mahasiswa.nim.equals(searchNilai.nimMhs)) {
                        System.out.print(mahasiswa.nama + "\t\t");
                    }
                }
                for(Tugas2_Stack_Collection_Matakuliah matkul : mk) {
                    if(matkul.kode.equals(searchNilai.kdMatkul)) {
                        System.out.print(matkul.matkul + "\t" + matkul.sks + "\t" + searchNilai.nilai);
                        System.out.println("\nTotal SKS " + matkul.sks + " telah diambil");
                    }
                }
                confirm3++;
            }
        }
        if(confirm3 == 0) {
            System.out.println("Data dengan NIM " + searchNIM + " Tidak Ditemukan");
        }
    }
    
    void urutNilai() {
        for(int i=0; i<nil.size()-1; i++) {
            for(int j=0; j<nil.size()-i-1; j++) {
                if(nil.get(j).nilai > nil.get(j+1).nilai) {
                    double swap = nil.get(j).nilai;
                    nil.get(j).nilai = nil.get(j+1).nilai;
                    nil.get(j+1).nilai = swap;
                }
            }
        }
        tampilNilai();
    }


    static void menu(){

    }

    public static void main(String[] args) {
        MainTugas2_Stack_Collection_Pertemuan_16 ddn = new MainTugas2_Stack_Collection_Pertemuan_16();
        int pilih;
        ddn.setData();
        do {
            System.out.println("************************************************");
            System.out.println("SISTEM PENGOLAHAN DATA NILAI MAHASISWA SEMESTER");
            System.out.println("************************************************");
            System.out.println("1. Input Nilai");
            System.out.println("2. Tampil Nilai");
            System.out.println("3. Mencari Nilai Mahasiswa");
            System.out.println("4. Urut Data Nilai");
            System.out.println("5. Keluar");
            System.out.print("Pilih   : ");
            pilih = sc.nextInt();
            switch (pilih) {
                case 1:
                    ddn.inputNilai();
                    break;
                case 2:
                    ddn.tampilNilai();
                    break;
                case 3:
                    ddn.cariNilai();
                    break;
                case 4:
                    ddn.urutNilai();
                    break;
                case 5:
                    System.out.println("Terima Kasih........");
                    System.exit(0);
                default:
                    System.out.println("Plihan Anda Salah!");
                    System.exit(0);
            }
        } while (pilih > 0 && pilih < 6);
    }
}
```
- Output : 

    **Input Nilai**

    ![T2.no1](Screenshot/T2.no1.png)


    **Tampil Nilai**

    ![T2.no2](Screenshot/T2.no2.png)
    
    **Mencari Nilai Mahasiswa**
    
    ![T2.no3](Screenshot/T2.no3.png)
   
    **Urutan Data Nilai dan Keluar**
    
    ![T2.no4](Screenshot/T2.no4.png)