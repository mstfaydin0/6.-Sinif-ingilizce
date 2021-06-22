package com.edebtek.mustafamuharrem.a6sinifingilizce;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class Unit5G extends AppCompatActivity {

    int counter=-1;
    TextView textView;
    Button nextButton;
    Button prevButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_unit5_g);
        textView=(TextView)findViewById(R.id.ttt);
        nextButton=(Button)findViewById(R.id.button126);
        prevButton=(Button)findViewById(R.id.button127);
        textView.setText("Bu konu anlatımında Simple Past Tense (Geçmiş Zaman) konusu ele alınacaktır..");


        final String array[]={"Simple Past Tense olumlu cümleler, önce özne, sonra fiilin 2.Şekli eklenerek kurulur.","Olumlu Cümle Örnekleri\n" +
                "I came. (Ben geldim.)\n" +
                "You came (Sen geldin.)\n" +
                "He/She/It came. (O  geldi.)\n" +
                "We came. (Biz  geldik.)\n" +
                "You came. (Siz  geldiniz.)\n" +
                "They came. (Onlar  geldiler.)\n","Simple Past Tense olumsuz cümleler, önce özne, sonra yardımcı fiilinin olumsuz şekli ve ardından asıl fiil eklenerek kurulur","+Olumsuz Cümle Örnekleri\n" +
                "I did not come. (Ben gelmedim.)\n" +
                "You did not come. (Sen gelmedin.)\n" +
                "He/She/It did not come. (O gelmedi.)\n" +
                "We  did not come. (Biz gelmedik.)\n" +
                "You did not come. (Siz gelmediniz.)\n" +
                "They  did not come. (Onlar gelmediler.)\n","Soru Cümlesi Örnekleri\n" +
                "\n" +
                " Soru cümlesi\n" +
                "Did I come? (Ben geldim mi?)\n" +
                "Did you come? (Sen  geldin mi?)\n" +
                "Did he/she/it come? (O geldi mi?)\n" +
                "Did we come? (Biz geldik mi?)\n" +
                "Did you come? (Siz geldiniz mi?)\n" +
                "Did they come? (Onlar geldiler mi?)\n"};
        nextButton.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {

                counter++;

//If counter has come to end of array, set it to the first item.

                if(counter==array.length) counter=0;

                textView.setText(array[counter]);

            }

        });

        prevButton.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {

                counter--;

//If counter has come to starting of array, set it to the last item.

                if(counter<0) counter=array.length-1;

                textView.setText(array[counter]);

            }

        });






    }
}

