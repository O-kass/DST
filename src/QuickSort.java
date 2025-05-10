
import java.util.Comparator;
import rogeriogentil.data.structures.chapter06.LinkedQueue;
import rogeriogentil.data.structures.chapter06.Queue;

/**
 *
 * @author Rogerio J. Gentil
 */
public class QuickSort {

    /**
     * Quick-sort contents of a queue.
     *
     * @param <K>
     * @param S
     * @param comp
     */
    public static <K> void quickSort(Queue<K> S, Comparator<K> comp) {
        int n = S.size();

        if (n < 2) {
            return;
        }

        // divide
        K pivot = S.first();            // using first as arbitrary pivot

        Queue<K> L = new LinkedQueue<>();
        Queue<K> E = new LinkedQueue<>();
        Queue<K> G = new LinkedQueue<>();

        while (!S.isEmpty()) {
            K element = S.dequeue();    // divide original into L, E, and G

            int comparation = comp.compare(element, pivot);

            if (comparation < 0) {
                L.enqueue(element);         // element is less than pivot
            } else if (comparation == 0) {
                E.enqueue(element);         // element is equal to pivot
            } else {
                G.enqueue(element);         // element is greater than pivot
            }
        }

        // conquer
        quickSort(L, comp);         // sort elements less than pivot
        quickSort(G, comp);         // sort elements greater than pivot

        // concatenate results
        while (!L.isEmpty()) {
            S.enqueue(L.dequeue());
        }

        while (!E.isEmpty()) {
            S.enqueue(E.dequeue());
        }

        while (!G.isEmpty()) {
            S.enqueue(G.dequeue());
        }
    }

    /**
     * Sort the subarray S[a..b] inclusive. The entire array can be sorted as
     * {@code quickSortInPlace(S, comp, 0, S.length−1)}.
     *
     * @param <K>
     * @param S
     * @param comp
     * @param a
     * @param b
     */
    public static <K> void quickSortInPlace(K[] S, Comparator<K> comp, int a, int b) {
        if (a >= b) {
            return;
        }

        int left = a;
        int right = b - 1;
        K pivot = S[b];

        while (left <= right) {
            while (comp.compare(S[left], pivot) <= 0  && left <= right) {
                left++;
            }
            while (comp.compare(S[right], pivot) >= 0  && left <= right) {
                right--;
            }
            if (comp.compare(S[left], pivot) > 0 && comp.compare(S[right], pivot) < 0 && left <= right) {
                K temp = S[left];
                S[left] = S[right];
                S[right] = temp;
                left++;
                right--;
            }
        }
        S[b] = S[left];
        S[right] = pivot;

        quickSort(S, comp, a, right);

    }
}