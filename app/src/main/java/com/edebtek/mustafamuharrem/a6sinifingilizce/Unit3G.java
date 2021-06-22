package com.edebtek.mustafamuharrem.a6sinifingilizce;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class Unit3G extends AppCompatActivity {

    int counter=-1;
    TextView textView;
    Button nextButton;
    Button prevButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_unit3_g);
        textView=(TextView)findViewById(R.id.ttt);
        nextButton=(Button)findViewById(R.id.button122);
        prevButton=(Button)findViewById(R.id.button123);
        textView.setText("Bu konu anlatımında \nPresent Continuous Tense konusu ele alınacaktır.");


        final String array[]={"(Özne+Yardımcı fiil+Asıl fiilin ing eki almış hali)\n" +
                "I am running.\n" +
                " Ben koşuyorum.\n", "Düz cümle\n" +
                "I am swimming. (Ben yüzüyorum.)\n" +
                "You are swimming. (Sen yüzüyorsun.)\n" +
                "He/She/It is swimming. (O yüzüyor.)\n" +
                "We are swimming. (Biz yüzüyoruz.)\n" +
                "You are swimming. (Siz yüzüyorsunuz.)\n" +
                "They are swimming. (Onlar yüzüyorlar.)\n","I am cooking a cake now.\n" +
                "Ben şu anda kek pişiriyorum.\n" +
                "\n" +
                "He is sleeping.\n" +
                "O, uyuyor.\n" +
                "\n" +
                "I am writing my posts.\n" +
                "Ben postalarımı yazıyorum.\n" +
                "\n" +
                "You are listening music.\n" +
                "Siz müzik dinliyorsunuz.\n" +
                "\n" +
                "They are playing football.\n" +
                "Onlar futbol oynuyorlar.\n"};
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

