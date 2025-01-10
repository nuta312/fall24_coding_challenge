package coding_bat.arsen.D.functional_2;

import java.util.List;
import java.util.stream.Collectors;

public class Two2 {
    public static void main(String[] args) {
        System.out.println(two2(List.of(11,12,42,51)));
    }
    public static List<Integer> two2(List<Integer> nums) {
        return nums.stream()
                .map(num -> num * 2)
                .filter(num -> num % 10 != 2)
                .collect(Collectors.toList());
    }

}
