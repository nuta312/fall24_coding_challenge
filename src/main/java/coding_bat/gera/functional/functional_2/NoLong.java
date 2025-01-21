package coding_bat.gera.functional.functional_2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class NoLong {
    public List<String> noLong(List<String> strings) {
        return  strings.stream()
                .filter(str -> str.length() < 4)
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        NoLong noLong = new NoLong();
        List<String> str = Arrays.asList("hello", "Piter", "no","yes","lol");
        List<String> result = noLong.noLong(str);
        System.out.println(result);
    }
}
