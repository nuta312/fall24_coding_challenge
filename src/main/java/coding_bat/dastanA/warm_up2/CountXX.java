package coding_bat.dastanA.warm_up2;

public class CountXX {
    int countXX(String str) {
        String[] words = str.split(" ");
        if (words.length > 1) {
            int count = 0;
            for (int i = 0; i < words.length; i++) {
                for (int j = 0; j < words[i].length(); j++) {
                    if (words[i].charAt(j) == 'x') {
                        count++;
                    }
                } count -= 1;
            }
            if (count <= 0) {
                count = 0;
            }
            return count;
        }

        int count1 = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'x') {
                count1++;
            }
        }
        if (count1 <= 0) {
            return count1 = 0;
        }
        return count1 - 1;
    }

}
