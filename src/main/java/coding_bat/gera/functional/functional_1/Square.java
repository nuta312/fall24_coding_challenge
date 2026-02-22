package coding_bat.gera.functional.functional_1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Square {
    public List<Integer> square(List<Integer> nums) {
        return nums.stream()
                .map(n -> n * n)
                .collect(Collectors.toList());
    }


    public static void main(String[] args) {
        Square sq = new Square();

        List<Integer> nums = Arrays.asList(2, 10, 7, 8);
        List<Integer> sq1 = sq.square(nums);
        System.out.println(sq1);


    }
}
