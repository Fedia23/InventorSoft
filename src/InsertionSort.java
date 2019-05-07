import java.util.LinkedList;
import java.util.List;

public class InsertionSort {

    private List<Integer> numbers;

    public InsertionSort(List<Integer> numbers) {
        this.numbers = numbers;
    }

    public List<Integer> sortNumberAscending() {
        int j, temp;
        for (int i = 1; i < numbers.size(); i++) {
            j = i - 1;
            while (j >= 0 && numbers.get(j) > numbers.get(i)) {
                temp = numbers.get(i);
                numbers.set(i, numbers.get(j));
                numbers.set(j, temp);
                i = j;
                j--;
            }
        }
        return numbers != null ? numbers : new LinkedList<>();
    }

    public List<Integer> sortNumberDescending() {
        int j, temp;
        for (int i = 1; i < numbers.size(); i++) {
            j = i - 1;
            while (j >= 0 && numbers.get(j) < numbers.get(i)) {
                temp = numbers.get(i);
                numbers.set(i, numbers.get(j));
                numbers.set(j, temp);
                i = j;
                j--;
            }
        }

        return numbers != null ? numbers : new LinkedList<>();
    }

}
