public class IfElse {
    public static void main(String[] args) {
        int a= 50;
        int b= 30;
        int c = 20;
        
        if  (a==b){
            System.out.println("a ve b sayıları birbirine eşittir.");
        }
        else if (a>c){
            System.out.println("a ve c sayıları birbirine eşit değil.");
        }
        else {
            System.out.println("b ve c sayıları eşit değil.");
        }
        
        
        if((a<c) && (a<b)){
            System.out.println("a en küçük sayıdır.");
        }
        else if ((c<a) && (c<b)){
            System.out.println("c en küçük sayıdır.");
        }
        else {
            System.out.println("b en küçük sayıdır.");
        }
    }
}
