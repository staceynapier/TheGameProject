package com.example.user.thegame;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;

public class GameActivityTeam1 extends AppCompatActivity {

    TextView clueOutput;
    ArrayList<Clue> newList;
    Game game;
    Button correctButton;
    Button passButton;
    Button switchToTwo;
    Clue clue;
    Team team1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game_team1);

        game = (Game) getIntent().getSerializableExtra("game");
        team1 = new Team("Team1");

        correctButton = (Button) findViewById(R.id.correct_button);
        passButton = (Button) findViewById(R.id.pass_button);
        switchToTwo = (Button)findViewById(R.id.switch_to_two);
    }

    public void onCorrectButtonClicked(View button) {
        clueOutput = (TextView) findViewById(R.id.clue_output);
        String newClue = game.getRandomClueAndRemove();
        clueOutput.setText(newClue);

        if (game.getLength() == 0) {
            clueOutput.setText("Round finished");
        }
        team1.addToScore(1);
        Log.d("Score is", team1.getScore().toString());
//        clue = new Clue(newClue);
//        newList = new ArrayList<Clue>();
//        newList.add(clue);
    }


    public void onPassButtonClicked(View button) {
        clueOutput = (TextView) findViewById(R.id.clue_output);
        String newClue = game.getRandomClue();
        clueOutput.setText(newClue);
    }

    public void onSwitchToTeamTwoButton(View button) {
        Log.d("Button clicked", team1.getScore());
        Intent intent = new Intent(this, GameActivityTeam2.class);
        intent.putExtra("game", game);
        startActivity(intent);
    }

}
