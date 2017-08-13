package com.example.user.thegame;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import java.util.ArrayList;

public class GameActivity extends AppCompatActivity {

    TextView clueOutput;
    ArrayList<Clue> list;
    Game game;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);

        clueOutput = (TextView)findViewById(R.id.clue_output);

    }
//    game = new Game(list);
//    String newClue = game.getRandomClue();
//    clueOutput.setText(newClue);
}
