package coding_bat.dastanA.array_1;

public class MaxTriple {
    public int maxTriple(int[] nums) {
        int largestNum = 0;
        int firstNum = nums[0];
        int middleNum = nums[nums.length/2];
        int lastNum = nums[nums.length-1];
        if (nums.length == 1) {
            largestNum = nums[0];
        } else if (nums.length == 2) {
            largestNum = (firstNum >= lastNum) ? firstNum : lastNum;
        } else if (nums.length > 2) {
            if (firstNum >= middleNum && firstNum >= lastNum){
                largestNum = firstNum;
            } else if (middleNum >= firstNum && middleNum >= lastNum) {
                largestNum = middleNum;
            } else if (lastNum >= firstNum && lastNum >= middleNum) {
                largestNum = lastNum;
            }
        }
        return largestNum;
    }
}
