package coding_bat.gera.functional.functional_2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Square56 {
    public List<Integer> square56(List<Integer> nums) {


        return nums.stream()
                .map(n -> n * n)
                .map(n -> n + 10)
                .filter(n -> n % 10 != 5 && n % 10 != 6)
                .collect(Collectors.toList());

    }

    public static void main(String[] args) {
        Square56 square56 = new Square56();
        List<Integer> nums = Arrays.asList(44, 3, 2, 11);
        List<Integer> result = square56.square56(nums);
        System.out.println(result);
    }

}
