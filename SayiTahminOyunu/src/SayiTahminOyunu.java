import java.util.Random;
import java.util.Scanner;

public class SayiTahminOyunu {
    public static void main(String[] args) {
        
        int tahmin, can = 5, i = 0;
        Random rand = new Random();
        Scanner scan = new Scanner(System.in);
        int sayi = rand.nextInt(100);
        boolean oyunDurum = false, hata= false;
        int[] tahminler = new int[5];
        System.out.println(sayi);
        System.out.println("*****  Sayı Tahmin Oyununa Hoşgeldiniz!  *****");
        System.out.println("0-99 arasında bir sayı tuttum.");

        while(can > 0){
            System.out.print("Tahminiz :");
            tahmin = scan.nextInt();
    
            if(tahmin < 0 ||(tahmin > 99)){
                if(hata){
                    System.out.println("Çok fazla hatalı giriş yaptınız 1 can kaybettiniz.");
                    System.out.println("Kalan Can : " + --can);
                }else{
                    hata = true;
                    System.out.println("Lütfen 0-99 arası br sayı giriniz.");
                }
                continue;
            }
            tahminler[i++] = tahmin;
            if(tahmin == sayi){
                oyunDurum = true;
                break;
            }else{
                System.out.println("Yanlış, tekrar deneyiniz! Kalan Can :" + --can);

            }
        }
        if(oyunDurum){
            System.out.println("**** Tebrikler Doğru Tahmin! ***");
            System.out.println("Sayımız : " +sayi);
            System.out.println("Kalan Can : "+ can);
        }else{
            System.out.println("Başaramadınız!");
            }
        System.out.print("Tahminlerimiz : ");
        for( int value: tahminler){
            if(value !=0){
            System.out.print(value + " ,");
        }
        }
        }

    }

