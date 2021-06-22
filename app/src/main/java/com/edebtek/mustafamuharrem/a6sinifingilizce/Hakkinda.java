package com.edebtek.mustafamuharrem.a6sinifingilizce;

import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class Hakkinda extends AppCompatActivity {


    TextView iletisim;
    Button ibutton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hakkinda);

    ibutton=(Button)findViewById(R.id.button15);
    iletisim=(TextView)findViewById(R.id.textView3);




    }
    public void in(View v){
        if (v.getId()==R.id.button20){
            Intent intent= new Intent(getApplicationContext(),Gizlilik.class);
            startActivity(intent);
        }else if (v.getId()==R.id.button15){

            iletisim.setText("Developer: Mustafa Muharrem AYDIN\n" +
                    "Mail: edebtek@gmail.com\n" +
                    "Emeği geçen herkese teşekkürler.\n");
        }


    }
}