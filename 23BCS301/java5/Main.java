import Shapes.Rectangle;
import Shapes.Shape;
import Shapes.Triangle;
import Shapes.Circle;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        int choice = 0;

        do {
            System.out.println("Finding Area");
            System.out.println("************");
            System.out.println(
                "\n1. Rectangle" + "\n2. Triangle" + "\n3. Circle" + "\n4. Exit" +
                "\n\nEnter your choice: "
            );

            choice = userInput.nextInt();
            Shape shape = null;

            switch (choice) {
                case 1:
                    shape = new Rectangle();
                    break;
                case 2:
                    shape = new Triangle();
                    break;
                case 3:
                    shape = new Circle();
                    break;
                case 4:
                    System.out.println("\n\nThank You !!!");
                    break;
                default:
                    System.out.println("Please enter valid input");
                    continue; // Skip the rest of the loop for invalid input
            }

            if (shape != null) {
                shape.printArea();
            }

        } while (choice != 4);

        userInput.close();
    }
}
