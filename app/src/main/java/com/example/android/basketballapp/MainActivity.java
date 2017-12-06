package com.example.android.basketballapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    //initialization the two variables
    //Track the score for Celtic team
    int scoreForTeamCeltic = 0;
    //Track the score for Bucks team
    int scoreForTeamBucks = 0;


    //this function to dispaly the score for Celtic team

    public void dispalyFunA(int x) {

        TextView teamATextView = (TextView) findViewById(R.id.celtic_team);
        teamATextView.setText("" + x);

    }
//this function to dispaly the score for Bucks team

    public void dispalyFunB(int y) {

        TextView teamATextView = (TextView) findViewById(R.id.bucks_team);
        teamATextView.setText("" + y);

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    //this methods for Celtic team

    //increase the score for Celtic team by 1 and display it
    public void addOneForClticTeam(View v) {

        scoreForTeamCeltic = scoreForTeamCeltic + 1;

        dispalyFunA(scoreForTeamCeltic);
    }

    //increase the score for Celtic team by 2 and display it
    public void addTowForClticTeam(View v) {

        scoreForTeamCeltic = scoreForTeamCeltic + 2;

        dispalyFunA(scoreForTeamCeltic);
    }

    //increase the score for Celtic team by 3 and display it
    public void addThreeForClticTeam(View v) {
        scoreForTeamCeltic = scoreForTeamCeltic + 3;

        dispalyFunA(scoreForTeamCeltic);
    }


    // this methods for  Bucks team
    //increase the score for  Bucks team  by 1 and display it

    public void addOneForBucksTeam(View v) {

        scoreForTeamBucks = scoreForTeamBucks + 1;

        dispalyFunB(scoreForTeamBucks);

    }

    //increase the score for  Bucks team by 2 and display it
    public void addTwoForBucksTeam(View v) {

        scoreForTeamBucks = scoreForTeamBucks + 2;

        dispalyFunB(scoreForTeamBucks);

    }

    //increase the score for  Bucks team by 3 and display it
    public void addThreeForBucksTeam(View v) {

        scoreForTeamBucks = scoreForTeamBucks + 3;

        dispalyFunB(scoreForTeamBucks);

    }

    // this method for resting the score for both Celtic team and  Bucks team  to o .

    public void resetScore(View v) {

        if (scoreForTeamCeltic == scoreForTeamBucks) {
            Toast.makeText(this, "The two teams are equal in Points", Toast.LENGTH_SHORT).show();
        } else if (scoreForTeamCeltic > scoreForTeamBucks) {
            Toast.makeText(this, "Celtic team is the Winner", Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(this, "Bucks team is the Winner", Toast.LENGTH_SHORT).show();
        }
        scoreForTeamCeltic = 0;
        scoreForTeamBucks = 0;

        dispalyFunA(scoreForTeamCeltic);
        dispalyFunB(scoreForTeamBucks);

    }

}

