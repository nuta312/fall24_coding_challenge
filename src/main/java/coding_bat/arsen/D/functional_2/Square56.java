package coding_bat.arsen.D.functional_2;

import java.util.List;
import java.util.stream.Collectors;

public class Square56 {
    public static void main(String[] args) {
        System.out.println(square56(List.of(3,1,4)));
    }
    public static List<Integer> square56(List<Integer> nums) {
        return nums.stream()
                .map(num -> (num * num) + 10)
                .filter(num -> num % 10 != 5 && num % 10 != 6)
                .collect(Collectors.toList());
    }

}
