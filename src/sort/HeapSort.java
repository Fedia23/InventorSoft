package sort;

import java.util.Collections;
import java.util.List;

public class HeapSort {

    public void sort(List<Integer> numbers) {
        int sizeNumbers = numbers.size() - 1;

        for (int i = sizeNumbers / 2 - 1; i >= 0; i--) {
            heapify(numbers, i, sizeNumbers);
        }

        for (int i = sizeNumbers; i >= 0; i--) {
            Collections.swap(numbers, i, 0);
            heapify(numbers, 0, i);
        }
    }

    void heapify(List<Integer> list, int index, int size) {
        int largest = index;
        int left = 2 * index + 1;
        int right = 2 * index + 2;

        if (left < size && list.get(left) > list.get(largest)) {
            largest = left;
        }

        if (right < size && list.get(right) > list.get(largest)) {
            largest = right;
        }

        if (largest != index) {
            Collections.swap(list, index, largest);
            heapify(list, largest, size);
        }
    }

}
