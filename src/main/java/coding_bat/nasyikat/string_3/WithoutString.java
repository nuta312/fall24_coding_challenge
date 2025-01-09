package coding_bat.nasyikat.string_3;

public class WithoutString {
    public String withoutString(String base, String remove) {
        if (remove.isEmpty()) {
            return base;
        }
        String baseLower = base.toLowerCase();
        String removeLower = remove.toLowerCase();
        StringBuilder result = new StringBuilder();
        int index = 0;
        while (index < base.length()) {
            if (index <= base.length() - remove.length() &&
                    baseLower.substring(index, index + remove.length()).equals(removeLower)) {
                index += remove.length();
            } else {
                result.append(base.charAt(index));
                index++;
            }
        }
        return result.toString();
    }
}
