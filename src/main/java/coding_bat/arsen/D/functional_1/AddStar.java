package coding_bat.arsen.D.functional_1;

import java.util.List;
import java.util.stream.Collectors;

public class AddStar {
    public static void main(String[] args) {
        System.out.println(addStar(List.of("a","cor")));
        System.out.println(addStar(List.of("b","cat")));
        System.out.println(addStar(List.of()));
    }
    public static List<String> addStar(List<String> strings) {
        return strings.stream()
                .map(str -> str + "*")
                .collect(Collectors.toList());
    }
}
