package coding_bat.gera.functional.functional_2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class No9 {
    public List<Integer> no9(List<Integer> nums) {
        return nums.stream()
                .filter(n -> n % 10 != 9)
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        No9 no9 = new No9();

        List<Integer> nums = Arrays.asList(19, 29, 28, 7);
        List<Integer> result = no9.no9(nums);
        System.out.println(result);
    }

}
