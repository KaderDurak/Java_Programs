import java.util.Random;
import java.util.Scanner;

public class MayinTarlasi {
    int rowNumber, colNumber,size;
    int [][] map;
    int[][] board;
    boolean game = true;

    Random rand = new Random();
    Scanner scan = new Scanner(System.in);

    MayinTarlasi(int rowNumber, int colNumber){
        this.rowNumber = rowNumber;
        this.colNumber = colNumber;
        this.map = new int [rowNumber][colNumber];
        this.board = new int [rowNumber][colNumber];
        this.size = rowNumber*colNumber;
    }
    public void run(){
        int col, row, success=0;
        prepareGame();
        print(map);
        System.out.println(" Oyun Başladı !");
        while(game){
            print(board);
            System.out.println("Satır Sayısı : ");
            row = scan.nextInt();
            System.out.println("Sütun Sayısı");
            col = scan.nextInt();

            if( row < 0 || row >= rowNumber){
                System.out.println("Geçersiz Koordinat!");
                continue;
            }

            if( col < 0 || col >= colNumber){
                System.out.println("Geçersiz Koordinat!");
                continue;
            }
            if(map[row][col] != -1){
                check(row,col);
                success++;
                if(success == (size - (size/4))){
                    System.out.println("Başardınız! Hiç bir Mayına basmadınız.");
                    break;
                }
            }else{
                game = false;
                System.out.println("Oyun Bitti!");
            }
        }
    }

    public void check(int r, int c) {
        if(board[r][c] == 0){
            if((c < colNumber -1) && (map[r][c+1] == -1)){  //sağa bakıyor
                board[r][c]++;
            }
            if((r < rowNumber -3)&& (map[r+1][c] == -1)){   //aşağıya bakıyor
                board[r][c]++;
            }
            if((r > 0) && (map[r-1][c] == -1)){    //yukarıya bakıyor
                board[r][c]++;
            }
            if((c > 0) && (map[r][c-1] == -1)){    //sola bakıyor
                board[r][c]++;
            }
            if (board[r][c] == 0 ){
                board[r][c] = -2;
            } 
        }
    }
    public void prepareGame(){
        int randRow, randCol, count = 0;
        while(count !=(size/4)){
            randRow = rand.nextInt(rowNumber);
            randCol = rand.nextInt(colNumber);
            if(map[randRow][randCol] != -1){
                map[randRow][randCol] = -1;
                count++;
            }
        }

    }
    public void print(int [][] arr){
        for(int i =0; i< arr.length; i++){
            for(int j = 0; j <arr[0].length; j++){
                if(arr[i][j] >= 0) 
                    System.out.print(" ");
                System.out.print(arr[i][j]+ " ");
            }
            System.out.println();
        }
    }
}
