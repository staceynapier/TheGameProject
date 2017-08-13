package com.example.user.thegame;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;

import static com.example.user.thegame.R.id.correct_button;

public class GameActivity extends AppCompatActivity {

    TextView clueOutput;
    ArrayList<Clue> list;
    Game game;
    Button correctButton;
    Button passButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);

        correctButton = (Button)findViewById(R.id.correct_button);
        passButton = (Button)findViewById(R.id.pass_button);

    }

    public void onCorrectButtonClicked(View button){

        clueOutput = (TextView)findViewById(R.id.clue_output);

    }
    game = Game();
//    String newClue = game.getRandomClue();
//    clueOutput.setText(newClue);
}
