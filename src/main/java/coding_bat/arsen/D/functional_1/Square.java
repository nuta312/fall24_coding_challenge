package coding_bat.arsen.D.functional_1;

import java.util.List;
import java.util.stream.Collectors;

public class Square {
    public static void main(String[] args) {
        System.out.println(square(List.of(1,2,3)));
        System.out.println(square(List.of(1,4,-7,-9)));
        System.out.println(square(List.of()));

    }
    public static List<Integer> square(List<Integer> nums) {
        return nums.stream()
                .map(num -> num * num)
                .collect(Collectors.toList());
    }
}
