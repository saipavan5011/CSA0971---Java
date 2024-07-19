import java.util.ArrayList;

class Bank {
    private String name;
    private double rateOfInterest;

    public Bank(String name, double rateOfInterest) {
        this.name = name;
        this.rateOfInterest = rateOfInterest;
    }

    public double getRateOfInterest() {
        return rateOfInterest;
    }

    public String getName() {
        return name;
    }

    public String toString() {
        return name + ", " + rateOfInterest;
    }
}

public class Main {
    public static void main(String[] args) {
        Bank sbi = new Bank("SBI", 8.4);
        Bank icici = new Bank("ICICI", 7.3);
        Bank axis = new Bank("AXIS", 9.7);

        ArrayList<Bank> banks = new ArrayList<>();
        banks.add(sbi);
        banks.add(icici);
        banks.add(axis);

        ArrayList<String> testCases = new ArrayList<>();
        testCases.add("SBI, 8.3");
        testCases.add("ICICI, 7.3");
        testCases.add("AXIS, 9.7");
        testCases.add("SBI, 8.6");
        testCases.add("AXIS, 7.6");

        System.out.println("Sample Output");
        for (int i = 0; i < testCases.size(); i++) {
            System.out.println((i + 1) + ". " + testCases.get(i));
        }

        System.out.println("\nActual Output");
        for (String testCase : testCases) {
            String[] parts = testCase.split(", ");
            String bankName = parts[0].trim();
            double expectedRate = Double.parseDouble(parts[1]);

            boolean found = false;
            for (Bank bank : banks) {
                if (bank.getName().equalsIgnoreCase(bankName)) {
                    found = true;
                    double actualRate = bank.getRateOfInterest();
                    System.out.println(bankName + ", " + actualRate);
                    break;
                }
            }

            if (!found) {
                System.out.println(bankName + " not found");
            }
        }
    }
}
