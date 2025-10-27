/*
* Ad-Soyad: Amine Ceren Yiğit 
* Öğrenci No: 250541048
* Tarih: 26 Ekim 2025
* Açıklama: Görev-2 Geometrik hesaplayıcı 
*
* Bu program kullancıdan belirli verileri alarak maaş hesaplaması yapar. Sabitler sayesinde kolay yolla maaş hesaplayabilir  
*/ 

import java.util.Scanner;
public class MaasHesap {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // veriler istenir

        System.out.print("Calisan: " );
        String Calisan = input.nextLine();

        System.out.print("Brüt maaşı giriniz: ");
        float brut_maas = input.nextFloat();

        System.out.print("Mesai saatini giriniz: ");
        float mesai_saati = input.nextFloat();

        final double SGK_kesintisi_orani = 0.14;
        final double gelir_vergisi_orani = 0.15;
        final double damga_vergisi_orani = 0.00759;


        // Hesaplamalar yapılır

        double mesai_ucreti = (brut_maas/160) * mesai_saati * 1.5;
        System.out.printf("\nMesai ücreti: %.2f " , mesai_ucreti  );

        double toplam_gelir = brut_maas + mesai_ucreti;
        System.out.printf("\nTOPLAM GELİR: %.2f " , toplam_gelir);

        // kesintiler hesaplanır
        double SGK_kesintisi = toplam_gelir * 0.14;

        double gelir_vergisi = toplam_gelir * 0.15;

        double damga_vergisi = toplam_gelir * 0.00759;

        double toplam_kesinti =  SGK_kesintisi + gelir_vergisi + damga_vergisi;
        System.out.printf("\nTOPLAM KESİNTİ: %.2f " , toplam_kesinti);

        double net_maas = toplam_gelir - toplam_kesinti;
        System.out.printf("\nNET MAAS: %.2f " , net_maas);

        double kesinti_orani = (toplam_kesinti / toplam_gelir) * 100;
        System.out.printf("\nNET KESINTI: %.2f" , kesinti_orani);

        // (22 gün * 8 saaat = 176 saat) değişebilir bir değer
        double saatlik_net_kazanc = net_maas / 176;
        System.out.printf("\nSAATLIK NET MAAŞ: %.2f " , saatlik_net_kazanc);

        // 22 günlük süre de şirketin çalışma kurallarına göre değişebilir
        double gunluk_net_kazanc = net_maas / 22;
        System.out.printf("\nGÜNLÜK NET MAAŞ: %.2f" , gunluk_net_kazanc);



        System.out.println("\n===============================");
        System.out.print("    MAAŞ BODROSU   ");
        System.out.printf("\n================================");
        System.out.printf("\nCalisan: %s ", Calisan );
        System.out.print("\n\nGELİRLER");
        System.out.printf("\n   Brüt Maaaş           :  %.2f TL       " , brut_maas);
        System.out.printf("\n   Mesai Ücreti (8 saat): %.2f TL  " , mesai_ucreti);
        System.out.printf("\n   -----------------------");
        System.out.printf("\n   TOPLAM GELİR         : %.2f TL       " , toplam_gelir);
        System.out.printf("\n\nKESİNTİLER ");
        System.out.printf("\n   SGK Kesintisi        :  %.2f TL     " , SGK_kesintisi);
        System.out.printf("\n   Gelir Vergisi        :  %.2f TL      " , gelir_vergisi);
        System.out.printf("\n   Damga Vergisi        :   %.2f TL     " , damga_vergisi);
        System.out.printf("\n   -----------------------");
        System.out.printf("\n   TOPLAM KESİNTİ       : %.2f TL      " , toplam_kesinti);
        System.out.printf("\nNET MAAŞ                : %.2f TL          " , net_maas);
        System.out.println("\n================================");

    }
}
