package com.github.megatron.svg.sample.drawables;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;

import com.android.svg.support.SVGRenderer;

/**
 * AUTO-GENERATED FILE.  DO NOT MODIFY.
 * 
 * This class was automatically generated by the
 * SVG-Generator. It should not be modified by hand.
 */
public class ic_sample_01 extends SVGRenderer {

    public ic_sample_01(Context context) {
        super(context);
        mAlpha = 1.0f;
        mWidth = dip2px(48.0f);
        mHeight = dip2px(48.0f);
    }

    @Override
    public void render(Canvas canvas, int w, int h, ColorFilter filter) {
        
        final float scaleX = w / 24.0f;
        final float scaleY = h / 24.0f;
        
        mPath.reset();
        mRenderPath.reset();
        
        mFinalPathMatrix.setValues(new float[]{1.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 1.0f});
        mFinalPathMatrix.postScale(scaleX, scaleY);
        
        mPath.moveTo(16.21f, 4.16f);
        mPath.rLineTo(4.0f, 4.0f);
        mPath.rLineTo(0f, -4.0f);
        mPath.close();
        mPath.moveTo(16.21f, 4.16f);
        mPath.moveTo(20.21f, 16.16f);
        mPath.rLineTo(-4.0f, 4.0f);
        mPath.rLineTo(4.0f, 0f);
        mPath.close();
        mPath.moveTo(20.21f, 16.16f);
        mPath.moveTo(8.21f, 20.16f);
        mPath.rLineTo(-4.0f, -4.0f);
        mPath.rLineTo(0f, 4.0f);
        mPath.close();
        mPath.moveTo(8.21f, 20.16f);
        mPath.moveTo(4.21f, 8.16f);
        mPath.rLineTo(4.0f, -4.0f);
        mPath.rLineTo(-4.0f, 0f);
        mPath.close();
        mPath.moveTo(4.21f, 8.16f);
        mPath.moveTo(17.16f, 7.21f);
        mPath.rCubicTo(-2.73f, -2.73f, -7.17f, -2.73f, -9.9f, 0.0f);
        mPath.rCubicTo(-2.7299995f, 2.73f, -2.73f, 7.17f, 0.0f, 9.9f);
        mPath.rCubicTo(2.73f, 2.7300005f, 7.17f, 2.73f, 9.9f, 0.0f);
        mPath.rCubicTo(2.7299995f, -2.7299995f, 2.73f, -7.16f, 0.0f, -9.9f);
        mPath.close();
        mPath.moveTo(17.16f, 7.21f);
        mPath.moveTo(16.06f, 16.01f);
        mPath.rCubicTo(-2.13f, 2.13f, -5.57f, 2.13f, -7.7f, 0.0f);
        mPath.rCubicTo(-2.13f, -2.1299992f, -2.13f, -5.57f, 0.0f, -7.7f);
        mPath.rCubicTo(2.13f, -2.13f, 5.57f, -2.13f, 7.7f, 0.0f);
        mPath.rCubicTo(2.1299992f, 2.13f, 2.13f, 5.57f, 0.0f, 7.7f);
        mPath.close();
        mPath.moveTo(16.06f, 16.01f);
        
        mRenderPath.addPath(mPath, mFinalPathMatrix);
        if (mFillPaint == null) {
            mFillPaint = new Paint();
            mFillPaint.setStyle(Paint.Style.FILL);
            mFillPaint.setAntiAlias(true);
        }
        mFillPaint.setColor(applyAlpha(-16711423, 1.0f));
        mFillPaint.setColorFilter(filter);
        canvas.drawPath(mRenderPath, mFillPaint);

    }

}