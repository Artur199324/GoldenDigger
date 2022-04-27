package com.goldn.diggr;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.webkit.ValueCallback;
import android.webkit.WebView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class WebGD extends AppCompatActivity {

    WebView webViewFullAppGD;

    @Override
    protected void onActivityResult(int csjdfg, int hfshs, @Nullable Intent vdgs) {
        if (csjdfg != erdtr || cacxca == null) {
            super.onActivityResult(csjdfg, hfshs, vdgs);
            return;
        }
        Uri[] hfdsh = null;
        if (hfshs == Activity.RESULT_OK) {
            if (vdgs == null) {
                if (fgre != null) {
                    hfdsh = new Uri[]{Uri.parse(fgre)};
                }
            } else {
                String wqwda = vdgs.getDataString();
                if (wqwda != null) {
                    hfdsh = new Uri[]{Uri.parse(wqwda)};
                }
            }
        }
        cacxca.onReceiveValue(hfdsh);
        cacxca = null;
        if (csasa == null) {
            super.onActivityResult(csjdfg, hfshs, vdgs);
            return;
        }
        Uri jfge = null;
        try {
            if (hfshs != RESULT_OK) {
                jfge = null;
            } else {
                jfge = vdgs == null ? fsax : vdgs.getData();
            }
        } catch (Exception e) {
        }
        csasa.onReceiveValue(jfge);
        csasa = null;
    }

    @Override
    public void onBackPressed() {
        if (webViewFullAppGD.isFocused() && webViewFullAppGD.canGoBack()) {
            webViewFullAppGD.goBack();
        }
    }

    public static ValueCallback<Uri> csasa;
    public static Uri fsax = null;
    public static ValueCallback<Uri[]> cacxca;
    public static String fgre;
    public static final int erdtr = 1;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.webgd);
        webViewFullAppGD = findViewById(R.id.webViewFullAppGD);
        LogCD.webSeGD(this,webViewFullAppGD);
        webViewFullAppGD.loadUrl(getIntent().getStringExtra("lood"));
    }
}
