import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import payscale.AssistantProfessor;
import payscale.AssociateProfessor;
import payscale.Programmer;
import payscale.Professor;

public class Main {
    public static void main(String[] args) throws IOException {
        String choice;
        int n_choice = 0;

        Scanner userInput = new Scanner(System.in);
        while (n_choice != 5) {
            System.out.println("\n\nEmployee Payroll System");
            System.out.println("***********************\n");
            System.out.println("1. Programmer\n2. Assistant Professor\n" +
                               "3. Associate Professor\n4. Professor\n" +
                               "5. Exit\n\nEnter Your Choice");

            choice = new BufferedReader(new InputStreamReader(System.in)).readLine();
            n_choice = Integer.parseInt(choice);

            switch (n_choice) {
                case 1:
                    System.out.println("Programmer Selected");
                    new Programmer();
                    break;
                case 2:
                    System.out.println("Assistant Professor Selected");
                    new AssistantProfessor();
                    break;
                case 3:
                    System.out.println("Associate Professor Selected");
                    new AssociateProfessor();
                    break;
                case 4:
                    System.out.println("Professor Selected");
                    new Professor();
                    break;
                case 5:
                    System.out.println("Thank You !!!");
                    userInput.close();
                    break;
                default:
                    System.out.println("Enter valid choice !!!");
                    break;
            }
        }
    }
}
