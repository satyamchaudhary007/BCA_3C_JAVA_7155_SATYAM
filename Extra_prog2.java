// Write a java program to print the area and perimeter of a rectangle and circle.

import java.util.Scanner;

public class Extra_prog2{

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter length of rectangle: ");
        double length = input.nextDouble();

        System.out.print("Enter width of rectangle: ");
        double width = input.nextDouble();

        System.out.print("Enter radius of circle: ");
        double radius = input.nextDouble();

        double rectangleArea = length * width;
        double rectanglePerimeter = 2 * (length + width);

        double circleArea = Math.PI * radius * radius;
        double circleCircumference = 2 * Math.PI * radius;

        System.out.println("\nRectangle Area = " + rectangleArea);
        System.out.println("Rectangle Perimeter = " + rectanglePerimeter);

        System.out.println("\nCircle Area = " + circleArea);
        System.out.println("Circle Circumference = " + circleCircumference);

    }
}