package coding_bat.nasyikat.functional_1;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class AddStar2 {
    public List<String> addStar(List<String> strings) {
        return strings.stream()
                .map(string -> string + "*")
                .collect(Collectors.toList());
    }
}
