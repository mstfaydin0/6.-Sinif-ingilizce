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


public class Unit3V extends AppCompatActivity {

    private InterstitialAd mInterstitialAd;

    int counter=-1;
    TextView textView;
    Button nextButton;
    Button prevButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_unit3_v);
        textView=(TextView)findViewById(R.id.ttt);
        nextButton=(Button)findViewById(R.id.button102);
        prevButton=(Button)findViewById(R.id.button103);

        MobileAds.initialize(this, new OnInitializationCompleteListener() {
            @Override
            public void onInitializationComplete(InitializationStatus initializationStatus) {
            }
        });

        mInterstitialAd = new InterstitialAd(this);
        mInterstitialAd.setAdUnitId("ca-app-pub-9455123396521751/2123548962");
        mInterstitialAd.loadAd(new AdRequest.Builder().build());

        textView.setText("Challenges are what make life interesting and overcoming them is what makes life meaningful.\n\nHayatı ilginç yapan zorluklardır. Anlamlı kılan ise zorlukların üstesinden gelmek.");


        final String array[]={"1.  Awarage: Ortalama\n" +
                "2. Barn: Çiftlik ambarı\n" +
                "3. Beatiful: Güzel\n" +
                "4. Big: Büyük\n" +
                "5. Busy: Meşgul\n" +
                "6. Buy a ticket: Bilet almak\n" +
                "7. Car park: Araba parkı\n" +
                "8. Chase a cat: Kedi yakalamak\n" +
                "9. Cheap: Ucuz\n" +
                "10.    Cinema: Sinema\n" +
                "11.    City: Şehir\n" +
                "12.    Comfortable: Rahat\n" +
                "13.    Concert: Konser\n" +
                "14.    Country: Ülke\n" +
                "15.    County: İlçe\n" +
                "16.    Cross the street: Karşıya geçmek\n",
                "17.    Crowded: Kalabalık\n" +
                "18.    Cry: Ağlamak\n" +
                "19.    Different: Farklı\n" +
                "20.    Difficult: Zor\n" +
                "21.    Downtown: Şehir merkezi\n" +
                "22.    Drive a car: Araba sürmek\n" +
                "23.    Elevator: Asansör\n" +
                "24.    Enviroment: Çevre\n" +
                "25.    Expensive: Pahalı\n" +
                "26.    Fast: Hızlı\n" +
                "27.    Feed: Beslemek\n" +
                "28.    For rent: Kiralamak\n" +
                "29.    For sale: Satılık\n" +
                "30.    Go shopping: Alışverişe gitmek\n" +
                "31.    Great: Müthiş\n","32.    Have fun: Eğlenmek\n" +
                "33.    Hotel: Otel\n" +
                "34.    Information: Bilgi\n" +
                "35.    Interesting: İlginç\n" +
                "36.    Joke: Şaka\n" +
                "37.    Cool: Havalı\n" +
                "38.    Line: Çizgi,Hat\n" +
                "39.    Meatball: Köfte\n" +
                "40.    Meet: Buluşmak\n" +
                "41.    Metro: Metro\n" +
                "42.    More: Daha fazla\n" +
                "43.    Musemum: Müze\n" +
                "44.    Nice: İyi,Güzel\n" +
                "45.    Pavement: Kaldırım\n" +
                "46.    Place: Yer\n" +
                "47.    Play soccer: Futbol oynamak\n" +
                "48.    Playground: Oyun alanı\n" +
                "49.    Poor you: Zavallı sen\n","50.    Population: Nüfus\n" +
                "51.    Queue: Kuyruk,Sıra\n" +
                "52.    Quiet: Sessiz\n" +
                "53.    Relaxing: Rahatlama\n" +
                "54.    Rent: Kiralamak\n" +
                "55.    Mall: Alışveriş merkezi\n" +
                "56.    Skeatboard: Kaykay\n" +
                "57.    Skyscarper: Gökdelen\n" +
                "58.    Small: Küçük\n" +
                "59.    Subway: Metro\n" +
                "60.    Take a Photo: Fotoğraf çekmek\n" +
                "61.    Take care: Dikkat etmek\n" +
                "62.    Town: Kasaba\n" +
                "63.    Train station: Tren istasyonu\n" +
                "64.    Which: Hangisi?\n"};
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

