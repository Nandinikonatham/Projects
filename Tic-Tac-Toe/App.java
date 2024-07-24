import board.Board;
import player.Player;
import game.Game;
public class App {
    public static void main(String[] args) throws Exception {
        Board b=new Board(3, '-');
        Player p1=new Player();
        p1.setNameandSymbol("Nandini",'X');
        p1.getNameandSymbol();

        Player p2=new Player();
        p2.setNameandSymbol("Nanda",'0');
        p2.getNameandSymbol();

        Game g=new Game(new Player[] {p1,p2},b); 
        g.play();
       }
}
