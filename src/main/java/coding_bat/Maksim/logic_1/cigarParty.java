package coding_bat.Maksim.logic_1;

public class cigarParty {
    public boolean cigarParty(int cigars, boolean isWeekend) {
        if (isWeekend) {
            return cigars >= 40;
        }
        return cigars >= 40 && cigars <= 60;
    }
}
