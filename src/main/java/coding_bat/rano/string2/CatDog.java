package coding_bat.rano.string2;

public class CatDog {
    public boolean catDog(String str) {
        int catCount = 0;
        int dogCount = 0;
        int index = str.indexOf("cat");
        while (index != -1) {
            catCount++;
            index = str.indexOf("cat", index + 1);
        }
        int index1 = str.indexOf("dog");
        while (index1 != -1){
            dogCount++;
            index1 = str.indexOf("dog", index1+1);
        }
        return catCount == dogCount;
    }
}