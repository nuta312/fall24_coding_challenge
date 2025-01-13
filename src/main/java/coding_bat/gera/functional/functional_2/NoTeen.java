package coding_bat.gera.functional.functional_2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class NoTeen {
    public List<Integer> noTeen(List<Integer> nums) {
        return nums.stream()
                .filter(n -> n > 19 ||  n < 13)
                .collect(Collectors.toList());

    }

    public static void main(String[] args) {
        NoTeen noTeen = new NoTeen();
        List <Integer> nums = Arrays.asList(26,15,17,20,39,17,11);
        List<Integer> result = noTeen.noTeen(nums);
        System.out.println(result);
    }

}
