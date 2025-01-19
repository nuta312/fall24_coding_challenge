package coding_bat.Murat.Logic1;

public class CigarParty {
    public boolean cigarParty(int cigars, boolean isWeekend) {
        if (isWeekend == false && cigars >= 40 && cigars <= 60) return true;
        else if (isWeekend == true && cigars >= 40) return true;
        return false;
    }
}