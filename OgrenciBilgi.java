/*
 * Ad Soyad: Amine Ceren Yiğit
 * Ogrenci No: 250541048
 * Tarih: 26 Ekim 2025
 * Aciklama: Gorev 1 - Ogrenci Bilgi Sistemi
 * 
 * Bu program kullanicidan ogrenci bilgilerini alir ve
 * duzenli bir formatta ekrana yazdirir.
 * Diğer java dosyalarının başında da bu örnek formattaki gibi kısa bilgi giriniz
 */

import java.util.Scanner;

public class OgrenciBilgi {
    public static void main(String[] args) {
        // Scanner objesi olusturun

        
        
        // Degisken tanimlamalari
        // String ad, soyad;
        // int ogrenciNo, yas;
        // double gpa;
        
        
        // Kullanicidan bilgileri alin
        System.out.println("=== OGRENCI BILGI SISTEMI ===");
        System.out.println();
        
        // Ad
        
        
        // Soyad
        
        
        // Ogrenci No
        
        
        // Yas
        
        
        // GPA
        
        
        // Bilgileri ekrana yazdirin
        System.out.println("\n=== OGRENCI BILGI SISTEMI ===");
        
        // COZUMUNUZU BURAYA YAZIN
        import java.util.Scanner;

public class OgrenciBilgi {

        public static void main(String[] args) {

            // degiskeler aliniyor
            Scanner input = new Scanner(System.in);
            
            //Ad
            System.out.print("Adınızı girin: ");
            String ad = input.nextLine();

            //Soyad
            System.out.print("Soyadınızı girin: ");
            String soyad = input.nextLine();

            //öğrenci numarası
            System.out.print("Öğrenci Numaranız: ");
            int ogrenci_no = input.nextInt();

            //yaş
            System.out.print("Yasınız: ");
            int yas = input.nextInt();

            //gpa 
            System.out.print("GPA (0.00-4.00):");
            float gpa = input.nextFloat();

            //bilgiler ekrana bastiriliyor
            System.out.println("=== OGRENCI BILGI SISTEMI ===");
            System.out.printf("Ad Soyad: %s %s  ", ad, soyad);
            System.out.printf("\nOgrenci No: %d", ogrenci_no);
            System.out.printf("\nYas: %d", yas);
            System.out.printf("\nGPA %.2f", gpa);

            input.close();
    }
}

        
        
        
        
        

        
        
        // Scanner'i kapatin (önemli pratik)
        

