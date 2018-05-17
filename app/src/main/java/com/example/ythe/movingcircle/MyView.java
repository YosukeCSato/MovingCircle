package com.example.ythe.movingcircle;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.Log;
import android.view.View;

import java.util.Random;

public class MyView extends View {

    int mX = this.getWidth()/2;
    int mY = this.getHeight()/2;
    int mVX = 7;
    int mVY = 5;


    @Override
    protected void onDraw(Canvas canvas) {

        super.onDraw(canvas);
        canvas.drawColor(Color.argb(255, 142, 107 ,135));
        Paint paint = new Paint();
        paint.setColor(Color.argb(233, 132, 32, 51));
        Log.d("mX", String.valueOf(mX));
        Log.d("mY", String.valueOf(mY));
        Log.d("getWidth", String.valueOf(this.getWidth()/2));
        Log.d("getHeight", String.valueOf(this.getHeight()/2));

        canvas.drawCircle(mX, mY, 100, paint);

        if (mX > this.getWidth()) {
            mVX = -mVX;
        } else if (mX < 0) {
            mVX = -mVX;
        }
        if (mY > this.getHeight()) {
            mVY = -mVY;
        } else if (mY < 0) {
            mVY = -mVY;
        }
        mX += mVX;
        mY += mVY;
        invalidate();
        Log.d("TAG", String.valueOf(mVX));
        Log.d("TAG", String.valueOf(mVY));
    }


    public MyView(Context context) {
        super(context);
    }
}
