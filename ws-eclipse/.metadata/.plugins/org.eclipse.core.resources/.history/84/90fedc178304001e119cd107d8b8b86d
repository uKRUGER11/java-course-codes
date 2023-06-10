package application;

public class Program {
	
    public static void main(String[] args) {
        int[] arr = {3, 41, 52, 26, 38, 57, 9, 49};
        System.out.print("Lista original: ");
        printArray(arr);

        mergeSort(arr, 0, arr.length - 1);
        System.out.print("Lista ordenada: ");
        printArray(arr);
    }

    public static void merge(int[] A, int p, int q, int r) {
        int n1 = q - p + 1;
        int n2 = r - q;
        int[] L = new int[n1];
        int[] R = new int[n2];

        for (int i = 0; i < n1; i++) {
            L[i] = A[p + i];
        }

        for (int j = 0; j < n2; j++) {
            R[j] = A[q + j + 1];
        }

        int i = 0;
        int j = 0;
        int k = p;

        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                A[k] = L[i];
                i++;
            } else {
                A[k] = R[j];
                j++;
            }
            k++;
        }

        while (i < n1) {
            A[k] = L[i];
            i++;
            k++;
        }

        while (j < n2) {
            A[k] = R[j];
            j++;
            k++;
        }

        // Exibir visualmente a lista a cada iteração do merge
        System.out.print("Merge: ");
        for (int m = p; m <= r; m++) {
            System.out.print(A[m] + " ");
        }
        System.out.println();
    }

    public static void mergeSort(int[] A, int p, int r) {
        if (p < r) {
            int q = (p + r) / 2;
            mergeSort(A, p, q);
            mergeSort(A, q + 1, r);
            merge(A, p, q, r);
        }
    }

    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
        	System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}

