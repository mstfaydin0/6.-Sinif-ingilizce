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


public class Unit7V extends AppCompatActivity {

    private InterstitialAd mInterstitialAd;

    int counter=-1;
    TextView textView;
    Button nextButton;
    Button prevButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_unit7_v);
        textView=(TextView)findViewById(R.id.ttt);
        nextButton=(Button)findViewById(R.id.button110);
        prevButton=(Button)findViewById(R.id.button111);
        MobileAds.initialize(this, new OnInitializationCompleteListener() {
            @Override
            public void onInitializationComplete(InitializationStatus initializationStatus) {
            }
        });

        mInterstitialAd = new InterstitialAd(this);
        mInterstitialAd.setAdUnitId("ca-app-pub-9455123396521751/2123548962");
        mInterstitialAd.loadAd(new AdRequest.Builder().build());

        textView.setText("Never give up. Today is hard, tomorrow will be worse but the day after tomorrow will be sunshine.\n\nAsla pes etme. Bugün zor. Yarın daha da kötü olacak. Ama yarından sonraki gün güneş doğacak.");


        final String array[]={"1.  Accountant: Muhasebeci\n" +
                "2. Accounting: Hesap etme\n" +
                "3. Actor: Aktör\n" +
                "4. Architect: Mimar\n" +
                "5. Artist: Sanatçı\n" +
                "6. Baker: Fırıncı\n" +
                "7. Become: Olmak\n" +
                "8. Building: İnşa etmek\n" +
                "9. Butcher: Kasap\n" +
                "10.    Carpenter: Marangoz\n" +
                "11.    Carry: Taşımak\n" +
                "12.    Catch: Yakalamak\n" +
                "13.    Chef: Şef\n" +
                "14.    Computer company: Bilgisayar şirketi\n", "15.    Computer: Bilgisayar\n" +
                "16.    Cook: Aşçı,Pişirmek\n" +
                "17.    Course: Kurs\n" +
                "18.    Cut: Kesmek\n" +
                "19.    Decorate: Süslemek\n" +
                "20.    Dentist: Diş doktoru\n" +
                "21.    Design: Düzenlemek\n" +
                "22.    Doctor: Doktor\n" +
                "23.    Dye: Boyamak\n" +
                "24.    Engineer: Mühendis\n" +
                "25.    Fabrics: Kumaş\n" +
                "26.    Factory worker: Fabrika işçisi\n" +
                "27.    Fashion show: Moda gösterisi\n" +
                "28.    Fire fighter: İtfaiyeci\n" +
                "29.    Fisherman: Balıkçı\n","30.    Gardener: Bahçıvan\n" +
                "31.    Hairdresser: Kuaför\n" +
                "32.    House: Ev\n" +
                "33.    Illımunatıon: Aydınlatma\n" +
                "34.    Lawyer: Avukat\n" +
                "35.    Look after: Bakımını yapmak\n" +
                "36.    Manager: Müdür\n" +
                "37.    Mechanic: Tamirci\n" +
                "38.    Men:Adamlar\n" +
                "39.    Model: Örnek model\n" +
                "40.    Nurse: Hemşire\n" +
                "41.    Occupation: Meslek\n" +
                "42.    Of course: Tabiiki\n" +
                "43.    Painter: Ressam\n" +
                "44.    Pilot: Pilot\n","45.    Pin: Toplu iğne\n" +
                "46.    Police officer: Polis memuru\n" +
                "47.    Postman: Postacı\n" +
                "48.    Proffession: Meslek\n" +
                "49.    Professional: Profesyonel\n" +
                "50.    Programmer: Programcı\n" +
                "51.    Repair: Tamir etmek\n" +
                "52.    Salesperson: Satış elemanı\n" +
                "53.    Scientist: Bilim adamı\n" +
                "54.    Secretary: Sekreter\n" +
                "55.    Self-employed: Serbest çalışan\n" +
                "56.    Sew: Dikmek\n" +
                "57.    Sew fabric: Kumaş dikmek\n" +
                "58.    Shopkeeper: Dükkan sahibi\n" +
                "59.    Sick: Hasta\n" +
                "60.    Solider: Asker\n","61.    Study: Ders çalışmak\n" +
                "62.    Still: Tarz\n" +
                "63.    Sure: Emin\n" +
                "64.    Tailor: Terzi\n" +
                "65.    Teacher: Öğretmen\n" +
                "66.    That’s a great idea: Müthiş fikir\n" +
                "67.    Use: Kullanmak\n" +
                "68.    Vet: Veteriner\n" +
                "69.    Veterinary: Veteriner\n" +
                "70.    Waiter: Erkek garson\n" +
                "71.    Waitress: Bayan garson\n" +
                "72.    What does he do?: mesleği nedir?\n" +
                "73.    Worker: İşçi\n"};
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

