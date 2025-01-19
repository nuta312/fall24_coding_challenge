package coding_bat.gulasal.warm_up1;

public class Front3 {
    public String front3(String str) {
    if (str.length() <= 2) {
        return str.concat(str).concat(str);
    } else {
        return str.substring(0,3).concat(str.substring(0,3)).concat(str.substring(0,3));
    }
}
}
