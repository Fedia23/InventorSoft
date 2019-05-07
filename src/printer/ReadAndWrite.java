package printer;

import sort.InsertionSort;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class ReadAndWrite {

    private List<Integer> list = new LinkedList<>();

    public void read() {
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
    }

    public void writeList() {
        InsertionSort insertionSort = new InsertionSort(list);
        insertionSort.sortNumberAscending();

        System.out.println("Result of sorting :");
        list.stream().forEach(s -> System.out.println(s));
    }


}
