class Solution {
    public int maximum69Number(int num) {
        String numstr = String.valueOf(num);

        for (int i = 0; i < numstr.length(); i++) {
            if (numstr.charAt(i) == '6') {
                numstr = numstr.substring(0, i) + '9' + numstr.substring(i + 1);
                return Integer.parseInt(numstr);
            }
        }

        return num;
    }
}