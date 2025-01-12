package coding_bat.Maksim.Functional1;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


public class addStar {


    public List<String> addStar(List<String> strings) {
        return strings.stream()
                .map(s -> s + "*")
                .collect(Collectors.toList());
    }
    public List<String> addStar1(List<String> strings) {
        List<String> result = new ArrayList<>();
        strings.forEach(s -> result.add(s + "*"));
        return result;
    }
}
