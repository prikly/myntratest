package com.explorestack.iab.mraid;

import android.content.Context;
import android.view.GestureDetector;
import android.view.MotionEvent;

public class m extends GestureDetector {

    /* renamed from: a  reason: collision with root package name */
    public final a f3055a;

    public static class a extends GestureDetector.SimpleOnGestureListener {

        /* renamed from: a  reason: collision with root package name */
        public boolean f3056a = false;

        public boolean a() {
            return this.f3056a;
        }

        public void b() {
            this.f3056a = false;
        }

        public boolean onSingleTapUp(MotionEvent motionEvent) {
            this.f3056a = true;
            return super.onSingleTapUp(motionEvent);
        }
    }

    public m(Context context) {
        this(context, new a());
    }

    private m(Context context, a aVar) {
        super(context, aVar);
        this.f3055a = aVar;
        setIsLongpressEnabled(false);
    }

    public boolean a() {
        return this.f3055a.a();
    }

    public void b() {
        this.f3055a.b();
    }
}
