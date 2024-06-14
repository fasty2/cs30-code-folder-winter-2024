import java.util.Scanner;
public class Textbase {
    public static void main(String[] args) throws Exception {
       
        String playname;
        Scanner myScanner;
        myScanner = new Scanner(System.in);

        System.out.println("please enter your name ");

        playname = myScanner.nextLine();
        
        System.out.println("hello " + playname + " lets start ");
        System.out.println("'''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''");


        Textbase textbase;
        textbase = new Textbase();
      
        textbase.playersetUp(); // player set up method 

        textbase.forest();

    //    Scanner myScanner;

    //    String playername;
    //    myScanner = new Scanner(System.in);

    //    System.out.println( "please enter your name; ");

    //    playername = myScanner.nextLine();

    //    System.out.println( "hello " + playername);


    // int  number;

    // System.out.println("please enter a number ");
    
    // number = myScanner.nextInt();

    // System.out.println("the number you typed is " + number );

           
    //     System.out.println("Hello, there i am bixbi welcome to the enchanted woods");

    //     String myweapon;
    //     String mycolth; 
    //     myweapon = "fish slap";
    //     mycolth = " pant ";


    //     System.out.println("your currnet weapon and cloth are " + myweapon + mycolth);

    //     int yourHP;
    //     yourHP = 10; 

    //     System.out.println("your HP is 10" + yourHP );

    //     System.out.println(" you've been beating by a killer moth  -4 HP "  );

    //     yourHP = yourHP - 4; 

    //     System.out.println( " currnet HP is " + yourHP);
    }

    public void playersetUp(){

        String myweapon;
        String mycolth; 
        myweapon = "fish slap";
        mycolth = " pant ";


        System.out.println("your currnet weapon and cloth are " + myweapon + " and" + mycolth);

        int yourHP;
        yourHP = 15; 

        System.out.println("your HP is " + yourHP );
        
        System.out.println("");
       
    }
public void forest(){ 

    System.out.println("");
    

    System.out.println( " into the forest you go");
    System.out.println( " A bear is standing on a stump trying to get honey from a tall hive ");
    System.out.println( " what do you want to do ");

    System.out.println("");
    

    System.out.println( " 1: attck the bear show him whose boss ");
    System.out.println( " 2: educate the bear and tell him how hard the bees worked to make the honey he is stealing  ");
    System.out.println( " 3: try help the bear  ");
    



}

}

