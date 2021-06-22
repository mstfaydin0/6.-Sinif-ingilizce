package com.edebtek.mustafamuharrem.a6sinifingilizce;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class Unit6G extends AppCompatActivity {

    int counter=-1;
    TextView textView;
    Button nextButton;
    Button prevButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_unit6_g);
        textView=(TextView)findViewById(R.id.ttt);
        nextButton=(Button)findViewById(R.id.button128);
        prevButton=(Button)findViewById(R.id.button129);
        textView.setText("Bu konu anlatımında WAS VE WERE konusu ele alınacaktır.");


        final String array[]={"            WAS VE WERE NEREDE KULLANILIR?\n" +
                "            yapılarını fiilleri kullanmadığımız geçmiş zaman cümlelerinde kullanırız. Fiiller, Türkçede sonu -mek/-mak ile biten isimlerdir. Örneğin bilmek, anlamak, yaşamak vb.gibi yapılar fiildir.\n","örnek cümleler:\n" +
                "He was a fast driver. ( Hızlı bir sürücüydü.)\n" +
                "You were at the cinema. ( Sinemadaydın.)\n" +
                "She was careful. ( Dikkatliydi.)\n" +
                "It was a slow car. ( Yavaş bir arabaydı.)\n" +
                "In summer 1990 I was in Brazil. (1990 yazında Birezilyadaydım.)\n","Özne tekil ise “was”, çoğul ise “were” yardımcı fiili kullanılır.\n" +
                " The students were late.\n" +
                "The teacher was angry.\n","Olumsuz cümlelerde kullanım aşağıdaki gibidir:\n" +
                "was not => wasn’t\n" +
                "were not => weren’t\n" +
                "Examples:\n" +
                "I wasn’t at school yesterday because I was ill.\n" +
                "She wasn’t hungry.\n" +
                "They weren’t late.\n","TODAY (Bugün)   YESTERDAY (Dün)\n" +
                "I am ill. (Ben hastayım.)\n" +
                "You are tired. (Sen yorgunsun.)\n" +
                "She is at home. (O evdedir.)\n" +
                "He is a lawyer. (O bir avukattır.)\n" +
                "It is rainy. (Hava yağmurlu.)\n" +
                "We are hungry. (Biz açız.)\n" +
                "They are at school. (Onlar okuldalar.) I was ill. (Ben hastaydım.)\n" +
                "You were tired.(Sen hastaydın.)\n" +
                "She was at home. (O evdeydi.)\n" +
                "He was a lawyer. (O bir avukattı.)\n" +
                "It was rainy. (Hava yağmurluydu.)\n" +
                "We were hungry. (Biz açtık.)\n" +
                "They were at school. (Onlar okuldaydılar.)\n"};
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

