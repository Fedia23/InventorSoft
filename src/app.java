import java.util.LinkedList;
import java.util.List;

public class app {
    public static void main(String[] args) {

        List<Integer> list = new LinkedList<>();
        list.add(4);
        list.add(1);
        list.add(3);
        list.add(14);
        list.add(44);
        list.add(42);
        InsertionSort insertionSort = new InsertionSort(list);
        insertionSort.sortNumberDescending();

        list.stream().forEach(s -> System.out.println(s));
    }
}


