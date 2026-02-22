package coding_bat.nurdan.warm_up2;

public class doubleX {
    boolean doubleX(String str) {
        for(int i = 0; i < str.length() - 1; i++){
            if(str.charAt(i) == 'x'){
                return str.charAt(i+1) == 'x';
            }
        }
        return false;

    }

}
