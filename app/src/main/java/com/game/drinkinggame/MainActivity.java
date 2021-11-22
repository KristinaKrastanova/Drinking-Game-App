package com.game.drinkinggame;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;


import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

public class MainActivity extends AppCompatActivity {
    private Map<Integer, String> cards;
    private List<Integer> keysAsArray;
    private ImageView imageView;
    private TextView textView;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_main);

    imageView = findViewById(R.id.imageView);
        textView = findViewById(R.id.textView);

        cards = new HashMap<>();
        addCards();

        imageView.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                keysAsArray = new ArrayList<>(cards.keySet());
                int size = keysAsArray.size();

                if (size > 0) {
                    //Still has cards to show
                    showRandomCard(size);
                } else{
                    Intent intent = new Intent(MainActivity.this,GameOver.class);
                    startActivity(intent);
                }
            }
        });
    }

    private void addCards(){
        String twoS = "Drink two sips\n Cheers!";
        cards.put(20, twoS); //2C
        cards.put(21, twoS); //2D
        cards.put(22, twoS); //2H
        cards.put(23, twoS); //2S
        String threeS = "Drink three sips\n Cheers!";
        cards.put(30, threeS); //3C
        cards.put(31, threeS); //3D
        cards.put(32, threeS); //3H
        cards.put(33, threeS); //3S
        String fourS = "Drink four sips\n Cheers!";
        cards.put(40, fourS); //4C
        cards.put(41, fourS); //4D
        cards.put(42, fourS); //4H
        cards.put(43, fourS); //4S
        String fiveS = "Drink five sips\n Cheers!";
        cards.put(50, fiveS); //5C
        cards.put(51, fiveS); //5D
        cards.put(52, fiveS); //5H
        cards.put(53, fiveS); //5S
        String sixSBlack = "All boys drink\n Let's go boys!!!";
        cards.put(60, sixSBlack); //6C
        cards.put(63, sixSBlack); //6S
        String sixSRed = "All girls drink\n Come on ladies <3";
        cards.put(61, sixSRed); //6D
        cards.put(62, sixSRed); //6H
        String sevS = "Blitz\nTake turns counting from \"1\". But instead of numbers that contain \"7\" or " +
                "divisible by \"7\" you should say \"Blitz\". It's over when " +
                "someone makes a mistake and should drink.";
        cards.put(70, sevS); //7C
        cards.put(71, sevS); //7D
        cards.put(72, sevS); //7H
        cards.put(73, sevS); //7S
        String eighS = "Brands\n Define the category and take turns saying a brand from it. The first person unable to say should drink";
        cards.put(80, eighS); //8C
        cards.put(81, eighS); //8D
        cards.put(82, eighS); //8H
        cards.put(83, eighS); //8S
        String nineS = "Rhymes\n Say a word and take turns saying rhymes. The first person unable to say should drink";
        cards.put(90, nineS); //9C
        cards.put(91, nineS); //9D
        cards.put(92, nineS); //9H
        cards.put(93, nineS); //9S
        String tenS = "Fountain\n You start drinking and every other player too. A player can stop after the person before them has stopped";
        cards.put(100, tenS); //10C
        cards.put(101, tenS); //10D
        cards.put(102, tenS); //10H
        cards.put(103, tenS); //10S
        String acS = "Drink your whole glass!\n Cheers - you are the craziest one!";
        cards.put(200, acS); //AC
        cards.put(201, acS); //AD
        cards.put(202, acS); //AH
        cards.put(203, acS); //AS
        String jS = "Rule\n Make a rule. It'll be valid through the whole game.";
        cards.put(300, jS); //JC
        cards.put(301, jS); //JD
        cards.put(302, jS); //JH
        cards.put(303, jS); //JS
        String kS = "Never Have I Ever\n Take turns playing never have I ever. The first person that has done three of the things should drink.";
        cards.put(400, kS); //KC
        cards.put(401, kS); //KD
        cards.put(402, kS); //KH
        cards.put(403, kS); //KS
        String qS = "Raise\n Raise your hand and the last player who raises their hand should drink\n You can use this card once during the whole game. Cheers to the slowest player!";
        cards.put(500, qS); //QC
        cards.put(501, qS); //QD
        cards.put(502, qS); //QH
        cards.put(503, qS); //QS
    }

    private void showRandomCard(int size){
        int randIdx = new Random().nextInt(size);
        Integer i = keysAsArray.get(randIdx);

        MediaPlayer royal_sound = MediaPlayer.create(MainActivity.this,R.raw.royal);

        switch (i) {
            case 20:
                imageView.setImageResource(R.drawable.two_c);
                textView.setText(cards.get(20));
                break;
            case 21:
                imageView.setImageResource(R.drawable.two_d);
                textView.setText(cards.get(21));
                break;
            case 22:
                imageView.setImageResource(R.drawable.two_h);
                textView.setText(cards.get(22));
                break;
            case 23:
                imageView.setImageResource(R.drawable.two_s);
                textView.setText(cards.get(23));
                break;
            case 30:
                imageView.setImageResource(R.drawable.three_c);
                textView.setText(cards.get(30));
                break;
            case 31:
                imageView.setImageResource(R.drawable.three_d);
                textView.setText(cards.get(31));
                break;
            case 32:
                imageView.setImageResource(R.drawable.three_h);
                textView.setText(cards.get(32));
                break;
            case 33:
                imageView.setImageResource(R.drawable.three_s);
                textView.setText(cards.get(33));
                break;
            case 40:
                imageView.setImageResource(R.drawable.four_c);
                textView.setText(cards.get(40));
                break;
            case 41:
                imageView.setImageResource(R.drawable.four_d);
                textView.setText(cards.get(41));
                break;
            case 42:
                imageView.setImageResource(R.drawable.four_h);
                textView.setText(cards.get(42));
                break;
            case 43:
                imageView.setImageResource(R.drawable.four_s);
                textView.setText(cards.get(43));
                break;
            case 50:
                imageView.setImageResource(R.drawable.five_c);
                textView.setText(cards.get(50));
                break;
            case 51:
                imageView.setImageResource(R.drawable.five_d);
                textView.setText(cards.get(51));
                break;
            case 52:
                imageView.setImageResource(R.drawable.five_h);
                textView.setText(cards.get(52));
                break;
            case 53:
                imageView.setImageResource(R.drawable.five_s);
                textView.setText(cards.get(53));
                break;
            case 60:
                imageView.setImageResource(R.drawable.six_c);
                textView.setText(cards.get(60));
                break;
            case 61:
                imageView.setImageResource(R.drawable.six_d);
                textView.setText(cards.get(61));
                break;
            case 62:
                imageView.setImageResource(R.drawable.six_h);
                textView.setText(cards.get(62));
                break;
            case 63:
                imageView.setImageResource(R.drawable.six_s);
                textView.setText(cards.get(63));
                break;
            case 70:
                imageView.setImageResource(R.drawable.sev_c);
                textView.setText(cards.get(70));
                break;
            case 71:
                imageView.setImageResource(R.drawable.sev_d);
                textView.setText(cards.get(71));
                break;
            case 72:
                imageView.setImageResource(R.drawable.sev_h);
                textView.setText(cards.get(72));
                break;
            case 73:
                imageView.setImageResource(R.drawable.sev_s);
                textView.setText(cards.get(73));
                break;
            case 80:
                imageView.setImageResource(R.drawable.ei_c);
                textView.setText(cards.get(80));
                break;
            case 81:
                imageView.setImageResource(R.drawable.ei_d);
                textView.setText(cards.get(81));
                break;
            case 82:
                imageView.setImageResource(R.drawable.ei_h);
                textView.setText(cards.get(82));
                break;
            case 83:
                imageView.setImageResource(R.drawable.ei_s);
                textView.setText(cards.get(83));
                break;
            case 90:
                imageView.setImageResource(R.drawable.nine_c);
                textView.setText(cards.get(90));
                break;
            case 91:
                imageView.setImageResource(R.drawable.nine_d);
                textView.setText(cards.get(91));
                break;
            case 92:
                imageView.setImageResource(R.drawable.nine_h);
                textView.setText(cards.get(92));
                break;
            case 93:
                imageView.setImageResource(R.drawable.nine_s);
                textView.setText(cards.get(93));
                break;
            case 100:
                imageView.setImageResource(R.drawable.ten_c);
                textView.setText(cards.get(100));
                break;
            case 101:
                imageView.setImageResource(R.drawable.ten_d);
                textView.setText(cards.get(101));
                break;
            case 102:
                imageView.setImageResource(R.drawable.ten_h);
                textView.setText(cards.get(102));
                break;
            case 103:
                imageView.setImageResource(R.drawable.ten_s);
                textView.setText(cards.get(103));
                break;
            case 200:
                imageView.setImageResource(R.drawable.ac);
                textView.setText(cards.get(200));
                break;
            case 201:
                imageView.setImageResource(R.drawable.ad);
                textView.setText(cards.get(201));
                break;
            case 202:
                imageView.setImageResource(R.drawable.ah);
                textView.setText(cards.get(202));
                break;
            case 203:
                imageView.setImageResource(R.drawable.as);
                textView.setText(cards.get(203));
                break;
            case 300:
                royal_sound.start();
                imageView.setImageResource(R.drawable.jc);
                textView.setText(cards.get(300));
                break;
            case 301:
                royal_sound.start();
                imageView.setImageResource(R.drawable.jd);
                textView.setText(cards.get(301));
                break;
            case 302:
                royal_sound.start();
                imageView.setImageResource(R.drawable.jh);
                textView.setText(cards.get(302));
                break;
            case 303:
                royal_sound.start();
                imageView.setImageResource(R.drawable.js);
                textView.setText(cards.get(303));
                break;
            case 400:
                imageView.setImageResource(R.drawable.kc);
                textView.setText(cards.get(400));
                break;
            case 401:
                imageView.setImageResource(R.drawable.kd);
                textView.setText(cards.get(401));
                break;
            case 402:
                imageView.setImageResource(R.drawable.kh);
                textView.setText(cards.get(402));
                break;
            case 403:
                imageView.setImageResource(R.drawable.ks);
                textView.setText(cards.get(403));
                break;
            case 500:
                imageView.setImageResource(R.drawable.qc);
                textView.setText(cards.get(500));
                break;
            case 501:
                imageView.setImageResource(R.drawable.qd);
                textView.setText(cards.get(501));
                break;
            case 502:
                imageView.setImageResource(R.drawable.qh);
                textView.setText(cards.get(502));
                break;
            case 503:
                imageView.setImageResource(R.drawable.qs);
                textView.setText(cards.get(503));
                break;
        }
        cards.remove(i);
    }
}
