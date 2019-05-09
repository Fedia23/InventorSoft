package sort;

import java.util.Collections;
import java.util.List;

public class QuickSort {

    public void sort(List<Integer> list) {
        sort(list, 0, list.size() - 1);
    }

    public void sort(List<Integer> list, int from, int to) {
        if (from < to) {
            int pivot = from;
            int left = from + 1;
            int right = to;
            int pivotValue = list.get(pivot);
            while (left <= right) {
                while (left <= to && pivotValue >= list.get(left)) {
                    left++;
                }
                while (right > from && pivotValue < list.get(right)) {
                    right--;
                }
                if (left < right) {
                    Collections.swap(list, left, right);
                }
            }
            Collections.swap(list, pivot, left - 1);
            sort(list, from, right - 1);
            sort(list, right + 1, to);
        }
    }
}
