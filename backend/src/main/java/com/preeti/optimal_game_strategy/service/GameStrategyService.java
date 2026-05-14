package com.preeti.optimal_game_strategy.service;

import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class GameStrategyService {

    public int optimalScore(List<Integer> coins) {

        int n = coins.size();

        int[][] dp = new int[n][n];

        for (int gap = 0; gap < n; gap++) {

            for (int i = 0, j = gap; j < n; i++, j++) {

                int x = (i + 2 <= j) ? dp[i + 2][j] : 0;

                int y = (i + 1 <= j - 1) ? dp[i + 1][j - 1] : 0;

                int z = (i <= j - 2) ? dp[i][j - 2] : 0;

                dp[i][j] = Math.max(
                        coins.get(i) + Math.min(x, y),
                        coins.get(j) + Math.min(y, z)
                );
            }
        }

        return dp[0][n - 1];
    }
}