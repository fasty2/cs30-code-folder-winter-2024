// public class geometry {
//     public void perimeter(double len, double wid) {

//         System.out.println("Print your answer here after calculating");
//     }

//     // Surface area of a cube
//     public void surfaceArea(double side) {

//         System.out.println("Print your answer here after calculating");
//     }

//     // Area of a circle
//     public void circleArea(double radius) {
        
//         System.out.println("Print your answer here after calculating");
//     }
// }
//         Perimeter of a Rectangle. Formula: P = 2L + 2W or 2( L + W ) 
//         Surface area of a  Cube.  Formula: SA = 6s2
//         Area of a Circle. Formula: A = πr2 or A = Pi * r2

import java.util.Scanner;

public class geometry {
    public static void perimeter( double len, double wid) {
        
        double grade = (2*len + 2*wid);
        System.out.println("premeter "+grade);

        
    }
    public static void areaofcircle( double radius) {
        double area = (Math.PI * radius*radius);
        System.out.println("area of circle" + area);;

    }
}