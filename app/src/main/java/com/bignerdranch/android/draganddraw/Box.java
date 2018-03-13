package com.bignerdranch.android.draganddraw;

import android.graphics.PointF;

/**
 * Created by adamc on 3/13/2018.
 */

// When the user touches BoxDrawingView, a new Box will be created and added to the list of existing boxes.
public class Box {

    private PointF mOrigin;
    private PointF mCurrent;

    public Box(PointF origin) {
        mOrigin = origin;
        mCurrent = origin;
    }

    public PointF getCurrent() {
        return mCurrent;
    }

    public void setCurrent(PointF current) {
        this.mCurrent = current;
    }

    public PointF getOrigin() {
        return mOrigin;
    }
}
