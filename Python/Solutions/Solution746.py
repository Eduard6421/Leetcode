from typing import List


class Solution:
    def minCostClimbingStairs(self, cost: List[int]) -> int:

        if len(cost) <= 2:
             return min(cost[0], cost[1])

        cost_d2, cost_d1 = cost[0], cost[1]

        for i in range(2, len(cost)):

            current_cost = min(cost_d2,cost_d1) + cost[i]
            cost_d2, cost_d1 = cost_d1, current_cost

            print(f"{i} -> {current_cost} {cost_d2} {cost_d1}")


        return min(cost_d1, cost_d2)