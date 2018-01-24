package example.codeclan.com.rockpaperscissors;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class RockPaperScissorsActivity extends AppCompatActivity {

    RockPaperScissors game;
    TextView game_result;
    TextView computerScoreBox;
    TextView playersScoreBox;
    int computerScore;
    int playerScore;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rock_paper_scissors);
        computerScore = 0;
        playerScore = 0;
    }

    public void onRockButtonClick(View button) {
        game = new RockPaperScissors("rock");
        playGame();
    }

    public void onPaperButtonClick(View button) {
        game = new RockPaperScissors("paper");
        playGame();
    }

    public void onScissorsButtonClick(View button) {
        game = new RockPaperScissors("scissors");
        playGame();
    }

    public void playGame(){
        String result = game.play();
        game_result = findViewById(R.id.game_result);
        game_result.setText(result);
        if(game.gameIsWon() == 1){
            playerScore += 1;
        } else if(game.gameIsWon() == 0) {
            computerScore += 1;
        }
        computerScoreBox = findViewById(R.id.computer_score);
        computerScoreBox.setText("Computer: " + String.valueOf(computerScore));
        playersScoreBox = findViewById(R.id.player_score);
        playersScoreBox.setText("Player: " + String.valueOf(playerScore));
    }


    public void onRulesButtonClick(View button) {
        Intent intent = new Intent(this, RulesActivity.class);
        startActivity(intent);
    }
}
