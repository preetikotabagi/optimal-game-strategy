package com.preeti.optimal_game_strategy.dto;

import java.util.List;

public class GameRequest {

    private List<Integer> coins;

    public List<Integer> getCoins() {
        return coins;
    }

    public void setCoins(List<Integer> coins) {
        this.coins = coins;
    }
}