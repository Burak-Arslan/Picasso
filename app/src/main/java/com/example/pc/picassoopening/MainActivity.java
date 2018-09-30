package com.example.pc.picassoopening;

import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

public class MainActivity extends AppCompatActivity {

    ImageView imgPicassso;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Init();
        GetImage();
    }

    public void Init() {
        imgPicassso = (ImageView) findViewById(R.id.imgPicassso);
    }

    public void GetImage(){
        Picasso.get().load("https://vignette.wikia.nocookie.net/marveldatabase/images/2/2e/Deadpool_%282015%29_logo.png/revision/latest?cb=20151012233806").into(imgPicassso);
    }
}
