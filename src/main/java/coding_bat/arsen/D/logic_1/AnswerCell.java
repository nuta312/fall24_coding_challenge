package coding_bat.arsen.D.logic_1;

public class AnswerCell {
    public boolean answerCell(boolean isMorning, boolean isMom, boolean isAsleep) {
        if (isAsleep) {
            return false;
        }
        else if ( isMorning && !isMom) {
            return false;
        }else {
            return true;
        }
    }
}
