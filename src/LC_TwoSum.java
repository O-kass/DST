import java.util.*;
public class LC_TwoSum {
    class Solution {
        public int[] twoSum(int[] nums, int target) {
            HashSet<Integer> set = new HashSet<>();
            int[] output = new int[2];
            boolean checker = false;
            for(int num = 0 ; num < nums.length; num++){
                int desired = target - nums[num];
                if(set.contains(desired)){
                    for(int j = 0; j < nums.length; j++){
                        if(nums[j] == desired){
                            desired = j;
                            break;
                        }
                    }
                    output[0] = desired;
                    output[1]= num;
                    checker = true;
                }
                set.add(nums[num]);
            }
            return output;

        }
    }

}
