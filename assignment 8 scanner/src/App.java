import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception
    { 
        Scanner keyboard = new Scanner(System.in); 

        System.out.println("Enter an integer::");
        int num1 = keyboard.nextInt();
        System.out.println( num1);
        
        
        System.out.println("Enter an second integer::");
        int num2 = keyboard.nextInt();
        System.out.println();
        System.out.println( num2 + num1);
        
        // System.out.println("Enter an integer::");
        // int num2 = keyboard.nextInt();
        // System.out.println(num2);

        System.out.println("Enter a double ::");
        double num3 = keyboard.nextDouble();
        
        System.err.println("enter a second double again");
        double num4 = keyboard.nextDouble();

        System.out.println("Your answer is:" + (num3 + num4));
       
        // System.out.println("Enter a float I.E  2.3f::");
        // float num4 = keyboard.nextFloat();
        // System.out.println(num4);

        // System.out.println("Enter a short I.E -23 or 10 ::");
        // short num5 = keyboard.nextShort();
        // System.out.println(num5);
        
        // System.out.println("Enter a byte I.E  2.3f::");
        // float num6 = keyboard.nextByte();
        // System.out.println(num6);


      
    } 
}
