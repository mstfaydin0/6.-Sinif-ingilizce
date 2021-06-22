package com.edebtek.mustafamuharrem.a6sinifingilizce;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;
import com.google.android.gms.ads.InterstitialAd;
import com.google.android.gms.ads.AdRequest;


public class Unit4V extends AppCompatActivity {

    private InterstitialAd mInterstitialAd;

    int counter=-1;
    TextView textView;
    Button nextButton;
    Button prevButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_unit4_v);
        textView=(TextView)findViewById(R.id.ttt);
        nextButton=(Button)findViewById(R.id.button104);
        prevButton=(Button)findViewById(R.id.button105);

        MobileAds.initialize(this, new OnInitializationCompleteListener() {
            @Override
            public void onInitializationComplete(InitializationStatus initializationStatus) {
            }
        });

        mInterstitialAd = new InterstitialAd(this);
        mInterstitialAd.setAdUnitId("ca-app-pub-9455123396521751/2123548962");
        mInterstitialAd.loadAd(new AdRequest.Builder().build());


        textView.setText("The best view comes after the hardest climb.\n\nEn iyi manzara en zor tırmanışın ardından gelir.");


        final String array[]={"1.  Affect: Etkilemek\n" +
                "2. Angry: Kızgın\n" +
                "3. Anixous: Heyecanlı\n" +
                "4. Barometer: Barometre\n" +
                "5. Be careful: Dikkatli ol\n" +
                "6. Beach: Sahil\n" +
                "7. Boiling: Suda pişmiş\n" +
                "8. Bored: Sıkılmış\n" +
                "9. Buddy: Arkadaş ,Ahbap\n" +
                "10.     Celcisus: Santigrat\n" +
                "11.    Chilly: Üşütücü serinlik\n" +
                "12.    Cloud: Bulut\n" +
                "13.    Cloudy: Bulutlu\n" +
                "14.    Coat: Manto\n" +
                "15.    Cold: Soğuk\n" +
                "16.    Cool: Serin\n", "17.    Degrees: Derece\n" +
                "18.    Drive carefully: Dikkatli sürmek\n" +
                "19.    Drizzling: Çiseleme\n" +
                "20.    Dry: Kuru\n" +
                "21.    Dull: Donuk sıkıcı\n" +
                "22.    Emotion: Duygu\n" +
                "23.    Excited: Heyecanlı\n" +
                "24.    Exhausted: Yorgun\n" +
                "25.    Fabulous: Muhteşem\n" +
                "26.    Feel: Hissetmek\n" +
                "27.    Ferris wheel: Dönme dolap\n" +
                "28.    Fog: Sis\n" +
                "29.    Foggy: Sisli\n" +
                "30.    Freezing: Dondurucu\n" +
                "31.    Get the flu: Grip olmak\n" +
                "32.    Get well soon: Geçmiş olsun\n" +
                "33.    Go for a walk: Yürüyüşe çıkmak\n" +
                "34.    Go trekking: Dağ yürüyüşüne çıkmak\n","35.    Hailing: Dolu yağışı\n" +
                "36.    Ice: Buz\n" +
                "37.    Icy: Buzlu\n" +
                "38.    Lightning: Şimşek\n" +
                "39.    Make a snowman: Kardan adam yapmak\n" +
                "40.    Moody: Karamsar\n" +
                "41.    Partly cloudy : Parçalı bulutlu\n" +
                "42.    Perfect: Mükemmel\n" +
                "43.    Rain: Yağmur\n" +
                "44.    Rainy: Yağmurlu\n" +
                "45.    Real: Gerçek\n" +
                "46.    Happy: Mutlu\n" +
                "47.    Sad: Üzgün\n","48.    Scared: Korkmuş\n" +
                "49.    Scarf: Atkı\n" +
                "50.    Sleepy: Uykulu\n" +
                "51.    Slip: Kaydırmak\n" +
                "52.    Snow: Kar\n" +
                "53.    Snowy: Karlı\n" +
                "54.    Song: Şarkı\n" +
                "55.    Spring: İlkbahar\n" +
                "56.    Storm: Fırtına\n" +
                "57.    Stormy: Fırtınalı\n" +
                "58.    Sun: Güneş\n" +
                "59.    Sunbathing: Güneşlenmek\n" +
                "60.    Sunny: Güneşli\n" +
                "61.    Swimming: Yüzmek\n","62.    Take care: Dikkat etmek\n" +
                "63.    Thunder: Gök gürültüsü\n" +
                "64.    Verse: Mısra\n" +
                "65.    Warm: Ilık\n" +
                "66.    Wear jacket: Ceket giymek\n" +
                "67.    Weather forecast: Hava durumu\n" +
                "68.    Wet: Islak\n" +
                "69.    Win: Kazanmak\n" +
                "70.    Wind: Rüzgar\n" +
                "71.    Windy:Rüzgarlı\n"};
        nextButton.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {

                if (mInterstitialAd.isLoaded()) {
                    mInterstitialAd.show();
                }

                counter++;

//If counter has come to end of array, set it to the first item.

                if(counter==array.length) counter=0;

                textView.setText(array[counter]);

            }

        });

        prevButton.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {

                if (mInterstitialAd.isLoaded()) {
                    mInterstitialAd.show();
                }

                counter--;

//If counter has come to starting of array, set it to the last item.

                if(counter<0) counter=array.length-1;

                textView.setText(array[counter]);

            }

        });






    }
}

