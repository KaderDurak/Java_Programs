import java.util.Scanner;

public class whileex2 {
    public static void main(String[] args) {
        // Örnek 1: Faktöriyel hesaplama
        // Örnek 2: Harmonik Sayılar
        // Örnek 3: Yıldızlar ile Üçgen Yapma
        // Örnek 4: Üslü sayı hesaplama

        /* Örnek 1
        Scanner scan = new Scanner(System.in);
        System.out.println(" Faktöriyel Sayısı Giriniz: ");
        int f = scan.nextInt();
        int sonuc = 1;
        while(f>0){
            sonuc *= f;
            f--;
        }
        System.out.println(sonuc);
        */


        /*
        Örnek 2
        Scanner scan = new Scanner(System.in);
        System.out.println("Harmonik Sayısı Giriniz: ");
        double h = scan.nextDouble();
        double harmonic = 0.0;
        while(h > 0){
            harmonic += (1/h);
            h--;
        }
        System.out.println(harmonic);
        */
        /*
        Örnek 3
        Scanner scan = new Scanner(System.in);
        System.out.println("sayı giriniz: ");

    
        int star = scan.nextInt();
        int i = 1;
        while(i<= star){
            int k =1;
            while (k<=i){
                System.out.print("*");
                k++;
            }
            System.out.println();
            i++;
        }
        */

        
        Scanner scan = new Scanner(System.in);
        int sayi1, sayi2, sonuc=1;
        System.out.println("Üssü alınacak sayı:  ");
        sayi1 = scan.nextInt();
        System.out.println("Üs olacak sayı:  ");
        sayi2 = scan.nextInt();

        int i =1;
        while(i<= sayi2){
            sonuc = sonuc*sayi1 ;
            i++;
        }
        System.out.println("Sonuc: "+ sonuc);
    }
}
