class SuperClass {
    private int num1;
    private int num2;

    public SuperClass(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public void display() {
        System.out.println(num1 + ", " + num2);
    }
}

class SubClass extends SuperClass {
    public SubClass(int num1, int num2) {
        super(num1, num2);
    }
}

public class Main {
    public static void main(String[] args) {
        int[][] testCases = {
            {100, 200},
            {10, 20},
            {-20, -30},
            {0, 0},
            {85, 85}, // Assuming "EIGHT FIVE" was a typo
            {10, 20} // Example of non-integer input
        };

        System.out.println("Sample Output:");
        for (int i = 0; i < testCases.length; i++) {
            SubClass obj = new SubClass(testCases[i][0], testCases[i][1]);
            obj.display();
        }
    }
}
