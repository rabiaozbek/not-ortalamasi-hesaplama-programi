import java.util.Scanner;

public class Main {
    public static void main(String[] args)  {
        // Değişkenleri Oluştur
        int matematik, kimya, fizik, turkce, muzik, tarih;
        // Scanner Sınıfını Tanımla
        Scanner inp = new Scanner(System.in);
        // Kullanıcıdan Değerleri Al
        System.out.println("Matematik Notunuzu Giriniz : ");
        matematik = inp.nextInt();
        System.out.println("Kimya Notunuzu Giriniz : ");
        kimya = inp.nextInt();
        System.out.println("Fizik Notunuzu Giriniz : ");
        fizik = inp.nextInt();
        System.out.println("Türkçe Notunuzu Giriniz : ");
        turkce = inp.nextInt();
        System.out.println("Müzik Notunuzu Giriniz : ");
        muzik = inp.nextInt();
        System.out.println("Tarih Notunuzu Giriniz : ");
        tarih = inp.nextInt();
        int toplam =(matematik+kimya+fizik+turkce+muzik+tarih);
        double ortalama = (toplam/6);
        System.out.println(ortalama);
        boolean durum;
        durum = (ortalama>=60);
        String vDurum = (durum) ? "geçti":"kaldı";
        System.out.println(vDurum);




        }


        }






