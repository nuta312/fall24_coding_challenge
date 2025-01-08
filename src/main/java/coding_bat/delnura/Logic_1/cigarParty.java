package coding_bat.delnura.Logic_1;

public class cigarParty {
    public boolean cigarParty(int cigars, boolean isWeekend) {
        if(isWeekend && cigars >= 40) {
            return true;
        }
        else if(cigars >=40 && cigars <= 60) {
            return true;
        }
        else {
            return false;
        }
    }
}
