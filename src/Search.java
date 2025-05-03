public class Search {

    public static boolean searchRecursive(Object[] list, int f, Object x) {
        // recursive method for checking if x is in array list at index f or higher
        // GIVE YOUR CODE HERE
        if(f > list.length | f < 0){
            return false;
        }
        else if(list[f].equals(x)){
            return true;
        }
        else{
            return searchRecursive(list, f+1, x);
        }
    }

    public static boolean searchIterative(Object[] list, int f, Object x) {
        // iterative method for checking if x is in array list at index f or higher
        // GIVE YOUR CODE HERE
        if(f > list.length | f < 0){
            return false;
        }
        else if(list[f].equals(x)){
            return true;
        }
        else{
            for(int i = f; i < list.length; i++){
                if(list[i].equals(x)){
                    return true;
                }
            }
            return false;
        }
    }

    public int RecursiveFactorial(int n){
        if(n <= 1){
            return 1;
        }
        else{
            return (n*RecursiveFactorial(n-1));
        }
    }

    public static void main(String[] args) {
        // test the methods
        for (int i = 0; i < args.length; i++) {
            System.out.print(args[i] + " ");
        }
        System.out.println();

        // check if the first argument in the command line is repeated
        System.out.println("the 1st argument is repeated:");
        System.out.println(searchRecursive(args, 1, args[0]));
        System.out.println(searchIterative(args, 1, args[0]));
    }
}
