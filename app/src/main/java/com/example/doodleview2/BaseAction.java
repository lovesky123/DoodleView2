package com.example.doodleview2;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;

/**
 * 动作的基础类
 * Created  on 2017/7/12.
 */

abstract class BaseAction {

    public int color;

    BaseAction() {
        color = Color.WHITE;
    }

    BaseAction(int color) {
        this.color = color;
    }

    public abstract void draw(Canvas canvas);

    public abstract void move(float mx, float my);

}





























