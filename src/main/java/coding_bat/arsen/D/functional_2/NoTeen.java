package coding_bat.arsen.D.functional_2;

import java.util.List;
import java.util.stream.Collectors;

public class NoTeen {
    public static void main(String[] args) {
        System.out.println(noTeen(List.of(12,14,19,1,23)));
    }
    public static List<Integer> noTeen(List<Integer> nums) {
        return nums.stream()
                .filter(num -> num < 13 | num > 19)
                .collect(Collectors.toList());
    }

}
