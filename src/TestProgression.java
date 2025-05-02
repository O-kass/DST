
/** Test program for the progression classes */
class TestProgression {
    public static void main(String[] args) {
        Progression prog;

        System.out.println("Default progression:");
        prog = new Progression();
        prog.printProgression(10);

        System.out.println("Arithmetic progression with default increment:");
        prog = new ArithProgression();
        prog.printProgression(10);

        System.out.println("Arithmetic progression with increment 5:");
        prog = new ArithProgression(5);
        prog.printProgression(10);

        System.out.println("Geometric progression with base 3:");
        prog = new GeomProgression(3);
        prog.printProgression(10);

        System.out.println("Geometric progression with base 3:");
        (new GeomProgression(3)).printProgression(10);

        System.out.println("Fibonacci progression with start values 0 and 4:");
        prog = new FibonacciProgression(4);
        prog.printProgression(10);

    }
}
