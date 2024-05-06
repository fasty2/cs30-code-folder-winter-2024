import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
       Scanner keys = new Scanner(System.in);

       System.out.println("Enter an integar: ");
       int int1 = keys.nextInt();
       
       System.out.println("Enter an integar: ");
       int int2 = keys.nextInt();


       System.out.println("Enter an double: ");
       double db1 = keys.nextInt();

       System.out.println("Enter an double: ");
       double db2 = keys.nextDouble();

       for (int i = 0; i < 10; i++){
       System.out.println("the number is" + rdInt(100, 200) );
    
       }
     }
     // custom random doubble generator 
     public static double rdDb1(double max) {
        // generate random double between 0 and max
        double gen = Math.random() * max;
        
        // cast the double as an int to drop this decimals
        return (int) gen;
     }

      // custom random doubble generator 
      public static double rdInt(int min, int max) {
        // generate random double between 0 and max
        double gen = Math.random() * (max - min) + min;
        
        // cast the double as an int to drop this decimals
        return (int) gen;
     }




    }