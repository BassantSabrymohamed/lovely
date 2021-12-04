package com.example.lovely;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private ImageView button1, button2, button3, button4, button5, button6, button7, button8, button9;
    private int b1 = 5, b2 = 5, b3 = 5, b4 = 5, b5 = 5, b6 = 5, b7 = 5, b8 = 5, b9 = 5, xCount = 0, oCount = 0, i = 0;
    private TextView ScoreX, scoreO;
    private boolean isX = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button1 = findViewById(R.id.buttonimge1);
        button2 = findViewById(R.id.buttonimge2);
        button3 = findViewById(R.id.buttonimge3);
        button4 = findViewById(R.id.buttonimge4);
        button5 = findViewById(R.id.buttonimge5);
        button6 = findViewById(R.id.buttonimge6);
        button7 = findViewById(R.id.buttonimge7);
        button8 = findViewById(R.id.buttonimge8);
        button9 = findViewById(R.id.buttonimge9);
        ScoreX = findViewById(R.id.Scorex);
        scoreO = findViewById(R.id.ScoreO);
        Button reset = findViewById(R.id.Reset);

        reset.setOnClickListener(view -> resetAllData());

        button1.setOnClickListener(view -> {
            button1.setEnabled(false);
            if (isX) {
                button1.setImageResource(R.drawable.cross);
                b1 = 1;
                isX = false;
            } else {
                button1.setImageResource(R.drawable.circle);
                b1 = 0;
                isX = true;
            }
            i++;
            winningGame();
        });
        button2.setOnClickListener(view -> {
            button2.setEnabled(false);
            if (isX) {
                button2.setImageResource(R.drawable.cross);
                b2 = 1;
                isX = false;
            } else {
                button2.setImageResource(R.drawable.circle);
                b2 = 0;
                isX = true;
            }
            i++;
            winningGame();
        });
        button3.setOnClickListener(view -> {
            button3.setEnabled(false);
            if (isX) {
                button3.setImageResource(R.drawable.cross);
                b3 = 1;
                isX = false;
            } else {
                button3.setImageResource(R.drawable.circle);
                b3 = 0;
                isX = true;
            }
            i++;
            winningGame();
        });
        button4.setOnClickListener(view -> {
            button4.setEnabled(false);
            if (isX) {
                button4.setImageResource(R.drawable.cross);
                b4 = 1;
                isX = false;
            } else {
                button4.setImageResource(R.drawable.circle);
                b4 = 0;
                isX = true;
            }
            i++;
            winningGame();
        });
        button5.setOnClickListener(view -> {
            button5.setEnabled(false);
            if (isX) {
                button5.setImageResource(R.drawable.cross);
                b5 = 1;
                isX = false;
            } else {
                button5.setImageResource(R.drawable.circle);
                b5 = 0;
                isX = true;
            }
            i++;
            winningGame();
        });
        button6.setOnClickListener(view -> {
            button6.setEnabled(false);
            if (isX) {
                button6.setImageResource(R.drawable.cross);
                b6 = 1;
                isX = false;
            } else {
                button6.setImageResource(R.drawable.circle);
                b6 = 0;
                isX = true;
            }
            i++;
            winningGame();
        });
        button7.setOnClickListener(view -> {
            button7.setEnabled(false);
            if (isX) {
                button7.setImageResource(R.drawable.cross);
                b7 = 1;
                isX = false;
            } else {
                button7.setImageResource(R.drawable.circle);
                b7 = 0;
                isX = true;
            }
            i++;
            winningGame();
        });
        button8.setOnClickListener(view -> {
            button8.setEnabled(false);
            if (isX) {
                button8.setImageResource(R.drawable.cross);
                b8 = 1;
                isX = false;
            } else {
                button8.setImageResource(R.drawable.circle);
                b8 = 0;
                isX = true;
            }
            i++;
            winningGame();
        });
        button9.setOnClickListener(view -> {
            button9.setEnabled(false);
            if (isX) {
                button9.setImageResource(R.drawable.cross);
                b9 = 1;
                isX = false;
            } else {
                button9.setImageResource(R.drawable.circle);
                b9 = 0;
                isX = true;
            }
            i++;
            winningGame();
        });

    }

    private void resetAllData() {
        isX = true;
        xCount = 0;
        oCount = 0;
        ScoreX.setText("score x:-" + xCount);
        scoreO.setText("score O:-" + oCount);
        resetButtons();
        resetImages();
        resetValues();
    }

    private void resetButtons() {
        button1.setEnabled(true);
        button2.setEnabled(true);
        button3.setEnabled(true);
        button4.setEnabled(true);
        button5.setEnabled(true);
        button6.setEnabled(true);
        button7.setEnabled(true);
        button8.setEnabled(true);
        button9.setEnabled(true);
    }

    void showAlertWinner(String player) {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setCancelable(false)
                .setMessage("player " + player + " Wins")
                .setPositiveButton("ok", (dialogInterface, i) -> {
                    resetButtons();
                    resetImages();
                    resetValues();
                });
        AlertDialog alertDialog = builder.create();
        alertDialog.show();
        if (player.equals("X")) {
            xCount++;
            ScoreX.setText("score " + player + ":=" + xCount);
        } else {
            oCount++;
            scoreO.setText("score " + player + ":=" + oCount);
        }
    }

    private void winningGame() {
        if ((b1 == 1) && (b2 == 1) && (b3 == 1)) {
            Toast.makeText(this, "1", Toast.LENGTH_SHORT).show();
            showAlertWinner("X");
        } else if ((b4 == 1) && (b5 == 1) && (b6 == 1)) {
            Toast.makeText(this, "1", Toast.LENGTH_SHORT).show();
            showAlertWinner("X");
        } else if ((b7 == 1) && (b8 == 1) && (b9 == 1)) {
            Toast.makeText(this, "1", Toast.LENGTH_SHORT).show();
            showAlertWinner("X");
        } else if ((b1 == 1) && (b4 == 1) && (b7 == 1)) {
            Toast.makeText(this, "1", Toast.LENGTH_SHORT).show();
            showAlertWinner("X");
        } else if ((b2 == 1) && (b5 == 1) && (b8 == 1)) {
            Toast.makeText(this, "1", Toast.LENGTH_SHORT).show();
            showAlertWinner("X");
        } else if ((b3 == 1) && (b6 == 1) && (b9 == 1)) {
            Toast.makeText(this, "1", Toast.LENGTH_SHORT).show();
            showAlertWinner("X");
        } else if ((b1 == 1) && (b5 == 1) && (b9 == 1)) {
            Toast.makeText(this, "1", Toast.LENGTH_SHORT).show();
            showAlertWinner("X");
        } else if ((b3 == 1) && (b5 == 1) && (b7 == 1)) {
            Toast.makeText(this, "1", Toast.LENGTH_SHORT).show();
            showAlertWinner("X");
        } else if ((b1 == 0) && (b2 == 0) && (b3 == 0)) {
            Toast.makeText(this, "1", Toast.LENGTH_SHORT).show();
            showAlertWinner("O");
        } else if ((b4 == 0) && (b5 == 0) && (b6 == 0)) {
            Toast.makeText(this, "1", Toast.LENGTH_SHORT).show();
            showAlertWinner("O");
        } else if ((b7 == 0) && (b8 == 0) && (b9 == 0)) {
            Toast.makeText(this, "1", Toast.LENGTH_SHORT).show();
            showAlertWinner("O");
        } else if ((b2 == 0) && (b5 == 0) && (b8 == 0)) {
            Toast.makeText(this, "1", Toast.LENGTH_SHORT).show();
            showAlertWinner("O");
        } else if ((b3 == 0) && (b6 == 0) && (b9 == 0)) {
            Toast.makeText(this, "1", Toast.LENGTH_SHORT).show();
            showAlertWinner("O");
        } else if ((b1 == 0) && (b5 == 0) && (b9 == 0)) {
            Toast.makeText(this, "1", Toast.LENGTH_SHORT).show();
            showAlertWinner("O");
        } else if ((b3 == 0) && (b5 == 0) && (b7 == 0)) {
            Toast.makeText(this, "1", Toast.LENGTH_SHORT).show();
            showAlertWinner("O");
        } else {
            if (i == 9) {
                AlertDialog.Builder builder = new AlertDialog.Builder(this);
                builder.setMessage("No one Wins").setPositiveButton("ok", (dialogInterface, i) -> {
                    resetButtons();
                    resetImages();
                    resetValues();
                });
                AlertDialog alertDialog = builder.create();
                alertDialog.show();
            }
        }
    }

    private void resetImages() {
        button1.setImageDrawable(null);
        button2.setImageDrawable(null);
        button3.setImageDrawable(null);
        button4.setImageDrawable(null);
        button5.setImageDrawable(null);
        button6.setImageDrawable(null);
        button7.setImageDrawable(null);
        button8.setImageDrawable(null);
        button9.setImageDrawable(null);
    }

    private void resetValues() {
        b1 = b2 = b3 = b4 = b5 = b6 = b7 = b8 = b9 = -1;
        i = 0;
    }
}