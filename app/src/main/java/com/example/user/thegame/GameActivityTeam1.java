package com.example.user.thegame;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;

public class GameActivityTeam1 extends AppCompatActivity {

    TextView clueOutput;
    ArrayList<Clue> list;
    Game game;
    Button correctButton;
    Button passButton;
    Button switchToTwo;
    Clue clue;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game_team1);

        correctButton = (Button) findViewById(R.id.correct_button);
        passButton = (Button) findViewById(R.id.pass_button);
        switchToTwo = (Button)findViewById(R.id.switch_to_two);

    }

    public void onCorrectButtonClicked(View button) {
        clueOutput = (TextView) findViewById(R.id.clue_output);
        String newClue = game.getRandomClue();
        clueOutput.setText(newClue);
        clue = new Clue(newClue);
        new ArrayList<Clue>();
        list.add(clue);
    }

    public void onPassButtonClicked(View button) {
        clueOutput = (TextView) findViewById(R.id.clue_output);
        String newClue = game.getRandomClue();
        clueOutput.setText(newClue);
    }

    public void onSwitchToTeamTwoButton(View button) {
        Intent intent = new Intent(this, GameActivityTeam2.class);
        startActivity(intent);
    }

}
