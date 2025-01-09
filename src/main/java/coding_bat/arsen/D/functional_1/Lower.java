package coding_bat.arsen.D.functional_1;

import java.util.List;
import java.util.stream.Collectors;

public class Lower {
    public static void main(String[] args) {
        System.out.println(lower(List.of("Arsen","Hello")));
        System.out.println(lower(List.of("ALINA")));
    }
    public static List<String> lower(List<String> strings) {
        return strings.stream()
                .map(String:: toLowerCase)
                .collect(Collectors.toList());
    }

}
