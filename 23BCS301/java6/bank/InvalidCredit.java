package bank;

public class InvalidCredit extends Exception {
    public InvalidCredit() {
        super("Invalid credit amount! Please enter a positive amount.");
    }
}
