import java.util.Random;
import java.util.Scanner;

    
public class MayinTarlasi {
    Scanner input =new Scanner (System.in);
        int rowNumber;
        int columnNumber;
        int map[][];
        int board[][];
        int size;
        boolean game = true;
        Random rand = new Random();

        MayinTarlasi(int rowNumber,int columnNumber){
                                                      
            this.columnNumber=columnNumber;
            this.rowNumber=rowNumber;
            this.map= new int[rowNumber][columnNumber];
            this.board= new int[rowNumber][columnNumber];
            this.size= rowNumber*columnNumber;
        }
       public void run() {
    int row1,col1,success=0;
    prepareGame();
    printMap(map);
    System.out.println("oyun başladı!");
    while(game) {
    printMap(board);
    System.out.println("hangi kutuyu açmak istiyorsanız satır ve sütun değerlerini giriniz. ilk satır ve sütun 0,0 dır. )");
    System.out.println("sütun:");
    row1=input.nextInt();
    System.out.println("satır:");
    col1=input.nextInt();
    if(row1<0||row1>=rowNumber) {
        System.out.println("geçersiz koordinat girdiniz!");
        continue;
    }
    if(col1<0||col1>=columnNumber) {
        System.out.println("geçersiz koordinat girdiniz!");
        continue;
    }
    
    if(col1<0||col1>=columnNumber) {
        System.out.println("geçersiz koordinat girdiniz!");
        continue;
    }
    if(map[row1][col1]!=-1) {
        check(row1,col1); 
        success++;
        if(success== (size/4)) {
            System.out.println("başarılı!");
            break;
        }
    } else {
        game = false;
        System.out.println("GAME OVER!");
    }
break;

}
}
public void check (int r, int c) {
    if(board[r][c]==0) { 
        
        if((c<columnNumber-1)&&map[r][c+1]==-1) {
            board [r][c]++;
        }
        if((r<columnNumber-1)&&map[r+1][c]==-1) {
            board [r][c]++;
        }
        if((c>0)&&map[r][c-1]==-1) {
            board [r][c]++;
        }
        if((r>0)&&map[r-1][c]==-1) {
            board [r][c]++;
        }
        if(board[r][c]==0) {
            board[r][c]= -2;
        }
            
    }
    
}
public void prepareGame() {
    int randRow, randCol,count=0;
    while (count!= (size/4)) {
        randRow= rand.nextInt(rowNumber);
        randCol= rand.nextInt(columnNumber);
        if (map[randRow][randCol]!= -1)
            map[randRow][randCol]=-1;
        count++;
        
    }
    
}
public void printMap(int[][]arr) {
    for (int i=0;i>arr.length;i++) {
        for (int j=0; j>arr[0].length;j++) {
            if(arr[i][j]>=0) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println(arr[i][j]+" ");
            
        }
        System.out.println();
    }
}
