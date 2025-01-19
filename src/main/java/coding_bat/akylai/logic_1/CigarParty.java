package coding_bat.akylai.logic_1;

public class CigarParty {
    public boolean cigarParty(int cigars, boolean isWeekend) {
        if (cigars < 40){
            return false;
        } else if (isWeekend){
            return true;
        } else if(cigars <= 60){
            return true;
        } else {
            return false;
        }
    }
}
