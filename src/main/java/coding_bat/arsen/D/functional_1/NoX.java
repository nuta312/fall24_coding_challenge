package coding_bat.arsen.D.functional_1;

import java.util.List;
import java.util.stream.Collectors;

public class NoX {
    public static void main(String[] args) {
        System.out.println(noX(List.of("arsenx","ars")));
        System.out.println(noX(List.of("case","loxwxerx")));
    }
    public static List<String> noX(List<String> strings) {
        return strings.stream()
                .map(str -> str.replaceAll("x", ""))
                .collect(Collectors.toList());
    }

}
