public class HillClimbingAlgorithm {

    public static int findLocalMaximum(int[] arr) {
        int current = 0;
        int neighbor = 0;

        while (true) {
            neighbor = current;

            if (current > 0 && arr[current - 1] > arr[current]) {
                neighbor = current - 1;
            }
            if (current < arr.length - 1 && arr[current + 1] > arr[neighbor]) {
                neighbor = current + 1;
            }

            if (neighbor == current) {
                break;
            }
            current = neighbor;
        }
        return current;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 3, 5, 4, 2, 6 };
        int localMaximumIndex = findLocalMaximum(arr);

        System.out.println("Local Maximum Index: " + localMaximumIndex);
        System.out.println("Local Maximum Value: " + arr[localMaximumIndex]);
    }
}
