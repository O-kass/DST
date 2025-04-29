class RecursiveFactorial {

    public static int recursiveFactorial(int n) {
        if(n <= 1) return 1;
        else return n * recursiveFactorial(n-1);
    }

    public static void main(String args[]) {
        System.out.println
                (args[0]+ "! is equal to "
                        + recursiveFactorial(Integer.parseInt(args[0])));
    }
}
