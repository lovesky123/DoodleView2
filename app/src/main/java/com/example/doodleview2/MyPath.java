package com.example.doodleview2;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;

/**
 * 自由曲线
 */
class MyPath extends BaseAction {
    private Path path;
    private int size;

    MyPath() {
        path = new Path();
        size = 1;
    }

    MyPath(float x, float y, int size, int color) {
        super(color);
        this.path = new Path();
        this.size = size;
        path.moveTo(x, y);
        path.lineTo(x, y);
    }

    @Override
    public void draw(Canvas canvas) {
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setDither(true);
        paint.setColor(color);
        paint.setStrokeWidth(size);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeJoin(Paint.Join.ROUND);
        paint.setStrokeCap(Paint.Cap.ROUND);
        canvas.drawPath(path, paint);
    }

    @Override
    public void move(float mx, float my) {
        path.lineTo(mx, my);
    }
}
