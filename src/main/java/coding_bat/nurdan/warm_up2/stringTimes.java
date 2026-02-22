package coding_bat.nurdan.warm_up2;

public class stringTimes {
    public String stringTimes(String str, int n) {
        String result = "";
        for (int i = 0; i < n; i++) {
            result += str;  // Добавляем строку к результату
        }
        return result;
    }
}
