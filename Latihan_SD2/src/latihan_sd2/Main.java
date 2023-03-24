/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package latihan_sd2;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Buat objek Hewan dan DeleteHewan
        ArrayList<Hewan> hewanList = new ArrayList<>();
        hewanList.add(new Hewan("Kucing", "Hitam"));
        hewanList.add(new Hewan("Anjing", "Coklat"));
        hewanList.add(new Hewan("Burung", "Merah"));
        hewanList.add(new Hewan("Kuda", "Hitam"));
        hewanList.add(new Hewan("Ikan", "Kuning"));
        
        ArrayList<DeleteHewan> deleteHewanList = new ArrayList<>();
        deleteHewanList.add(new DeleteHewan("Kucing", "Hitam"));
        deleteHewanList.add(new DeleteHewan("Burung", "Merah"));
        deleteHewanList.add(new DeleteHewan("Ikan", "Biru"));

        // Cek data sebelum dihapus
        System.out.println("Data sebelum dihapus:");
        for (Hewan hewan : hewanList) {
            System.out.println(hewan.toString());
        }
        
        // Lakukan penghapusan data
        for (DeleteHewan deleteHewan : deleteHewanList) {
            String warna = deleteHewan.getWarna();
            hewanList.removeIf(hewan -> hewan.getWarna().equals(warna));
        }

        // Cek data setelah dihapus
        System.out.println("\nData setelah dihapus:");
        for (Hewan hewan : hewanList) {
            System.out.println(hewan.toString());
        }
    }
}

class Hewan {
    private String jenis;
    private String warna;

    public Hewan(String jenis, String warna) {
        this.jenis = jenis;
        this.warna = warna;
    }

    public String getJenis() {
        return jenis;
    }

    public String getWarna() {
        return warna;
    }

    @Override
    public String toString() {
        return "Hewan{" +
                "jenis='" + jenis + '\'' +
                ", warna='" + warna + '\'' +
                '}';
    }
}

class DeleteHewan {
    private String jenis;
    private String warna;

    public DeleteHewan(String jenis, String warna) {
        this.jenis = jenis;
        this.warna = warna;
    }

    public String getJenis() {
        return jenis;
    }

    public String getWarna() {
        return warna;
    }
}

