public class Siniflar {
    public static void main(String[] args) {
        // Object Oriented Programming
        // SınıfAdı objeAdı = new SınıfAdı();
        // Constructor (Yapıcı)

        //1. Object
        HesapMakinesi m1 = new HesapMakinesi(25, 9, "pembe");
        System.out.println(m1.carpma());
        m1.sayi1 = 11;
        System.out.println(m1.cikarma());

        // 2. Object

        HesapMakinesi m2 = new HesapMakinesi(45, 3, "mor");
        System.out.println(m2.bolme());

    
        

    }
}
