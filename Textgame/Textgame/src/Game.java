import java.util.Scanner;
public class Game {
    
    Scanner myScanner;
    int PlayerHP;
    String PlayerName;
    String Playerweapon;
    int choice;

    public static void main(String[] args) {
        
        Game game;
        game = new Game();

        game.playerSetup();
        game.forest();
        }
 public void playerSetup(){


    PlayerHP = 10;
    
    Playerweapon = " fishslap";

    System.out.println("Your HP: " + PlayerHP);
    System.out.println("You weapon: " + Playerweapon);
  
   
    myScanner = new Scanner(System.in);

    System.out.println( "Please enter your name:");

    PlayerName = myScanner.nextLine();
    
    System.out.println("Hello " + PlayerName + ", lets start your adventure");

    }

    public void forest(){
        System.out.println( " into the forest you go");
        System.out.println( " A bear is standing on a stump trying to get honey from a tall hive ");
        System.out.println( " what do you want to do ");
       
        System.out.println("");

        System.out.println( " 1: attck the bear show him whose boss \n 2: educate the bear and tell him how hard the bees worked to make the honey he is stealing  \n 3: try help the bear ");
        
        choice = myScanner.nextInt();
    }

}
