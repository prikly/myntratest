package com.bytedance.sdk.openadsdk.core.nativeexpress;

import android.content.Context;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import com.bytedance.sdk.openadsdk.core.b.f;
import com.bytedance.sdk.openadsdk.core.e.g;
import com.bytedance.sdk.openadsdk.core.h;
import com.bytedance.sdk.openadsdk.utils.v;

/* compiled from: ViewGestureDetector */
public class n extends GestureDetector {

    /* renamed from: a  reason: collision with root package name */
    private final a f1477a;

    /* renamed from: b  reason: collision with root package name */
    private final f f1478b;

    public n(Context context) {
        this(context, new a());
    }

    public n(Context context, a aVar) {
        super(context, aVar);
        this.f1477a = aVar;
        this.f1478b = new f();
        setIsLongpressEnabled(false);
    }

    /* access modifiers changed from: package-private */
    public void a() {
        this.f1477a.a();
    }

    public boolean b() {
        return this.f1477a.b();
    }

    public g a(Context context, View view, View view2) {
        if (this.f1478b == null) {
            return new g.a().a();
        }
        return new g.a().f(this.f1478b.f957a).e(this.f1478b.f958b).d(this.f1478b.f959c).c(this.f1478b.f960d).b(this.f1478b.f961e).a(this.f1478b.f962f).b(v.a(view)).a(v.a(view2)).c(v.c(view)).d(v.c(view2)).d(this.f1478b.f963g).e(this.f1478b.f964h).f(this.f1478b.i).a(this.f1478b.l).b(h.d().b() ? 1 : 2).a("vessel").a(v.e(context)).c(v.g(context)).b(v.f(context)).a();
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        this.f1478b.a(motionEvent);
        return super.onTouchEvent(motionEvent);
    }

    /* compiled from: ViewGestureDetector */
    static class a extends GestureDetector.SimpleOnGestureListener {

        /* renamed from: a  reason: collision with root package name */
        boolean f1479a = false;

        a() {
        }

        /* access modifiers changed from: package-private */
        public void a() {
            this.f1479a = false;
        }

        /* access modifiers changed from: package-private */
        public boolean b() {
            return this.f1479a;
        }

        public boolean onSingleTapUp(MotionEvent motionEvent) {
            this.f1479a = true;
            return super.onSingleTapUp(motionEvent);
        }
    }
}
