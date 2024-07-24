package board;
import jumper.Jumper;

import java.util.HashMap;

public class Board {
    int size;
    public String board[][];
    public HashMap<String,Jumper> jumpers;

    public Board(int size,HashMap<String,Jumper> jumpers){
        this.size=size;
        this.jumpers=jumpers;
        board=new String[size][size];
        int count=1;

        for(int i=size-1;i>=0;i--){
            if(i%2!=0){
                for(int j=0;j<size;j++){
                    board[i][j]=count+"";
                    count++;
                }
            }else{
                for(int j=size-1;j>=0;j--){
                    board[i][j]=count+"";
                    count++;
                }
            }
        }
    }
    public void displayBoard(){
        for(int i=0;i<size;i++){
            for(int j=0;j<size;j++){
                if(i==9){
                    System.out.print(board[i][j]+"  ");
                }else{
                    System.out.print(board[i][j]+" ");
                }
            }
            System.out.println();
        }
    }

    public int getBoardSize(){
        return this.size;
    }

}
