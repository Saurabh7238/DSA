class Solution {
    public int numPrimeArrangements(int n) {
        int pcount = 0;
        int npcount = 0;

        for (int i = 1; i <= n; i++) {
            boolean prime = true;

            if (i == 1) {
                prime = false;
            } else {
                for (int j = 2; j < i; j++) {
                    if (i % j == 0) {
                        prime = false;
                        break;
                    }
                }
            }

            if (prime) {
                pcount++;
            } else {
                npcount++;
            }
        }

        long ans1 = 1;
        long ans2 = 1;
        int mod = 1000000007;

        for (int j = pcount; j > 0; j--) {
            ans1 = (ans1 * j) % mod;
        }

        for (int k = npcount; k > 0; k--) {
            ans2 = (ans2 * k) % mod;
        }

        return (int)((ans1 * ans2) % mod);
    }
}