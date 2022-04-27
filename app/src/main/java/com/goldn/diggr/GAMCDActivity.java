package com.goldn.diggr;

import static com.goldn.diggr.GD.dsja;
import static com.goldn.diggr.GD.cstsca;
import static com.goldn.diggr.GD.cagcta;
import static com.goldn.diggr.GD.chsaus;
import static com.goldn.diggr.GD.nhsfsa;
import static com.goldn.diggr.GD.mmjds;
import static com.goldn.diggr.GD.csha;
import static com.goldn.diggr.GD.hsafsa;
import static com.goldn.diggr.LogCD.decode;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class GAMCDActivity extends AppCompatActivity {


    ImageView imageS1, imageS2, imageS3, imageS4, imageS5, imageS6, imageViewBoom, imageViewRes, imageViewWinner;
    TextView textViewYB, textView100, textView200, textView300, textViewattempts;
    int countegfgr = 0;
    int gfrk = 0;
    int vv = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getWindow().addFlags(1024);
        textViewYB = findViewById(R.id.textViewYB);
        textView100 = findViewById(R.id.textView100);
        textView200 = findViewById(R.id.textView200);
        textView300 = findViewById(R.id.textView300);
        textViewattempts = findViewById(R.id.textViewattempts);
        imageS1 = findViewById(R.id.imageS1);
        imageS2 = findViewById(R.id.imageS2);
        imageS3 = findViewById(R.id.imageS3);
        imageS4 = findViewById(R.id.imageS4);
        imageS5 = findViewById(R.id.imageS5);
        imageS6 = findViewById(R.id.imageS6);
        imageViewWinner = findViewById(R.id.imageViewWinner);
        imageViewRes = findViewById(R.id.imageViewRes);
        imageViewBoom = findViewById(R.id.imageViewBoom);

        GaGD gaGD = new GaGD(imageS1, imageS2, imageS3, imageS4, imageS5, imageS6);
        gaGD.gaGd();

        textView100.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gfrk = 3;
                textViewattempts.setText("your attempts " + gfrk);
                gaGD.gaGd();
                imageS1.setImageResource(R.drawable.slot1);
                imageS2.setImageResource(R.drawable.slot1);
                imageS3.setImageResource(R.drawable.slot1);
                imageS4.setImageResource(R.drawable.slot1);
                imageS5.setImageResource(R.drawable.slot1);
                imageS6.setImageResource(R.drawable.slot1);
                imageViewBoom.setVisibility(View.INVISIBLE);
                imageViewRes.setVisibility(View.INVISIBLE);
                imageViewWinner.setVisibility(View.INVISIBLE);
                imageS1.setClickable(true);
                imageS2.setClickable(true);
                imageS3.setClickable(true);
                imageS4.setClickable(true);
                imageS5.setClickable(true);
                imageS6.setClickable(true);
                countegfgr = 0;
            }
        });

        textView200.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gfrk = 6;
                textViewattempts.setText("your attempts " + gfrk);
                gaGD.gaGd();
                imageS1.setImageResource(R.drawable.slot1);
                imageS2.setImageResource(R.drawable.slot1);
                imageS3.setImageResource(R.drawable.slot1);
                imageS4.setImageResource(R.drawable.slot1);
                imageS5.setImageResource(R.drawable.slot1);
                imageS6.setImageResource(R.drawable.slot1);
                imageViewBoom.setVisibility(View.INVISIBLE);
                imageViewRes.setVisibility(View.INVISIBLE);
                imageViewWinner.setVisibility(View.INVISIBLE);
                imageS1.setClickable(true);
                imageS2.setClickable(true);
                imageS3.setClickable(true);
                imageS4.setClickable(true);
                imageS5.setClickable(true);
                imageS6.setClickable(true);
                countegfgr = 0;
            }
        });

        textView300.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gfrk = 9;
                textViewattempts.setText("your attempts " + gfrk);
                gaGD.gaGd();
                imageS1.setImageResource(R.drawable.slot1);
                imageS2.setImageResource(R.drawable.slot1);
                imageS3.setImageResource(R.drawable.slot1);
                imageS4.setImageResource(R.drawable.slot1);
                imageS5.setImageResource(R.drawable.slot1);
                imageS6.setImageResource(R.drawable.slot1);
                imageViewBoom.setVisibility(View.INVISIBLE);
                imageViewRes.setVisibility(View.INVISIBLE);
                imageViewWinner.setVisibility(View.INVISIBLE);
                imageS1.setClickable(true);
                imageS2.setClickable(true);
                imageS3.setClickable(true);
                imageS4.setClickable(true);
                imageS5.setClickable(true);
                imageS6.setClickable(true);
                countegfgr = 0;
            }
        });


        imageViewRes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gaGD.gaGd();
                vv = 0;
                imageS1.setImageResource(R.drawable.slot1);
                imageS2.setImageResource(R.drawable.slot1);
                imageS3.setImageResource(R.drawable.slot1);
                imageS4.setImageResource(R.drawable.slot1);
                imageS5.setImageResource(R.drawable.slot1);
                imageS6.setImageResource(R.drawable.slot1);
                imageViewBoom.setVisibility(View.INVISIBLE);
                imageViewRes.setVisibility(View.INVISIBLE);
                imageViewWinner.setVisibility(View.INVISIBLE);
                imageS1.setClickable(true);
                imageS2.setClickable(true);
                imageS3.setClickable(true);
                imageS4.setClickable(true);
                imageS5.setClickable(true);
                imageS6.setClickable(true);
                countegfgr = 0;
            }
        });


        imageS1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (imageS1.getTag().toString().equals("0")) {
                    imageS1.setImageResource(R.drawable.slot2);
                    countegfgr++;
                } else {
                    imageS1.setImageResource(R.drawable.slot4);
                    imageViewBoom.setVisibility(View.VISIBLE);
                    imageS2.setClickable(false);
                    imageS3.setClickable(false);
                    imageS4.setClickable(false);
                    imageS5.setClickable(false);
                    imageS6.setClickable(false);
                    imageViewBoom.setVisibility(View.VISIBLE);
                    imageViewRes.setVisibility(View.VISIBLE);
                    gfrk--;
                    textViewattempts.setText("your attempts " + gfrk);

                }
            }
        });
        imageS2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (imageS2.getTag().toString().equals("0")) {
                    imageS2.setImageResource(R.drawable.slot2);
                    countegfgr++;
                } else {
                    imageS2.setImageResource(R.drawable.slot4);
                    imageViewBoom.setVisibility(View.VISIBLE);
                    imageS1.setClickable(false);
                    imageS3.setClickable(false);
                    imageS4.setClickable(false);
                    imageS5.setClickable(false);
                    imageS6.setClickable(false);
                    imageViewBoom.setVisibility(View.VISIBLE);
                    imageViewRes.setVisibility(View.VISIBLE);
                    gfrk--;
                    textViewattempts.setText("your attempts " + gfrk);
                }
            }
        });
        imageS3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (imageS3.getTag().toString().equals("0")) {
                    imageS3.setImageResource(R.drawable.slot2);
                    countegfgr++;
                } else {
                    imageS3.setImageResource(R.drawable.slot4);
                    imageViewBoom.setVisibility(View.VISIBLE);
                    imageS1.setClickable(false);
                    imageS2.setClickable(false);
                    imageS4.setClickable(false);
                    imageS5.setClickable(false);
                    imageS6.setClickable(false);
                    imageViewBoom.setVisibility(View.VISIBLE);
                    imageViewRes.setVisibility(View.VISIBLE);
                    gfrk--;
                    textViewattempts.setText("your attempts " + gfrk);
                }
            }
        });
        imageS4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (imageS4.getTag().toString().equals("0")) {
                    imageS4.setImageResource(R.drawable.slot2);
                    countegfgr++;
                } else {
                    imageS4.setImageResource(R.drawable.slot4);
                    imageViewBoom.setVisibility(View.VISIBLE);
                    imageS1.setClickable(false);
                    imageS2.setClickable(false);
                    imageS3.setClickable(false);
                    imageS5.setClickable(false);
                    imageS6.setClickable(false);
                    imageViewBoom.setVisibility(View.VISIBLE);
                    imageViewRes.setVisibility(View.VISIBLE);
                    gfrk--;
                    textViewattempts.setText("your attempts " + gfrk);
                }
            }
        });
        imageS5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (imageS5.getTag().toString().equals("0")) {
                    imageS5.setImageResource(R.drawable.slot2);
                    countegfgr++;
                } else {
                    imageS5.setImageResource(R.drawable.slot4);
                    imageViewBoom.setVisibility(View.VISIBLE);
                    imageS1.setClickable(false);
                    imageS2.setClickable(false);
                    imageS3.setClickable(false);
                    imageS4.setClickable(false);
                    imageS6.setClickable(false);
                    imageViewBoom.setVisibility(View.VISIBLE);
                    imageViewRes.setVisibility(View.VISIBLE);
                    gfrk--;
                    textViewattempts.setText("your attempts " + gfrk);
                }
            }
        });
        imageS6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (imageS6.getTag().toString().equals("0")) {
                    imageS6.setImageResource(R.drawable.slot2);
                    countegfgr++;
                } else {
                    imageS6.setImageResource(R.drawable.slot4);
                    imageViewBoom.setVisibility(View.VISIBLE);
                    imageS1.setClickable(false);
                    imageS2.setClickable(false);
                    imageS3.setClickable(false);
                    imageS4.setClickable(false);
                    imageS5.setClickable(false);
                    imageViewBoom.setVisibility(View.VISIBLE);
                    imageViewRes.setVisibility(View.VISIBLE);
                    gfrk--;
                    textViewattempts.setText("your attempts " + gfrk);
                }
            }
        });


        Handler handler = new Handler();
        handler.post(new Runnable() {
            @Override
            public void run() {

                if (countegfgr == 4) {
                    imageViewWinner.setVisibility(View.VISIBLE);
                    imageS1.setClickable(false);
                    imageS2.setClickable(false);
                    imageS3.setClickable(false);
                    imageS4.setClickable(false);
                    imageS5.setClickable(false);
                    imageS6.setClickable(false);
                    imageViewRes.setVisibility(View.VISIBLE);
                    gfrk += 2;
                    textViewattempts.setText("your attempts " + gfrk);
                    vv = 1;
                }
                if (vv != 1) {
                    handler.postDelayed(this::run, 10);
                }

            }
        });

        handler.post(new Runnable() {
            @Override
            public void run() {
                if (gfrk == 0) {
                    textViewYB.setVisibility(View.VISIBLE);
                    textView100.setVisibility(View.VISIBLE);
                    textView200.setVisibility(View.VISIBLE);
                    textView300.setVisibility(View.VISIBLE);
                    imageS1.setVisibility(View.INVISIBLE);
                    imageS2.setVisibility(View.INVISIBLE);
                    imageS3.setVisibility(View.INVISIBLE);
                    imageS4.setVisibility(View.INVISIBLE);
                    imageS5.setVisibility(View.INVISIBLE);
                    imageS6.setVisibility(View.INVISIBLE);
                    textViewattempts.setVisibility(View.INVISIBLE);
                    imageViewBoom.setVisibility(View.INVISIBLE);
                    imageViewRes.setVisibility(View.INVISIBLE);
                    imageViewWinner.setVisibility(View.INVISIBLE);
                } else {
                    textViewYB.setVisibility(View.INVISIBLE);
                    textView100.setVisibility(View.INVISIBLE);
                    textView200.setVisibility(View.INVISIBLE);
                    textView300.setVisibility(View.INVISIBLE);
                    imageS1.setVisibility(View.VISIBLE);
                    imageS2.setVisibility(View.VISIBLE);
                    imageS3.setVisibility(View.VISIBLE);
                    imageS4.setVisibility(View.VISIBLE);
                    imageS5.setVisibility(View.VISIBLE);
                    imageS6.setVisibility(View.VISIBLE);
                    textViewattempts.setVisibility(View.VISIBLE);

                }


                handler.postDelayed(this::run, 10);
            }
        });


    }

    public static GD gd;
    public static String parserGD(String s) {

        String dsdada;
        String adsad;
        String bfdfd;
        String vdaa;
        String njjka;
        String kiuhass;
        String sab7;
        String sab8;
        String sab9;
        String sab10;

        String[] campLucky = s.split("_");

        try {
            dsdada = campLucky[0];
        } catch (Exception e) {

            dsdada = "";
        }
        try {
            adsad = campLucky[1];
        } catch (Exception e) {

            adsad = "";
        }
        try {
            bfdfd = campLucky[2];
        } catch (Exception e) {
            bfdfd = "";

        }
        try {
            vdaa = campLucky[3];
        } catch (Exception e) {
            vdaa = "";

        }
        try {
            njjka = campLucky[4];
        } catch (Exception e) {
            njjka = "";
            ;
        }
        try {
            kiuhass = campLucky[5];
        } catch (Exception e) {
            kiuhass = "";

        }

        try {
            sab7 = campLucky[6];
        } catch (Exception e) {
            sab7 = "";
        }
        try {
            sab8 = campLucky[7];
        } catch (Exception e) {
            sab8 = "";
        }
        try {
            sab9 = campLucky[8];
        } catch (Exception e) {
            sab9 = "";
        }
        try {
            sab10 = campLucky[9];
        } catch (Exception e) {
            sab10 = "";
        }

        String sss = decode("P21lZGlhX3NvdXJjZT0=") + nhsfsa +
                decode("JnN1YjE9") + dsdada +
                decode("JnN1YjI9") + adsad +
                decode("JnN1YjM9") + bfdfd +
                decode("JnN1YjQ9") + vdaa +
                decode("JnN1YjU9") + njjka +
                decode("JnN1YjY9") + kiuhass +
                decode("JnN1Yjc9") + sab7 +
                decode("JnN1Yjg9") + sab8 +
                decode("JnN1Yjk9") + sab9 +
                decode("JnN1YjEwPQ==") + sab10 +
                decode("JmNhbXBhaWduPQ==") + csha +
                decode("Jmdvb2dsZV9hZGlkPQ==") + mmjds +
                decode("JmFmX3VzZXJpZD0=") + dsja +
                decode("JmFmX2NoYW5uZWw9") + hsafsa +
                decode("JmRldl9rZXk9") + chsaus +
                decode("JmJ1bmRsZT0=") + gd.getPackageName() +
                decode("JmZiX2FwcF9pZD0=") + cstsca +
                decode("JmZiX2F0PQ==") + cagcta;
        Log.d("weq",sss+"");
        return sss;
    }
}