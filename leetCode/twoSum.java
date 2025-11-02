import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;

public class twoSum {
    public static void main(String[] args) {
        LinkedHashMap<Integer,int[]>testcases= new LinkedHashMap<>();
        testcases.put(9,new int[]{2,7,11,15});
        testcases.put(5, new int[]{4,3, 2});
        testcases.put(6, new int[]{3, 3});

        for(int target: testcases.keySet()){
            int[] res =twoSum(testcases.get(target),target);
            System.err.println(Arrays.toString(res));
        }
        
    }
    public static int[] twoSum(int[] nums, int target) {

        HashMap<Integer,Integer> store=new HashMap<>();
        int l=nums.length;
        for(int i=0;i<l;i++){
            int num=nums[i];
            int diff=target-num;

            if(store.containsKey(diff)){
                return new int[] {store.get(diff),i};
            }
            store.put(num,i);
        }
        return new int[] {};
    }
}
/*Example 1:

Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
Example 2:

Input: nums = [3,2,4], target = 6
Output: [1,2]
Example 3:

Input: nums = [3,3], target = 6
Output: [0,1] */