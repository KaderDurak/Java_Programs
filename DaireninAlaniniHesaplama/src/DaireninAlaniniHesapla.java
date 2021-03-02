import java.util.Scanner;

public class DaireninAlaniniHesapla {
    
    public static void main(String[] args) {
        
        int r;
        double alan, hacim, pi= 3.14;
        Scanner input = new Scanner(System.in);

        System.out.println("Daire yarıçapını giriniz: ");
        r = input.nextInt();
        alan = pi*(r*r);
        hacim = ((4/3)*pi*(r*r*r));
        System.out.println("Dairenin Alanı: "+ alan);
        System.out.println("Dairenin Hacmi: "+ hacim);
    } 
}
