package com.example.doodleview2;

import android.graphics.Canvas;
import android.graphics.Paint;

class MyFillRect extends BaseAction {
        private float startX;
        private float startY;
        private float stopX;
        private float stopY;
        private int size;

        MyFillRect() {
            this.startX = 0;
            this.startY = 0;
            this.stopX = 0;
            this.stopY = 0;
        }

        MyFillRect(float x, float y, int size, int color) {
            super(color);
            this.startX = x;
            this.startY = y;
            this.stopX = x;
            this.stopY = y;
            this.size = size;
        }

        @Override
        public void draw(Canvas canvas) {
            Paint paint = new Paint();
            paint.setAntiAlias(true);
            paint.setStyle(Paint.Style.FILL);
            paint.setColor(color);
            paint.setStrokeWidth(size);
            canvas.drawRect(startX, startY, stopX, stopY, paint);
        }

        @Override
        public void move(float mx, float my) {
            stopX = mx;
            stopY = my;
        }
    }
