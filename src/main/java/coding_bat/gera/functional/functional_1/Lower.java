package coding_bat.gera.functional.functional_1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Lower {

    public List<String> lower(List<String> strings) {
        return  strings.stream()
                .map(String::toLowerCase)
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        Lower low = new Lower();

        List<String> str = Arrays.asList("HELLO", "World", "Nice");
        List<String > answ = low.lower(str);

        System.out.println(answ);
    }

}
