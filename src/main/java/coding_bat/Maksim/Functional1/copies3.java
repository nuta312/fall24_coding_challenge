package coding_bat.Maksim.Functional1;

import java.util.*;
import java.util.stream.Collectors;


public class copies3 {
    public static List<String> copies3(List<String> strings) {
        return strings.stream()
                .map(s -> s.repeat(3))
                .collect(Collectors.toList());
    }
}
