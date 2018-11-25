package com.rstreamdevelopments.backend.controller;

import com.rstreamdevelopments.backend.domain.GameList;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ArcadeController {

    @RequestMapping("/gamelist")
    public GameList gameListApi() {
        return new GameList("PacMan", "TicTacToe", "Snake", "FlappyBird");
    }
}
