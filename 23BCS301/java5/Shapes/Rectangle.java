package Shapes;

import java.util.Scanner;

public class Rectangle implements Shape {
    private double length;
    private double breadth;

    @Override
    public void printArea() {
        System.out.println("\nRectangle");
        System.out.println("---------\n");
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Length of Rectangle: ");
        this.length = input.nextDouble();
        System.out.println("Enter Breadth of Rectangle: ");
        this.breadth = input.nextDouble();
        double area = this.length * this.breadth;
        System.out.println("Area of the Rectangle is: " + area);
    }
}
