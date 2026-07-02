class Solution {

    static boolean isValidAns(int[] piles, int h, int k) {
        int hours = 0;

        for (int i = 0; i < piles.length; i++) {
            if (piles[i] % k == 0) {
                hours += piles[i] / k;
            } else {
                hours += (piles[i] / k) + 1;
            }

            if (hours > h) {
                return false;
            }
        }

        return true;
    }

    public int minEatingSpeed(int[] piles, int h) {
        int max = 0;

        for (int i = 0; i < piles.length; i++) {
            max = Math.max(max, piles[i]);
        }

        int s = 1;
        int e = max;
        int ans = -1;

        while (s <= e) {
            int mid = s + (e - s) / 2;

            if (isValidAns(piles, h, mid)) {
                ans = mid;
                e = mid - 1;
            } else {
                s = mid + 1;
            }
        }

        return ans;
    }
}