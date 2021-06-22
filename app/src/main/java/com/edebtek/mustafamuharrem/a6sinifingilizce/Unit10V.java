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


public class Unit10V extends AppCompatActivity {

    private InterstitialAd mInterstitialAd;

    int counter=-1;
    TextView textView;
    Button nextButton;
    Button prevButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_unit10_v);
        textView=(TextView)findViewById(R.id.ttt);
        nextButton=(Button)findViewById(R.id.button116);
        prevButton=(Button)findViewById(R.id.button117);

        MobileAds.initialize(this, new OnInitializationCompleteListener() {
            @Override
            public void onInitializationComplete(InitializationStatus initializationStatus) {
            }
        });

        mInterstitialAd = new InterstitialAd(this);
        mInterstitialAd.setAdUnitId("ca-app-pub-9455123396521751/2123548962");
        mInterstitialAd.loadAd(new AdRequest.Builder().build());

        textView.setText("There is always room at the top.\n\nZirvede her zaman yer vardır.");


        final String array[]={"1.  Angry: Sinirli\n" +
                "2. Ballot box: Oy sandığı\n" +
                "3. Busy: Meşgul\n" +
                "4. Campaign: Tanıtım\n" +
                "5. Campaign crew: Tanıtım elemanı\n" +
                "6. Candidate: Aday\n" +
                "7. Choose: Seçmek\n" +
                "8. Class president: Sınıf başkanı\n" +
                "9. Decide: Karar vermek\n" +
                "10.    Disagree: Aynı fikirde olmamak\n", "11.    Elect: Seçmek\n" +
                "12.    Election: Seçim\n" +
                "13.    Equal: Eşit\n" +
                "14.    Equal rights: Eşit haklar\n" +
                "15.    Fair: İyi,Fuar\n" +
                "16.    Fair election: Dürüst seçim\n" +
                "17.    Flyers: El ilanı\n" +
                "18.    Fold: Katlamak\n" +
                "19.    Friendly: Arkadaş canlısı\n" +
                "20.    Get along: Anlaşmak\n","21.    Give a speech: Konuşma yapmak\n" +
                "22.    Go to meetings: Toplantıya gitmek\n" +
                "23.    Have same rights: Aynı haklara sahip olma\n" +
                "24.    Helpful: Yardımsever\n" +
                "25.    I think: Bence\n" +
                "26.    Keep quiet: Sessiz ol\n" +
                "27.    Kind: Kibar\n" +
                "28.    Law: Kanun\n" +
                "29.    Live in harmony: Uyum içinde olmak\n" +
                "30.    Loud: Yüksek ses\n","31.    Loud person: Gürültücü\n" +
                "32.    Make a decision: Karar vermek\n" +
                "33.    Make a speech: Konuşma yapmak\n" +
                "34.    Me too: Ben de\n" +
                "35.    Mean: Anlam\n" +
                "36.    Messy: Dağınık\n" +
                "37.    Moody: Karamsar\n" +
                "38.    Newcomer: Yeni gelen\n" +
                "39.    Opinion: Düşünce\n" +
                "40.    Organised: Düzenlenmiş\n","41.    Policy: Politika\n" +
                "42.    Polling place: Oy kullanma yeri\n" +
                "43.    Poster: Poster\n" +
                "44.    President: Başkan\n" +
                "45.    Republic: Cumhuriyet\n" +
                "46.    Respect: Saygı\n" +
                "47.    Responsibilty: Sorumluluk\n" +
                "48.    Rights: Haklar\n" +
                "49.    Share: Paylaşmak\n" +
                "50.    Shy: Utangaç\n","51.    Slogan: Slogan\n" +
                "52.    Speech: Konuşma\n" +
                "53.    Sticker: Yapıştırıcı\n" +
                "54.    That’s true: Doğru\n" +
                "55.    Unfair: İyi olmayan\n" +
                "56.    Unkind: Kaba\n" +
                "57.    Untidy: Düzensiz\n" +
                "58.    Vote: Oy\n" +
                "59.    Voter: Seçmen\n" +
                "60.    Wait in line: Sırada beklemek\n" +
                "61.    You’re welcome: Bir şey değil\n"};
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

