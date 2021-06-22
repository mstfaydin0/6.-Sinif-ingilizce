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


public class Unit1V extends AppCompatActivity {

    int counter=-1;
    TextView textView;
    Button nextButton;
    Button prevButton;
    private InterstitialAd mInterstitialAd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_unit1_v);
        textView=(TextView)findViewById(R.id.ttt);
        nextButton=(Button)findViewById(R.id.button29);
        prevButton=(Button)findViewById(R.id.button11);

        MobileAds.initialize(this, new OnInitializationCompleteListener() {
            @Override
            public void onInitializationComplete(InitializationStatus initializationStatus) {
            }
        });

        mInterstitialAd = new InterstitialAd(this);
        mInterstitialAd.setAdUnitId("ca-app-pub-9455123396521751/2123548962");
        mInterstitialAd.loadAd(new AdRequest.Builder().build());

        textView.setText("If you start a job with love, it is done.\n\nEğer bir işe aşkla başlarsan o iş olmuş demektir.\n\t\t\tN.S.");


        final String array[]={"1. After School: Okuldan sonra\n" +
                "2. Afternoon: Öğleden sonra\n" +
                "3. Announcement: Duyuru\n" +
                "4.\tAwesome: Müthiş\n" +
                "5.\tBrush teeth: Diş fırçalamak\n" +
                "6.\tCinema: Sinema\n" +
                "7.\tComplete: Tamamlamak\n" +
                "8.\tDo homework: Ödev yapmak\n" +
                "9.\tDo judo: Judo yapmak\n" +
                "10.\tDo shopping: Alışveriş yapmak\n" +
                "11.\tDrink coffee: Kahve içmek\n" +
                "12.\tEat dinner: Yemek yeme\n" +
                "13.\tEighth: Sekizinci\n" +
                "14.\tEleventh: On birinci\n" +
                "15.\tEnroll: Kayıt olmak\n", "16.\tEvening: Akşam\n" +
                "17.\tFifteenth: On beşinci\n" +
                "18.\tFifth: beşinci\n" +
                "19.\tFirst: İlk,Önce,Birinci\n" +
                "20.\tFlamenco: Flamenko dansı\n" +
                "21.\tFolk dance: Halk dansı\n" +
                "22.\tFourteenth: On dördüncü1\n" +
                "23.\tFourth: Dördüncü\n" +
                "24.\tFriday: Cuma\n" +
                "25.\tGames: Oyunlar\n" +
                "26.\tGet online: İnternete bağlanmak\n" +
                "27.\tGet up: kalkmak\n" +
                "28.\tGive us a demo: Bize gösteri yap\n" +
                "29.\tGo shopping: Alışverişe gitmek\n" +
                "30.\tGo skateboarding: Kaykay yapmak\n","31.\tGo swimming: Yüzmeye gitmek\n" +
                "32.\tGo to a dance class: Dans sınıfına gitmek\n" +
                "33.\tGo to bed: Yatmak\n" +
                "34.\tGraph: Çizelge\n" +
                "35.\tHang around: Takılmak\n" +
                "36.\tHang out on the net: İnternette takılmak\n" +
                "37.\tHave a guitar lesson: Gitar dersi almak\n" +
                "38.\tHave a rest: Dinlenmek\n" +
                "39.\tHave a shower: Duş almak\n" +
                "40.\tHave a snack: Atıştırmak\n" +
                "41.\tHave breakfast: Kahvaltı yapmak\n" +
                "42.\tI don’t believe it: inanmıyorum\n" +
                "43.\tJudo: Judo\n" +
                "44.\tKarate: karate\n" +
                "45.\tKeep a diary: Günlük tutmak\n","46.\tKnow: Bilmek,Tanımak\n" +
                "47.\tLanguage school: Dil okulu\n" +
                "48.\tLearn: Öğrenmek\n" +
                "49.\tLibrary: Kütüphane\n" +
                "50.\tListen: Dinlemek\n" +
                "51.\tListen to music: Müzik dinlemek\n" +
                "52.\tLook: Bakmak\n" +
                "53.\tMembership: Üyelik\n" +
                "54.\tMidnight: Gece yarısı\n" +
                "55.\tMonday: Pazartesi\n" +
                "56.\tMorning: Sabah\n" +
                "57.\tNeighbour: Komşu\n" +
                "58.\tNeighbourhood: Komşuluk,Mahalle\n" +
                "59.\tNight: Gece\n" +
                "60.\tNinth: Doluzuncu\n","61.\tNoon: Öğle\n" +
                "62.\tPark: Park etmek\n" +
                "63.\tPlay an instrument: Müzik aleti çalmak\n" +
                "64.\tPlay computer: Bilgisayar oynamak\n" +
                "65.\tPlay soccer: Futbol oynamak\n" +
                "66.\tPolka: Polka dansı\n" +
                "67.\tPractice: Uygulamak\n" +
                "68.\tRead: Okumak\n" +
                "69.\tRest: Dinlenmek\n" +
                "70.\tRun errands: Ev işleri yapmak\n" +
                "71.\tSaturday: Cumartesi\n" +
                "72.\tSecond: Saniye,İkinci\n" +
                "73.\tSeventh: Yedinci\n" +
                "74.\tSixth: Altıncı\n" +
                "75.\tSpend time: Vakit geçirmek\n","76.\tSports centre: Spor merkezi\n" +
                "77.\tStay at home: Evde kalmak\n" +
                "78.\tStudy: Ders çalışmak\n" +
                "79.\tSunday: Pazar\n" +
                "80.\tSupermarket: Süpermarket\n" +
                "81.\tSwimming pool: Yüzme havuzu\n" +
                "82.\tTake a course: Kursa gitmek\n" +
                "83.\tTake a dance class: Dans dersi almak\n" +
                "84.\tTake a nap: Kestirmek(uyku)\n" +
                "85.\tTake care of: Dikkat et\n" +
                "86.\tTenth: Onuncu\n" +
                "87.\tThird: Üçüncü\n" +
                "88.\tThirteenth: On üçüncü\n" +
                "89.\tThirtieth: Otuzuncu\n" +
                "90.\tThursday: Perşembe\n","91.\tTidy room: Odayı toplamak\n" +
                "92.\tTraditional: Geleneksel\n" +
                "93.\tTuesday: Salı\n" +
                "94.\tTwelfth: On ikinci\n" +
                "95.\tTwentieth: yirminci\n" +
                "96.\tTwenty-second: Yirmi ikinci\n" +
                "97.\tTwenty-first: Yirmi birinci\n" +
                "98.\tTwenty-fourth: Yirmi döndürcü\n" +
                "99.\tTwenty-third: Yirmi üçüncü\n" +
                "100.\tVisit grandparents: Yaşlıları ziyaret etmek\n" +
                "101.\tWalk the dog: Köpeği yürütmek\n" +
                "102.\tWash the dishes: Bulaşıkları yıkamak\n" +
                "103.\tWatch film: Film izlemek\n" +
                "104.\tWatch TV: TV izlemek\n" +
                "105.\tWednesday: Çarşamba\n" +
                "106.\tWeekdays: Hafta içi\n" +
                "107.\tWork: İş,Çalışmak\n"};
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
