package Shapes;

import java.util.Scanner;

public class Rectangle extends Shape {
    @Override
    public void printArea() {
        System.out.println("\nRectangle");
        System.out.println("---------\n");
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Length of Rectangle: ");
        this.length = input.nextDouble();
        System.out.print("Enter Breadth of Rectangle: ");
        this.height = input.nextDouble();
        double area = this.length * this.height;
        System.out.println("Area of the Rectangle is: " + area);
    }
}
