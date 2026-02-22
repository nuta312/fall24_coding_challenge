package coding_bat.gera.functional.functional_1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class NoX {

    public List<String> noX(List<String> strings) {
        return strings.stream()
                .map(str-> str.replaceAll("x", ""))
                .collect(Collectors.toList());
    }
    public static void main(String[] args) {
        NoX n = new NoX();

        List<String> str = Arrays.asList("xxx", "wx","next");
        List<String> answ = n.noX(str);

        System.out.println(answ);
    }

}
