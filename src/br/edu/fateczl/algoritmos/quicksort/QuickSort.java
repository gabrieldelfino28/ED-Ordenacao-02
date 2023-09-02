package br.edu.fateczl.algoritmos.quicksort;

public class QuickSort {
    public QuickSort(){
        super();
    }

    public int[] QuickSort(int[] arr, int start, int end){
        if(end > start){
            int PivotIndexed = SplitArray(arr, start, end);
            QuickSort(arr, start, PivotIndexed-1); //Left Array
            QuickSort(arr,PivotIndexed+1, end); //Right Array
        }
        return arr;
    }

    private int SplitArray(int[] arr, int start, int end){
        int pivot = arr[start];
        int pointerRight = end;
        int pointerLeft = start +1;

        while(pointerLeft <= pointerRight){

            while(pointerLeft <= pointerRight && arr[pointerLeft] <= pivot){
                pointerLeft++;
            }

            while(pointerRight >= pointerLeft && arr[pointerRight] > pivot){
                pointerRight--;
            }

            if(pointerLeft < pointerRight){
                PositionSwap(arr, pointerLeft, pointerRight);
                pointerRight--;
                pointerLeft++;
            }
        }

        PositionSwap(arr, start, pointerRight);
        return pointerRight;
    }

    private void PositionSwap(int[] arr, int i, int j){
        int auxiliary = arr[i];
        arr[i] = arr[j];
        arr[j] = auxiliary;
    }
}
