import java.util.Scanner;
import Files.UserFileHandler;

public class Main {
    public static void main(String[] args) {
        String filePath = null;
        Scanner input = new Scanner(System.in);

        System.out.println("File Handler");
        System.out.println("************");
        System.out.print("Enter the file path: ");
        filePath = input.next();

        UserFileHandler userFileHandler = new UserFileHandler(filePath);
        userFileHandler.fileDetails();
        
        input.close(); // It's a good practice to close the scanner
    }
}
