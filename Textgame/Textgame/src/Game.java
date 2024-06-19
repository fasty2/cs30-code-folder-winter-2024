import java.util.Scanner;  
public class Game {  

    Scanner myScanner = new Scanner(System.in);  
    Scanner enterScanner = new Scanner(System.in);  
    int PlayerHP;  
    String PlayerName;  
    String Playerweapon;  
    int choice;  
    int mongooseHP;
    int silverRing;

    public static void main(String[] args){  

        Game game;  
        game = new Game();  
        game.playerSetup();  
        game.forest();  

        }  
    
    

 public void playerSetup(){  
    
    mongooseHP = 35;
    PlayerHP = 20;  
    Playerweapon = "fishslap";  

    System.out.println("Your HP: " + PlayerHP);  
    System.out.println("You weapon: " + Playerweapon);  
    System.out.println( "Please enter your name:");  
    PlayerName = myScanner.nextLine();  
    System.out.println("Hello " + PlayerName + ", lets start your adventure");  

    }  
 
    public void forest(){  
        System.out.println("\n------------------------------------------------------------------------------\n" );  
        System.out.println( " into the forest you go");  
        System.out.println( " A bear is standing on a stump trying to get honey from a tall hive ");  
         System.out.println( " what do you want to do ");  
        System.out.println("\n------------------------------------------------------------------------------\n" );      

        System.out.println("");  
        System.out.println( " 1: you talk to bear   \n 2: attck the bear show him whose boss  \n 3: leave him be bear \n   ENTER A NUMBER" );  
        silverRing = 1;
        
         choice = myScanner.nextInt();  
 
        if (choice == 1){  
            if(silverRing == 1){
                ending();
            }
            else{
          System.out.println(" i can help you find your way home do you have anything to trade... \n you show bear your fish \n Yuck i hate red salmon" );  
         enterScanner.nextLine();          
            forest(); 
            }
        } 
        if (choice == 2){  
             System.out.println( " the bear attacks you");  
            PlayerHP = PlayerHP - 18;  
            System.out.println(" your current HP" + PlayerHP + "\n you are almost dead");  
            enterScanner.nextLine();  

            forest();  
        }  

        if (choice == 3){  
            System.out.println(" The bear give you some honey for not disturbing his lunch, + 2HP ");
            PlayerHP = PlayerHP + 3; 
            System.out.println(" your current HP" + PlayerHP);
            pathway();  
        }  

        else{  
            forest();  
        }  
    }  
        public void pathway(){  
        System.out.println("\n------------------------------------------------------------------------------\n" );  
        System.out.println(" You with this New found strengh you go deeper into the Forest");  
        System.out.println(" You are at a several diving pathways if you go south you would go back to the Bear ");  
        System.out.println(" 1: Go North");  
        System.out.println(" 2: Go East");  
        System.out.println(" 3: Go South");  
        System.out.println(" 4: Go West");  

        choice = myScanner.nextInt();
        if(choice == 1){  
            North(); 

        } 

        if(choice == 2){  
            East(); 
 
        }         

        if(choice == 3){ 
            forest();  
        }     
 
        if(choice == 4){  
           West();  
        }  
 
        else{   
            pathway();  
        }  
    }  

    public void North(){   

        System.out.println("\n------------------------------------------------------------------------------\n" );  
    System.out.println("you see a river and rest by the river" );  
    System.out.println( " you give the bear a stick and he gives you some honey + 5 HP");  
    PlayerHP = PlayerHP + 5;  
    System.out.println(" your current HP" + PlayerHP);  
    System.out.println("\n\n Go back to the pathway"); 
    System.out.println("press 1");
    System.out.println("\n------------------------------------------------------------------------------\n" ); 
 
    choice = myScanner.nextInt(); 

    if (choice == 1){ 

        pathway(); 
        

         } 

    else{ 

        North(); 

    } 

}     

    public void East(){ 

         System.out.println("\n------------------------------------------------------------------------------\n" ); 
    System.out.println("You walked in to a cave and found a sword"); 
    Playerweapon = ("sword"); 
    System.out.println("Your weapon is : " + Playerweapon);
    System.out.println("\n\n1: Go back to the pathway"); 
    System.out.println("\n------------------------------------------------------------------------------\n" ); 
    choice = myScanner.nextInt(); 

    if (choice == 1){ 
        pathway(); 
    } 

else{ 

    North(); 
   }  

}     

    public void West(){ 
        System.out.println("\n------------------------------------------------------------------------------\n" ); 
        System.out.println("You encounter a fightin MonGoose\n");
        System.out.println(" 1: FIGHT ");
        System.out.println(" 2: Run ");
        System.out.println("\n------------------------------------------------------------------------------\n" ); 
 
        choice = myScanner.nextInt();

        if( choice == 1){
            fight(); 
     }  
        if( choice == 2){
            pathway(); 
 }  
    else{
        West();
    
    }
}
    public void fight(){  
        System.out.println("\n------------------------------------------------------------------------------\n" ); 
        System.out.println( " Your HP:" + PlayerHP);
        System.out.println( " MonGoose HP:" + mongooseHP);
        System.out.println("\n 1: Attack");
        System.out.println(" 2: Run");
        System.out.println("\n------------------------------------------------------------------------------\n" );

        choice = myScanner.nextInt();

        if(choice == 1){
            attack();
        }
        if( choice == 2){
            pathway(); 
    } 
        else{
        fight();
        }  

    }

    public void attack(){
    int PlayerDamage = 0;


    if(Playerweapon.equals("fishslap")){
       PlayerDamage = new java.util.Random().nextInt(6);
    }
    if(Playerweapon.equals("sword")){
        PlayerDamage = new java.util.Random().nextInt(9);
    }

    System.out.println("You attacked the MonGoose and gave " + PlayerDamage + "damage!" );

    mongooseHP = mongooseHP - PlayerDamage;

    System.out.println("MonGoose HP: " + mongooseHP);

    if (mongooseHP < 1){
        win();
    }
    if(mongooseHP > 0){
        int mongooseDamage =0;

        mongooseDamage = new java.util.Random().nextInt(4);

         System.out.println(" the monster attcked you: MonGoose Kick \n you recive " + mongooseDamage + " damage!" );

         PlayerHP = PlayerHP - mongooseDamage;

         System.out.println(" playerHP: " + PlayerHP);

         if(PlayerHP < 1){
            dead();
         }

        else if(PlayerHP > 0){
            fight();
         }

       }

    }



public void dead(){ 
    System.out.println("\n------------------------------------------------------------------------------\n" );
    System.out.println("You died :( ");
    System.out.println("\n\n GAME OVER");

    System.out.println("\n------------------------------------------------------------------------------\n" );

}

public void win(){
    System.out.println("\n------------------------------------------------------------------------------\n" );
    System.out.println("You defeated the fightin MonGoose :) ");
    System.out.println("\n\n The MonGoose dropped a ring!\n\n");
    System.out.println("1: Go East ");
    System.out.println("\n------------------------------------------------------------------------------\n" );

    silverRing = 1;

    choice = myScanner.nextInt();
    if (choice==1){
          pathway();
        }
        else{
            win();
        }
    }
    public void ending(){
        System.out.println("\n------------------------------------------------------------------------------\n" );
        System.out.println(" i can help you find your way home do you have anything to trade... \n you show bear your silverRing" );  
        System.out.println( " wow you do have valueables ok i will take you important fellow. ");
        System.out.println("\n-------------------------THE__END--------------------------\n" );
        System.out.println("\n------------------------------------------------------------------------------\n" );

    }
}


 

 