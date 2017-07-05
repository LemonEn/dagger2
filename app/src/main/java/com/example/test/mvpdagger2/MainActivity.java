package com.example.test.mvpdagger2;

import android.graphics.BitmapFactory;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {
    private TextView  textView;
    private ImageView  imageView;
    @Inject
   public Datas  datas;
    @Inject
    public OtherData  otherData;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        DaggerDatasComponent.builder().datasModule(new DatasModule(this)).build().inject(this);
        textView= (TextView) findViewById(R.id.text);
        imageView= (ImageView) findViewById(R.id.image);
//        Datas  datas=new Datas();
        String data = datas.getData();
        textView.setText(data);
        imageView.setImageResource(otherData.getImage());

    }
}
