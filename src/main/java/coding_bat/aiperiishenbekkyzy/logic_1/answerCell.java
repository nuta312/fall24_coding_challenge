package coding_bat.aiperiishenbekkyzy.logic_1;

public class answerCell {
    public boolean answerCell(boolean isMorning, boolean isMom, boolean isAsleep) {
        if (isAsleep)
            return false;
        if ((isMorning && isMom) || !isMorning)
            return true;
        else return false;

    }
}
