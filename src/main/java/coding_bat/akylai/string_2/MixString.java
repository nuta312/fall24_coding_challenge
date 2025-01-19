package coding_bat.akylai.string_2;

public class MixString {
    public String mixString(String a, String b) {
        StringBuilder mix = new StringBuilder();
        int minLength = Math.min(a.length(), b.length());
        for (int i = 0; i< minLength; i++){
            mix.append(a.charAt(i));
            mix.append(b.charAt(i));
        }
        if (a.length() > minLength){
            mix.append(a.substring(minLength));
        }
        if (b.length() > minLength){
            mix.append(b.substring(minLength));
        }
        return mix.toString();
    }

}
