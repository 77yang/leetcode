import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * @Author: yangqi
 * @Date: 10/26/2018 4:10 PM
 */
public class TwoSum {
    public int[] twoSum1(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }

        throw new RuntimeException("no result return");
    }




    public int[] twoSum2(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap(nums.length);

        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }


        for (int i = 0; i < nums.length; i++) {
            int temp = target - nums[i];
            Integer index = map.get(temp);
            if (map.containsKey(temp)&& !Objects.equals(index,i)) {
                return new int[]{i,index};
            }
        }

        throw new RuntimeException("no result return");
    }


    public int[] twoSum3(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap(nums.length);

        for (int i = 0; i < nums.length; i++) {
            int temp = target - nums[i];
            if (map.containsKey(temp)) {
                return new int[]{map.get(temp),i};
            }
            map.put(nums[i], i);
        }
        throw new RuntimeException("no result return");
    }


    public static void main(String[] args) {
        System.out.println(print(new TwoSum().twoSum1(new int[]{1, 2, 43, 543, 56546, 54, 43, 243}, 97)));
        System.out.println(print(new TwoSum().twoSum2(new int[]{1, 2, 43, 543, 56546, 54, 43, 243}, 97)));
        System.out.println(print(new TwoSum().twoSum3(new int[]{1, 2, 43, 543, 56546, 54, 43, 243}, 97)));
    }

    private static String print(int[] arr) {
        return String.format("%s,%s",arr[0],arr[1]);
    }


}
