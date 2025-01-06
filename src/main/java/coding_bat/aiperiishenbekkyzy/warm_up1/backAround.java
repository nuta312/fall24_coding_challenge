package coding_bat.aiperiishenbekkyzy.warm_up1;

public class backAround {
    public String backAround(String str) {

        String back = str.substring(str.length() - 1, str.length());
        return back + str + back;
    }
}
