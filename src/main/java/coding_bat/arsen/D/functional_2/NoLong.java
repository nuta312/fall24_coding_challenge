package coding_bat.arsen.D.functional_2;

import java.util.List;
import java.util.stream.Collectors;

public class NoLong {
    public static void main(String[] args) {
        System.out.println(noLong(List.of("ars","arsen")));
    }
    public static List<String> noLong(List<String> strings) {
        return strings.stream()
                .filter(str -> str.length () < 4)
                .collect(Collectors.toList());
    }

}
