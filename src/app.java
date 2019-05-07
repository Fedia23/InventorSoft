import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class app {
    public static void main(String[] args) {

        List<Integer> list = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter five numbers :");
        for (int i = 0; i <= 5; i++) {
            String count = scanner.nextLine();
            try {
                Integer num = Integer.parseInt(count);
                list.add(num);
            } catch (NumberFormatException e) {
                System.out.println("Error " + e.getMessage() + " , enter number :");
            }
        }

        InsertionSort insertionSort = new InsertionSort(list);
        insertionSort.sortNumberDescending();

        System.out.println("Result of sorting :");
        list.stream().forEach(s -> System.out.println(s));
    }
}


