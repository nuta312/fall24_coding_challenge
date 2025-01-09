package coding_bat.delnura.warm_up1;

public class front22 {
    public String front22(String str) {
        String last = str.length()<2 ? str : str.substring(0,2);
        return last + str +last ;
    }

}
