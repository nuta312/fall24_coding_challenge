package coding_bat.gera.functional.functional_2;


import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class NoNeg {
    public List<Integer> noNeg(List<Integer> nums) {
        return nums.stream()
                .filter(n -> n > 0 )
                .collect(Collectors.toList());

    }

    public static void main(String[] args) {
        NoNeg no = new NoNeg();
        List<Integer> nums = Arrays.asList(-2, -5, 9, 8);
        List<Integer> answ = no.noNeg(nums);
        System.out.println(answ);
    }
}
