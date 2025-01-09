package coding_bat.mirat.warm_up2;

public class noTriples {
    public boolean noTriples(int[] nums) {
        for (int i = 0; i < nums.length - 2; i++) {
            // Check if the current element and the next two elements are the same
            if (nums[i] == nums[i + 1] && nums[i] == nums[i + 2]) {
                return false; // A triple is found
            }
        }
        return true; // No triples found
    }

}
