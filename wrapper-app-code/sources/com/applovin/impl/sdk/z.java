package com.applovin.impl.sdk;

import android.graphics.Rect;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import com.applovin.impl.mediation.a.d;
import com.applovin.impl.mediation.a.e;
import com.applovin.impl.sdk.c.b;
import com.applovin.impl.sdk.utils.Utils;
import com.applovin.sdk.AppLovinSdkUtils;
import java.lang.ref.WeakReference;

public class z {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final v f15972a;

    /* renamed from: b  reason: collision with root package name */
    private final Object f15973b = new Object();

    /* renamed from: c  reason: collision with root package name */
    private final Rect f15974c = new Rect();

    /* renamed from: d  reason: collision with root package name */
    private final Handler f15975d;

    /* renamed from: e  reason: collision with root package name */
    private final Runnable f15976e;

    /* renamed from: f  reason: collision with root package name */
    private final ViewTreeObserver.OnPreDrawListener f15977f;
    /* access modifiers changed from: private */

    /* renamed from: g  reason: collision with root package name */
    public final WeakReference<View> f15978g;

    /* renamed from: h  reason: collision with root package name */
    private final long f15979h;
    private WeakReference<ViewTreeObserver> i = new WeakReference<>((Object) null);
    /* access modifiers changed from: private */
    public WeakReference<View> j = new WeakReference<>((Object) null);
    private int k;
    private float l;
    private float m;
    private long n;
    private long o = Long.MIN_VALUE;

    public interface a {
        void onLogVisibilityImpression();
    }

    public z(final View view, n nVar, a aVar) {
        this.f15972a = nVar.D();
        this.f15979h = ((Long) nVar.a(b.cb)).longValue();
        this.f15975d = new Handler(Looper.getMainLooper());
        this.f15978g = new WeakReference<>(view);
        final WeakReference weakReference = new WeakReference(aVar);
        this.f15976e = new Runnable() {
            public void run() {
                View view = (View) z.this.f15978g.get();
                ViewGroup viewGroup = view instanceof ViewGroup ? (ViewGroup) view : null;
                View view2 = (View) z.this.j.get();
                if (viewGroup != null && view2 != null) {
                    if (z.this.b(viewGroup, view2)) {
                        v unused = z.this.f15972a;
                        if (v.a()) {
                            z.this.f15972a.b("VisibilityTracker", "View met visibility requirements. Logging visibility impression..");
                        }
                        z.this.a();
                        a aVar = (a) weakReference.get();
                        if (aVar != null) {
                            aVar.onLogVisibilityImpression();
                            return;
                        }
                        return;
                    }
                    z.this.b();
                }
            }
        };
        this.f15977f = new ViewTreeObserver.OnPreDrawListener() {
            public boolean onPreDraw() {
                z.this.b();
                z.this.b(view);
                return true;
            }
        };
    }

    private void a(View view) {
        View rootView = Utils.getRootView((View) this.f15978g.get());
        if (rootView == null) {
            rootView = Utils.getRootView(view);
        }
        if (rootView != null) {
            ViewTreeObserver viewTreeObserver = rootView.getViewTreeObserver();
            if (viewTreeObserver.isAlive()) {
                this.i = new WeakReference<>(viewTreeObserver);
                viewTreeObserver.addOnPreDrawListener(this.f15977f);
            } else if (v.a()) {
                this.f15972a.d("VisibilityTracker", "Unable to set view tree observer since the view tree observer is not alive.");
            }
        } else if (v.a()) {
            this.f15972a.b("VisibilityTracker", "Unable to set view tree observer due to no root view.");
        }
    }

    private boolean a(View view, View view2) {
        if (view2 == null || view2.getVisibility() != 0 || view.getParent() == null || view2.getWidth() <= 0 || view2.getHeight() <= 0 || !view2.getGlobalVisibleRect(this.f15974c)) {
            return false;
        }
        long pxToDp = (long) (AppLovinSdkUtils.pxToDp(view2.getContext(), this.f15974c.width()) * AppLovinSdkUtils.pxToDp(view2.getContext(), this.f15974c.height()));
        if (pxToDp < ((long) this.k)) {
            return false;
        }
        if ((((float) pxToDp) / ((float) ((long) (AppLovinSdkUtils.pxToDp(view2.getContext(), view2.getWidth()) * AppLovinSdkUtils.pxToDp(view2.getContext(), view2.getHeight()))))) * 100.0f < this.l) {
            return false;
        }
        return (((float) ((long) (this.f15974c.width() * this.f15974c.height()))) / ((float) ((long) (view2.getWidth() * view2.getHeight())))) * 100.0f >= this.m;
    }

    /* access modifiers changed from: private */
    public void b() {
        this.f15975d.postDelayed(this.f15976e, this.f15979h);
    }

    /* access modifiers changed from: private */
    public void b(View view) {
        v vVar;
        String str;
        ViewTreeObserver viewTreeObserver = (ViewTreeObserver) this.i.get();
        if (viewTreeObserver == null || !viewTreeObserver.isAlive()) {
            if (view != null) {
                ViewTreeObserver viewTreeObserver2 = view.getViewTreeObserver();
                if (viewTreeObserver2.isAlive()) {
                    viewTreeObserver2.removeOnPreDrawListener(this.f15977f);
                } else if (v.a()) {
                    vVar = this.f15972a;
                    str = "Could not remove on pre-draw listener. View tree observer is not alive.";
                }
            } else if (v.a()) {
                vVar = this.f15972a;
                str = "Could not remove on pre-draw listener. Root view is null.";
            }
            vVar.b("VisibilityTracker", str);
        } else {
            viewTreeObserver.removeOnPreDrawListener(this.f15977f);
        }
        this.i.clear();
    }

    /* access modifiers changed from: private */
    public boolean b(View view, View view2) {
        if (!a(view, view2)) {
            return false;
        }
        if (this.o == Long.MIN_VALUE) {
            this.o = SystemClock.uptimeMillis();
        }
        return SystemClock.uptimeMillis() - this.o >= this.n;
    }

    public void a() {
        synchronized (this.f15973b) {
            this.f15975d.removeMessages(0);
            b((View) this.f15978g.get());
            this.o = Long.MIN_VALUE;
            this.j.clear();
        }
    }

    public void a(e eVar) {
        WeakReference<View> weakReference;
        synchronized (this.f15973b) {
            if (v.a()) {
                this.f15972a.b("VisibilityTracker", "Tracking Visibility...");
            }
            a();
            if (eVar instanceof com.applovin.impl.mediation.a.b) {
                weakReference = new WeakReference<>(((com.applovin.impl.mediation.a.b) eVar).o());
            } else if (eVar instanceof d) {
                weakReference = new WeakReference<>(((d) eVar).z());
            } else {
                return;
            }
            this.j = weakReference;
            this.k = eVar.K();
            this.l = eVar.L();
            this.m = eVar.M();
            this.n = eVar.O();
            a((View) this.j.get());
        }
    }
}
