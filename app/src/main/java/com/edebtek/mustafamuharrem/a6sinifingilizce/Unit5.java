package com.edebtek.mustafamuharrem.a6sinifingilizce;

import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;
import com.google.android.gms.ads.InterstitialAd;
import com.google.android.gms.ads.AdRequest;




public class Unit5 extends AppCompatActivity {

    private InterstitialAd mInterstitialAd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_unit5);

        MobileAds.initialize(this, new OnInitializationCompleteListener() {
            @Override
            public void onInitializationComplete(InitializationStatus initializationStatus) {
            }
        });

        mInterstitialAd = new InterstitialAd(this);
        mInterstitialAd.setAdUnitId("ca-app-pub-9455123396521751/2123548962");
        mInterstitialAd.loadAd(new AdRequest.Builder().build());




    }
    public void in(View v){

        if (v.getId()==R.id.button22){
            if (mInterstitialAd.isLoaded()) {
                mInterstitialAd.show();
            }
            Intent intent= new Intent(getApplicationContext(),Unit5V.class);
            startActivity(intent);
        }

        else if (v.getId()==R.id.button23){
            if (mInterstitialAd.isLoaded()) {
                mInterstitialAd.show();
            }
            Intent intent= new Intent(getApplicationContext(),Unit5G.class);
            startActivity(intent);
        }

    }
}