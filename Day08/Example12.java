package Day08;

import java.util.ArrayList;
import java.util.List;
public class Example12 {
public static void main(String[] args) {
// Wrapper class required here: ArrayList<int> is invalid
List<Integer> numbers = new ArrayList<>();
// Autoboxing: primitive ints automatically become Integer objects
numbers.add(12);
numbers.add(7);
numbers.add(23);
numbers.add(44);
numbers.add(91);
numbers.add(50);
List<Integer> evens = new ArrayList<>();
for (Integer num : numbers) {
// Unboxing: num unboxes to primitive int for the % operation
if (num % 2 == 0) {
evens.add(num);
}
}
System.out.println("Even numbers: " + evens);
}
}