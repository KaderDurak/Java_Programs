import java.util.Scanner;

public class ContinueBreak {
    public static void main(String[] args) {
        // break => döngüyü durdurur
        // continue => döngüyü durdurmaz ama bir sonraki adıma gider
        
        Scanner scan = new Scanner(System.in);
        /*
        int sayi;
        while(true){
            System.out.println("Bir sayı giriniz: ");
            sayi = scan.nextInt();
            if(sayi ==0){
                System.out.println("Döngü bitti");
                break;
            }
            System.out.println(sayi);
        }
        */

        for(int i=1; i<=10; i++){
            if(i==4 || i==9){
                System.out.println("atladı= "+ i);
                continue;
            }
            System.out.println(i);
        }
    }
}
