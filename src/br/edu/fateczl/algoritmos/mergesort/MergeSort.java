package br.edu.fateczl.algoritmos.mergesort;

public class MergeSort {
    public MergeSort() {
        super();
    }

    public int[] MergeSort(int[] arr, int start, int end) {
        if (end > start) {
            int mid = (start + end) / 2;
            MergeSort(arr, start, mid);
            MergeSort(arr, mid + 1, end);
            MergeArray(arr, start, mid, end);
        }
        return arr;
    }

    private void MergeArray(int[] arr, int start, int mid, int end) {
        int pointerLeft = start;
        int pointerRight = mid + 1;

        int[] aux = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            aux[i] = arr[i];
        }

        for (int i = start; i <= end; i++) {
            if (pointerLeft > mid) {
                arr[i] = aux[pointerRight];
                pointerRight++;
            } else if (pointerRight > end) {
                arr[i] = aux[pointerLeft];
                pointerLeft++;
            } else if (aux[pointerLeft] < aux[pointerRight]) {
                arr[i] = aux[pointerLeft];
                pointerLeft++;
            } else {
                arr[i] = aux[pointerRight];
                pointerRight++;
            }
        }
    }
}
