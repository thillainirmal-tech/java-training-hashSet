import java.util.HashSet;
import java.util.Iterator;
public class HashSetBasics {
public static void main(String[] args) {
HashSet<String> fruits = new HashSet<>();
fruits.add("apple");
fruits.add("banana");
fruits.add("cherry");
fruits.add("date");
fruits.add("fig");
fruits.add("banana"); // Adding a duplicate value
System.out.println("Size of HashSet: " + fruits.size());
Iterator<String> iterator = fruits.iterator();
System.out.print("Elements in the HashSet: ");
while (iterator.hasNext()) {
System.out.print(iterator.next() + " ");
}
}
}
