class Solution {
    public String reorderSpaces(String text) {
        int spaces = 0;
        String[] words = text.trim().split("\\s+");

        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == ' ') {
                spaces++;
            }
        }

        if (words.length == 1) {
            return words[0] + " ".repeat(spaces);
        }

        int gap = spaces / (words.length - 1);
        int extra = spaces % (words.length - 1);

        String result = "";

        for (int i = 0; i < words.length; i++) {
            result += words[i];

            if (i < words.length - 1) {
                result += " ".repeat(gap);
            }
        }

        result += " ".repeat(extra);

        return result;
    }
}