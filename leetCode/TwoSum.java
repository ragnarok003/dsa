import java.util.Arrays;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.List;

public class TwoSum {
    public static void main(String[] args) {
        
        List<TestCase> testcases = new ArrayList<>();

        testcases.add(new TestCase(9, new int[]{2, 7, 11, 15}));
        testcases.add(new TestCase(6, new int[]{3, 2, 4}));
        testcases.add(new TestCase(6, new int[]{3, 3}));

        
        for (TestCase t : testcases) {
            int[] res = twoSum(t.nums, t.target);
            System.out.println(Arrays.toString(res));
        }
    }

    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> store = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int diff = target - nums[i];

            if (store.containsKey(diff)) {
                return new int[]{store.get(diff), i};
            }
            store.put(nums[i], i);
        }
        return new int[]{};
    }
}


class TestCase {
    int target;
    int[] nums;

    TestCase(int target, int[] nums) {
        this.target = target;
        this.nums = nums;
    }
}
