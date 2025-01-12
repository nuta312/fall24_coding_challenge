package coding_bat.rano.string2;

public class WordEnds {
    public String wordEnds(String str, String word) {
        String result = "";
        int i=0;
        int end = 0;
        int l =str.length();
        while( i < str.length()) {

            end = i + word.length();
            if( end > l) {
                end=l;
            }

            if(str.substring(i,end).equals(word)) {

                if(i>0) {
                    result = result + str.charAt(i-1);
                }

                if(i+word.length() <l) {
                    result = result + str.charAt(end);
                }
            }
            i++;
        }
        return result;
    }
}
