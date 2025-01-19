package coding_bat.arsen.D.functional_1;

import java.util.List;
import java.util.stream.Collectors;

public class Math1 {
    public static void main(String[] args) {
        System.out.println(math1(List.of(1,2,3,4)));
        System.out.println(math1(List.of()));
    }
    public static List<Integer> math1(List<Integer> nums) {
        return nums.stream()
                .map(num -> (num + 1) * 10)
                .collect(Collectors.toList());
    }

}
