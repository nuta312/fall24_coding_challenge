package coding_bat.arsen.D.functional_2;

import java.util.List;
import java.util.stream.Collectors;

public class No9 {
    public static void main(String[] args) {
        System.out.println(no9(List.of(29,21,43,65)));
    }
    public static List<Integer> no9(List<Integer> nums) {
        return nums.stream()
                .filter(num -> num % 10 != 9)
                .collect(Collectors.toList());
    }

}
