package prepwork;
import java.util.*;

public class CollectionApp {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(3);
        numbers.add(5);
        numbers.add(7);
        System.out.println(numbers);

        List<A> names = new ArrayList<>();
        names.add(new A("Monthy"));
        names.add(new A("Python"));
        names.add(new A("Little"));
        names.add(new A("Dickie"));
        System.out.println(names);
        System.out.println(max(numbers, 1, 4));

    }

    public static <T extends Comparable<? super T>> T max(List<? extends T> list, int begin, int end) { // T stands for any type that extends the comparable interface, The comparable interface type must be T or something that T extends
        T maxElem = list.get(begin);  // Can be done because list must be T or something that extends T
        for (++begin; begin < end; ++begin) // Weird for loop that avoids declaring an index, the ++ before beings means to increase the value of begin before starting the loop
            if (maxElem.compareTo(list.get(begin)) < 0) // compareTo can be used because T extends comparable and is type safe because the Comparable is some object that T extends
                maxElem = list.get(begin);
        return maxElem;
    }

    public static <T extends Collection> int countCollection(T collection){
        return collection.size();
    }

    @SuppressWarnings("unchecked")
    public static <T extends List> void swapIndexPositions(T list, int iSrc, int iDest){
        Object oDest = list.get(iDest);
        list.set(iDest, list.get(iSrc));
        list.set(iSrc, oDest);
    }

    public static void print(List<? extends Number> list) {
        for (Number n : list)
            System.out.print(n + " ");
        System.out.println();
    }



}

class A {
    private String name;

    public A(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "A{" +
                "name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        A a = (A) o;
        return Objects.equals(name, a.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}