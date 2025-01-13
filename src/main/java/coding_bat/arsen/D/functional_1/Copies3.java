package coding_bat.arsen.D.functional_1;

import java.util.List;
import java.util.stream.Collectors;

public class Copies3 {
    public static void main(String[] args) {
        System.out.println(copies3(List.of("ar","pr")));
        System.out.println(copies3(List.of("alina","arsen")));
    }
    public static List<String> copies3(List<String> strings) {
        return strings.stream().
                map(str -> str + str + str)
                .collect(Collectors.toList());
    }

}
