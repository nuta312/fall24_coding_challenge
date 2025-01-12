package coding_bat.akylai.logic_1;

public class AnswerCell {
    public boolean answerCell(boolean isMorning, boolean isMom, boolean isAsleep) {
        if (!isMorning && isMom && !isAsleep) {
            return true;
        }
        if(isMorning && isMom && !isAsleep){
            return true;
        } else {
            return false;
        }
    }
}
