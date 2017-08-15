package com.example.user.thegame;

import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.io.Serializable;
import java.util.ArrayList;

public class GameActivityTeam1 extends AppCompatActivity {

    TextView clueOutput;
    Game game;
    Button correctButton;
    Button passButton;
    Button switchToTwo;
    Button start;
    Button stop;
    Clue clue;
    Team team1;
    Team team2;
    private TextView countText;
    private CountDownTimer countDownTimer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game_team1);

        game = (Game) getIntent().getSerializableExtra("game");
        team1 = new Team("Team1");
        team2 = new Team("Team2");


        correctButton = (Button)findViewById(R.id.correct_button);
        passButton = (Button)findViewById(R.id.pass_button);
        switchToTwo = (Button)findViewById(R.id.switch_to_two);
        start = (Button)findViewById(R.id.start);
        stop = (Button)findViewById(R.id.stop);
        countText = (TextView)findViewById(R.id.countdown_text);

    }

    public void onCorrectButtonClicked(View button) {
        clueOutput = (TextView)findViewById(R.id.clue_output);
        String newClue = game.getRandomClueAndRemove();
        clueOutput.setText(newClue);

        if (game.getLength() == 0) {
            clueOutput.setText("Round finished");
        }
        team1.addToScore(1);
        Log.d("Score is", team1.getScore());
    }

    public void onPassButtonClicked(View button) {
        clueOutput = (TextView) findViewById(R.id.clue_output);
        String newClue = game.getRandomClue();
        clueOutput.setText(newClue);
    }

    public void onSwitchToTeamTwoButton(View button) {
        Log.d("Button clicked", team1.getScore());
        Intent intent = new Intent(this, GameActivityTeam2.class);
        Bundle extras = new Bundle();
        extras.putSerializable("game", game);
        extras.putSerializable("team1", team1);
        extras.putSerializable("team2", team2);
        intent.putExtras(extras);
        startActivity(intent);
    }

    public void onScorecardButtonClicked(View button) {
        Intent intent = new Intent(this, ScorecardActivity.class);
        Bundle extras = new Bundle();
        extras.putSerializable("game", game);
        extras.putSerializable("team1", team1);
        extras.putSerializable("team2", team2);
        intent.putExtras(extras);
        startActivity(intent);
    }

    public void onStartButtonClicked(View button) {
        countDownTimer = new CountDownTimer(60 * 1000, 1000) {
            public void onTick(long millisUntilFinished) {
                countText.setText("" + millisUntilFinished / 1000);
            }

            public void onFinish() {
                countText.setText("Done !");
            }
        };
        countDownTimer.start();
    }

    public void onStopButtonClicked(View button) {
        countDownTimer.cancel();
    }
}
