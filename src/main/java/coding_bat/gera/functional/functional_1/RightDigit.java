package coding_bat.gera.functional.functional_1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RightDigit {

    public List<Integer> rightDigit(List<Integer> nums) {
        return nums.stream()
                .map(n -> n % 10)
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        RightDigit right = new RightDigit();

        List<Integer> nums = Arrays.asList(2, 4, 20);
        List<Integer> answ = right.rightDigit(nums);

        System.out.println(answ);
    }
}
