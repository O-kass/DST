public class Unique {



    public static boolean isUniqueLoop(int[] arr, int start, int end) {

        for ( int i = start; i < end; i++ )

            for ( int j = i+1; j <= end; j++ )

                if ( arr[i] == arr[j] )

                    return false;     // the same  element at locations i and j

        // all elements are unique

        return true;

    }



    public static void main(String [] args) {

        // tests of the methods
        int[] arr = new int[]{0, 1, 2, 4, 55, 4, 2, 4 , 3, 33};
        int[] arr1 = new int[]{0, 1, 2, 4, 55, 5, 6, 7 , 8, 33};

        System.out.println(Unique.isUniqueLoop(arr, 0, 9));
        System.out.println(Unique.isUniqueLoop(arr1, 0, 9));

    }

}
