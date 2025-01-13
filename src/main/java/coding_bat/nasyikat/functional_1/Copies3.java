package coding_bat.nasyikat.functional_1;

import java.util.List;
import java.util.stream.Collectors;

public class Copies3 {
    public List<String> copies3(List<String> strings) {
        return strings.stream()
                .map(string -> string + string +string)
                .collect(Collectors.toList());
    }
}
