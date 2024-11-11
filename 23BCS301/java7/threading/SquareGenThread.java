package threading;

public class SquareGenThread extends Thread {
    int number;
    int square;

    public SquareGenThread(int number) {
        this.number = number;
    }

    @Override
    public void run() {
        try {
            // Sleep for 3 seconds
            this.sleep(3000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt(); // Restore interrupted status
        }
        this.square = this.number * this.number;
        System.out.println("SquareGenThread --> Square of " + number + " is " + square);
    }
}
