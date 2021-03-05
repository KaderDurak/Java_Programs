import java.util.Scanner;
public class UcakBiletiHesaplama {
    public static void main(String[] args) {
        // TODO 
        // km birim fiyatı : 0.12$
        // 0-3 yaş ücretsiz
        // 12 yaşından küçükse toplam fiyata 37% indirim
        // 12 ve 24 yaş arasında ise toplam fiyata 25% indirim
        // 65 yaş üzerine %10
        // Gidiş ve Dönüş bilet alınırsa toplam fiyata 15% indirim
        // Bu koşullara göre uçak bileti hesaplayan program

        Scanner scan = new Scanner(System.in);
        int km,yas,tip;
        System.out.println("Mesafeyi Giriniz: ");
        km = scan.nextInt();
        System.out.println("Lütfen Yaşınızı Giriniz: ");
        yas = scan.nextInt();
        System.out.print("\n Yolculuk Tipini Seçiniz.\n1- Tek Gidiş\n2- Gidiş/Dönüş\n");
        tip = scan.nextInt();

        double normalFiyat, yasIndirimi, tipIndirimi;

        if(km>0 && yas>=0 && (tip == 1 || tip == 2)){
            normalFiyat = km * 0.12;
            if(yas<3){
                yasIndirimi = normalFiyat*0 ;  // 0-3 yaş yolcular için ücretsiz.
                normalFiyat = normalFiyat*yasIndirimi;
            }else if (yas>3 && yas<12){  
                yasIndirimi = normalFiyat *0.37;   // 3 yaşından büyük 12 yaşından küçük yolcular
               
            }else if (yas>=12 && yas<=24){  
                yasIndirimi = normalFiyat *0.25;   // 12 yaşından büyük 24 yaşından küçük yolcular
                
            }else if(yas>65){
                yasIndirimi = normalFiyat*0.10;  // 65 yaşından büyük yolcular

            }else {
                yasIndirimi = 0;
            }
            normalFiyat -= yasIndirimi; //Fiyattan indirim payını çıkarıyorum.
            if( tip==2){
                tipIndirimi = normalFiyat * 0.15;
                normalFiyat =(normalFiyat -tipIndirimi)*2; //Gidiş-Dönüş bilet olduğundan 2 ile çarpılır. 
            }
            System.out.println("Bilet Tutarı: " + normalFiyat + "$");

        }else{
            System.out.println("Girdiğiniz değerler eksik veya yanlış lütfen tekrar deneyiniz.");
        }
}
}