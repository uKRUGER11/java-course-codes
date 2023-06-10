package application;

import java.util.Arrays;

public class Program {
    public static void mergeSort(int[] array) {
        if (array.length < 2) {
            return;
        }
        
        int mid = array.length / 2;
        int[] leftArray = new int[mid];
        int[] rightArray = new int[array.length - mid];
        
        System.arraycopy(array, 0, leftArray, 0, mid);
        System.arraycopy(array, mid, rightArray, 0, array.length - mid);
        
        mergeSort(leftArray);
        mergeSort(rightArray);
        
        merge(array, leftArray, rightArray);
    }
    
    public static void merge(int[] mergedArray, int[] leftArray, int[] rightArray) {
        int leftSize = leftArray.length;
        int rightSize = rightArray.length;
        int i = 0; // Índice para percorrer o array leftArray
        int j = 0; // Índice para percorrer o array rightArray
        int k = 0; // Índice para percorrer o array mergedArray
        
        while (i < leftSize && j < rightSize) {
            if (leftArray[i] <= rightArray[j]) {
                mergedArray[k++] = leftArray[i++];
            } else {
                mergedArray[k++] = rightArray[j++];
            }
        }
        
        while (i < leftSize) {
            mergedArray[k++] = leftArray[i++];
        }
        
        while (j < rightSize) {
            mergedArray[k++] = rightArray[j++];
        }
    }
    
    public static void main(String[] args) {
        int[] array = {8, 2, 4, 1, 3, 5, 6, 7};
        System.out.println("Array antes do Merge Sort: " + Arrays.toString(array));
        
        mergeSort(array);
        
        System.out.println("Array depois do Merge Sort: " + Arrays.toString(array));
        
        System.out.println("Menor nuúmero da lista: " + array[0]);
    }
}