package com.ironsource.sdk.controller;

import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.os.Build;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.ironsource.environment.h;
import com.ironsource.sdk.controller.x;
import com.ironsource.sdk.i.a;
import com.ironsource.sdk.j.g;
import com.unity3d.services.core.request.metrics.MetricCommonTags;

public final class i extends FrameLayout implements g {

    /* renamed from: a  reason: collision with root package name */
    Context f9201a;

    /* renamed from: b  reason: collision with root package name */
    x f9202b;

    public i(Context context) {
        super(context);
        this.f9201a = context;
        setClickable(true);
    }

    static /* synthetic */ ViewGroup a(i iVar) {
        Activity activity = (Activity) iVar.f9201a;
        if (activity != null) {
            return (ViewGroup) activity.getWindow().getDecorView();
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public int a() {
        int identifier;
        try {
            if (this.f9201a == null || (identifier = this.f9201a.getResources().getIdentifier("status_bar_height", "dimen", MetricCommonTags.METRIC_COMMON_TAG_PLATFORM_ANDROID)) <= 0) {
                return 0;
            }
            return this.f9201a.getResources().getDimensionPixelSize(identifier);
        } catch (Exception unused) {
            return 0;
        }
    }

    /* access modifiers changed from: package-private */
    public int b() {
        Activity activity = (Activity) this.f9201a;
        try {
            if (Build.VERSION.SDK_INT > 9) {
                Rect rect = new Rect();
                activity.getWindow().getDecorView().getDrawingRect(rect);
                Rect rect2 = new Rect();
                activity.getWindow().getDecorView().getWindowVisibleDisplayFrame(rect2);
                if (h.o(activity) == 1) {
                    if (rect.bottom - rect2.bottom > 0) {
                        return rect.bottom - rect2.bottom;
                    }
                    return 0;
                } else if (rect.right - rect2.right > 0) {
                    return rect.right - rect2.right;
                }
            }
        } catch (Exception unused) {
        }
        return 0;
    }

    /* access modifiers changed from: protected */
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f9202b.l();
        this.f9202b.a(true, "main");
    }

    public final boolean onBackButtonPressed() {
        new a();
        return a.a((Activity) this.f9201a);
    }

    public final void onCloseRequested() {
        ((Activity) this.f9201a).runOnUiThread(new Runnable() {
            public final void run() {
                ViewGroup a2 = i.a(i.this);
                if (a2 != null) {
                    a2.removeView(i.this);
                }
            }
        });
    }

    /* access modifiers changed from: protected */
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f9202b.k();
        this.f9202b.a(false, "main");
        x xVar = this.f9202b;
        if (xVar != null) {
            xVar.j = x.g.Gone;
            this.f9202b.l = null;
            this.f9202b.v = null;
        }
        removeAllViews();
    }

    public final void onOrientationChanged(String str, int i) {
    }
}
