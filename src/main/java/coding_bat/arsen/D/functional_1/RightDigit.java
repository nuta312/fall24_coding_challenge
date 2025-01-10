package coding_bat.arsen.D.functional_1;

import java.util.List;
import java.util.stream.Collectors;

public class RightDigit {
    public static void main(String[] args) {
        System.out.println(rightDigit(List.of(11,1,33)));
        System.out.println(rightDigit(List.of(1132,5418,3435)));
    }
    public static List<Integer> rightDigit(List<Integer> nums) {
        return nums.stream()
                .map(num -> num % 10)
                .collect(Collectors.toList());
    }

}
