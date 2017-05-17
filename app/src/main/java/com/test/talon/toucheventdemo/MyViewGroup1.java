package com.test.talon.toucheventdemo;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.widget.RelativeLayout;

import java.util.zip.Inflater;

/**
 * Created by Talon on 2017/5/17.
 */

public class MyViewGroup1 extends RelativeLayout {

    private static final String TAG = MyViewGroup1.class.getSimpleName();

    public MyViewGroup1(Context context) {
        super(context);
        initView(context);
    }

    public MyViewGroup1(Context context, AttributeSet attrs) {
        super(context, attrs);
        initView(context);
    }

    public MyViewGroup1(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        initView(context);
    }


    private void initView(Context context) {
        View rootView = LayoutInflater.from(context).inflate(R.layout.viewgroup1_layout, this);
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent ev) {
        Log.e("Talon", TAG + "     dispatchTouchEvent" + ev.getAction());
        return super.dispatchTouchEvent(ev);
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent ev) {
        Log.e("Talon", TAG + "    onInterceptTouchEvent" + ev.getAction());
        return super.onInterceptTouchEvent(ev);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        Log.e("Talon", TAG + "     onTouchEvent" + event.getAction());
        return super.onTouchEvent(event);
    }
}
