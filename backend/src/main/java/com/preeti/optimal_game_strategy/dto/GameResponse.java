package com.preeti.optimal_game_strategy.dto;

public class GameResponse {

    private int optimalScore;
    private String message;

    public GameResponse(int optimalScore, String message) {
        this.optimalScore = optimalScore;
        this.message = message;
    }

    public int getOptimalScore() {
        return optimalScore;
    }

    public void setOptimalScore(int optimalScore) {
        this.optimalScore = optimalScore;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}