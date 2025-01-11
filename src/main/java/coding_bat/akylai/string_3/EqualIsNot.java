package coding_bat.akylai.string_3;

public class EqualIsNot {
    public boolean equalIsNot(String str) {
        int countIs = 0;
        int countNot = 0;
        for (int i = 0; i < str.length()-1; i++){
            if (str.substring(i, i+2).equals("is")){
                countIs++;
            } else if(i+3 <= str.length() && str.substring(i, i+3).equals("not")){
                countNot++;
            }
        }
        return  countIs == countNot;
    }
}
