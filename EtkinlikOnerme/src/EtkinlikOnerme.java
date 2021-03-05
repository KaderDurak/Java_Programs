import java.util.Scanner;

public class EtkinlikOnerme {
    public static void main(String[] args) {
        // TODO
        // Hava sıcaklığını al.
        // Sıcaklık 25- 40 C arasında ise  yüzme öner.
        // Sıcaklık 5-25 C arasında ise sinema öner.
        // 4 C veya daha az ise kayak öner.
        Scanner scan = new Scanner(System.in);
        int sicaklik;
        System.out.println("Lütfen hava sıcaklığını giriniz: ");
        sicaklik = scan.nextInt();

        if(sicaklik > 25 && sicaklik<45){
            System.out.println("Bu havada yüzmeye gidilir.");
        }else if (sicaklik<25 && sicaklik>5){
            System.out.println("Bu havada sinemaya gidilir. ");
        }else if (sicaklik<5){
            System.out.println("Bu havada en iyi kayağa gidilir.");
        }else{
            System.out.println("Bu sıcak havada arkadaşlarla serin iç mekanlarda buluşulur.");
        }
    }
}
