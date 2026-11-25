
class Solution {
    public int rotatedDigits(int n) {
        int count = 0;

        for (int i = 1; i <= n; i++) {
            int num = i;
            boolean valid = true;
            boolean changed = false;

            while (num > 0) {
                int digit = num % 10;

                switch (digit) {
                    case 0:
                    case 1:
                    case 8:
                        break;

                    case 2:
                    case 5:
                    case 6:
                    case 9:
                        changed = true;
                        break;

                    default:
                        valid = false;
                }

                num = num / 10;
            }

            if (valid && changed) {
                count++;
            }
        }

        return count;
    }
}
