package coding_bat.gera.functional.functional_1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Math1 {

    public List<Integer> math1(List<Integer> nums) {
        return nums.stream()
                .map(n -> (n + 1) * 10)
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        Math1 math = new Math1();

        List<Integer> nums = Arrays.asList(2, 7, 9);
        List<Integer> answ = math.math1(nums);

        System.out.println(answ);
    }
}
