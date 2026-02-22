package coding_bat.gera.functional.functional_2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class No34 {
    public List<String> no34(List<String> strings) {
        return strings.stream()
                .filter(str -> !(str.length() == 3 || str.length() == 4))
                .collect(Collectors.toList());

    }

    public static void main(String[] args) {
        No34 no34 = new No34();

        List<String> str = Arrays.asList("Hello", "ccc", "dddd", "common", "si");
        List<String> result  = no34.no34(str);
        System.out.println(result);
    }
}
