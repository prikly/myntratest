package com.appsgeyser.multiTabApp.controllers;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import androidx.viewpager.widget.ViewPager;

public class ContentSwipeAwareViewPager extends ViewPager {
    private boolean enabled = true;

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return false;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        return false;
    }

    public ContentSwipeAwareViewPager(Context context) {
        super(context);
    }

    public ContentSwipeAwareViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public void setPagingEnabled(boolean z) {
        this.enabled = z;
    }
}
