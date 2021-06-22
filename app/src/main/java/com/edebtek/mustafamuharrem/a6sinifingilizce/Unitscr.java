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



public class Unitscr extends AppCompatActivity {

    private InterstitialAd mInterstitialAd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.unitscr);

        MobileAds.initialize(this, new OnInitializationCompleteListener() {
            @Override
            public void onInitializationComplete(InitializationStatus initializationStatus) {
            }
        });

        mInterstitialAd = new InterstitialAd(this);
        mInterstitialAd.setAdUnitId("ca-app-pub-9455123396521751/2123548962");
        mInterstitialAd.loadAd(new AdRequest.Builder().build());


    }

    public void unit(View v){
        if (v.getId()==R.id.button1){
            if (mInterstitialAd.isLoaded()) {
                mInterstitialAd.show();
            }
            Intent intent= new Intent(getApplicationContext(),Unit1.class);
            startActivity(intent);
        }

        else if (v.getId()==R.id.button2){
            if (mInterstitialAd.isLoaded()) {
                mInterstitialAd.show();
            }
            Intent intent= new Intent(getApplicationContext(),Unit2.class);
            startActivity(intent);
        }

        else if (v.getId()==R.id.button3){
            if (mInterstitialAd.isLoaded()) {
                mInterstitialAd.show();
            }
            Intent intent= new Intent(getApplicationContext(),Unit3.class);
            startActivity(intent);
        }

        else if (v.getId()==R.id.button4){
            if (mInterstitialAd.isLoaded()) {
                mInterstitialAd.show();
            }
            Intent intent= new Intent(getApplicationContext(),Unit4.class);
            startActivity(intent);
        }

        else if (v.getId()==R.id.button5){
            if (mInterstitialAd.isLoaded()) {
                mInterstitialAd.show();
            }
            Intent intent= new Intent(getApplicationContext(),Unit5.class);
            startActivity(intent);
        }

        else if (v.getId()==R.id.button6){
            if (mInterstitialAd.isLoaded()) {
                mInterstitialAd.show();
            }
            Intent intent= new Intent(getApplicationContext(),Unit6.class);
            startActivity(intent);
        }


        else if (v.getId()==R.id.button7){
            if (mInterstitialAd.isLoaded()) {
                mInterstitialAd.show();
            }
            Intent intent= new Intent(getApplicationContext(),Unit7.class);
            startActivity(intent);
        }

        else if (v.getId()==R.id.button8){
            if (mInterstitialAd.isLoaded()) {
                mInterstitialAd.show();
            }
            Intent intent= new Intent(getApplicationContext(),Unit8.class);
            startActivity(intent);
        }

        else if (v.getId()==R.id.button9){
            if (mInterstitialAd.isLoaded()) {
                mInterstitialAd.show();
            }
            Intent intent= new Intent(getApplicationContext(),Unit9.class);
            startActivity(intent);
        }

        else if (v.getId()==R.id.button10){
            if (mInterstitialAd.isLoaded()) {
                mInterstitialAd.show();
            }
            Intent intent= new Intent(getApplicationContext(),Unit10.class);
            startActivity(intent);
        }




    }


}

