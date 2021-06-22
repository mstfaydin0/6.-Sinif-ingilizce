package com.edebtek.mustafamuharrem.a6sinifingilizce;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class Unit4G extends AppCompatActivity {

    int counter=-1;
    TextView textView;
    Button nextButton;
    Button prevButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_unit4_g);
        textView=(TextView)findViewById(R.id.ttt);
        nextButton=(Button)findViewById(R.id.button124);
        prevButton=(Button)findViewById(R.id.button125);
        textView.setText("Bu konu anlatımında Future Tense (Gelecek Zaman) konusu ele alınacaktır.");


        final String array[]={"(Özne+Yardımcı fiil+Asıl fiil)\n" +
                "  I              will                 sleep.\n" +
                "Ben uyuyacağım.\n","DÜZ CÜMLE ÖRNEKLERİ\n" +
                "I will sleep (Ben uyuyacağım.)\n" +
                "You will sleep (Sen uyuyacaksın.)\n" +
                "He/She/It will sleep (O uyuyacak.)\n" +
                "We will sleep (Biz uyuyacağız.)\n" +
                "You will sleep (Siz uyuyacaksınız.)\n" +
                "They will sleep (Onlar uyuyacaklar.)\n","OLUMSUZ CÜMLE ÖRNEKLERİ\n" +
                "I will not sleep (Ben uyuymayacağım.)\n" +
                "You will not sleep (Sen uyumayacaksın.)\n" +
                "He/She/It will not sleep (O uyumayacak.\n" +
                "We will not sleep (Biz uyumayacağız.\n" +
                "You will not sleep (Siz uyumaycaksınız.)\n" +
                "They will not sleep. (Onlar uyumuyacaklar.)\n","SORU CÜMLE ÖRNEKLERİ\n" +
                "Will I sleep? (Ben uyuyacak mıyım?)\n" +
                "Will you sleep? (Sen  uyuyacak mısın?)\n" +
                "Will he/she/it sleep? (O uyuyacak mı?)\n" +
                "Will we sleep? (Biz uyuyacak mıyız?)\n" +
                "Will you sleep? (Siz uyuyacak mısınız?)\n" +
                "Will they sleep? (Onlar uyuyacaklar mı?)\n","+CÜMLE ÖRNEKLERİ\n" +
                " \n" +
                "I will paint my house next week.\n" +
                "Gelecek hafta evimi boyayacağım.\n" +
                "\n" +
                "You will forget me next year.\n" +
                "Beni seneye unutacaksın.\n"};
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

