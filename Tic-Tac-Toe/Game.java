package game;

import player.Player;
import board.Board;
import java.util.Scanner;

public class Game {
    Player[] players;
    Board board;
    int turn;
    int noOfMoves;
    boolean gameOver;
    String zero;
    String cross;
    public Game(Player[] players,Board board){
        this.players=players;
        this.board=board;
        this.turn=0;
        this.noOfMoves=0;
        this.gameOver=false;

        StringBuilder z=new StringBuilder();
        StringBuilder c=new StringBuilder();

        for(int i=0;i<board.size;i++){
            z.append("0");
            c.append("X");
        }

        this.zero=z.toString();
        this.cross=c.toString();

    }
    public void play(){
        board.printBoardConfig();
        int sz=board.size;

        while(!gameOver){
            noOfMoves++;
            int idx=getIndex();

            int row=idx/sz;
            int col=idx%sz;

            board.matrix[row][col]=players[turn].getPlayerSymbol();

            if(noOfMoves>=2*sz-1 && checkCombination()==true){
                gameOver=true;
                board.printBoardConfig();
                System.out.println("Winner"+players[turn].getPlayerName());
                return;

            }
            if(noOfMoves>=sz*sz){
                System.out.println("Game Draw");
                return;
            }
            turn =(turn+1)%2;
            board.printBoardConfig();
       }
    }
    public int getIndex(){
        while(true){
            System.out.println("player:"+players[turn].getPlayerName()+"give one position");
            Scanner sc=new Scanner(System.in);
            int pos=sc.nextInt()-1;

            int sz=board.size;
            
            int row=pos/sz;
            int col=pos%sz;

            //checking for valid position
            if(row<0 ||row>=sz ||col<0 ||col>=sz){
                System.out.println("invalid position");
                continue;
            }
            
            if(board.matrix[row][col]!='-'){
                System.out.println("position already occupied");
                continue;
            }
            return pos;
        }
    }
    public boolean checkCombination(){
        int sz=board.size;

        //rowwise
        for(int i=0;i<sz;i++){
            StringBuilder sb= new StringBuilder();
            for(int j=0;j<sz;j++){
                sb.append(board.matrix[i][j]);
            }
            String pattern=sb.toString();
            if(pattern.equals(zero)||pattern.equals(cross)){
                return true;
            }
        }

        //columnwise
        for(int i=0;i<sz;i++){
            StringBuilder sb= new StringBuilder();
            for(int j=0;j<sz;j++){
                sb.append(board.matrix[j][i]);
            }
            String pattern=sb.toString();
            if(pattern.equals(zero)||pattern.equals(cross)){
                return true;
            }
        }
        //diagonalwise
        int i=0,j=0;
        StringBuilder sb=new StringBuilder();

        while(i<sz){
            sb.append(board.matrix[i][j]);
            i++;
            j++;
        }
        String pattern = sb.toString();
        if(pattern.equals(zero) ||pattern.equals(cross)){
            return true;
        }
        //antidiagonnalwise
        i=0;
        j=sz-1;
        sb=new StringBuilder();

        while(i<sz){
            sb.append(board.matrix[i][j]);
            i++;
            j--;
        }
        pattern = sb.toString();
        if(pattern.equals(zero) ||pattern.equals(cross)){
            return true;
        }


        return false;

    }
    




}
