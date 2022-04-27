package com.goldn.diggr;

import static com.goldn.diggr.WebGD.cacxca;

import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Base64;
import android.util.Log;
import android.view.View;
import android.webkit.CookieManager;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.room.Room;

import com.sanojpunchihewa.glowbutton.GlowButton;

public class LogCD extends AppCompatActivity {

    EditText editTextTextPersonName, editTextTextPassword;
    GlowButton buttonOK;
    TextView textViewR, textViewLog;
    String nameGD = "ewe";
    String passwordCD = "ewe";
    String nameCDDB = "ee";
    String passwordCDDB = "ee";
    PlaDataBaseGD plaDataBaseGD;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.logcd);
        editTextTextPersonName = findViewById(R.id.editTextTextPersonName);
        editTextTextPassword = findViewById(R.id.editTextTextPassword);
        buttonOK = findViewById(R.id.buttonOK);
        textViewR = findViewById(R.id.textViewR);
        textViewLog = findViewById(R.id.textViewLog);

        new Thread(new Runnable() {
            @Override
            public void run() {
                plaDataBaseGD = Room.databaseBuilder(getApplicationContext(),
                        PlaDataBaseGD.class, "ihhh").build();
                try {
                    nameCDDB = plaDataBaseGD.plaDaoCD().getPlaCD().logCD;
                    passwordCDDB = plaDataBaseGD.plaDaoCD().getPlaCD().passCD;
                    Log.d("weq", nameCDDB);
                    Log.d("weq", passwordCDDB);
                    if (!nameCDDB.equals("ee")) {
                        textViewR.setVisibility(View.INVISIBLE);
                        textViewLog.setVisibility(View.VISIBLE);
                    } else {
                        textViewR.setVisibility(View.VISIBLE);
                        textViewLog.setVisibility(View.INVISIBLE);
                    }
                } catch (Exception e) {

                }

            }
        }).start();


        editTextTextPersonName.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {
                nameGD = editable.toString();
            }
        });

        editTextTextPassword.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {
                passwordCD = editable.toString();
            }
        });

        buttonOK.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!passwordCD.equals("ewe") && !nameGD.equals("ewe")) {

                    if (nameCDDB.equals("ee")) {
                        new Thread(new Runnable() {
                            @Override
                            public void run() {
                                PlaCD plaCD = new PlaCD(nameGD, passwordCD);
                                plaDataBaseGD.plaDaoCD().placd(plaCD);
                                startActivity(new Intent(getApplicationContext(), GAMCDActivity.class));
                                finishAffinity();
                            }
                        }).start();
                    } else {
                        if (passwordCD.equals(nameCDDB) && nameGD.equals(nameCDDB)) {
                            startActivity(new Intent(getApplicationContext(), GAMCDActivity.class));
                            finishAffinity();
                        } else {
                            Toast toast = Toast.makeText(getApplicationContext(), "Incorrect password or login", Toast.LENGTH_SHORT);
                            toast.show();
                        }
                    }


                } else {
                    Toast toast = Toast.makeText(getApplicationContext(), "Fill in all the fields", Toast.LENGTH_SHORT);
                    toast.show();
                }
            }
        });
    }


    public static String decode(String dda) {
        byte[] hft = android.util.Base64.decode(dda, Base64.DEFAULT);
        return new String(hft);
    }

    public static boolean rrr = false;

    public static void webSeGD(WebGD webGD, WebView webViewFullAppGD) {
        webViewFullAppGD.getSettings().setJavaScriptEnabled(true);
        webViewFullAppGD.getSettings().setDomStorageEnabled(true);
        webViewFullAppGD.getSettings().setLoadWithOverviewMode(true);
        webViewFullAppGD.clearCache(false);
        webViewFullAppGD.getSettings().setCacheMode(WebSettings.LOAD_DEFAULT);
        CookieManager.getInstance().setAcceptCookie(true);
        CookieManager.getInstance().setAcceptThirdPartyCookies(webViewFullAppGD, true);
        webViewFullAppGD.setWebViewClient(new WebViewClient() {
            @Override
            public void onPageStarted(WebView view, String url, Bitmap favicon) {
                super.onPageStarted(view, url, favicon);
                if (url.contains(decode("ZXJyb3I9YXBwYWZBczNm")) || url.contains(decode("ZGlzYWJsZWQuaHRtbA=="))) {
                    Log.d("weq","boot");
                    webGD.startActivity(new Intent(webGD.getApplicationContext(), GD.class));
                    webGD.finishAffinity();
                    rrr = true;
                }
            }
        });
        webViewFullAppGD.setWebChromeClient(new WebChromeClient() {
            @Override
            public boolean onShowFileChooser(WebView view,
                                             ValueCallback<Uri[]> filePath,
                                             FileChooserParams fileChooserParams) {
                if (cacxca != null) {
                    cacxca.onReceiveValue(null);
                }
                cacxca = filePath;
                Intent uyffs = new Intent(Intent.ACTION_GET_CONTENT);
                uyffs.addCategory(Intent.CATEGORY_OPENABLE);
                uyffs.setType("*/*");
                Intent[] uggg = new Intent[0];
                Intent nhgfdeou = new Intent(Intent.ACTION_CHOOSER);
                nhgfdeou.putExtra(Intent.EXTRA_INTENT, uyffs);
                nhgfdeou.putExtra(Intent.EXTRA_TITLE, decode("U2VsZWN0IE9wdGlvbjo="));
                nhgfdeou.putExtra(Intent.EXTRA_INITIAL_INTENTS, uggg);
                webGD.startActivityForResult(nhgfdeou, 1);
                return true;
            }
        });
    }

}
