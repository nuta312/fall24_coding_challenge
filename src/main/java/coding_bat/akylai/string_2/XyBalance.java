package coding_bat.akylai.string_2;

public class XyBalance {
    public boolean xyBalance(String str) {
        boolean y = false;
        for(int i = str.length() - 1; i >= 0; i--) {
            if(str.charAt(i) == 'y'){
                y = true;}
            if(str.charAt(i) == 'x' && !y){
                return false;}
        }
        return true;
    }
}
