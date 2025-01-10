package coding_bat.arsen.D.functional_2;

import java.util.List;
import java.util.stream.Collectors;

public class NoNeg {
    public static void main(String[] args) {
        System.out.println(noNeg(List.of(-1,5,9,-6,-8)));
    }
    public static List<Integer> noNeg(List<Integer> nums) {
        return nums.stream()
                .filter(num -> num >= 0)
                .collect(Collectors.toList());
    }

}
