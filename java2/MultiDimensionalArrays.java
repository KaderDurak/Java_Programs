public class MultiDimensionalArrays {
    public static void main(String[] args) {
        // Çok Boyutlu Diziler
        // int[] 1Darr = new int[5];
        int[][] table = new int[][]{
            {1,75,10},
            {2,87,13},
            {3,95,15},
            {4,103,17},
            {5,110,19}
        };

        int[][] table2 = new int[5][3];
        table2[0][0]= 1;
        table2[0][1]= 75;
        table2[0][2]= 10;

        for (int i=0; i < table.length; i++){

            for( int j=0; j < table[0].length; j++){
                System.out.print(table[i][j] +" ");
            }
        
            System.out.println();
    }
        System.out.println("***********************");

    //Foreach
        for(int[] column : table){
            for(int value : column){
                System.out.print(value + " ");
            }
            System.out.println();
        }
}
}
