import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        int row, column;
        System.out.println("***** Mayın Tarlasına Hoşgeldiniz! *****");
        System.out.println("Lütfen oynamak istediğiniz boyutları giriniz :");
        System.out.println("Satır Sayısı : ");
        row = scan.nextInt();
        System.out.println("Sütun Sayısı");
        column = scan.nextInt();

        MayinTarlasi mayin = new MayinTarlasi(row,column);
        mayin.run();
    }
}
