package com.example.user.thegame;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ScorecardActivity extends AppCompatActivity {

    TextView team1Scores;
    TextView team2Scores;
    Team team1;
    Team team2;
    Game game;
    Button restart;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scorecard);

        team1 = (Team) getIntent().getSerializableExtra("team1");
        team2 = (Team) getIntent().getSerializableExtra("team2");
        game = (Game) getIntent().getSerializableExtra("game");


        team1Scores = (TextView)findViewById(R.id.team_1_scores);
        team2Scores = (TextView)findViewById(R.id.team_2_scores);
        restart = (Button)findViewById(R.id.restart_button);

    }

    public void showScoresButtonClicked(View button) {

        String t1 = team1.getScore();
        team1Scores.setText(t1);

        String t2 = team2.getScore();
        team2Scores.setText(t2);
    }

    public void onRestartButtonClicked(View button) {
        Intent intent = new Intent(this, InitialActivity.class);
        startActivity(intent);
    }
}