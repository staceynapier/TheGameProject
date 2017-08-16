package com.example.user.thegame;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import static android.R.attr.button;

public class RulesActivity extends AppCompatActivity {

    TextView rules;
    TextView title;
    Button enter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rules);

        rules = (TextView) findViewById(R.id.rules);
        title = (TextView) findViewById(R.string.app_name);
        enter = (Button) findViewById(R.id.enter_game_button);

        rules.setText(  "The object of The Game is to guess the most names described by your team members\n" +
                        "Split the group into two teams. Each player should enter at least four names into the game.  These can be any names from famous people to family members as long as they are known to the whole group.\n" +
                        "When ready, choose one member of the team to describe the names (no rhyming or ‘sounds like’ allowed).\n" +
                        "Start Game is then pressed and the timer begins. Guessing by the remaining team members should begin.\n" +
                        "If the team cannot guess the name, the ‘Pass’ button can be pressed.\n" +
                        "If correctly guessed, press ‘Correct’ and a new name will be presented.\n" +
                        "Once the timer is up, pass to Team Two and repeat.\n" +
                        "The game is complete when all of the names have been correctly guessed.");
    }

    public void onBeginButtonClicked(View button) {
            Intent intent = new Intent(this, InitialActivity.class);
            startActivity(intent);

    }
}
