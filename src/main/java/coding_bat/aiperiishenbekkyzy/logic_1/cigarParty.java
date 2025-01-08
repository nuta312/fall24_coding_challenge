package coding_bat.aiperiishenbekkyzy.logic_1;

public class cigarParty {
    public boolean cigarParty(int cigars, boolean isWeekend) {
        if (isWeekend) {
            return cigars >= 40;  // No upper limit on the weekend
        } else {
            return cigars >= 40 && cigars <= 60;  // Between 40 and 60 on weekdays
        }
    }
}
