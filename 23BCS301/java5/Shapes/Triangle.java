package Shapes;

import java.util.Scanner;

public class Triangle implements Shape {
    private double base;
    private double height;

    @Override
    public void printArea() {
        System.out.println("\nTriangle");
        System.out.println("---------\n");
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Base of Triangle: ");
        this.base = input.nextDouble();
        System.out.println("Enter Height of Triangle: ");
        this.height = input.nextDouble();
        double area = 0.5 * this.base * this.height;
        System.out.println("Area of the Triangle is: " + area);
    }
}
