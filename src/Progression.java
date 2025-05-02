public class Progression {

    /** First value of the progression.  */
    protected long first;

    /** Current value of the progression.  */
    protected long cur;

    /** Default constructor.  */
    protected Progression() {
        cur = first = 0;
    }

    /** Resets the progression to the first value.
     *
     * @return first value
     */
    protected long firstValue() {
        cur = first;
        return cur;
    }

    /** Advances the progression to the next value.
     *
     * @return next value of the progression
     */
    protected long nextValue() {
        return ++cur; // default next value
    }

    /** Prints the first n values of the progression.
     *
     * @param n number of values to print
     */
    protected void printProgression(int n) {
        System.out.print(firstValue());
        for (int i = 2; i <= n; i++)
            System.out.print(" " + nextValue());
        System.out.println(); // ends the line
    }

    protected long nextValue(int k){
        cur += k;
        return cur;
    }


    public static void main(String[] args) {
        // test Progression
        Progression prog = new Progression();
        System.out.println("Default progression:");
        prog.printProgression(10);
    }
}
