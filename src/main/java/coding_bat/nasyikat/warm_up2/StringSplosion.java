package coding_bat.nasyikat.warm_up2;

public class StringSplosion {
    public String stringSplosion(String str) {
        StringBuilder result = new StringBuilder();
//   начиная от  1 до последнего включительно увеличиваем на 1
        for (int i = 0; i <= str.length(); i++){
            //      каждый раз i+1 будет увеличивать i = 0,1
            //                                           0,2
            //                                           0,3 и так до конца длинны str
            result.append(str.substring(0,i));
        }
        return result.toString();
    }
}
