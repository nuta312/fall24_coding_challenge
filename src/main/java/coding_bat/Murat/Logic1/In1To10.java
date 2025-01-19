package coding_bat.Murat.Logic1;

public class In1To10 {
    public boolean in1To10(int n, boolean outsideMode) {
        if (outsideMode == false && (n >= 1 && n <= 10)) return true;
        else if (outsideMode == true && (n <= 1 || n >= 10)) return true;
        return false;
    }
}