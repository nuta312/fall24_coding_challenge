package coding_bat.aidin.warm_up1;

public class loneTeen {
    public boolean loneTeen(int a, int b) {

        if ((a >=13 && a <= 19) && (b < 13 || b > 19))

            return true;

        else if ((b >=13 && b <= 19) && (a < 13 || a > 19))

            return true;

        else

            return false;

    }
}
