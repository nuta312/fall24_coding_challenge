package coding_bat.gera.functional.functional_2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class NoYY {

    public List<String> noYY(List<String> strings) {
        return strings.stream()
                .map(str -> str + "y")
                .filter(str -> !str.contains("yy"))
                .collect(Collectors.toList());

    }

    public static void main(String[] args) {
        NoYY noYY = new NoYY();
        List<String> str = Arrays.asList("cc" , "dy", "he", "ly");
        List<String> result = noYY.noYY(str);
        System.out.println(result);
    }

}
