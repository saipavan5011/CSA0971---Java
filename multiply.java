class MultiplicationTable implements Runnable {
    private int number;

    public MultiplicationTable(int number) {
        this.number = number;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " X " + i + " = " + (number * i));
            try {
                Thread.sleep(500); // Simulating some processing time
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class Main {
    public static void main(String[] args) {
        // Test cases with numbers 5 and 10
        int[] testCases = {5, 10};

        System.out.println("Sample Output:");

        for (int number : testCases) {
            Thread thread = new Thread(new MultiplicationTable(number));
            thread.start();

            // Wait for the thread to complete
            try {
                thread.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
