import java.util.Scanner;

public class georunner {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("input value of len: ");
        double len = keyboard.nextInt();
        System.out.println("input value of wid: ");
        double wid = keyboard.nextInt();
        geometry.perimeter(len,wid);
     
        
        System.out.println("input value of radius");
        double radius = keyboard.nextInt();
        geometry.areaofcircle( radius);
    }
}

