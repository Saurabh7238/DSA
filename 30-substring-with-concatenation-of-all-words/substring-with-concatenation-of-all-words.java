import java.util.*;

class Solution {
    public List<Integer> findSubstring(String s, String[] words) {
        List<Integer> result = new ArrayList<>();

        if (s.length() == 0 || words.length == 0) {
            return result;
        }

        int wordLength = words[0].length();
        int wordCount = words.length;
        int totalLength = wordLength * wordCount;

        if (s.length() < totalLength) {
            return result;
        }

        Map<String, Integer> needed = new HashMap<>();

        for (String word : words) {
            needed.put(word, needed.getOrDefault(word, 0) + 1);
        }

        for (int start = 0; start < wordLength; start++) {
            int left = start;
            int right = start;
            int count = 0;

            Map<String, Integer> current = new HashMap<>();

            while (right + wordLength <= s.length()) {
                String word = s.substring(right, right + wordLength);
                right += wordLength;

                if (!needed.containsKey(word)) {
                    current.clear();
                    count = 0;
                    left = right;
                    continue;
                }

                current.put(word, current.getOrDefault(word, 0) + 1);
                count++;

                while (current.get(word) > needed.get(word)) {
                    String removeWord = s.substring(left, left + wordLength);
                    current.put(removeWord, current.get(removeWord) - 1);
                    left += wordLength;
                    count--;
                }

                if (count == wordCount) {
                    result.add(left);

                    String removeWord = s.substring(left, left + wordLength);
                    current.put(removeWord, current.get(removeWord) - 1);
                    left += wordLength;
                    count--;
                }
            }
        }

        return result;
    }
}