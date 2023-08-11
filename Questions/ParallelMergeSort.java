import java.util.Arrays;

public class ParallelMergeSort {

    public static void main(String[] args) {
        int[] arr = { 5, 2, 9, 1, 5, 6 };
        parallelMergeSort(arr);
        System.out.println(Arrays.toString(arr)); 
    }

    public static void parallelMergeSort(int[] arr) {
        parallelMergeSort(arr, 0, arr.length - 1);
    }

    private static void parallelMergeSort(int[] arr, int low, int high) {
        if (low < high) {
            if (high - low <= 1000) {
                mergeSort(arr, low, high);
            } else {
                int mid = (low + high) / 2;
                Thread leftSort = new Thread(() -> parallelMergeSort(arr, low, mid));
                Thread rightSort = new Thread(() -> parallelMergeSort(arr, mid + 1, high));
                leftSort.start();
                rightSort.start();
                try {
                    leftSort.join();
                    rightSort.join();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                merge(arr, low, mid, high);
            }
        }
    }

    private static void mergeSort(int[] arr, int low, int high) {
        if (low < high) {
            int mid = (low + high) / 2;
            mergeSort(arr, low, mid);
            mergeSort(arr, mid + 1, high);
            merge(arr, low, mid, high);
        }
    }

    private static void merge(int[] arr, int low, int mid, int high) {
        int[] temp = new int[high - low + 1];
        int i = low;
        int j = mid + 1;
        int k = 0;

        while (i <= mid && j <= high) {
            if (arr[i] <= arr[j]) {
                temp[k++] = arr[i++];
            } else {
                temp[k++] = arr[j++];
            }
        }

        while (i <= mid) {
            temp[k++] = arr[i++];
        }

        while (j <= high) {
            temp[k++] = arr[j++];
        }

        System.arraycopy(temp, 0, arr, low, temp.length);
    }
}