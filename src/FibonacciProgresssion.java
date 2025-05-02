
/**
 * Fibonacci progression.
 */
class FibonacciProgression extends Progression {
    /** Previous value. */
    long prev;
    // Inherits variables first and cur.

    /** Default constructor setting 1 as the second value. */
    FibonacciProgression() {
        this(1);
    }
    /** Parametric constructor providing the first and second values.
     *
     * @param second - the second value.
     */
    FibonacciProgression(long second) {
        prev = second - first; // fictitious value preceding the first
    }

    /** Advances the progression by adding the previous value to the current value.
     *
     * @return next value of the progression
     */
    protected long nextValue() {
        long next = cur + prev;
        prev = cur;
        cur = next;
        return cur;
    }

    // Inherits methods firstValue() and printProgression(int).
    @Override
    protected long nextValue(int k){
        for(int i=0; i<k;i++){
            long next = cur + prev;
            prev = cur;
            cur = next;
        }
        return cur;
    }
}

