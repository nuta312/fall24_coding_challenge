package coding_bat.alia_warmup1.alia_logic_1;

public class DateFashion {
    public int dateFashion(int you, int date) {
        if (you<=2 || date<=2){
            return 0;
        } else if (you>=8 || date>=8) {
            return 2;
        }
        return 1;
    }
}
