package coding_bat.akylai.functional_1;

import java.util.ArrayList;
import java.util.List;

public class RightDigit {
    public List<Integer> rightDigit(List<Integer> nums) {
        List<Integer> number = new ArrayList<>();
        for (int num : nums) {
            number.add(num % 10);
        }
        return number;
    }
}
