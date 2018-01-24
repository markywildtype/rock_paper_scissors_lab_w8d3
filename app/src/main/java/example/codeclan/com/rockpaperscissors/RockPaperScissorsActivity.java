package example.codeclan.com.rockpaperscissors;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class RockPaperScissorsActivity extends AppCompatActivity {

    RockPaperScissors game;
    TextView game_result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rock_paper_scissors);
    }

    public void onRockButtonClick(View button){
        game = new RockPaperScissors("rock");
        String result = game.play();
        game_result = findViewById(R.id.game_result);
        game_result.setText(result);
    }

    public void onPaperButtonClick(View button) {
        game = new RockPaperScissors("paper");
        String result = game.play();
        game_result = findViewById(R.id.game_result);
        game_result.setText(result);
    }

    public void onScissorsButtonClick(View button) {
        game = new RockPaperScissors("scissors");
        String result = game.play();
        game_result = findViewById(R.id.game_result);
        game_result.setText(result);
    }
}
