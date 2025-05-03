import javax.lang.model.element.Element;
import java.util.ArrayList;

public class ReverseArray {


    public  void reverseArray(ArrayList<Integer> inputArray){
        int j = inputArray.size() - 1;
        int i = 0;
        while(i < j){
            int end = inputArray.get(j);
            int start = inputArray.get(i);
            inputArray.set(i, end);
            inputArray.set(j, start);
            i++;
            j--;
        }
        System.out.println(inputArray);
    }

    public static void main(String args[]){
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(0);
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        arr.add(5);

        ReverseArray Hello = new ReverseArray();
        Hello.reverseArray(arr);

    }
}
