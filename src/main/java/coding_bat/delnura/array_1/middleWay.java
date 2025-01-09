package coding_bat.delnura.array_1;

public class middleWay {
    public int[] middleWay(int[] a, int[] b) {
        int[] result = new int[2];

        result[0] = a[1];  // Второй элемент массива a
        result[1] = b[1];  // Второй элемент массива b

        return result;
    }
}
