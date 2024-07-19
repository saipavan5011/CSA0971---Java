import java.util.Hashtable;

public class BankDetails {
    public static void main(String[] args) {
        Hashtable<Integer, String> bankDetails = new Hashtable<>();

        bankDetails.put(123456, "John Doe");
        bankDetails.put(789012, "Jane Smith");
        bankDetails.put(345678, "Alice Johnson");

        System.out.println("Bank details: " + bankDetails);
        
        int size = bankDetails.size();
        System.out.println("Size of HashTable: " + size);

        bankDetails.clear();
        System.out.println("HashTable after clear operation: " + bankDetails);
    }
}
