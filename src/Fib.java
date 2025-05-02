public class Fib {

    public static long fib(int k){
        if(k <= 1){
            return k;
        }
        else if(k == 2){
            return 1;
        }
        else{
            if(k % 2 != 0){
                return ((fib((k+1)/2) * fib((k+1)/2)) + ((fib((k-1)/2)) * fib((k-1)/2)));
            }
            else{
                return ((fib(k/2 + 1)) + (fib(k/2  - 1))) * fib(k/2);
            }
        }
    }
}
