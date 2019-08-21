package org.techtown.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.support.v7.widget.AppCompatButton;
import android.util.AttributeSet;
import android.view.MotionEvent;

public class MyButton extends AppCompatButton {  //AppCompatButton 클래스 상속하여 새로운클래스 정의하기

    public MyButton(Context context) {
        super(context);
        init(context);
    }

    public MyButton(Context context, AttributeSet attrs) {
        super(context, attrs);
        init(context);
    }


    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        return super.onTouchEvent(event);
    }

    private void init(Context context){  //Context 객체를 전달하도록
        setBackgroundColor(Color.CYAN);  //배경색 설정
        setTextColor(Color.BLACK);       //글자색 설정

        float textSize = getResources().getDimension(R.dimen.text_size);
        setTextSize(textSize);  //초기화를 위한 메서드 정의하기



    }
}
