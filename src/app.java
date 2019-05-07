import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class app {
    public static void main(String[] args) {

        List<Integer> list = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter five numbers :");
        for (int i = 0; i <= 5; i++) {
            list.add(scanner.nextInt());
        }

        InsertionSort insertionSort = new InsertionSort(list);
        insertionSort.sortNumberDescending();

        System.out.println("Result of sorting :");
        list.stream().forEach(s -> System.out.println(s));
    }
}


