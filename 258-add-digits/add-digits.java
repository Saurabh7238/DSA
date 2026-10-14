class Solution {
    public int addDigits(int num) {
        while (num >= 10) {
            int sod = 0;

            while (num > 0) {
                sod += num % 10;
                num = num / 10;
            }

            num = sod;
        }

        return num;
    }
}