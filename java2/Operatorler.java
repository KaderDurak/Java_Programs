public class Operatorler {
    public static void main(String[] args) {
        int a = 10;
        int b = 5;
        int sum = a+b;
        int subtract = a-b;
        int multiply = a*b;
        double divison = a/b;
        int mod = a%b;

        System.out.println("Sum: "+ sum);
        System.out.println("Multiply: "+ multiply);
        System.out.println("Subtract: "+ subtract);
        System.out.println("Division: "+ divison);
        System.out.println("Mod: "+ mod);

        int result = a++ + b++ ;
        System.out.println("result :"+ result);
        System.out.println(a);
        System.out.println(b);

        int num1 = 10;
        int num2 = 5;

        boolean kosul = (num1 /num2) == 2;
        System.out.println(kosul);

        boolean kosul1 = (num1>num2);
        boolean kosul2 =(num1<num2);

        boolean result1 = (kosul1 && kosul2);
        System.out.println(result1);

        var result2 = kosul1 || kosul2;
        System.out.println(result2);

        String result3 = (a==b) ? "Doğru": "Yanlış";
        System.out.println(result3);
    }
}
