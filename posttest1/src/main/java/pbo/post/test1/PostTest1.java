/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package pbo.post.test1;

import java.util.ArrayList;

/**
 *
 * @author Novi
 */
public class PostTest1 {

    public static void main(String[] args) {
        // Membuat ArrayList untuk menyimpan objek Mahasiswa
        ArrayList<Mahasiswa> mahasiswas = new ArrayList();

        // Inisialisasi beberapa objek Mahasiswa
        Mahasiswa mahasiswa1 = new Mahasiswa("Novianti Safitri", "2209116004", "Sistem Informasi", 3.98f, 3);
        Mahasiswa mahasiswa2 = new Mahasiswa("Sandrina Aulia", "2107114003", "Kedokteran", 3.85f, 5);
        Mahasiswa mahasiswa3 = new Mahasiswa("Sagita Santia", "2001127043", "Ilmu Komunikasi", 3.83f, 7);
        Mahasiswa mahasiswa4 = new Mahasiswa("Bayu Purnama Aji", "2009123051", "Informatika", 3.72f, 7);
        Mahasiswa mahasiswa5 = new Mahasiswa("Dinnuhoni", "2108119006", "Teknik Industri", 3.75f, 5);
        
        // Menambahkan objek-objek Mahasiswa ke ArrayList
        mahasiswas.add(mahasiswa1);
        mahasiswas.add(mahasiswa2);
        mahasiswas.add(mahasiswa3);
        mahasiswas.add(mahasiswa4);
        mahasiswas.add(mahasiswa5);        

        // String concatenation 
        // StringBuilder digunakan untuk menggabungkan informasi mahasiswa-mahasiswa
        StringBuilder result = new StringBuilder();
        // Menggunakan perulangan for-each untuk mengakses setiap objek Mahasiswa dalam ArrayList mahasiswas
        for (Mahasiswa mahasiswa : mahasiswas) {
            result.append(mahasiswa.name)
                .append( "(" + mahasiswa.nim + ")")
                .append("adalah mahasiswa Program Studi ")
                .append(mahasiswa.programStudi)
                .append(" dengan nilai IPK ")
                .append(mahasiswa.ipk)
                .append(".\n");
        }

        // Menampilkan hasil penggabungan
        System.out.println("----- Data Mahasiswa -----");
        System.out.println(result.toString());
        
        // Menggunakan method untuk menampilkan progress mahasiswa
        System.out.println("----- Progress Mahasiswa -----");
        mahasiswa1.showProgress(3, "PMM");
        mahasiswa2.showProgress(5,"PMM");
        mahasiswa3.showProgress(7, "KKN");
        mahasiswa4.showProgress(7, "KKN");
        mahasiswa5.showProgress(5, "MBKM");
        
        // Menampilkan status kelulusan dan prediksi sisa studi untuk setiap mahasiswa
        System.out.println("\n----- Status Kelulusan Mahasiswa -----");
        System.out.println( mahasiswa1.getStatusKelulusan() + ", " + 
                            mahasiswa1.prediksiSisaStudi());
        System.out.println( mahasiswa2.getStatusKelulusan() + ", " + 
                            mahasiswa2.prediksiSisaStudi());
        System.out.println( mahasiswa3.getStatusKelulusan() + ", " + 
                            mahasiswa3.prediksiSisaStudi());
        System.out.println( mahasiswa4.getStatusKelulusan() + ", " + 
                            mahasiswa4.prediksiSisaStudi());
        System.out.println( mahasiswa5.getStatusKelulusan() + ", " + 
                            mahasiswa5.prediksiSisaStudi());
        
    }
}
