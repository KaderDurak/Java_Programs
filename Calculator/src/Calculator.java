import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int num1, num2, secim;
        System.out.println("İlk sayıyı girin.");
        num1 = scan.nextInt();
        System.out.println("İkinci sayıyı girin.");
        num2 = scan.nextInt();
        System.out.println("Yapılacak işlemi seçiniz: ");
        System.out.println("1- Toplama\n2- Çıkarma\n3- Çarpma\n4- Bölme");
        System.out.println("Seçiminiz: ");
        secim = scan.nextInt();

        if (secim==1){
            System.out.println("Toplama: "+ (num1 + num2));
        }
        else if (secim==2){
            System.out.println("Çıkarma: "+ (num1 - num2));
        }
        else if (secim==3){
            System.out.println("Çarpma: "+ (num1 * num2));
        }
        else if (secim==4){
            if (num2 ==0){
                System.out.println("İkinci sayı 0'a eşittir. Sonuç belirsizdir.");
            }
            else{
                System.out.println("Bölme: "+ (num1 / num2));
            }
            }
        else{
            System.out.println("Geçersiz seçim yaptınız.");
        }
    }
}
