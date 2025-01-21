package coding_bat.gera.functional.functional_2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Two2 {
    public List<Integer> two2(List<Integer> nums) {

        return nums.stream()
                .map(n -> n * 2)
                .filter(n -> n % 10 != 2)
                .collect(Collectors.toList());


    }

    public static void main(String[] args) {
        Two2 two2 = new Two2();
        List<Integer> nums = Arrays.asList(12, 2, 6, 11);
        List<Integer> result = two2.two2(nums);
        System.out.println(result);
    }
}
