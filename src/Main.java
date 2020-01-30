import java.awt.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        double length, height, radius, side;
        ArrayList <Double> sides = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        Square square = new Square("Square");
        Circle circle = new Circle("Circle");
        Triangle triangle = new Triangle("Triangle");
        EquilateralTriangle equilateralTriangle = new EquilateralTriangle("EquilateralTriangle");

        //Triangle
        System.out.print("Enter length for Square: ");
        length = sc.nextDouble();
        System.out.print("now height: ");
        height = sc.nextDouble();

        //Circle
        System.out.println("Enter radius for circle:");
        radius = sc.nextDouble();

        //Triangle
        System.out.println("Enter the 3 sides of a Triangle one at a time: ");
        for (int i = 1; i <= 3; i++) {
            System.out.print(i+": ");
            sides.add(sc.nextDouble());
        }

        //EquilateralTriangle
        System.out.println("Enter the side for Equilateral Triangle");
        side = sc.nextDouble();

        square.setDimensions(length,height);
        circle.setDimension(radius);
        triangle.setDimensions(sides.get(0),sides.get(1),sides.get(2));
        equilateralTriangle.setDimensions(side);

        square.printDimensions();
        System.out.println("Square area is " + square.getArea());

        circle.printDimensions();
        System.out.println("Circle area is " + circle.getArea());

        triangle.printDimensions();
        System.out.println("Triangle area is " + triangle.getArea());

        equilateralTriangle.printDimensions();
        System.out.println("EquilateralTriangle area is "+ equilateralTriangle.getArea());


    }

}
