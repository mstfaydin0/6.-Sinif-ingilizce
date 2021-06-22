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


public class Unit5V extends AppCompatActivity {

    private InterstitialAd mInterstitialAd;

    int counter=-1;
    TextView textView;
    Button nextButton;
    Button prevButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_unit5_v);
        textView=(TextView)findViewById(R.id.ttt);
        nextButton=(Button)findViewById(R.id.button106);
        prevButton=(Button)findViewById(R.id.button107);
        MobileAds.initialize(this, new OnInitializationCompleteListener() {
            @Override
            public void onInitializationComplete(InitializationStatus initializationStatus) {
            }
        });

        mInterstitialAd = new InterstitialAd(this);
        mInterstitialAd.setAdUnitId("ca-app-pub-9455123396521751/2123548962");
        mInterstitialAd.loadAd(new AdRequest.Builder().build());



        textView.setText("Everything comes to you at the perfect time. Be patient.\n\nHerşey doğru zamanda size gelir. Sabırlı olun.");


        final String array[]={"1.  Amazed: Şaşırmış\n" +
                "2. Amazing: Şaşırtıcı\n" +
                "3. Amusement: Eğlence parkı\n" +
                "4. Big wheel: Dönme dolap\n" +
                "5. Bored: Sıkılmış\n" +
                "6. Boring: Sıkıcı\n" +
                "7. Bumper cars: Çarpışan arabalar\n" +
                "8. Carnival: Karnaval\n" +
                "9. Carrosuel: Atlıkarınca\n" +
                "10.    Caterpillar: Tırtıl\n" +
                "11.    Cheap: Ucuz\n" +
                "12.    Come on: Haydi\n" +
                "13.    Corn on the cob: Koçanlı mısır\n" +
                "14.    Cotton candy: Pamuk şeker\n" +
                "15.    Crazy: Çılgın\n", "16.    Dangerous: Tehlikeli\n" +
                "17.    Delicious: Lezzetli\n" +
                "18.    Dull: Donuk\n" +
                "19.    Entry: Giriş\n" +
                "20.    Exciting: Heyecan verici\n" +
                "21.    Expensive: Pahalı\n" +
                "22.    Fair: Fuar,İyi\n" +
                "23.    Fantastic: Muhteşem\n" +
                "24.    Frightened: Korkmuş\n" +
                "25.    Fun: Eğlenceli\n" +
                "26.    Funfair: Lunapark\n" +
                "27.    Funny: Eğlenceli\n" +
                "28.    Ghost train: Korku treni\n" +
                "29.    Gondola: Gondol\n" +
                "30.    Hall of mirrors: Komik aynalar\n" +
                "31.    Horrible: Berbat\n","32.    I agree: Katılıyorum\n" +
                "33.    I disagree: Katılmıyorum\n" +
                "34.    Interesting: İlginç\n" +
                "35.    Join; Katılmak\n" +
                "36.    Kamikaze: Kamikaze\n" +
                "37.    Magic: Sihir\n" +
                "38.    Merry go round: Atlıkarınca\n" +
                "39.    Nervous: Sinirli\n" +
                "40.    Over there: Orada\n" +
                "41.    Pay: Ödemek\n" +
                "42.    Quick: Hızlı\n" +
                "43.    Roller coaster: Hız treni\n","44.    Safe: Güvenli\n" +
                "45.    Share: Paylaşmak\n" +
                "46.    Sketelon: İskelet\n" +
                "47.    Slow: Yavaş\n" +
                "48.    Soda: Soda\n" +
                "49.    Surpised: Şaşırmış\n" +
                "50.    Sweet things: Tatlı şeyler\n" +
                "51.    Swing: Salıncak\n" +
                "52.    Tap: Musluk,Dokunmak\n" +
                "53.    Terrified: Dehşete düşmüş\n" +
                "54.    Thrilled: Heyecanlanmış\n" +
                "55.    Ticket: Bilet\n" +
                "56.    Tofee apples: Elma şekeri\n" +
                "57.    You’re right: Haklısın\n"};
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

