package coding_bat.arsen.D.functional_2;

import java.util.List;
import java.util.stream.Collectors;

public class No34 {
    public static void main(String[] args) {
        System.out.println(no34(List.of("arsen")));
        System.out.println(no34(List.of("ars")));
    }
    public static List<String> no34(List<String> strings) {
        return strings.stream()
                .filter(str -> str.length () != 4 && str.length () != 3)
                .collect(Collectors.toList());
    }

}
