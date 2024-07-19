interface IterF1 {
    void add(int a, int b);
    void sub(int a, int b);
}

class MathOperations implements IterF1 {
    @Override
    public void add(int a, int b) {
        System.out.println("Addition of two integers: " + (a + b));
    }

    @Override
    public void sub(int a, int b) {
        System.out.println("Subtraction of two integers: " + (a - b));
    }

    public void add(double a, double b) {
        System.out.println("Addition of two doubles: " + (a + b));
    }

    public void sub(double a, double b) {
        System.out.println("Subtraction of two doubles: " + (a - b));
    }

    public static void main(String[] args) {
        MathOperations mathOperations = new MathOperations();

        mathOperations.add(10, 5);
        mathOperations.sub(10, 5);

        mathOperations.add(10.5, 5.5);
        mathOperations.sub(10.5, 5.5);
    }
}
