package br.edu.fateczl.algoritmos.bubblesort;

public class BubbleSort {
    public BubbleSort(){
        super();
    }

    public int[] BubbleSort(int[] arr){
        int size = arr.length;
        for(int i = 0; i < size; i++ ){
            for(int j = 0; j < size-1; j++){
                if(arr[j] > arr[j+1]){
                    int aux = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = aux;
                }
            }
        }
        return arr;
    }
}
