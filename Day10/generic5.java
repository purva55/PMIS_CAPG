//package Day10;
import java.util.*;


class generic5{
    static double sum(List<? extends Number> list){
        double total=0.0;
        for (Number n : list){
            total+=n.doubleValue();
        }
        return total;
    }
}
public static void main(String[] args) {
    List<Integer> intlist = Arrays.asList(1,2,3,4,5);
    List<Double> doublelist = Arrays.asList(1.1, 2.2, 3.3);
     List<Float> floatlist = Arrays.asList(1.1f, 2.2f, 3.3f);


    System.out.println("Sum of intlist: " + generic5.sum(intlist));
    System.out.println("Sum of doublelist: " + generic5.sum(doublelist));
    System.out.println("Sum of floatlist: " + generic5.sum(floatlist));
}