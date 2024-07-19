public class MultiCatchExample {
    public static void main(String[] args) {
        try {
            int a = 10;
            int b = 0;
            int result = a / b;

            int[] array = new int[5];
            int value = array[10];

            String str = null;
            System.out.println(str.length());
        } catch (ArithmeticException | ArrayIndexOutOfBoundsException | NullPointerException e) {
            System.out.println("Exception caught: " + e);
        }
    }
}
