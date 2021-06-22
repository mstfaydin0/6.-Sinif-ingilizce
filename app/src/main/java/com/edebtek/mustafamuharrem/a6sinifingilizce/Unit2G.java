package com.edebtek.mustafamuharrem.a6sinifingilizce;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class Unit2G extends AppCompatActivity {

    int counter=-1;
    TextView textView;
    Button nextButton;
    Button prevButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_unit2_g);
        textView=(TextView)findViewById(R.id.ttt);
        nextButton=(Button)findViewById(R.id.button120);
        prevButton=(Button)findViewById(R.id.button121);
        textView.setText("Bu konu anlatımında saatler konusu ele alınacaktır.");


        final String array[]={"İngilizce saatin kaç olduğunu sorarken\n" +
                "“What time is it? What is the time?”\n" +
                " sorularını kullanabiliriz.\n" +
                " \n", "Tam saatlerde\n" +
                "\n" +
                "04:00 :It is four o’clock.\n" +
                "05:00 :It’s five o’clock\n","Yarımlarda half past kullanılır\n" +
                "\n" +
                "05:30 : It is half past five.\n" +
                "09:30 : It is half past nine.\n","Çeyreklerde quarter kullanılır\n" +
                "\n" +
                "08:45  : It is a quarter to nine.\n" +
                "02:15  :It’s a quarter past two.\n","-e var demek için : “to” kullanılmalıdır.\n" +
                "\n" +
                "03:40 : It is twenty to four.\n" +
                "06:55 : It is five to seven.\n","– … geçiyor demek için : “past” kullanılmalıdır.\n" +
                "\n" +
                "10:10 : It is ten past ten.\n" +
                "11:20  : It’s twenty past eleven.\n","am ve pm arasındaki fark nedir?\n" +
                "\n" +
                "am : Gece 12.00’den öğlen 12.00’ye kadar olan vakit aralığı\n" +
                "pm : Öğlen 12.00’dan gece yarısı 12.00’a kadar olan vakit\n","Örnekler: \n" +
                "\n" +
                "01.10 pm : Öğlen saat 01.10\n" +
                "04.20 am : Sabaha karşı saat 4.20\n","İkinci olarak, pratik saat söyleme yolu olarak ise Türkçe’de olduğu gibi aynen sayılar okunabilir:\n" +
                "\n" +
                "02.20 : two twenty\n" +
                "04.30 : two thirty\n" +
                "09.45 : nine forty five\n"};
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

