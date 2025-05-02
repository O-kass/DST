
class TestProgression2 {
    public static void main(String[] args) {
        Progression prog;

        prog = new ArithProgression(5);
        prog.printProgression(5);
        System.out.println(prog.nextValue(2));
        prog.printProgression(7);

        prog = new GeomProgression(2);
        prog.printProgression(5);
        System.out.println(prog.nextValue(2));
        prog.printProgression(7);

        prog = new FibonacciProgression(3);
        prog.printProgression(5);
        System.out.println(prog.nextValue(2));
        prog.printProgression(7);
    }
}
