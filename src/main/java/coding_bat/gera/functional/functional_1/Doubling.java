package coding_bat.gera.functional.functional_1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Doubling {
    public List<Integer> doubling(List<Integer> nums) {
        return nums.stream()
                .map(n -> n * 2)
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        Doubling d = new Doubling();
        List<Integer> numbers = Arrays.asList(2, 3, 6, 7);

        List<Integer> doubling = d.doubling(numbers);
        System.out.println(doubling);


    }
}





