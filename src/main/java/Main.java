package main.java;

public class Main {
    public static void main(String[] args) {
        Player playerA = new Player("Gourav",50, 5, 10);
        Player playerB = new Player("Chunmun",100, 10, 5);
        Dice attackDice = new Dice(6);
        Dice defenseDice = new Dice(6);
        Arena game = new Arena(playerA, playerB, attackDice, defenseDice);
        game.play();
    }
}

