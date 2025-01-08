package coding_bat.gera.string1;

public class ConCat {
    public String conCat(String a, String b) {
        if (a.length() > 0 && b.length() > 0 && a.endsWith(b.substring(0,1).toString())){
            String result = a.concat(b.substring(1));
            return result;
        }
        else if (a.length() == 0 || b.length() == 0){
            return a.concat(b);
        }
        else {
            return  a.concat(b);
        }
    }
}
