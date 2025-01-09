package coding_bat.Maksim.array1;

public class start1 {
    public int start1(int[] a, int[] b) {

        int count = 0;

        // Проверяем, начинается ли массив a с 1
        if (a.length > 0 && a[0] == 1) {
            count++;
        }

        // Проверяем, начинается ли массив b с 1
        if (b.length > 0 && b[0] == 1) {
            count++;
        }

        return count;
    }

}
