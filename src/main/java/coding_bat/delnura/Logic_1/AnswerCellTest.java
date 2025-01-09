package coding_bat.delnura.Logic_1;

public class AnswerCellTest {
    public boolean answerCell(boolean isMorning, boolean isMom, boolean isAsleep) {

        if(isAsleep) return false;
        if(isMorning && !isMom) return false;

        return true;
    }
}
