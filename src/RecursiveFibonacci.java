class RecursiveFibonacci {
    public static class Pair<K, V> {
        K key;
        V value;

        public Pair(K k, V v) {
            key = k;
            value = v;
        }
        public Pair() {
            this.key = null;
            this.value = null;
        }

        public void set(K k, V v) {
            key = k;
            value = v;
        }
        public K getKey() { return key; }
        public V getValue() { return value; }
        public String toString() {
            return "[" + getKey() + ", " + getValue() + "]";
        }

        public static <T> void reverse(Pair<T,T> p) {
            p.set(p.getValue(), p.getKey());
        }

        @Override
        public boolean equals(Object obj){
            if(obj == null){
               return false;
            }
            else if(this.getClass() == obj.getClass()){
                Pair<K,V> x = (Pair<K,V>) obj;
                if(x.getKey().equals(this.getKey()) && x.getValue().equals(this.getValue())){
                    return true;
                }
                else{
                    return false;
                }

            }
            else{
                return false;
            }

        }

        public static void main(String args[]){
            Pair<String, Integer> pairA = new Pair<String, Integer>("abc", 1);
            Pair<String, Integer> pairAA = pairA;
            Pair<String, Integer> pairB = new Pair<String, Integer>("abc", 2);
            Pair<String, Integer> pairC = new Pair<String, Integer>("xyz", 1);
            Pair<String, Integer> pairD = new Pair<String, Integer>("abc", 1);
            Pair<String, Integer> pairE = new Pair<String, Integer>();
            Pair<String, Integer> pairF = new Pair<String, Integer>(null, 1);
            Pair<String, Integer> pairG = null;


            System.out.println( pairA.equals(pairAA) );
            System.out.println( pairA.equals(pairB) );
            System.out.println( pairA.equals(pairC) );
            System.out.println( pairA.equals(pairD) );
            System.out.println( pairA.equals(null) );
            System.out.println( pairA.equals(new Integer(5)) );
            System.out.println( pairE.equals(pairA) );
            System.out.println( pairF.equals(pairA) );
            System.out.println( pairA.equals(pairG) );

        }

    }


    public static int binaryFib(int n) {
        if (n <= 1) return n;
        else return binaryFib(n-1) + binaryFib(n-2);
    }

    public Pair<Integer,Integer> linearFib(int n) {
        Pair<Integer, Integer> F = new Pair<>();
        if (n <= 1) {
            F.set(n, 0);
            return F;
        } else {
            F = linearFib(n - 1);
            int Fn = F.getKey() + F.getValue();
            F.set(Fn, F.getKey());
            return F;
        }
    }


        //        if (n <= 1) {
//            return new int[] {n,0};
//        }
//        else {
//            int[] F = linearFib(n-1);
//            int Fn = F[0] + F[1];
//            F[1] = F[0];
//            F[0] = Fn;
//            return F;
//        }

//    public static void main(String args[])
//    {
//        System.out.println("fib(8) = " + binaryFib(8));
//        System.out.println("fib(8) = " + linearFib(8).getKey());
//
//        System.out.println("fib(" + args[0] + ") = " + binaryFib(Integer.parseInt(args[0])));
//        System.out.println("fib(" + args[0] + ") = " + linearFib(Integer.parseInt(args[0]))[0]);
//    }
}
