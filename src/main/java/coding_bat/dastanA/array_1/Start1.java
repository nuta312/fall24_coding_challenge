package coding_bat.dastanA.array_1;

public class Start1 {
    public int start1(int[] a, int[] b) {
        int num = 0;
        if (a.length > 0 && b.length >0) {
            if (a[0] == 1) {
                num ++;
            } if (b[0] ==1) {
                num++;
            } else {
                num = 0;
            }
        }
        if (a.length > 0 && a[0] == 1 && b.length < 1) {
            num++;
        }
        if (b.length > 0 && b[0] == 1 && a.length < 1) {
            num++;
        }
        return num;
    }
}
