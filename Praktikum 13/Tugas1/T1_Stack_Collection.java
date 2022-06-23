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
