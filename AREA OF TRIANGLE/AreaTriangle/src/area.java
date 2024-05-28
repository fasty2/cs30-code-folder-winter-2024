
import java.util.Scanner;


public class area {
    public static void perimeter( double a, double b, double c) {
     double perimeter = (a + b + c);

     double s = (perimeter/2);
    System.out.println( "sum " + s);

     double area = (s*(s-a)*(s-b)*(s-c));

     double Area = (area * area );

     System.out.println( " Area is " + Area);
    }
}
