package com.edebtek.mustafamuharrem.a6sinifingilizce;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class Unit1G extends AppCompatActivity {

    int counter=-1;
    TextView textView;
    Button nextButton;
    Button prevButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_unit1_g);
        textView=(TextView)findViewById(R.id.ttt);
        nextButton=(Button)findViewById(R.id.button118);
        prevButton=(Button)findViewById(R.id.button119);
        textView.setText("Bu konu anlatımında\n" +
                "simple present tense ele alınacaktır.\n" +
                "Simple present tense\n" +
                "geniş zamanın İngilizcedeki karşılığıdır.\n");


        final String array[]={"Simple Present Tense Olumlu şekli\n" +
                "\n" +
                " Özne  Fiil       Türkçesi\n" +
                "I  eat    an apple.    Ben bir elma yerim.\n" +
                "You    eat    an apple.    Sen bir elma yersin.\n" +
                "He eats an apple.   O bir elma yer.\n" +
                "She    eats an apple.   O bir elma yer.\n" +
                "It eats an apple.   O bir elma yer.\n" +
                "We eat    an apple.    Biz bir elma yeriz.\n" +
                "You    eat    an apple.    Siz bir elma yersiniz.\n" +
                "They eat an apple.   Onlar bir elma yerler.\n", "Düz cümle\n" +
                "I work. (Ben çalışırım.)\n" +
                "You work. (Sen çalışırsın.)\n" +
                "He/She/It works. (O çalışır.)\n" +
                "We work. (Biz çalışırız.)\n" +
                "You work. (Siz çalışırsınız.)\n" +
                "They work. (Onlar çalışırlar.)\n","Olumsuz cümle\n" +
                "I do not work. (Ben çalışmam.)\n" +
                "You do not work. (Sen çalışmazsın.)\n" +
                "He/She/It does not work. (O çalışmaz.)\n" +
                "We do not work. (Biz çalışmayız.)\n" +
                "You do not work. (Siz çalışmazsınız.)\n" +
                "They do not work. (Onlar çalışmazlar.)\n","Soru cümlesi\n" +
                "Do I work? (Ben çalışır mıyım?)\n" +
                "Do you work? (Sen çalışır mısın?)\n" +
                "Does he/she/it work? (O çalışır mı?)\n" +
                "Do we work? (Biz çalışır mıyız?)\n" +
                "Do you work? (Siz çalışır mısınız?)\n" +
                "Do they work? (Onlar çalışırlar mı?)\n","Şimdi birkaç örnek cümle yapalım.\n" +
                "We live in Istanbul.\n" +
                "Biz İstanbul’da yaşarız.\n" +
                "\n" +
                "She loves me.\n" +
                "O, beni sever.\n" +
                "\n" +
                "I love her too.\n" +
                "Ben de onu severim.\n" +
                "\n" +
                "I go to work everyday.\n" +
                "Ben hergün işe giderim.\n" +
                "\n" +
                "You go to holiday every summer.\n" +
                "Sen her yaz tatile gidersin.\n"};
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

