package coding_bat.rano.string2;

public class ZipZap {
    public String zipZap(String str) {
        String result = "";
        if(str.length() <3) return str;
        for(int i=0; i<str.length(); i++ ) {
            if(str.charAt(i) == 'z' && str.charAt(i+2) == 'p') {
                result = result + "zp";
                i += 2;
            }
            else {
                result = result + str.charAt(i);
            }
        }
        return result;
    }
}
