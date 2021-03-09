import java.util.Scanner;

public class while1 {
    public static void main(String[] args) {
        //örnek 1: 1'den 100' e kadar 3'e bölünebilen sayıları ekrana yazdır.
        //örnek 2: Negatif değer girilene kadar kullanıcıdan girişleri kabul eden ve bunları toplayan program
        //örnek 3: Girilen sayıya kadar olan 3'ün kuvvetleri
        /*
       ** Örnek 1 **
        int i = 1;
        while (i <= 100){
            if(i % 3 == 0){
                System.out.println(i);
            }
            i++;
        }
        */
        /*
        ** Örnek 2 **
        Scanner scan = new Scanner(System.in);

        int toplam = 0;
        int input;

        while (true){
            System.out.println( "Lütfen sayı giriniz: ");
            input = scan.nextInt();

            if (input <0){
                System.out.println("Program Bitti. Negatif Sayı Girdiniz!");

                break;
            }
            if(input % 3 == 1){
                //toplam = toplam + input;
                toplam +=input;
            }

        }
        System.out.println("Girilen sayıların toplamı: " + toplam);
        */
        /*
        ** Örnek 3**
        */
        Scanner scan = new Scanner(System.in);
        System.out.println("Sayı Giriniz : ");
        int input = scan.nextInt();
        int k = 1;
        while( k <= input){
            System.out.println(k);
            k = k * 3;
            
        }
    }
}
