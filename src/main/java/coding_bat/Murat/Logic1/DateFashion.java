package coding_bat.Murat.Logic1;

public class DateFashion {
    public int dateFashion(int you, int date) {
        if (you <= 2 || date <= 2) return 0;
        if (you >= 8 || date >= 8) return 2;
        if ((you >= 8 && date > 2) || (you > 2 && date >= 8)) return 1;
        return 1;
    }
}
