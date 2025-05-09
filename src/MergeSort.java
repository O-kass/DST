
import java.util.Arrays;
import java.util.Comparator;


/**
 *
 * @author Rogerio J. Gentil
 */
public class MergeSort {


    // ----- Array-Based Implementation -----
    /**
     * Merge-sort contents of array S.
     *
     * @param <K>
     * @param S
     * @param comp
     */
    public static <K> void mergeSort(K[] S, Comparator<K> comp) {
        int max = S.length-1;
        int min = 0;
        int mid = (min + max)/2;
        K[] S1 = (K[]) new Object[mid];
        K[] S2 = (K[]) new Object[mid];

        if(min < max) {
            for (int i = min; i <= mid; i++) {
                S1[i] = S[i];
            }
            for (int i = mid + 1; i <= max; i++) {
                S2[i] = S[i];
            }
            mergeSort(S1, comp);
            mergeSort(S2, comp);
        }
        merge(S1, S2, S, comp);

    }

    /**
     * Merge contents of arrays S1 and S2 into properly sized array S.
     *
     * @param <K>
     * @param S1
     * @param S2
     * @param S
     * @param comp
     */
    public static <K> void merge(K[] S1, K[] S2, K[] S, Comparator<K> comp) {
        int i = 0;
        int j = 0;
        int k = 0;

        if (comp.compare(S1[i], S2[j]) <= 0){
            S[k++] = S1[i++];
        }
        else{
            S[k++] = S2[j++];
        }
        while(i < S1.length){
            S[k++] = S1[i++];
        }
        while(j < S2.length){
            S[k++] = S2[j++];
        }

    }


    // ----- Queue-Based Implementation -----
    /**
     * Merge-sort contents of queue.
     *
     * @param <K>
     * @param S
     * @param comp
     */
    public static <K> void mergeSort(Queue<K> S, Comparator<K> comp) {     // merge sorted halves back into original
    }

    /**
     * Merge contents of sorted queues S1 and S2 into empty queue S.
     *
     * @param <K>
     * @param S1
     * @param S2
     * @param S
     * @param comp
     */
    public static <K> void merge(Queue<K> S1, Queue<K> S2, Queue<K> S, Comparator<K> comp) {
    }

    // ----- Bottom-Up (Nonrecursive) Implementation -----
    /**
     * Merge-sort contents of data array.
     *
     * @param <K>
     * @param orig
     * @param comp
     */
    public static <K> void mergeSortBottomUp(K[] orig, Comparator<K> comp) {
    }

    /**
     * Merges in[start..start+inc−1] and in[start+inc..start+2∗inc−1] into out.
     *
     * @param <K>
     * @param in
     * @param out
     * @param comp
     * @param start
     * @param inc
     */
    public static <K> void merge(K[] in, K[] out, Comparator<K> comp, int start, int inc) {
}