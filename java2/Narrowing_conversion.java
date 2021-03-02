public class narrowing_conversion {
    public static void main(String[] args) {
        long longVal = 878;
        int intVal = (int) longVal;
        System.out.println("Long: "+longVal);
        System.out.println("Integer: "+intVal);

        double doubleVal = 299.89;
        long longVal1 = (long) doubleVal;
        System.out.println("Double: "+ doubleVal);
        System.out.println("Long: "+longVal1);

        float num1 = 34.5f;
        float num2 =  34.5F;
        float num3 = 34;

        System.out.println(num1);
        System.out.println(num2);
        System.out.println(num3);
     }
 }
