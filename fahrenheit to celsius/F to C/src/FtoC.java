// Convert Celsius to Fahrenheit
// sayo
// period 2

import java.util.Scanner;

public class FtoC {
    public static void converter() {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("What is the temp");
        double temp2 = keyboard.nextDouble();

        
          
        temp2 = (temp2 - 32)*5/9;
        System.out.println("ferinhiht temp is " + temp2+"C");
    }
}
