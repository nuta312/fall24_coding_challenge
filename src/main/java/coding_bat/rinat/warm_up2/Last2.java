package coding_bat.rinat.warm_up2;

public class Last2 {
    public int last2(String str) {
        if(str.length() < 2)
            return 0;

        String end = str.substring(str.length() - 2);
        int count = 0;

        for(int i = 0; i < str.length() - 2; i++) {
            if(str.substring(i, i + 2).equals(end))
                count++;
        }

        return count;

    }

}
