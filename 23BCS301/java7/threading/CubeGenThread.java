package threading;

public class CubeGenThread extends Thread {
    int number;
    int cube; // Changed variable name to 'cube'

    public CubeGenThread(int number) {
        this.number = number;
    }

    @Override
    public void run() {
        try {
            // Sleep for 2 seconds
            this.sleep(2000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt(); // Restore interrupted status
        }
        this.cube = this.number * this.number * this.number;
        System.out.println("CubeGenThread --> Cube of " + number + " is " + cube);
    }
}
