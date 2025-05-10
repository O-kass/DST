import java.util.Arrays;

public class QuickSortExam{

    // Function to perform Quick Sort
    public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pivotIndex = partition(arr, low, high);
            //Complete the recursive calling on two partitions
            //Insert your codes here.

            quickSort(arr, low, pivotIndex-1); // need this as low not 0 as second recursive call will have it's own LHS and RHS where beyond zero for LHS
            quickSort(arr, pivotIndex+1, high);
        }
    }

    // partition scheme
    private static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];  // Pivot is the last element
        int i = low;  // Pointer for smaller element
        int j = high - 1;


        //by using the pointer to scan the whole sequence.
        //move the small element to the left partition and move the larger element to right partition.
        //Then place the pivot into the correct position.
        //Insert your codes here.

        while(i <= j){
            while(arr[i] <= pivot){
                i++;
            }
            while(arr[j] > pivot){
                j--;
            }
            if(i <= j){
                swap(arr, i, j);
                i++;
                j--;
            }
        }
        swap(arr, i, high);

        return i;  // Return the pivot index
    }

    // Function to swap two elements in an array
    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}