package coding_bat.delnura.Logic_1;

public class CaughtSpeedingTest {
    public int caughtSpeeding(int speed, boolean isBirthday) {
        int sLimit = 60;
        int bLimit = 80;

        if (isBirthday) {
            sLimit += 5;
            bLimit += 5;
        }

        if (speed <= sLimit) {
            return 0;
        }
        else if (speed <= bLimit) {
            return 1;
        }

        return 2;
    }
}
