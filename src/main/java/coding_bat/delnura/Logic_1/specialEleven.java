package coding_bat.delnura.Logic_1;

public class specialEleven {
    public boolean specialEleven(int n) {
        if (n % 11 == 0 || n % 11 == 1) {
            return true;
        }

        return false;
    }
}
