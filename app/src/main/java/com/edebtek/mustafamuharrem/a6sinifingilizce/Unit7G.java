package com.edebtek.mustafamuharrem.a6sinifingilizce;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class Unit7G extends AppCompatActivity {

    int counter=-1;
    TextView textView;
    Button nextButton;
    Button prevButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_unit7_g);
        textView=(TextView)findViewById(R.id.ttt);
        nextButton=(Button)findViewById(R.id.button130);
        prevButton=(Button)findViewById(R.id.button131);
        textView.setText("Bu konu anlatımında Should ve Olumsuzu Shouldn't konusu ele alınacaktır.");


        final String array[]={" >  İngilizcede tavsiyede bulunmak veya öğüt vermek için kullanılan bir yapıdır.\n" +
                "\n" +
                " >  Yapılması iyi olan durumları belirtmek için should , yapılması iyi olmayan durumları belirtmek için de should yapısının olumsuz hali olan shouldn’t kullanılır.\n" +
                "\n" +
                " >  Should fiile “(yap)malı” anlamını katarken, shouldn’t ise “(yap)mamalı” anlamını katar.\n" +
                "\n" +
                " >  Olumlu, olumsuz ve soru cümlelerinin hepsinde should yapısıyla birlikte kullanılan fiile hiçbir ek getirilmez, yalın haliyle kullanılır. Tüm öznelerle (kişilerle) kullanımı aynıdır.\n"," Özne / Subject    Yard. Fiil / A. Verbs  Fiil / Verb    Nesne / Object\n" +
                "I\n" +
                "You\n" +
                "He\n" +
                "She\n" +
                "It\n" +
                "We\n" +
                "You\n" +
                "They\n","OLUMLU CÜMLE ÖRNEKLERİ\n" +
                "\n" +
                "You are ill. You should go to the doctor.\n" +
                "( Hastasın. Doktora gitmelisin.)\n" +
                "\n" +
                "He should study French to go to France.\n" +
                "( Fransaya gitmek için Fransızca çalışmalı.)\n" +
                "\n" +
                "They should work hard to make living.\n" +
                "( Para kazanmak için sıkı çalışmalılar.)\n" +
                "\n" +
                "You should rest to feel better.\n" +
                "( Daha iyi olmak için dinlenmelisin.)\n" +
                "\n" +
                "You should visit your grandparents.\n" +
                "(Büyükaileni ziyaret etmelisin.)\n","OLUMSUZ CÜMLE ÖRNEKLERİ\n" +
                "\n" +
                "You have sore throat. You shouldn’t drink cold water.\n" +
                "( Boğazın ağrıyor. Soğuk su içmemelisin.)\n" +
                "\n" +
                "I have an exam tomorrow. I shouldn’t go to bed late.\n" +
                "( Yarın sınavım var. Geç uyumamalıyım.)\n" +
                "\n" +
                "Students shouldn’t make noise in the lesson.\n" +
                "( Öğrenciler derste gürültü yapmamalılar.)\n" +
                "\n" +
                "You shouldn’t get up late on weekdays.\n" +
                "( Hafta içi geç kalkmamalısın.)\n" +
                "\n" +
                "They shouldn’t keep the house untidy.\n" +
                "( Evi kirli bırakmamalılar.)\n" +
                "\n","SORU CÜMLESİ ÖRNEKLERİ\n" +
                "\n" +
                "Should you go to bed late? No, I shouldnt.\n" +
                "( Geç uyumalı mısın? Hayır uyumamalıyım.)\n" +
                "\n" +
                "Should you study hard to graduate from the university? Yes, I should.\n" +
                "( Üniversiteden mezun olmak için çok çalışmalı mısın?  Evet, çok çalışmalıyım.)\n" +
                "\n" +
                "What should I do to lose weight? You should eat less.\n" +
                "( Kilo vermek için ne yapmalıyım. Az yemelisin.)\n" +
                "\n" +
                "How should I study to improve my English? You should watch English films.\n" +
                "( İngilizcemi geliştirmek için nasıl çalışmalıyım? İngilizce filmler izlemelisin.)\n"};
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

