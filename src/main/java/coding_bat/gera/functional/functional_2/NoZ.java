package coding_bat.gera.functional.functional_2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class NoZ {
    public List<String> noZ(List<String> strings) {
        return strings.stream()
                .filter(str -> !str.toLowerCase().contains("z"))
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        NoZ noZ = new NoZ();

        List<String> str = Arrays.asList("Hello", "generationZ", "comzzz", "baby");
        List<String> result = noZ.noZ(str);
        System.out.println(result);
    }
}
