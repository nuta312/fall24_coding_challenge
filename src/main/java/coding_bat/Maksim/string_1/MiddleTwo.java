package coding_bat.Maksim.string_1;

public class MiddleTwo {
    public String middleTwo(String str) {
        int mid = str.length() / 2;  // Находим индекс середины строки
        return str.substring(mid - 1, mid + 1);
    }
}
