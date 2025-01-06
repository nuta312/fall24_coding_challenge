package coding_bat.nasyikat.warm_up1;

public class EveryNth {
    public String everyNth(String str, int n) {
        StringBuilder result = new StringBuilder(); // оздали обьек для сохранения результата
        for (int i = 0; i < str.length(); i += n){
            result.append(str.charAt(i));// сохранили полученное значение в результате
        }
        return result.toString();
    }
}
