package com.preeti.optimal_game_strategy.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.preeti.optimal_game_strategy.dto.GameRequest;
import com.preeti.optimal_game_strategy.dto.GameResponse;
import com.preeti.optimal_game_strategy.service.GameStrategyService;

@RestController
@RequestMapping("/game")
@CrossOrigin("*")
public class HomeController {

    @Autowired
    private GameStrategyService gameStrategyService;

    @GetMapping("/")
    public String home() {
        return "Optimal Game Strategy Backend Running Successfully!";
    }

    @PostMapping("/solve")
    public GameResponse solveGame(@RequestBody GameRequest request) {

        int result = gameStrategyService.optimalScore(request.getCoins());

        return new GameResponse(
                result,
                "Optimal strategy calculated successfully"
        );
    }
}