/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pbo.post.test1;

/**
 *
 * @author Novi
 */
public class Mahasiswa {
// Properti
    public String name; // Deklarasi variabel public 'name' untuk menyimpan nama mahasiswa.
    public String nim; // Deklarasi variabel public 'nim' untuk menyimpan NIM (Nomor Induk Mahasiswa) mahasiswa.
    public String programStudi; // Deklarasi variabel public 'programStudi' untuk menyimpan program studi mahasiswa.
    public float ipk; // Deklarasi variabel public 'ipk' untuk menyimpan IPK (Indeks Prestasi Kumulatif) mahasiswa.
    public int semester;
    
// Constructor
    public Mahasiswa(String name, String nim, String programStudi, float ipk, int semester) {
        this.name = name; // Inisialisasi 'name' dengan nilai dari parameter 'name'.
        this.nim = nim; // Inisialisasi 'nim' dengan nilai dari parameter 'nim'.
        this.programStudi = programStudi; // Inisialisasi 'programStudi' dengan nilai dari parameter 'programStudi'.
        this.ipk = ipk; // Inisialisasi 'ipk' dengan nilai dari parameter 'ipk'.
        this.semester = semester; // Inisialisasi 'semester' dengan nilai dari parameter 'semester'.
    }
    
// Method    
    // Method untuk menampilkan progres mahasiswa berdasarkan semester dan kegiatan yang sedang diikuti
    public void showProgress(int semester, String activity) {
        System.out.println(name + " saat ini berada disemester " + semester + 
                " dan sedang mengikuti program " + activity + ".");
    }
    
    // Method untuk mendapatkan status kelulusan berdasarkan IPK dan semester
    public String getStatusKelulusan() {  
        if (ipk >= 2.75 && semester >= 8) {
            return "Status Kelulusan " + name + ": " + "Lulus";
        } else {
            return "Status Kelulusan " + name + ": " + "Belum Lulus";
        }
    }
    
    // Method untuk memprediksi sisa studi berdasarkan semester saat ini
    public String prediksiSisaStudi() {
        // Hitung sisa semester yang diperlukan untuk menyelesaikan studi (7 semester total)
        int sisaSemester = 7 - semester;

        if (sisaSemester < 0) {
            return name + " telah selesai studi.";
        } else if (sisaSemester == 0) {
            return name + " akan lulus pada semester ini.";
        } else {
            return name + " memerlukan " + sisaSemester + " semester lagi untuk lulus.";
        }
    }


}
