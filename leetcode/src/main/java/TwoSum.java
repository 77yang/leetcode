import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * @Author: yangqi
 * @Date: 10/26/2018 4:10 PM
 */
public class TwoSum {

    public int[] twoSum(int[] nums, int target) {
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


    public static void main(String[] args) {

        int[] arr = new TwoSum().twoSum(new int[]{1, 2, 43, 543, 56546, 54, 43, 243}, 97);
        System.out.println(String.format("%s,%s",arr[0],arr[1]));

    }


}
