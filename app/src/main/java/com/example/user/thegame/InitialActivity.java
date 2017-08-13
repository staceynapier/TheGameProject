package com.example.user.thegame;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.ArrayList;

public class InitialActivity extends AppCompatActivity {

    EditText inputClueText;
    Button inputButton;
    Clue clue;
    Game game;
    Button clearButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_initial);

        inputClueText = (EditText)findViewById(R.id.clue_input);
        inputButton = (Button)findViewById(R.id.inputter);
        clearButton = (Button)findViewById(R.id.clear_button);
    }

    public void onInputButtonClicked(View button) {
        Log.d(getClass().toString(), "onInputButtonClicked was called");
        String clue = inputClueText.getText().toString();
        Clue newClue = new Clue(clue);
        game = new Game();
        game.addClue(newClue);

        Log.d(newClue.getName().toString(), "added to list");
    }

    public void onClearButtonClicked(View button) {
        Button instruction = clearButton;
        game.empty();
        Log.d(game.getList().toString(), "list emptied");
    }

    public void onStartGameButton(View button) {
        Intent intent = new Intent(this, GameActivity.class);
        startActivity(intent);
    }

}
