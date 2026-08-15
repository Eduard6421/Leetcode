class Solution(object):
    '''
    def numTilings(self, n):
        MOD = 10**9 + 7

        if n <= 2:
            return (1, 1, 2)[n]

        dp = [0] * (n + 1)
        dp[0], dp[1], dp[2] = 1, 1, 2

        for i in range(3, n + 1):
            dp[i] = (2 * dp[i - 1] + dp[i - 3]) % MOD

        return dp[n]
    '''

    def numTilings(self, n):
        MOD = 10**9 + 7

        if n <= 2:
            return (1, 1, 2)[n]

        num_m3,num_m2,num_m1 = 1,1,2

        for i in range(3, n + 1):
            num_current = (2*num_m1 + num_m3)%MOD

            num_m3 = num_m2
            num_m2 = num_m1
            num_m1 = num_current

        return num_m1