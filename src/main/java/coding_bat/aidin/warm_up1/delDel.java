package coding_bat.aidin.warm_up1;

public class delDel {
    public String delDel(String str) {
        if (str.startsWith("del", 1))

            return str.charAt(0) + str.substring(4, str.length());

        else

            return str;

    }
}
