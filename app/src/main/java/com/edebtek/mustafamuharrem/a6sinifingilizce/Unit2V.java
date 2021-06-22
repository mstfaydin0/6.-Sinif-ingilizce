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


public class Unit2V extends AppCompatActivity {

    private InterstitialAd mInterstitialAd;

    int counter=-1;
    TextView textView;
    Button nextButton;
    Button prevButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_unit2_v);
        textView=(TextView)findViewById(R.id.ttt);
        nextButton=(Button)findViewById(R.id.button100);
        prevButton=(Button)findViewById(R.id.button101);
        MobileAds.initialize(this, new OnInitializationCompleteListener() {
            @Override
            public void onInitializationComplete(InitializationStatus initializationStatus) {
            }
        });

        mInterstitialAd = new InterstitialAd(this);
        mInterstitialAd.setAdUnitId("ca-app-pub-9455123396521751/2123548962");
        mInterstitialAd.loadAd(new AdRequest.Builder().build());
        textView.setText("Patience is a key element of success.\n\nSabır, başarının temel unsurudur.");


        final String array[]={"1.  Apple: Elma\n" +
                "2. Apricot: Kayısı\n" +
                "3. Apricot juice: Kayısı suyu\n" +
                "4. Bagel: Simit\n" +
                "5. Baked: Fırında Pişmiş\n" +
                "6. Banana: Muz\n" +
                "7. Beans: Fasulye\n" +
                "8. Blackberry: Böğürtlen\n" +
                "9. Blueberry: Yaban mersini\n" +
                "10.    Boiled egg: Suda pişmiş yumurta\n" +
                "11.    Buon appétit:Afiyet olsun\n" +
                "12.    Bread: Ekmek\n" +
                "13.    Butter: Tereyağ\n" +
                "14.    Call: Aramak(Telefon)\n" +
                "15.    Candy: Şeker\n", "16.    Cereal: Kahvaltılık gevrek\n" +
                "17.    Chat: Sohbet\n" +
                "18.    Cheese: Peynir\n" +
                "19.    Cherry: Kiraz\n" +
                "20.    Chicken: Tavuk\n" +
                "21.    Chips: Cips\n" +
                "22.    Chocolate: Çikolata\n" +
                "23.    Conversation: Konuşma\n" +
                "24.    Cookie: Kurabiye\n" +
                "25.    Crepe: Krep\n" +
                "26.    Crossiant: Kruvasan\n" +
                "27.    Cucumber: Salatalık\n" +
                "28.    Delicious: Lezzetli\n" +
                "29.    Drink: İçmek,İçecek\n","30.    Egg: Yumurta\n" +
                "31.    England: İngiltere\n" +
                "32.    Enjoy it: Afiyet olsun\n" +
                "33.    Excuse me: Af edersiniz\n" +
                "34.    Fish: Balık\n" +
                "35.    France: Fransa\n" +
                "36.    Fried: Yağda kızarmış\n" +
                "37.    Garlic: Sarımsak\n" +
                "38.    Germany: Almanya\n" +
                "39.    Grape: üzüm\n" +
                "40.    Green pepper: Yeşilbiber\n" +
                "41.    Grilled: Izgara yapılmış\n" +
                "42.    Healthy: Sağlıklı\n" +
                "43.    Honey: Bal\n" +
                "44.    Ice tea: Soğuk çay\n" +
                "45.    Italy: İtalya\n" +
                "46.    Jam: Reçel\n" +
                "47.    Japan: Japonya\n" +
                "48.    Junk food: Abur cubur\n","49.    Lettuce: Marul\n" +
                "50.    Milk: Süt\n" +
                "51.    Soup: Çorba\n" +
                "52.    Muffin: Kap kek\n" +
                "53.    Mushroom: Mantar\n" +
                "54.    Nutritious: Besleyici\n" +
                "55.    Oat: Yulaf\n" +
                "56.    Olive: Zeytin\n" +
                "57.    Omlette: Omlet\n" +
                "58.    Onion: Soğan\n" +
                "59.    Orange: Portakal\n" +
                "60.    Pancake: Gözleme\n" +
                "61.    Parsley: Maydonoz\n" +
                "62.    Peach: Şeftali\n" +
                "63.    Pear: Armut\n" +
                "64.    Pinapple: Ananas\n" +
                "65.    Room temperature: Oda sıcaklığı\n"};
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

