package coding_bat.begayim.string2;

public class MixString {
    public String mixString(String a, String b) {
        StringBuilder result = new StringBuilder();
        int i = 0;
        while(i < a.length() && i < b.length()){
            result.append(a.charAt(i));
            result.append(b.charAt(i));
            i++;
        }
        while(i < a.length()){
            result.append(a.charAt(i));
            i++;
        }
        while(i < b.length()){
            result.append(b.charAt(i));
            i++;
        }
        return result.toString();
    }
}
