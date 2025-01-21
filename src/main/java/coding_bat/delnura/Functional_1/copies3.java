package coding_bat.delnura.Functional_1;

import java.util.List;
import java.util.stream.Collectors;

public class copies3 {
    public List<String> copies3(List<String> strings) {
        return strings.stream()
                .map(s -> s + s + s)  // объединяем строку 3 раза
                .collect(Collectors.toList());
    }
}
