package com.example.tarifuyg;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class CorbaActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    ArrayList<Model> arrayList=new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView=findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        arrayList.add(new Model(R.drawable.corba,"Mercimek Çorbası","Malzemeler\n" +
                "1 su bardağı sarı mercimek,\n" +
                "1 adet soğan,\n" +
                "2 diş sarımsak,\n" +
                "3-4 yemek kaşığı zeytinyağ,\n" +
                "2 yemek kaşığı un,\n" +
                "4 su bardağı sıcak su,\n" +
                "2 su bardağı et suyu,\n" +
                "1/2 limon suyu,\n" +
                "Tuz.\n" +
                "Yapılış\n" +
                "Soğanı yemeklik doğrayıp ezilmiş sarımsakla birlikte kızdırdığınız yağda kavurun,\n" +
                "Unu ekleyip sürekli karıştırarak kokusu çıkana kadar kavurun,\n" +
                "Yıkayıp süzdüğünüz mercimekleri ekleyip karıştırın,\n" +
                "Suyu ve et suyunu ekleyip karıştırın ve orta hararetli ateşte mercimekler patlayana kadar pişirin,\n" +
                "Çorbayı blenderdan veya süzgeçten geçirin,\n" +
                "Tuzunu ve limon suyunu ekleyip karıştırın ve ateşten alın."));
        arrayList.add(new Model(R.drawable.brokoli,"Brokoli Çorbası","Malzemeler\n" +
                "1 küçük baş (500 g) brokoli,\n" +
                "1 yemek kaşığı un,\n" +
                "1 yemek kaşığı tereyağı,\n" +
                "5 su bardağı kaynar su,\n" +
                "1 su bardağı süt,\n" +
                "Tuz,\n" +
                "Üzeri için 1 yemek kaşığı tereyağı ve 1 tatlı kaşığı kurutulmuş nane.\n" +
                "\n" +
                "Yapılış\n" +
                "Çiçeklerine ayrılmış brokoliyi suyla birlikte tencereye alıp yumuşayana kadar haşlayın,\n" +
                "Ayrı bir tencerede tereyağını eritin,\n" +
                "Unu ekleyip kavurun,\n" +
                "Üzerine suyuyla beraber  brokoliyi ekleyip karıştırın,\n" +
                "Blenderdan geçirip sütünü ekleyin ve 2-3 dk. daha kaynatın,\n" +
                "Tuzunu ekleyip karıştırın ve ateşten alın,\n" +
                "Üzeri için tereyağını eritip naneyi ekleyin ve karıştırıp ateşten alın,\n" +
                "Sosu çorbanın üzerine gezdirip karıştırın."));
        arrayList.add(new Model(R.drawable.domates,"Domates Çorbası","Malzemeler\n" +
                "5 adet olgun domates,\n" +
                "2 yemek kaşığı tereyağ,\n" +
                "1 tepeleme yemek kaşığı un,\n" +
                "1 tatlı kaşığı toz biber,\n" +
                "5 su bardağı su,\n" +
                "İsteğe bağlı olarak 1/2 su bardağı süt veya krema,\n" +
                "Tuz,\n" +
                "Üzeri için kaşar rendesi.\n" +
                "Yapılış\n" +
                "Domatesleri rendeleyin,\n" +
                "Tereyağını eritin,\n" +
                "Unu ekleyip kokusu çıkana kadar kavurun,\n" +
                "Toz biberi ekleyip karıştırın,\n" +
                "Domatesleri ekleyip karıştırın,\n" +
                "10-15 dk kadar kısık ateşte pişirin,\n" +
                "Suyunu (ve koyacaksanız sütü) ekleyip kıvamını alana kadar pişirin,\n" +
                "Gerek görürseniz blenderdan geçirip tuzunu ekleyin ve ateşten alın."));
        arrayList.add(new Model(R.drawable.tavuksuyu,"Tavuk Suyu Çorbası","Malzemeler\n" +
                "Yarım tavuk göğsü,\n" +
                "2 su bardağı su,\n" +
                "1 su bardağı süt,\n" +
                "1 tepeleme yemek kaşığı un,\n" +
                "1 yemek kaşığı tereyağ,\n" +
                "1  çay bardağı tel şehriye,\n" +
                "Tuz,\n" +
                "İsteğe bağlı dere otu, maydanoz.\n" +
                "Yapılış\n" +
                "Unu tereyağda kavurun,\n" +
                "2 su bardağı suyu ekleyip topaklanmasına müsaade etmeden hızlıca karıştırın,\n" +
                "Tavuğu haşladığınız sudan 2 su bardağı ekleyin,\n" +
                "Şehriyeleri ve minik minik dittiğiniz tavuğu da ekleyin,\n" +
                "Şehriyeler pişene kadar kaynatın,\n" +
                "Şehriyeler pişince sütü de ekleyerek 1-2 taşım daha kaynayın,\n" +
                "Tuzunu ekleyip karıştırın ve ateşten alın,\n" +
                "Damak zevkinize göre kıyılmış dere otu veya maydanozu ekleyip karıştırın."));
        arrayList.add(new Model(R.drawable.ezogelin,"Ezogelin Çorbası","Malzemeler\n" +
                "1/2 çay bardağı kırmızı mercimek,\n" +
                "1/2 çay bardağı pirinç,\n" +
                "1/2 çay bardağı pilavlık bulgur,\n" +
                "1 adet orta boy soğan,\n" +
                "1 yemek kaşığı domates salçası,\n" +
                "1 tatlı kaşığı toz biber,\n" +
                "1 yemek kaşığı tereyağı,\n" +
                "1 yemek kaşığı sıvı yağ,\n" +
                "6-7 su bardağı su,\n" +
                "1 tatlı kaşığı un,\n" +
                "Tuz, nane, kekik.\n" +
                "Yapılış\n" +
                "Tereyağ ve sıvı yağı tencereye alıp kızdırın,\n" +
                "Küçük küçük doğradığınız soğanı ekleyip yumuşayana kadar kavurun,\n" +
                "Salçayı ekleyip kokusu çıkana kadar kavurun\n" +
                "Toz biber ve unu ekleyip birkaç dakika kavurun,\n" +
                "Suyunu ekleyip karıştırın,\n" +
                "Su kaynayınca mercimek, bulgur ve pirinci ekleyip kapağı kapalı şekilde kısık ateşte hepsi yumuşayana kadar pişirin\n" +
                "Kıvamı koyu geldiği takdirde istediğiniz kıvama gelene kadar kaynar su ekleyin,\n" +
                "Tuz, nane ve kekik ekleyip karıştırın ve ateşten alın.\n"));
        arrayList.add(new Model(R.drawable.sehriye,"Şehriye Çorbası","Malzemeler\n" +
                "1 su bardağı arpa veya tel şehriye,\n" +
                "1 yemek kaşığı domates salçası,\n" +
                "1 tatlı kaşığı kırmızı tatlı toz biber,\n" +
                "1 yemek kaşığı tereyağı,4-5 su bardağı su\n" +
                "1 su bardağı süt,\n" +
                "2 tatlı kaşığı kuru nane,tuz\n" +
                "Yapılış\n" +
                "Tereyağını derin bir tencerede eritin,\n" +
                "İçine salçayı ekleyip kavurun,\n" +
                "Toz biberi ekleyip karıştırın,\n" +
                "Üzerine suyu ekleyip tortu kalmayana kadar karıştırın,\n" +
                "Şehriyeleri de ekleyip yumuşayana kadar sık sık karıştırarak pişirin,\n" +
                "Şehriyeler pişince sütünü ekleyip bir taşım daha kaynatın,\n" +
                "Ateşten almadan tuzunu ve naneyi ekleyip karıştırın."));
        arrayList.add(new Model(R.drawable.pancar,"Pancar Çorbası","Malzemeler\n" +
                "100 g (2 adet küçük boy) kırmızı pancar,\n" +
                "1/2 su bardağı buğday,\n" +
                "5 tepeleme yemek kaşığı yoğurt,\n" +
                "1 diş sarımsak,\n" +
                "Yarım limonun suyu,\n" +
                "Tuz,\n" +
                "4 su bardağı su,\n" +
                "Servis sırasında süslemek için 1 avuç kıyılmış taze soğan.\n" +
                "Yapılış\n" +
                "Pancarları soyup küçük küçük doğrayın ve buğday ve suyla birlikte bir tencereye alın,\n" +
                "Pancarlar ve buğdaylar tamamen yumuşayana kadar haşlayın,\n" +
                "Ayrı bir kapta yoğurt ve limon suyunu pürüzsüz bir kıvam alana kadar çırpın,\n" +
                "Sıcak çorba suyundan bir kepçe alıp yoğurt karışımına azar azar ekleyip hızlıca çırpın,\n" +
                "Yoğurtlu karışım tamamen ılıyana kadar birkaç kepçe daha çorba suyu ekleyip çırpın,\n" +
                "Tencerede kalan çorbanın tamamını yoğurtlu karışıma ekleyip karıştırın,\n" +
                "Rendelenmiş sarımsak ve tuzunu ekleyip karıştırın,\n" +
                "Buzdolabına kaldırıp tamamen soğuyana kadar dinlendirin,\n" +
                "Kıyılmış taze soğanla süsleyerek servis yapın."));

        ModelRecyclerView modelRecyclerView=new ModelRecyclerView(this,arrayList);
        recyclerView.setAdapter(modelRecyclerView);

    }
}