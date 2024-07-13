package com.applovin.impl.mediation.nativeAds.a;

import android.os.Handler;
import android.view.View;
import android.view.ViewTreeObserver;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.WeakHashMap;

public class c {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final WeakHashMap<View, Integer> f15082a = new WeakHashMap<>();
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final Object f15083b = new Object();

    /* renamed from: c  reason: collision with root package name */
    private final Handler f15084c = new Handler();
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public boolean f15085d = false;

    /* renamed from: e  reason: collision with root package name */
    private final WeakReference<View> f15086e;

    /* renamed from: f  reason: collision with root package name */
    private final ViewTreeObserver.OnPreDrawListener f15087f;
    /* access modifiers changed from: private */

    /* renamed from: g  reason: collision with root package name */
    public a f15088g;

    public interface a {
        void a(int i, int i2);
    }

    public c(View view) {
        this.f15086e = new WeakReference<>(view);
        ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
        if (viewTreeObserver.isAlive()) {
            AnonymousClass1 r0 = new ViewTreeObserver.OnPreDrawListener() {
                public boolean onPreDraw() {
                    c.this.b();
                    return true;
                }
            };
            this.f15087f = r0;
            viewTreeObserver.addOnPreDrawListener(r0);
            return;
        }
        this.f15087f = null;
    }

    /* access modifiers changed from: private */
    public void b() {
        if (!this.f15085d) {
            this.f15085d = true;
            this.f15084c.postDelayed(new Runnable() {
                public void run() {
                    synchronized (c.this.f15083b) {
                        boolean unused = c.this.f15085d = false;
                        int i = -1;
                        int i2 = -1;
                        for (Map.Entry entry : c.this.f15082a.entrySet()) {
                            if (c.this.b((View) entry.getKey())) {
                                Integer num = (Integer) entry.getValue();
                                if (i == -1 && i2 == -1) {
                                    i = num.intValue();
                                    i2 = num.intValue();
                                } else {
                                    i = Math.min(i, ((Integer) entry.getValue()).intValue());
                                    i2 = Math.max(i2, ((Integer) entry.getValue()).intValue());
                                }
                            }
                        }
                        if (c.this.f15088g != null) {
                            c.this.f15088g.a(i, i2);
                        }
                    }
                }
            }, 100);
        }
    }

    /* access modifiers changed from: private */
    public boolean b(View view) {
        return (view == null || view.getVisibility() != 0 || view.getParent() == null) ? false : true;
    }

    public void a() {
        ViewTreeObserver.OnPreDrawListener onPreDrawListener;
        this.f15088g = null;
        View view = (View) this.f15086e.get();
        if (view != null) {
            ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
            if (viewTreeObserver.isAlive() && (onPreDrawListener = this.f15087f) != null) {
                viewTreeObserver.removeOnPreDrawListener(onPreDrawListener);
            }
            this.f15086e.clear();
        }
    }

    public void a(View view) {
        synchronized (this.f15083b) {
            this.f15082a.remove(view);
        }
    }

    public void a(View view, int i) {
        synchronized (this.f15083b) {
            this.f15082a.put(view, Integer.valueOf(i));
            b();
        }
    }

    public void a(a aVar) {
        this.f15088g = aVar;
    }
}
