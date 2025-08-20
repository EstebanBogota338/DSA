package merge_sort_alg;

public class Main {
    public static void main(String[] args) {
        int [] numbers = {20, 70, 500, 320, 1, 99, 120, 96, 223, 440};

        System.out.println("Vector original: ");
        ArrayUtils.printArray(numbers);

        MergeSort mergeSort = new MergeSort();
        mergeSort.sort(numbers, 0, numbers.length - 1);

        System.out.println("\nVector ordenado: ");
        ArrayUtils.printArray(numbers);
    }
}
