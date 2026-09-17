class Solution {
    public long maxAlternatingSum(int[] nums) {

        long plus = 0;
        long minus = 0;

        for (int num : nums) {

            long newPlus = Math.max(plus, minus + num);

            long newMinus = Math.max(minus, plus - num);

            plus = newPlus;
            minus = newMinus;
        }

        return plus;
    }
}