package coding_bat.dastanA.warm_up1;

public class DelDel {
    public String delDel(String str) {
        if(str.length() > 3)
            if(str.substring(1,4).equals("del"))
                return str.replace(str.substring(1,4),"");
        return str;
    }
}
