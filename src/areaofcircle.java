import java.util.Scanner;

public class areaofcircle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the diameter of the circle: ");
        double diameter = sc.nextDouble();

        // Calculate radius
        double radius = diameter / 2.0;

        // Calculate area
        double area = Math.PI * radius * radius;

        System.out.println("The area of the circle is: " + area);
    }
}
