package com.edebtek.mustafamuharrem.a6sinifingilizce;

import android.graphics.Color;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import java.util.Random;

import gr.net.maroulis.library.EasySplashScreen;

public class SplashScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        String sozler[] = {"“Senin almaya cesaret edemediğin riskleri alanlar, senin yaşamak istediğin hayatı yaşarlar.”\n" +
                "Her nereyi düşlüyorsan, oraya aitsin.\n" +
                "Tayfun Topaloğlu\n","“Bir gün kalkacaksınız ve hep hayal ettiğiniz şeyleri yapmaya vakit kalmamış olacak. Şimdi tam zamanı. Harekete geçin.” \n" +
                "Paulo Coelho\n","Unutma, bir şeyin yapılamaz olduğunu düşünerek uyursan, başkasının o şeyi yaparken çıkardığı gürültüyle uyanırsın.” \n" +
                "Konfüçyüs\n","“Yüzüstü yere serilseniz bile, hala ileriye doğru hareket ediyorsunuzdur.”\n" +
                " Victor Kiam\n","“Hayatınızda kazanmadan önce, zihninizde kazanmak zorundasınız.” \n" +
                "John Addison\n","“İlk önce kendine ne olacağını sor; sonra ne yapmak gerekiyorsa yap.”\n" +
                " Epiktetos\n","“Hayatımın erken dönemlerinde öğrendim ki eğer bir şeyi istiyorsan, biraz gürültü yapsan iyi olur.” Malcolm X ","“Eğer biz imkansızı yapmazsak, olanaksız ile karşı karşıya kalacağız.” \n" +
                "Murray Bookchin\n","“Başınıza gelen her şey ya size ders olacak bir iyilik ya da bir iyilik olacak derstir.” Polly Berrien Berends","“Zamana bir kere hakim oldunuz mu, insanların bir yıl içinde yapabileceklerini gözlerinde ne kadar büyüttüğünü, buna karşılık on yıl içinde yapabileceklerini nasıl da azımsadıklarını anlayacaksınız.” Anthony Robbins","“Ne zaman ki güçlü olmak, tek çare olarak kalır; o zaman anlarsın ne kadar güçlü olduğunu.” \n" +
                "Bob Marley\n","“Zorlukları aşmanın tek yolu, yeni girişimlerde bulunmaktır.” \n" +
                "Goethe\n","“Umutsuz durumlar yoktur, umutsuz insanlar vardır. Ben hiçbir zaman umudumu yitirmedim.” Mustafa Kemal Atatürk","“Savaşçı olmak mükemmellikle ilgili değildir ya da zaferle veya incitilemez olmakla… O, incinmeye açık olmakla ilgilidir. Gerçek cesaret budur.” Dan Millman","“Diğerlerinden daha akıllı olmak zorunda değiliz. Diğerlerinden daha disiplinli olmak zorundayız.” Warren Buffett","“Yüzüne kapatılan kapılar ile kararlılığın, arkandan kapatılan kapılar ile de cesaretin test edilir.” Tayfun Topaloğlu","“Hiçbir şeyden asla vazgeçme; çünkü vazgeçenler yalnızca kaybedenlerdir.” \n" +
                "Abraham Lincoln\n" +
                "\n","“Mucize, enerjinizi korkularınıza değil, rüyalarınıza verdiğiniz zaman başlar.”\n" +
                " Richard Wilkins\n"};
        Random random = new Random();

        int index = random.nextInt(sozler.length);



        EasySplashScreen config = new EasySplashScreen(SplashScreen.this)

                .withFullScreen()
                .withTargetActivity(MainActivity.class)

                .withSplashTimeOut(5000)
                //.withLogo(R.mipmap.ic_launcher)
                //.withAfterLogoText(sozler[index])
                .withBeforeLogoText("\n"+sozler[index])
                .withBackgroundResource(R.drawable.herb)
                .withHeaderText("EdebTek")
                .withFooterText("Copyright 2017");
                //set text color
        config.getBeforeLogoTextView().setTextColor(Color.BLACK);
        config.getHeaderTextView().setTextColor(Color.WHITE);
        config.getFooterTextView().setTextColor(Color.WHITE);
        config.getHeaderTextView().setTextSize(35);
        config.getFooterTextView().setTextSize(20);
        config.getBeforeLogoTextView().setTextSize(20);




        //set to view
        View view = config.create();
        //set view to content view
        setContentView(view);

    }
}
