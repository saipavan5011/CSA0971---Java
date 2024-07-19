import java.util.LinkedList;
import java.util.ListIterator;

public class ListIteratorExample {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("C");
        list.add("A");
        list.add("E");
        list.add("B");
        list.add("D");
        list.add("F");

        ListIterator<String> iterator = list.listIterator();
        while (iterator.hasNext()) {
            String element = iterator.next();
            iterator.set(element + "+");
        }

        System.out.println("List with + appended to each element: " + list);

        System.out.println("List in reverse order:");
        while (iterator.hasPrevious()) {
            System.out.print(iterator.previous() + " ");
        }
    }
}
