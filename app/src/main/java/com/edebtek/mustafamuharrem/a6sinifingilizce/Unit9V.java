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


public class Unit9V extends AppCompatActivity {

    private InterstitialAd mInterstitialAd;

    int counter=-1;
    TextView textView;
    Button nextButton;
    Button prevButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_unit9_v);
        textView=(TextView)findViewById(R.id.ttt);
        nextButton=(Button)findViewById(R.id.button114);
        prevButton=(Button)findViewById(R.id.button115);
        MobileAds.initialize(this, new OnInitializationCompleteListener() {
            @Override
            public void onInitializationComplete(InitializationStatus initializationStatus) {
            }
        });

        mInterstitialAd = new InterstitialAd(this);
        mInterstitialAd.setAdUnitId("ca-app-pub-9455123396521751/2123548962");
        mInterstitialAd.loadAd(new AdRequest.Builder().build());

        textView.setText("It does not matter how slowly you go as long as you do not stop.\n\nDurmadığın sürece ne kadar yavaş gittiğinin önemi yoktur.");


        final String array[]={"1.  Air pollution: Hava kirliliği\n" +
                "2. Appliance: Alet\n" +
                "3. Bring: Kuş izleme\n" +
                "4. Chemicals: Kimyasallar\n" +
                "5. Cut down trees: Ağaçları kesmek\n" +
                "6. Cycle: Döndürmek\n" +
                "7. Damage: Hasar\n" +
                "8. Device: Cihaz\n" +
                "9. Disagree: Aynı fikirde olmamak\n" +
                "10.    Drop litter: Çöp atmak\n" +
                "11.    Drop rubish: Çöp atmak\n", "12.    Eco-frendly: Çevre dostu\n" +
                "13.    Electrical devices: Elektrikli aletler\n" +
                "14.    Electricity: Elektrik\n" +
                "15.    Envoriment: Çevre\n" +
                "16.    Erosion: Erozyon\n" +
                "17.    Exhaust fumes: Egzoz dumanı\n" +
                "18.    Fire: Yangın\n" +
                "19.    Garbage: Çöp\n" +
                "20.    Global warming: Küresel ısınma\n" +
                "21.    Greenhouse: Sera\n","22.    Harm: Zarar\n" +
                "23.    Harmful: Zararlı\n" +
                "24.    Heavy industry: Ağır sanayi\n" +
                "25.    Join: Katılmak\n" +
                "26.    Light bulb: Ampul\n" +
                "27.    Litter: Çöp\n" +
                "28.    Look after: Bakımını yapmak\n","29.    Mix: Karıştırmak\n" +
                "30.    Nuclear power: Nükleer güç\n" +
                "31.    Pick up litter: Çöp toplamak\n" +
                "32.    Planet: Gezegen\n" +
                "33.    Plant: Ağaç dikmek\n" +
                "34.    Plug: Fişe takmak\n" +
                "35.    Pollution: Kirlilik\n" +
                "36.    Produce: Üretmek\n" +
                "37.    Protect:Korumak\n","38.    Public transportation: Toplu taşıma\n" +
                "39.    Really?: Gerçekten?\n" +
                "40.    Recyclable: Geri dönüştürülebilir\n" +
                "41.    Recyle: Geri dönüştürmek\n" +
                "42.    Recyled paper: Geri dönebilen kağıt\n" +
                "43.    Reduce: Azaltmak\n" +
                "44.    Remote control: Uzaktan kumanda\n" +
                "45.    Reuse: Tekrar kullanmak\n" +
                "46.    Rubbish: Çöp\n","47.    Save: Tasarruf etmek\n" +
                "48.    Save energy: Enerji tasarrufu\n" +
                "49.    Save water: Su tasarrufu\n" +
                "50.    Shout: Bağırmak\n" +
                "51.    Solar power: Güneş enerjisi\n" +
                "52.    Stay up late: Geç uyumak\n" +
                "53.    Switch off: Kapatmak\n" +
                "54.    Switch on: Açmak\n","55.    Throw away: Atmak\n" +
                "56.    Trash: Çöp\n" +
                "57.    Trash bin: Çöp kutusu\n" +
                "58.    Turn of lights: Işıkları kapatmak\n" +
                "59.    Turn off the tap: Musluğu kapatma\n" +
                "60.    Turn on: Açma\n" +
                "61.    Unplug: Fişten çekme\n" +
                "62.    Use public transport: Toplu taşıma kullanma\n" +
                "63.    Waste: İsraf,Kayıp\n" +
                "64.    Waste electricity: Elektrik israfı\n" +
                "65.    Water pollution: Su kirliliği\n" +
                "66.    Wind turbine: Rüzgar tribünü\n"};
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

