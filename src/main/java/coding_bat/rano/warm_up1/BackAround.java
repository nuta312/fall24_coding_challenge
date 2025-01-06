package coding_bat.rano.warm_up1;

public class BackAround {
    public String backAround(String str) {
        char temp = str.charAt(str.length()-1);
        return temp+str+temp;
    }
}
