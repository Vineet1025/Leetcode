import java.util.Arrays;
import java.util.Comparator;

class Solution {
    public int[] sortJumbled(int[] mapping, int[] nums) {
        Integer[] mappedNums = new Integer[nums.length];
        
        for (int i = 0; i < nums.length; i++) {
            mappedNums[i] = nums[i];
        }
        
        Arrays.sort(mappedNums, new Comparator<Integer>() {
            @Override
            public int compare(Integer a, Integer b) {
                return mapValue(a, mapping) - mapValue(b, mapping);
            }
        });
        
        for (int i = 0; i < nums.length; i++) {
            nums[i] = mappedNums[i];
        }
        
        return nums;
    }
    
    private int mapValue(int num, int[] mapping) {
        StringBuilder sb = new StringBuilder();
        for (char c : String.valueOf(num).toCharArray()) {
            sb.append(mapping[c - '0']);
        }
        return Integer.parseInt(sb.toString());
    }
}
