import java.util.Scanner;

public class NotOrtalamasiProgrami {
    
    public static void main(String[] args) {
        int quiz;
        int vize;
        int ffinal;
        double ortalama;
        Scanner input = new Scanner(System.in);
        System.out.println("Quiz notunu giriniz: ");
        quiz = input.nextInt();
        System.out.println("Vize notunu giriniz: ");
        vize = input.nextInt();
        System.out.println("Final notunu giriniz: ");
        ffinal = input.nextInt();

        ortalama = (quiz*0.2)+(vize*0.35)+(ffinal*0.35);
        System.out.println("Not ortalamanız: " + ortalama);

        String sonuc = (ortalama>= 50) ? "Geçtiniz." : "Kaldınız.";
        System.out.println(sonuc);

    }
}
