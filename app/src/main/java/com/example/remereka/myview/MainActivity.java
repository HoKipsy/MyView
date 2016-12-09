package com.example.remereka.myview;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;

import static android.R.attr.bitmap;

public class MainActivity extends AppCompatActivity {

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        /*
        Bitmap bitmap = Bitmap.createBitmap(100, 200, Bitmap.Config.ARGB_8888);	//100px * 200 px méretű bitmap

        Paint paint = new Paint();
        paint.setColor(Color.BLUE);

        Canvas canvas = new Canvas(bitmap);		//egy canvas, amire rajzolhatunk. Minden változtatás látszódni fog a Bitmap-en
        canvas.drawColor(Color.RED);			//egy egész canvas kitöltése pirossal

        canvas.drawRect(25, 50, 75, 150, paint);	//egy téglalap rajzolása a paint objektummal; a paint miatt kék lesz
        //paraméterek: bal felső sarok: (25, 50), jobb alsó: (75, 150)

        ImageView imageView = new ImageView(this);	//létrehozunk egy ImageViewt, amibn meg fogjuk jeleníteni a bitmap-et
        imageView.setImageBitmap(bitmap);		//beállítjuk a bitmap-et, amit meg szeretnénk jeleníteni

        RelativeLayout layout = new RelativeLayout(this);	//Egy egyszerű layout, amihez hozzáajuk az ImageView-t
        RelativeLayout.LayoutParams params = new RelativeLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        params.addRule(RelativeLayout.CENTER_IN_PARENT);
        layout.addView(imageView, params);
        layout.setBackgroundColor(Color.BLACK);

        setContentView(layout);     //Layout megjelenítése

        */
    }
}
