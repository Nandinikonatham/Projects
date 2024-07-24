package player;

public class Player {
    private String name;
    private char symbol;
    private String contact;
    private String mailid;
    private int age;
    private String address;
    public void setDetails(String name,char symbol,String contact,String mailid,int age,String address){
        this.name=name;
        this.symbol=symbol;
        this.contact=contact;
        this.mailid=mailid;
        this.age=age;
        this.address=address;
    }
    public void setNameandSymbol(String name,char symbol){
        this.name=name;
        this.symbol=symbol;
    }
    public void getDetails(){
        System.out.println("player name:"+this.name);
        System.out.println("player symbol:"+this.symbol);
        System.out.println("player contact:"+this.contact);
        System.out.println("player mailid:"+this.mailid);
        System.out.println("player age:"+this.age);
        System.out.println("player address:"+this.address);
    }
    public void getNameandSymbol(){
        System.out.println("player name:"+this.name);
        System.out.println("player symbol:"+this.symbol);
    } 
    public String getPlayerName(){
        return this.name;
    }
    public char getPlayerSymbol(){
        return this.symbol;
    }


}
