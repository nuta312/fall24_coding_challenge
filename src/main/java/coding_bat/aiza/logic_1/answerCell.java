package coding_bat.aiza.logic_1;

public class answerCell {
    public boolean answerCell(boolean isMorning, boolean isMom, boolean isAsleep) {
        if (isAsleep) {
            return false;
        }
        if (isMorning && isMom) {
            return true;
        }
        return !isMorning || isMom;
    }
}
