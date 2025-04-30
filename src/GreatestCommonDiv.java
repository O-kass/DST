
public class GreatestCommonDiv{

    /** Returns the greatest common divisor of two positive numbers p and q, using recursion*/
    public static int greatestCD(int p, int q) {

        if (q == 0) {
            return p;
        }
        return greatestCD(q, p % q);
    }

    public static int greatestCDIter(int p, int q) {

        while (q != 0) {
            //To be completed
            int previousP = p;
            p = q;
            q = previousP % q;
        }
        return p;
    }

    public static void main(String[] args) {
        //Get first and second argument as p and q
        int p = Integer.parseInt("102");
        int q = Integer.parseInt("68");
        //Use p and q as arguments in the recursive and iterative version of greatestCD
        int d  = greatestCD(p,q);
        int d2 = greatestCDIter(p,q);
        //Print out the results
        System.out.println("greatestCD(" + p + ", " + q + ") = " + d);
        System.out.println("greatestCDIter(" + p + ", " + q + ") = " + d2);
    }
}