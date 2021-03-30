public class StringSinifi {
    public static void main(String[] args) {
        //str.lenght() :Girilen karakterin sayısını döndürür.
        //str.concat() :String birleştirme
        //str.indexOf('K') : karakterin konumunu verir.
        //str.charAt(5)  : indexOf metoduna benzer şekilde konumu verilen karakteri okur.
        //str.compareTo("Kodlama") : büyük/küçük harf fark duyarlı olarak karşılaştırır.
        //str.compareToIgnoreCase("KODlama") : büyük/küçük harf duyarlı olmadan karşılaştırı.
        //str.contains("kod") : girilen değer string içinde geçiyor mu diye kontrol eder.
        //str.endsWith('a') : belirtilen karakter(ler) ile bitiyorsa true değerini döndürür.
        //str.replace("kodlama", "vakti") : string değiştirme için kullanılır.
        //str.toLowerCase(), str.toUpperCase();

        char[] str = {'K','O','D','L','A','M','A'};
        String metin = new String(str);

        String metin1 = "CODING HELLO";
        String metin2 = "TIME";
        System.out.println(metin1.length());
        System.out.println(metin1.concat(metin2));
        System.out.println(metin1.indexOf('L'));
        System.out.println(metin1.charAt(3));
        System.out.println(metin1.endsWith("ING"));
        System.out.println(metin1.replace("HELLO", "TIME"));
        System.out.println(metin1.toLowerCase());
    }
}
