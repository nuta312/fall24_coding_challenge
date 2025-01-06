package coding_bat.dastank.warm_up1;

public class BackAround {
    public String backAround(String str) {
        char ch= str.charAt(str.length()-1);
        return ch+str+ch;
    }
}
