package coding_bat.gera.functional.functional_1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Copies3 {

    public List<String> copies3(List<String> strings) {
        return strings.stream()
                .map(str -> str.repeat(3))
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        Copies3 copy = new Copies3();
        List<String> str2 = Arrays.asList("java", "hey", "2");
        List<String> ans = copy.copies3(str2);

        System.out.println(ans);
    }

}
