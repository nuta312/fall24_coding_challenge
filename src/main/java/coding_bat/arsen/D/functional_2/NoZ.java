package coding_bat.arsen.D.functional_2;

import java.util.List;
import java.util.stream.Collectors;

public class NoZ {
    public static void main(String[] args) {
        System.out.println(noZ(List.of("Arszen","Alina")));
    }
    public static List<String> noZ(List<String> strings) {
        return strings.stream()
                .filter(str -> !str.contains("z"))
                .collect(Collectors.toList());
    }

}
