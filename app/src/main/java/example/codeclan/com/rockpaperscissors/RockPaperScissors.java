package example.codeclan.com.rockpaperscissors;

import java.util.Random;

/**
 * Created by user on 24/01/2018.
 */

public class RockPaperScissors {

    private String playerHand;
    private String computerHand;
    private boolean isWon;

    public RockPaperScissors(String playerHand){
        this.playerHand = playerHand;
        this.isWon = false;
    }

    public String play(){
        this.computerHand = computerHand();
        if(playerHand == "rock" && computerHand == "paper"){
            return "Paper beats rock, computer wins!";
        } else if(playerHand == "rock" && computerHand == "scissors"){
            this.isWon = true;
            return "Rock beats scissors, player 1 wins!";
        } else if(playerHand == "paper" && computerHand == "scissors"){
            return "Scissors beats paper, computer wins!";
        } else if(playerHand == "paper" && computerHand == "rock"){
            this.isWon = true;
            return "Paper beats rock, player 1 wins!";
        } else if(playerHand == "scissors" && computerHand == "rock"){
            return "Rock beats scissors, computer wins!";
        } else if(playerHand == "scissors" && computerHand == "paper"){
            this.isWon = true;
            return "Scissors beats paper, player 1 wins!";
        } else return"It's a draw!";
    }

    public String computerHand(){
        Random rand = new Random();
        int  n = rand.nextInt(3) + 1;
        if(n == 1){
            return "rock";
        } else if(n == 2){
            return "paper";
        } else
            return "scissors";
    }

    public boolean gameIsWon() {
        return this.isWon;
    }
}
