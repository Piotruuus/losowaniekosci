package com.example.myapplication;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    Button button;
    TextView wynikkk;
    ImageView kostka1;
    ImageView kostka2;
    ImageView kostka3;
    ImageView kostka4;
    ImageView kostka5;
    LinearLayout kostka1layout;
    LinearLayout kostka2layout;
    LinearLayout kostka3layout;
    LinearLayout kostka4layout;
    LinearLayout kostka5layout;
    int ilekostek = 0;
    int sumaoczek = 0;
    int kostka1locked=0;
    int kostka2locked=0;
    int kostka3locked=0;
    int kostka4locked=0;
    int kostka5locked=0;
    int kostka1lock;
    int kostka2lock;
    int kostka3lock;
    int kostka4lock;
    int kostka5lock;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        kostka1layout = findViewById(R.id.kostka1layout);
        kostka2layout = findViewById(R.id.kostka2layout);
        kostka3layout = findViewById(R.id.kostka3layout);
        kostka4layout = findViewById(R.id.kostka4layout);
        kostka5layout = findViewById(R.id.kostka5layout);
        kostka1 = findViewById(R.id.kostka1);
        kostka2 = findViewById(R.id.kostka2);
        kostka3 = findViewById(R.id.kostka3);
        kostka4 = findViewById(R.id.kostka4);
        kostka5 = findViewById(R.id.kostka5);
        button = findViewById(R.id.button2);
        wynikkk = findViewById(R.id.wynikkk);
        AlertDialog.Builder myAlertBuilder = new
                AlertDialog.Builder(MainActivity.this);
        myAlertBuilder.setTitle(R.string.alert_title);
        myAlertBuilder.setMessage(R.string.alert_message);
        myAlertBuilder.setPositiveButton("Tak", new
                DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        zerowanko();
                    }
                });
        myAlertBuilder.setNegativeButton("Nie", new
                DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {


                    }
                });
        kostka1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (kostka1locked==1){
                    kostka1locked=0;
                    kostka1layout.setBackgroundColor(Color.WHITE);
                }
                else {
                    kostka1locked=1;
                    kostka1layout.setBackgroundColor(Color.GREEN);
                }
            }
        });
        kostka2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (kostka2locked==1){
                    kostka2locked=0;
                    kostka2layout.setBackgroundColor(Color.WHITE);
                }
                else {
                    kostka2locked=1;
                    kostka2layout.setBackgroundColor(Color.GREEN);
                }
            }
        });
        kostka3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (kostka3locked==1){
                    kostka3locked=0;
                    kostka3layout.setBackgroundColor(Color.WHITE);
                }
                else {
                    kostka3locked=1;
                    kostka3layout.setBackgroundColor(Color.GREEN);
                }
            }
        });
        kostka4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (kostka4locked==1){
                    kostka4locked=0;
                    kostka4layout.setBackgroundColor(Color.WHITE);
                }
                else {
                    kostka4locked=1;
                    kostka4layout.setBackgroundColor(Color.GREEN);
                }
            }
        });
        kostka5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (kostka5locked==1){
                    kostka5locked=0;
                    kostka5layout.setBackgroundColor(Color.WHITE);
                }
                else {
                    kostka5locked=1;
                    kostka5layout.setBackgroundColor(Color.GREEN);
                }
            }
        });
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                /*switch (ilekostek){
                    case 1:
                        kostka1.setImageResource(R.drawable.dice_six_faces_one);
                    case 2:
                        kostka2.setImageResource(R.drawable.dice_six_faces_two);
                    case 3:
                        kostka3.setImageResource(R.drawable.dice_six_faces_three);
                    case 4:
                        kostka4.setImageResource(R.drawable.dice_six_faces_four);
                    case 5:
                        kostka5.setImageResource(R.drawable.dice_six_faces_five);
                    default:
                }*/

                losowanie();
                if(sumaoczek!=0){
                    myAlertBuilder.show();
                }



            }
        });
    }

    void jeden() {
        ilekostek = 1;
    }

    void dwa() {
        ilekostek = 2;
    }

    void trzy() {
        ilekostek = 3;
    }

    void cztery() {
        ilekostek = 4;
    }

    void piec() {
        ilekostek = 5;
    }

    void zerowanko() {
        kostka1.setImageResource(R.drawable.dice_empty);
        kostka2.setImageResource(R.drawable.dice_empty);
        kostka3.setImageResource(R.drawable.dice_empty);
        kostka4.setImageResource(R.drawable.dice_empty);
        kostka5.setImageResource(R.drawable.dice_empty);
        sumaoczek = 0;
        wynikkk.setText(Integer.toString(sumaoczek));

    }

    void losowanie() {
        zerowanko();
        Random rn = new Random();
        int kosc1los = rn.nextInt(6) + 1;
        int kosc2los = rn.nextInt(6) + 1;
        int kosc3los = rn.nextInt(6) + 1;
        int kosc4los = rn.nextInt(6) + 1;
        int kosc5los = rn.nextInt(6) + 1;

        if (kostka1locked==1){
            kosc1los=kostka1lock;
        }
        if (kostka2locked==1){
            kosc2los=kostka2lock;
        }
        if (kostka3locked==1){
            kosc3los=kostka3lock;
        }
        if (kostka4locked==1){
            kosc4los=kostka4lock;
        }
        if (kostka5locked==1){
            kosc5los=kostka5lock;
        }

        kostka1lock = kosc1los;
        kostka2lock = kosc2los;
        kostka3lock = kosc3los;
        kostka4lock = kosc4los;
        kostka5lock = kosc5los;
        if (ilekostek >= 1) {
            switch (kosc1los) {
                case 1:
                    kostka1.setImageResource(R.drawable.dice_six_faces_one);
                    break;
                case 2:
                    kostka1.setImageResource(R.drawable.dice_six_faces_two);
                    break;
                case 3:
                    kostka1.setImageResource(R.drawable.dice_six_faces_three);
                    break;
                case 4:
                    kostka1.setImageResource(R.drawable.dice_six_faces_four);
                    break;
                case 5:
                    kostka1.setImageResource(R.drawable.dice_six_faces_five);
                    break;
                case 6:
                    kostka1.setImageResource(R.drawable.dice_six_faces_six);
                    break;
            }
            sumaoczek = kosc1los;
            wynikkk.setText(Integer.toString(sumaoczek));
        }
        if (ilekostek >= 2) {
            switch (kosc2los) {
                case 1:
                    kostka2.setImageResource(R.drawable.dice_six_faces_one);
                    break;
                case 2:
                    kostka2.setImageResource(R.drawable.dice_six_faces_two);
                    break;
                case 3:
                    kostka2.setImageResource(R.drawable.dice_six_faces_three);
                    break;
                case 4:
                    kostka2.setImageResource(R.drawable.dice_six_faces_four);
                    break;
                case 5:
                    kostka2.setImageResource(R.drawable.dice_six_faces_five);
                    break;
                case 6:
                    kostka2.setImageResource(R.drawable.dice_six_faces_six);
                    break;
            }
            sumaoczek = kosc1los + kosc2los;
            wynikkk.setText(Integer.toString(sumaoczek));
        }
        if (ilekostek >= 3) {
            switch (kosc3los) {
                case 1:
                    kostka3.setImageResource(R.drawable.dice_six_faces_one);
                    break;
                case 2:
                    kostka3.setImageResource(R.drawable.dice_six_faces_two);
                    break;
                case 3:
                    kostka3.setImageResource(R.drawable.dice_six_faces_three);
                    break;
                case 4:
                    kostka3.setImageResource(R.drawable.dice_six_faces_four);
                    break;
                case 5:
                    kostka3.setImageResource(R.drawable.dice_six_faces_five);
                    break;
                case 6:
                    kostka3.setImageResource(R.drawable.dice_six_faces_six);
                    break;
            }
            sumaoczek = kosc1los + kosc2los + kosc3los;
            wynikkk.setText(Integer.toString(sumaoczek));
        }
        if (ilekostek >= 4) {
            switch (kosc4los) {
                case 1:
                    kostka4.setImageResource(R.drawable.dice_six_faces_one);
                    break;
                case 2:
                    kostka4.setImageResource(R.drawable.dice_six_faces_two);
                    break;
                case 3:
                    kostka4.setImageResource(R.drawable.dice_six_faces_three);
                    break;
                case 4:
                    kostka4.setImageResource(R.drawable.dice_six_faces_four);
                    break;
                case 5:
                    kostka4.setImageResource(R.drawable.dice_six_faces_five);
                    break;
                case 6:
                    kostka4.setImageResource(R.drawable.dice_six_faces_six);
                    break;
            }
            sumaoczek = kosc1los + kosc2los + kosc3los + kosc4los;
            wynikkk.setText(Integer.toString(sumaoczek));
        }
        if (ilekostek >= 5) {
            switch (kosc5los) {
                case 1:
                    kostka5.setImageResource(R.drawable.dice_six_faces_one);
                    break;
                case 2:
                    kostka5.setImageResource(R.drawable.dice_six_faces_two);
                    break;
                case 3:
                    kostka5.setImageResource(R.drawable.dice_six_faces_three);
                    break;
                case 4:
                    kostka5.setImageResource(R.drawable.dice_six_faces_four);
                    break;
                case 5:
                    kostka5.setImageResource(R.drawable.dice_six_faces_five);
                    break;
                case 6:
                    kostka5.setImageResource(R.drawable.dice_six_faces_six);
                    break;
            }
            sumaoczek = kosc1los + kosc2los + kosc3los + kosc4los + kosc5los;
            wynikkk.setText(Integer.toString(sumaoczek));
        }

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        getMenuInflater().inflate(R.menu.menu_liczby_kostek, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case R.id.jeden:
                jeden();
                return true;
            case R.id.dwa:
                dwa();
                return true;
            case R.id.trzy:
                trzy();
                return true;
            case R.id.cztery:
                cztery();
                return true;
            case R.id.piec:
                piec();
                return true;
            default:
        }

        return super.onOptionsItemSelected(item);
    }
}
