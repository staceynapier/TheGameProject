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
    Button startGameButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_initial);

        inputClueText = (EditText)findViewById(R.id.clue_input);
        inputButton = (Button)findViewById(R.id.inputter);
        clearButton = (Button)findViewById(R.id.clear_button);
        startGameButton = (Button)findViewById(R.id.start_game_button);

        game = new Game();

        inputButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View button) {

                Log.d(getClass().toString(), "onInputButtonClicked was called");

                String newClue = inputClueText.getText().toString();
                clue = new Clue(newClue);
                game.addClue(clue);

                inputClueText.setText("");
                Log.d( "Clue was added to list:", clue.getName());
                Log.d(game.getLength().toString(), "length of list");
            }
        });

    }


    public void onClearButtonClicked(View button) {
        Button instruction = clearButton;
        game.empty();
        Log.d(game.getLength().toString(), "list emptied");
    }

    public void onStartGameButton(View button) {
        Intent intent = new Intent(this, GameActivityTeam1.class);
        intent.putExtra("game", game);
        startActivity(intent);
    }

}
