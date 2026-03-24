class Solution:
    def constructProductMatrix(self, grid):
        MOD = 12345
        n, m = len(grid), len(grid[0])

        arr = []
        for row in grid:
            for x in row:
                arr.append(x % MOD)

        N = len(arr)

        prefix = [1] * N
        suffix = [1] * N

        for i in range(1, N):
            prefix[i] = (prefix[i - 1] * arr[i - 1]) % MOD

        for i in range(N - 2, -1, -1):
            suffix[i] = (suffix[i + 1] * arr[i + 1]) % MOD

        res = [[0] * m for _ in range(n)]
        idx = 0

        for i in range(n):
            for j in range(m):
                res[i][j] = (prefix[idx] * suffix[idx]) % MOD
                idx += 1

        return res