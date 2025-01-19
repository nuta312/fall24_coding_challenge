package coding_bat.arsen.D.functional_1;

import java.util.List;
import java.util.stream.Collectors;

public class Doubling {
    public static void main(String[] args) {
        System.out.println(doubling(List.of(3,1,4)));
        System.out.println(doubling(List.of(3,6,8,-1)));
        System.out.println(doubling(List.of()));
    }
    public static List<Integer> doubling(List<Integer> nums) {
        return nums.stream()
                .map(num -> num * 2)
                .collect(Collectors.toList());
    }
}
