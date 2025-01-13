package coding_bat.arsen.D.functional_1;

import java.util.List;
import java.util.stream.Collectors;

public class MoreY {
    public static void main(String[] args) {
        System.out.println(moreY(List.of("arsen","is")));
        System.out.println(moreY(List.of("mon")));
        System.out.println(moreY(List.of()));
    }
    public static List<String> moreY(List<String> strings) {
        return strings.stream()
                .map(str -> "y" + str + "y")
                .collect(Collectors.toList());

    }
}
