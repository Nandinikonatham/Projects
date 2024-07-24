
import player.Player;
import coordinates.Coordinates;
import jumper.Jumper;
import dice.Dice;
import board.Board;
import game.Game;
import java.util.*;
public class App {
    public static void main(String[] args) throws Exception {

        HashMap<String,Jumper> map=new HashMap<>();
        map.put("6",new Jumper(new Coordinates(9, 5),new Coordinates(6,6)));
        map.put("99",new Jumper(new Coordinates(0, 1),new Coordinates(9,9)));
        map.put("21",new Jumper(new Coordinates(7, 0),new Coordinates(0,9)));
        map.put("64",new Jumper(new Coordinates(3, 3),new Coordinates(7,4)));

        

        Player p1=new Player();
        Player p2=new Player();
        p1.setPlayerDetailsForInput(p1);
        p1.getPlayerDetails();
        p2.setPlayerDetailsForInput(p2);
        p2.getPlayerDetails();

        System.out.println("Player name"+p1.getPlayerName());
        System.out.println("Player name"+p2.getPlayerName());

        //Dice d= new Dice();
        //System.out.println(d.diceRolll()); 

        //Coordinates c1= new Coordinates(4, 5);
        //Coordinates c2= new Coordinates(5, 8);
        //System.out.println(c.printCoordinates());

        //Jumper j=new Jumper(c1,c2);
        //System.out.println(j.getJumperName());

        Board b=new Board(10,map);
        b.displayBoard();

        Game g=new Game(b,new Player[] {p1,p2},new Dice() );
        g.play();
    }
    
}
