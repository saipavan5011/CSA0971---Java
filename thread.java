class FibonacciGenerator implements Runnable {
    private int n;

    public FibonacciGenerator(int n) {
        this.n = n;
    }

    @Override
    public void run() {
        int a = 0, b = 1;
        System.out.print("Fibonacci series for " + n + " terms: ");
        
        for (int i = 0; i < n; i++) {
            System.out.print(a + " ");

            int temp = a;
            a = b;
            b = temp + b;

            try {
                Thread.sleep(500); // Simulating some processing time
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println();
    }
}

public class Main {
    public static void main(String[] args) {
        // Test cases with number of terms in Fibonacci series
        int[] testCases = {5, 7, -10, 0};

        System.out.println("Sample Output:");

        for (int n : testCases) {
            if (n <= 0) {
                System.out.println("Invalid input: " + n);
                continue;
            }

            Thread thread = new Thread(new FibonacciGenerator(n));
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
