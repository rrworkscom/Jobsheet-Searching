package week7;

public class MergeSortDemo {
    public static void main(String[] args) {
        int[] data = {10, 40, 20, 50, 70, 20, 100, 90};

        System.out.println("Sorting with merge sort");

        MergeSort sorting = new MergeSort();

        System.out.println("Initial data: ");
        sorting.printArray(data);
        sorting.mergeSort(data);

        System.out.println("Sorted data: ");
        sorting.printArray(data);
    }
}
