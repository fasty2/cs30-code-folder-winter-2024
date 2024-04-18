import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
       // Scanner keys = new Scanner(System.in);

      //  System.out.println("Scanner Demo Inputs");
        
    //     //Int input
    //     System.out.println("Integars: ");
    //     int num = keys.nextInt();
    //     System.out.println("the number was "+ num);
    
    //    // double input
    //     System.out.println("Double: ");
    //     int doublenum = keys.nextInt();
    //     System.out.println("the number was "+ doublenum);

    //     // Ne2xtline input
    //     System.out.println("line: ");
    //     String word = keys.nextLine();
    //     System.out.println("the word was "+ word);


        Scanner key = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int num = key.nextInt();
        key.nextLine();
        // key.nextLine allows it to continue on 
        System.out.print("Enter a Sent ence: ");
        String sentence = key.nextLine();
        System.out.println(num + " " + sentence);
    
    
    }
}
