package coding_bat.arsen.D.functional_2;

import java.util.List;
import java.util.stream.Collectors;

public class NoYY {
    public static void main(String[] args) {
        System.out.println(noYY(List.of("arsen")));
        System.out.println(noYY(List.of("arseny")));
        System.out.println(noYY(List.of("arsenyy")));
    }
    public static List<String> noYY(List<String> strings) {
        return strings.stream()
                .map(str -> str + "y")
                .filter(str -> !str.contains ("yy"))
                .collect(Collectors.toList());
    }
}
