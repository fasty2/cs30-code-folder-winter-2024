import java.util.Scanner;


public class MileperHour {
    public static void Distance( double distance, double hours, double minutes ) {
        double Distance = Math.floor( distance / (hours + (minutes/ 60.0) ));

        System.out.println("your distance in miles per hour is " + Distance + "MPH");
   
    }
}
