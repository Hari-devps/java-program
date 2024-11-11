package bank;

public class InvalidDebit extends Exception {
    public InvalidDebit() {
        super("Invalid debit amount! Insufficient balance.");
    }
}
