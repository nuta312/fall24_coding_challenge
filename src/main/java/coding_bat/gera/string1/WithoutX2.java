package coding_bat.gera.string1;

public class WithoutX2 {
    public String withoutX2(String str) {
        StringBuilder sb = new StringBuilder(str);
        if (str.length() <= 1){
            return "";
        }

        if (sb.length() == 1 || sb.length() == 0){
            return sb.toString();
        }
        if ( sb.charAt(0) == 'x' && sb.charAt(1) == 'x' ){
            sb.delete(0,2);
            return sb.toString();
        }
        if (sb.charAt(0) == 'x'){
            sb.deleteCharAt(0);
            return sb.toString();
        }
        if (sb.charAt(1) == 'x'){
            sb.deleteCharAt(1);
            return sb.toString();
        }
        return str;

    }
}
