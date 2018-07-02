package dennis.practice.leetcode;

public class Problem_746 {
    public int minCostClimbingStairs(int[] cost) {
        if (cost.length == 0) {
            return 0;
        }

        for (int i = cost.length - 1; i >= 0; --i) {
            int oneStepCost = 0;
            int twoStepCost = 0;

            if (i + 1 < cost.length) {
                oneStepCost = cost[i + 1];
            }

            if (i + 2 < cost.length) {
                twoStepCost = cost[i + 2];
            }

            cost[i] += Math.min(oneStepCost, twoStepCost);
        }

        return Math.min(cost[0], cost[1]);
    }
}
