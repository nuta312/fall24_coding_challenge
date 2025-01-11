package coding_bat.akylai.string_2;

public class CatDog {
    public boolean catDog(String str) {
        int cat = 0;
        int dog = 0;
        for (int i = 0; i < str.length() - 2; i++) {
            if (str.substring(i, i + 3).equalsIgnoreCase("cat")) {
                cat += 1;
            }
            if (str.substring(i, i + 3).equalsIgnoreCase("dog")) {
                dog += 1;
            }
        }
        return cat == dog;
    }
}
