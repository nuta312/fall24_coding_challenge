package coding_bat.alia_warmup1.alia_logic_1;

public class CigarParty {
    public boolean cigarParty(int cigars, boolean isWeekend) {
        if (cigars>=40 && cigars<=60) {
            return  true;
        }else if (cigars>60){
            return isWeekend;
        }
        return false;
    }
}
