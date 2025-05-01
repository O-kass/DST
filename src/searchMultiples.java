
public class searchMultiples{

    /** The array Numbers should contain positive integers.
     * The method returns true if the array contains at any location
     * greater than index a number that is 6 times the first number
     * in the array (number Numbers[0]), and false otherwise */
    public static boolean firstElementMultiple(int []Numbers, int index) {
        if (index+1 >= Numbers.length) {
            return false;
        }
        else {
            if(Numbers[index + 1] == 6*Numbers[0]){
                return true;
            }
            else{
                return firstElementMultiple(Numbers, index+1);
            }
        }
    }

    /** The array Numbers should contain positive integers.
     * The method should return true if the array contains
     * at any location greater than, or equal to, index
     * a number j followed immediately by a number equal to 6 times j. */
    public static boolean adjacentElementMultiple(int []Numbers, int index) {
        if(index+1 >= Numbers.length){
            return false; //to be completed by replacing this code
        }
        else{
            if(6*Numbers[index] == Numbers[index + 1]){
                return true;
            }
            else{
                return adjacentElementMultiple(Numbers, index + 1);
            }
        }
    }

    public static void main(String[] args) {
        int []Numbers1 = {1,2,3,4,5,6};
        int []Numbers2 = {3,2,4,5,6};
        int []Numbers3 = {3,2,1,6,18};
        int []Numbers4 = {3};
        int []Numbers5 = {3,2,12};
        int []Numbers6 = {0,0};
        int []Numbers7 = {1,2,3,18,20,21};

        int index=0;

        System.out.println("Does the array Numbers1 contain "+Numbers1[0]*6+" after the 0-th element?: "+firstElementMultiple(Numbers1,index));
        System.out.println("Does the array Numbers2 contain "+Numbers2[0]*6+" after the 0-th element?: "+firstElementMultiple(Numbers2,index));
        System.out.println("Does the array Numbers3 contain "+Numbers3[0]*6+" after the 0-th element?: "+firstElementMultiple(Numbers3,index));
        System.out.println("Does the array Numbers4 contain "+Numbers4[0]*6+" after the 0-th element?: "+firstElementMultiple(Numbers4,index));
        System.out.println("Does the array Numbers5 contain "+Numbers5[0]*6+" after the 0-th element?: "+firstElementMultiple(Numbers5,index));
        System.out.println("Does the array Numbers6 contain "+Numbers6[0]*6+" after the 0-th element?: "+firstElementMultiple(Numbers6,index));
        System.out.println("Does the array Numbers7 contain "+Numbers7[0]*6+" after the 0-th element?: "+firstElementMultiple(Numbers7,index));

        System.out.println("Does the array Numbers1 contain a number j immediately followed by a number 6*j? "+adjacentElementMultiple(Numbers1,index));
        System.out.println("Does the array Numbers2 contain a number j immediately followed by a number 6*j? "+adjacentElementMultiple(Numbers2,index));
        System.out.println("Does the array Numbers3 contain a number j immediately followed by a number 6*j? "+adjacentElementMultiple(Numbers3,index));
        System.out.println("Does the array Numbers4 contain a number j immediately followed by a number 6*j? "+adjacentElementMultiple(Numbers4,index));
        System.out.println("Does the array Numbers5 contain a number j immediately followed by a number 6*j? "+adjacentElementMultiple(Numbers5,index));
        System.out.println("Does the array Numbers6 contain a number j immediately followed by a number 6*j? "+adjacentElementMultiple(Numbers6,index));
        System.out.println("Does the array Numbers7 contain a number j immediately followed by a number 6*j? "+adjacentElementMultiple(Numbers7,index));

    }
}