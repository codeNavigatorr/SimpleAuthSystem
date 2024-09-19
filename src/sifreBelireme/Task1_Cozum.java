package sifreBelireme;

import java.util.Scanner;

public class Task1_Cozum {
    public static void main(String[] args) {

/*1. **Kullanıcı Adı ve Şifre Belirleme:**
   - Kullanıcıdan bir kullanıcı adı ve şifre belirlemesini isteyin.
   - Şifreyi doğrulamak için şifreyi iki kez üst üste girmesini isteyin.
   - Eğer şifreler uyuşmuyorsa, kullanıcıya uyarı verip tekrar şifre girişi yapmasını isteyin.*/

        String sifre1, sifre2;

        Scanner oku= new Scanner(System.in);

        System.out.print("Kullanıcı Adınızı Giriniz:");
        String kullaniciAdi=oku.nextLine();

        do {

            System.out.print("Şifreyi Giriniz:");
            sifre1 = oku.nextLine();

            System.out.print("Şifreyi Giriniz:");
            sifre2 = oku.nextLine();

            if (!sifre1.equals(sifre2))
                System.out.println("Şifreler uyuşmuyor. Tekrar deneyiniz.");
        }
        while( !sifre1.equals(sifre2) );

        System.out.println("Kaydınız yapılmıştır.");

        /*
        *
        * 2. **Giriş Yapma:**
   - Kullanıcıya, az önce belirlenen kullanıcı adı ve şifre ile giriş yapması için bir seçenek sunun.
   - Kullanıcı adını girmesini isteyin.
   - Programı bir döngü içinde çalıştırarak, kullanıcıdan şifreyi girmesini isteyin ve bu işlemi 3 kez tekrarlamasına izin verin.
   - Her hatalı girişte kalan hakkını bildirin (3 hakkınız var, 2 hakkınız kaldı, son hakkınız kaldı).

            3. **Giriş Kontrolü:**
   - Kullanıcının 3 kez üst üste yanlış giriş yapması durumunda, programı sonlandırın ve kullanıcıya "Üzgünüm, 3 kez üst üste yanlış giriş yaptınız." mesajını gönderin.
   - Eğer giriş doğruysa, kullanıcıya "Başarılı bir şekilde giriş yaptınız, ... kullanıcısı olarak sisteme hoş geldiniz!" mesajını gönderin.
        *
        *
        *
        *
        * */

        int denemeHakkı=3;

        do {
            System.out.print("Giriş yapmak için kullanıcı adınızı giriniz");
            String GirisKAdi = oku.nextLine();

            System.out.println("Giriş yapmak için şifreyi giriniz");
            String GirisSifre = oku.nextLine();

            denemeHakkı = denemeHakkı - 1;  //3-1=2    2-1=1    1-1=0

            if (!GirisSifre.equals(sifre1) || !GirisKAdi.equals(kullaniciAdi)) {
                System.out.println("Bilgilerinizi yanlış girdiniz " + denemeHakkı + " hakkınız kaldı");
                if (denemeHakkı == 0)
                    System.out.println("Üzgünüm, 3 kez üst üste yanlış giriş yaptınız.");
            }
            else {
                System.out.println("Giriş yapıldı.");
                break;
            }

            //2.yol
         /*   if (GirisSifre.equals(sifre1) && GirisKAdi.equals(kullaniciAdi)){
                System.out.println("Giriş yapıldı.");
                break;
            }
            else{
                System.out.println("Bilgilerinizi yanlış girdiniz " + denemeHakkı + " hakkınız kaldı");
                if (denemeHakkı == 0)
                    System.out.println("Üzgünüm, 3 kez üst üste yanlış giriş yaptınız.");

            }

           */



        }while (denemeHakkı>0);




    }
}
