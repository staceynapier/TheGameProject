package com.example.user.thegame;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.ArrayList;

import static android.R.id.list;

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

//    @Override
    public void onAddButtonClicked(View button) {
        inputClueText.setText("");
        Log.d(getClass().toString(), "onInputButtonClicked was called");

        String newClue = inputClueText.getText().toString();
        clue = new Clue(newClue);
        // loop?
        game = new Game();
        game.addClue(clue);

        // isn't returning the string...
        Log.d(clue.getName(), "added to list");
        Log.d(game.getLength().toString(), "full list");
    }

    public void onClearButtonClicked(View button) {
        Button instruction = clearButton;
        game.empty();
        Log.d(game.getLength().toString(), "list emptied");
    }

    public void onStartGameButton(View button) {
        Intent intent = new Intent(this, GameActivityTeam1.class);
        startActivity(intent);
    }

}
