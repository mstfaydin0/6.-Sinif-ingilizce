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


public class Unit8V extends AppCompatActivity {

    private InterstitialAd mInterstitialAd;

    int counter=-1;
    TextView textView;
    Button nextButton;
    Button prevButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_unit8_v);
        textView=(TextView)findViewById(R.id.ttt);
        nextButton=(Button)findViewById(R.id.button112);
        prevButton=(Button)findViewById(R.id.button113);
        MobileAds.initialize(this, new OnInitializationCompleteListener() {
            @Override
            public void onInitializationComplete(InitializationStatus initializationStatus) {
            }
        });

        mInterstitialAd = new InterstitialAd(this);
        mInterstitialAd.setAdUnitId("ca-app-pub-9455123396521751/2123548962");
        mInterstitialAd.loadAd(new AdRequest.Builder().build());

        textView.setText("The one who falls and gets up is so much stronger than the one who never fell.\n\nDüşen ve ayağa kalkan birisi hiç düşmeyenden daha güçlüdür.");


        final String array[]={"1.  Arrest: Tutuklamak\n" +
                "2. Behind: Arkasında\n" +
                "3. Beetween: Arasında\n" +
                "4. Break into: Zorla girmek\n" +
                "5. Burglar: Hırsız\n" +
                "6. Call: Aramak(Telefon)\n" +
                "7. Cap: Şapka\n" +
                "8. Cash: Nakit para\n" +
                "9. Catch: Yakalamak\n" +
                "10.    Catch of thief: Hırsız yakalamak\n" +
                "11.    Cell: Hücre\n" +
                "12.    Chase: Kovalamak\n" +
                "13.    Clue: İpucu\n" +
                "14.    Communication: İletşim\n" +
                "15.    Count: Saymak\n", "16.    Crime: Suç\n" +
                "17.    Detective: Dedektif\n" +
                "18.    Did you hear about?: Duydun mu?\n" +
                "19.    Drawer: Çekmece\n" +
                "20.    Find: Bulmak\n" +
                "21.    Find out: Öğrenmek\n" +
                "22.    Finger print: Parmak izi\n" +
                "23.    Follow: Takip etmek\n" +
                "24.    Footprint: Ayak izi\n" +
                "25.    Go to prison: Hapse girmek\n" +
                "26.    Guilty: Suçlu\n" +
                "27.    Gun: Silah\n" +
                "28.    Happen: Olmak\n" +
                "29.    Hundred: Yüz(sayı)\n","30.    ID: Kimlik\n" +
                "31.    Identıty: Kimlik\n" +
                "32.    In: İçinde\n" +
                "33.    In front of: Önünde\n" +
                "34.    Investigate: Soruşturmak\n" +
                "35.    Jail: Hapishane\n" +
                "36.    Jewellery: Kuyumcu\n" +
                "37.    Lie: Yalan\n" +
                "38.    Look for: Aramak\n" +
                "39.    Lose: Kaybetmek\n" +
                "40.    Magnifier: Büyüteç\n" +
                "41.    Magnifying glass: Büyüteç\n" +
                "42.    Mask: Maske\n" +
                "43.    Million: Milyon\n" +
                "44.    Next to: Yanında\n","45.    Observation: Gözleme\n" +
                "46.    Observe: Gözlemek\n" +
                "47.    On: Üstünde\n" +
                "48.    Opposite: Karşısında\n" +
                "49.    Prison: Hapishane\n" +
                "50.    Rob: Soymak\n" +
                "51.    Robber: Soyguncu\n" +
                "52.    Robbery: Soygunculuk\n" +
                "53.    Run away: Kaçmak\n" +
                "54.    Safe: Güvenli\n","55.    Security: Güvenlik\n" +
                "56.    Security guard: Güvenlik görevlisi\n" +
                "57.    Steal: Çalmak\n" +
                "58.    Strange: Yabancı\n" +
                "59.    Suspect: Şüphelenmek\n" +
                "60.    Suspicious: Şüpheli\n" +
                "61.    Thief: Hırsız\n" +
                "62.    Thousand: Bin(Sayı)\n" +
                "63.    Turn off: Kapatmak\n" +
                "64.    Turn on: Açmak\n" +
                "65.    Under: Altnda\n" +
                "66.    Wallet: Cüzdan\n" +
                "67.    Witness: Şahit\n"};
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

