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


public class Unit6V extends AppCompatActivity {
    private InterstitialAd mInterstitialAd;

    int counter=-1;
    TextView textView;
    Button nextButton;
    Button prevButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_unit6_v);
        textView=(TextView)findViewById(R.id.ttt);
        nextButton=(Button)findViewById(R.id.button108);
        prevButton=(Button)findViewById(R.id.button109);
        MobileAds.initialize(this, new OnInitializationCompleteListener() {
            @Override
            public void onInitializationComplete(InitializationStatus initializationStatus) {
            }
        });

        mInterstitialAd = new InterstitialAd(this);
        mInterstitialAd.setAdUnitId("ca-app-pub-9455123396521751/2123548962");
        mInterstitialAd.loadAd(new AdRequest.Builder().build());

        textView.setText("The starting point of all achievement is desire. Weak desire brings weak result.\n\nBütün başarıların başlangıç noktası arzulamaktır. Zayıf arzular, zayıf sonuçlar getirir.");


        final String array[]={"1.  Ago: Önce\n" +
                "2. Ancient: Eski\n" +
                "3. Aqua park: Su parkı\n" +
                "4. Awesome: Harika\n" +
                "5. Beach: Plaj\n" +
                "6. Beach holiday: Plaj tatili\n" +
                "7. Beach volleyball: Plaj voleybolu\n" +
                "8. Biking: Bisikelete binme\n" +
                "9. Binoculars: Dürbün\n" +
                "10.    Buy souvenirs: Hediyelik alma\n" +
                "11.    Camera: Kamera\n" +
                "12.    Camp: Kamp\n" +
                "13.    Camping: Kamp yapma\n" +
                "14.    Canoeing: Kano sporu\n", "15.    Check in: Giriş kontrolü\n" +
                "16.    Check out: Çıkış kontrolü\n" +
                "17.    City: Şehir\n" +
                "18.    Climb: Tırmanmak\n" +
                "19.    Climbing: Tırmanma\n" +
                "20.    Climbing holiday: Tırmanma tatili\n" +
                "21.    Cottage: Kır evi\n" +
                "22.    Country: Memleket\n" +
                "23.    Cluise holiday: Gemi tatili\n" +
                "24.    Cultural holiday: Kültür tatili\n" +
                "25.    Cycling holiday: Bisiklet tatili\n","26.    Diving: Dalış sporu\n" +
                "27.    Enjoy: Zevk almak\n" +
                "28.    Flower: Çiçek\n" +
                "29.    Forest: Orman\n" +
                "30.    Fruit: Meyve\n" +
                "31.    Fun: Eğlence\n" +
                "32.    Hang out: Takılmak\n" +
                "33.    Hiking: Yürüyüş yapma\n" +
                "34.    Holiday: Tatil\n" +
                "35.    Holiday resort: Tatil yeri\n","36.    Holiday village: Tatil köyü\n" +
                "37.    Holidaymaker: Tatilci\n" +
                "38.    Hotel: Otel\n" +
                "39.    Kayaking: Kayık sporu\n" +
                "40.    Kite surfing: Uçurtma sörfü\n" +
                "41.    Lake: Göl\n" +
                "42.    Last: Geçen,Son\n" +
                "43.    Mountain: Dağ\n" +
                "44.    Nature holiday: Doğa tatili\n","45.    Packing suitcase: Bavulu toplama\n" +
                "46.    People: İnsanlar\n" +
                "47.    Pick: Toplamak\n" +
                "48.    Relax: Rahatlamak\n" +
                "49.    River: Nehir\n" +
                "50.    Safari holiday: Av tatili\n" +
                "51.    Sailing: Yelken sporu\n" +
                "52.    Scuba diving: Tüplü dalış\n" +
                "53.    Seaside: Deniz kıyısı\n" +
                "54.    Sightseeing: Şehir gezisi\n" +
                "55.    Skiing: Kayak sporu\n" +
                "56.    Skiing holiday: Kayak tatili\n" +
                "57.    Snowboarding: Kar kaykayı\n" +
                "58.    Suitcase: Bavul\n" +
                "59.    Sunglasses: Güneş gözlüğü\n","60.    Sunscreen: Güneş kremi\n" +
                "61.    Surfing: Sörf yapma\n" +
                "62.    Surpised: Şaşırmış\n" +
                "63.    Swimsuit: mayo\n" +
                "64.    Tent: Çadır\n" +
                "65.    Tower: Kule\n" +
                "66.    Travel: Gezi\n" +
                "67.    Tree: Ağaç\n" +
                "68.    Trekking: Dağ yürüyüşü\n" +
                "69.    Understand: Anlamak\n" +
                "70.    Vacation: Tatil\n" +
                "71.    Water rafting: Su salcığı\n" +
                "72.    Yesterday : Dün\n"};
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

