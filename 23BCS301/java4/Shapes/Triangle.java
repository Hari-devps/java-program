package Shapes;

import java.util.Scanner;

public class Triangle extends Shape {
    @Override
    public void printArea() {
        System.out.println("\nTriangle");
        System.out.println("---------\n");
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Base of Triangle: ");
        this.length = input.nextDouble();
        System.out.print("Enter Height of Triangle: ");
        this.height = input.nextDouble();
        double area = 0.5 * this.length * this.height;
        System.out.println("Area of the Triangle is: " + area);
    }
}
