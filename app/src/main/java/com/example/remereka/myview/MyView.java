package com.example.remereka.myview;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.widget.ImageView;
import android.widget.RelativeLayout;

import static android.R.attr.alpha;
import static android.R.attr.bitmap;
import static android.R.attr.radius;

/**
 * Created by remereka on 2016.12.09..
 */

public class MyView extends SurfaceView implements SurfaceHolder.Callback {

    private SurfaceHolder surfaceHolder;

    Paint paint = new Paint();
    public MyView(Context context, AttributeSet attrs) {
        super(context, attrs);

        paint.setColor(Color.RED);
        surfaceHolder = getHolder();
        surfaceHolder.addCallback(this);

    }

    @Override
    public void surfaceCreated(SurfaceHolder surfaceHolder) {
        Canvas canvas =surfaceHolder.lockCanvas();

        if(canvas != null){

            render(canvas);
            surfaceHolder.unlockCanvasAndPost(canvas);

        }
    }

    private void render(Canvas canvas){
 /*       canvas.drawRect(10,  10, 100, 100,  paint);
        canvas.drawCircle(250, 250, 150, paint);
        canvas.drawLine(50, 500, 50, 10, paint); */

        float cx = 200;
        float cy = 300;
        float radius = 100;
        //--------------------
        float prevX=cx+radius;
        float prevY=cy;
        for (int alpha=0; alpha<500; alpha+=5){
            float x = radius * (float) Math.cos(Math.toRadians(alpha));
            float y = radius * (float) Math.sin(Math.toRadians(alpha));

            canvas.drawLine(cx+prevX, cy+prevY, cx+x, cy+y, paint);
            prevX=x;
            prevY=y;

        }
    }

    @Override
    public void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i1, int i2) {

    }

    @Override
    public void surfaceDestroyed(SurfaceHolder surfaceHolder) {

    }
}