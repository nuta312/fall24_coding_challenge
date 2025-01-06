package coding_bat.aiperiKasymova.warm_up1;

public class Front22 {
    public String front22(String str) {
        String firstTwoChars = str.length() < 2 ? str : str.substring(0, 2);
        // Формируем строку с добавленными символами спереди и сзади
        return firstTwoChars + str + firstTwoChars;
    }
}
