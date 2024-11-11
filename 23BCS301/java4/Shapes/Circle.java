package Shapes;

import java.util.Scanner;

public class Circle extends Shape {
    @Override
    public void printArea() {
        System.out.println("\nCircle");
        System.out.println("-------\n");
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Radius of Circle: ");
        this.length = input.nextDouble();
        double area = Math.PI * this.length * this.length;
        System.out.println("Area of the Circle is: " + area);
    }
}
