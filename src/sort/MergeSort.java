package sort;

import java.util.*;

public class MergeSort {

    public void sortNumbers(List<Integer> numbers) {

        if (numbers.size() > 1) {
            int point = numbers.size() / 2;

            List<Integer> left = new ArrayList<>(numbers.subList(0, point));
            List<Integer> right = new ArrayList<>(numbers.subList(point, numbers.size()));

            sortNumbers(left);
            sortNumbers(right);

            merge(left, right, numbers);
        }
    }

    public void merge(List<Integer> left, List<Integer> right, List<Integer> list) {
        int leftIndex = 0;
        int rightIndex = 0;
        int listIndex = 0;

        while (leftIndex < left.size() && rightIndex < right.size()) {
            if (left.get(leftIndex) < right.get(rightIndex)) {
                list.set(listIndex++, left.get(leftIndex++));
            } else {
                list.set(listIndex++, right.get(rightIndex++));
            }
        }
        while (leftIndex < left.size()) {
            list.set(listIndex++, left.get(leftIndex++));
        }
        while (rightIndex < right.size()) {
            list.set(listIndex++, right.get(rightIndex++));
        }
    }
}
