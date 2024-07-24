package player;
import java.util.*;

public class Player {
    private String name;
    private String mailId;
    private int age;
    private String contact;
    private String address;

    public String getPlayerName(){
        return this.name;
    }

    public void setPlayerName(String name){
        this.name=name;
    }

    public void setPlayerDetails(String name,String address,String contact,String mailId,int age){
        this.name=name;
        this.address=address;
        this.contact=contact;
        this.mailId=mailId;
        this.age=age;
    }

    public void getPlayerDetails(){
        System.out.println("Player Name"+this.name);
        System.out.println("Player address"+this.address);
        System.out.println("Player Contact"+this.contact);
        System.out.println("Player mail"+this.mailId);
        System.out.println("Player age"+this.age);
    }

    public static void setPlayerDetailsForInput(Player p){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter player details");
        System.out.println("enter Player Name");
        String name =sc.next();
        System.out.println("enter player address");
        String address=sc.next();
        System.out.println("enter mailId");
        String mailId=sc.next();
        System.out.println("enter contact");
        String contact=sc.next();
        System.out.println("enter player age");
        int age=sc.nextInt();
        p.setPlayerDetails(name, address, contact, mailId, age);
    }


}
