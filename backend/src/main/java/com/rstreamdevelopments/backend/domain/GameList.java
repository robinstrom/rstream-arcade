package com.rstreamdevelopments.backend.domain;

public class GameList {

    private String pacMan;
    private String ticTacToe;
    private String snake;
    private String flappyBird;

    public GameList(String pacMan, String ticTacToe, String snake, String flappyBird) {
        this.pacMan = pacMan;
        this.ticTacToe = ticTacToe;
        this.snake = snake;
        this.flappyBird = flappyBird;
    }

    public String getPacMan() {
        return pacMan;
    }

    public void setPacMan(String pacMan) {
        this.pacMan = pacMan;
    }

    public String getTicTacToe() {
        return ticTacToe;
    }

    public void setTicTacToe(String ticTacToe) {
        this.ticTacToe = ticTacToe;
    }

    public String getSnake() {
        return snake;
    }

    public void setSnake(String snake) {
        this.snake = snake;
    }

    public String getFlappyBird() {
        return flappyBird;
    }

    public void setFlappyBird(String flappyBird) {
        this.flappyBird = flappyBird;
    }
}
