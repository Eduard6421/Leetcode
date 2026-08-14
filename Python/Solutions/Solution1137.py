class Solution:
    def tribonacci(self, n: int) -> int:

        if n  <= 2:
            return (0,1,1)[n]

        t_m3, t_m2, t_m1 = 0, 0 , 1

        for i in range(3, n + 1):
            current = t_m3 + t_m2 + t_m1

            t_m3 = t_m2
            t_m2 = t_m1
            t_m1 = current

        return t_m1 + t_m2 + t_m3