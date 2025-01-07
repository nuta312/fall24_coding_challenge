package coding_bat.nasyikat.string_1;

public class ConCat {
    public String conCat(String a, String b) {
        if (a.isEmpty() && b.isEmpty()){
            return "";
        }
        if (a.isEmpty()){
            return b;}
        if (b.isEmpty()) {
            return a;
        }
        char firstch = a.charAt(a.length()-1);
        char lastch = b.charAt(0);
        if (firstch == lastch){
            return a.concat(b.substring(1));
        } else {
            return a.concat(b);
        }
    }
}
