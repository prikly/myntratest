package com.explorestack.iab.mraid;

import android.app.Activity;
import android.content.Context;
import android.content.MutableContextWrapper;
import android.content.res.Configuration;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.explorestack.iab.CacheControl;
import com.explorestack.iab.bridge.JsBridgeHandler;
import com.explorestack.iab.measurer.MraidAdMeasurer;
import com.explorestack.iab.mraid.j;
import com.explorestack.iab.utils.Assets;
import com.explorestack.iab.utils.IabClickCallback;
import com.explorestack.iab.utils.IabElementStyle;
import com.explorestack.iab.utils.Utils;
import com.explorestack.iab.utils.l;
import com.explorestack.iab.view.a;
import java.io.UnsupportedEncodingException;
import java.lang.ref.WeakReference;
import java.net.URLDecoder;
import java.util.concurrent.atomic.AtomicBoolean;

public class MraidView extends com.explorestack.iab.view.a implements IabClickCallback, a.d {
    public final String A;
    public final float B;
    public final float C;
    public final float D;
    public final boolean E;
    public final boolean F;
    public final boolean G;
    public final boolean H;
    public final AtomicBoolean I;
    public final AtomicBoolean J;
    public final AtomicBoolean K;
    public boolean L;
    public boolean M;
    public boolean N;
    public final a.d O;
    public final IabElementStyle P;
    public final IabElementStyle Q;
    public final IabElementStyle R;
    public final IabElementStyle S;
    public com.explorestack.iab.utils.l T;
    public com.explorestack.iab.utils.j U;
    public Runnable V;
    public Integer W;

    /* renamed from: h  reason: collision with root package name */
    public final MutableContextWrapper f2959h;
    public h i;
    public final j j;
    public j k;
    public com.explorestack.iab.view.a l;
    public com.explorestack.iab.view.a m;
    public com.explorestack.iab.utils.h n;
    public WeakReference<Activity> o;
    public final GestureDetector p;
    public final b q;
    public final f r;
    public final k s;
    public String t;
    public MraidViewListener u;
    public final MraidAdMeasurer v;
    public final d w;
    public final CacheControl x;
    public final String y;
    public final String z;

    public static class Builder {

        /* renamed from: a  reason: collision with root package name */
        public final d f2960a;

        /* renamed from: b  reason: collision with root package name */
        public CacheControl f2961b;

        /* renamed from: c  reason: collision with root package name */
        public String f2962c;

        /* renamed from: d  reason: collision with root package name */
        public String f2963d;

        /* renamed from: e  reason: collision with root package name */
        public String f2964e;

        /* renamed from: f  reason: collision with root package name */
        public String[] f2965f;

        /* renamed from: g  reason: collision with root package name */
        public IabElementStyle f2966g;

        /* renamed from: h  reason: collision with root package name */
        public IabElementStyle f2967h;
        public IabElementStyle i;
        public IabElementStyle j;
        public float k;
        public float l;
        public MraidViewListener listener;
        public float m;
        public MraidAdMeasurer mraidAdMeasurer;
        public boolean n;
        public boolean o;
        public boolean p;
        public boolean q;

        public Builder() {
            this(d.INLINE);
        }

        public Builder(d dVar) {
            this.f2965f = null;
            this.k = 3.0f;
            this.l = 0.0f;
            this.m = 0.0f;
            this.f2960a = dVar;
            this.f2961b = CacheControl.FullLoad;
            this.f2962c = "https://localhost";
        }

        public MraidView build(Context context) {
            return new MraidView(context, this, (c) null);
        }

        public Builder forceUseNativeCloseButton(boolean z) {
            this.o = z;
            return this;
        }

        public Builder setAdMeasurer(MraidAdMeasurer mraidAdMeasurer2) {
            this.mraidAdMeasurer = mraidAdMeasurer2;
            return this;
        }

        public Builder setBaseUrl(String str) {
            this.f2962c = str;
            return this;
        }

        public Builder setCacheControl(CacheControl cacheControl) {
            this.f2961b = cacheControl;
            return this;
        }

        public Builder setCloseStyle(IabElementStyle iabElementStyle) {
            this.f2966g = iabElementStyle;
            return this;
        }

        public Builder setCloseTimeSec(float f2) {
            this.l = f2;
            return this;
        }

        public Builder setCountDownStyle(IabElementStyle iabElementStyle) {
            this.f2967h = iabElementStyle;
            return this;
        }

        public Builder setDurationSec(float f2) {
            this.m = f2;
            return this;
        }

        public Builder setIsTag(boolean z) {
            this.n = z;
            return this;
        }

        public Builder setListener(MraidViewListener mraidViewListener) {
            this.listener = mraidViewListener;
            return this;
        }

        public Builder setLoadingStyle(IabElementStyle iabElementStyle) {
            this.i = iabElementStyle;
            return this;
        }

        public Builder setPageFinishedScript(String str) {
            this.f2964e = str;
            return this;
        }

        public Builder setPlaceholderTimeoutSec(float f2) {
            this.k = f2;
            return this;
        }

        public Builder setProductLink(String str) {
            this.f2963d = str;
            return this;
        }

        public Builder setProgressStyle(IabElementStyle iabElementStyle) {
            this.j = iabElementStyle;
            return this;
        }

        public Builder setR1(boolean z) {
            this.p = z;
            return this;
        }

        public Builder setR2(boolean z) {
            this.q = z;
            return this;
        }
    }

    public class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ View f2968a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ Runnable f2969b;

        public a(View view, Runnable runnable) {
            this.f2968a = view;
            this.f2969b = runnable;
        }

        public void run() {
            MraidView.this.b(this.f2968a);
            Runnable runnable = this.f2969b;
            if (runnable != null) {
                runnable.run();
            }
        }
    }

    public static /* synthetic */ class b {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f2971a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                com.explorestack.iab.CacheControl[] r0 = com.explorestack.iab.CacheControl.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f2971a = r0
                com.explorestack.iab.CacheControl r1 = com.explorestack.iab.CacheControl.FullLoad     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f2971a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.explorestack.iab.CacheControl r1 = com.explorestack.iab.CacheControl.Stream     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f2971a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.explorestack.iab.CacheControl r1 = com.explorestack.iab.CacheControl.PartialLoad     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.explorestack.iab.mraid.MraidView.b.<clinit>():void");
        }
    }

    public class c extends GestureDetector.SimpleOnGestureListener {
        public c() {
        }

        public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f2, float f3) {
            return true;
        }
    }

    public class d extends l {
        public d() {
            super(MraidView.this, (c) null);
        }

        public void a(boolean z) {
            if (z) {
                MraidView.this.m();
                if (!MraidView.this.L) {
                    boolean unused = MraidView.this.L = true;
                    if (MraidView.this.u != null) {
                        MraidView.this.u.onShown(MraidView.this);
                    }
                }
            }
        }

        public void b(boolean z) {
            if (!MraidView.this.F) {
                if (z && !MraidView.this.N) {
                    boolean unused = MraidView.this.N = true;
                }
                MraidView mraidView = MraidView.this;
                mraidView.a(mraidView.j);
            }
        }

        public void d(String str) {
            MraidView.this.c(str);
        }
    }

    public class e implements l.c {
        public e() {
        }

        public void a() {
            MraidView.this.U.c();
            if (!MraidView.this.M && MraidView.this.H && MraidView.this.D > 0.0f) {
                MraidView.this.i();
            }
        }

        public void a(float f2, long j, long j2) {
            int i = (int) (j / 1000);
            MraidView.this.U.a(f2, i, (int) (j2 / 1000));
        }
    }

    public class f implements a.d {
        public f() {
        }

        public void onCloseClick() {
            MraidView.this.a(2);
        }

        public void onCountDownFinish() {
        }
    }

    public class g implements Runnable {
        public g() {
        }

        public void run() {
            if (MraidView.this.i == h.RESIZED) {
                MraidView.this.e();
            } else if (MraidView.this.i == h.EXPANDED) {
                MraidView.this.d();
            } else if (MraidView.this.j()) {
                MraidView.this.setViewState(h.HIDDEN);
                if (MraidView.this.u != null) {
                    MraidView.this.u.onClose(MraidView.this);
                }
            }
        }
    }

    public class h implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ j f2977a;

        public class a implements Runnable {

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ Point f2979a;

            /* renamed from: com.explorestack.iab.mraid.MraidView$h$a$a  reason: collision with other inner class name */
            public class C0030a implements Runnable {
                public C0030a() {
                }

                public void run() {
                    MraidView.this.g();
                }
            }

            public a(Point point) {
                this.f2979a = point;
            }

            public void run() {
                C0030a aVar = new C0030a();
                h hVar = h.this;
                MraidView mraidView = MraidView.this;
                Point point = this.f2979a;
                mraidView.b(point.x, point.y, hVar.f2977a, aVar);
            }
        }

        public h(j jVar) {
            this.f2977a = jVar;
        }

        public void run() {
            IabElementStyle resolveDefCloseStyle = Assets.resolveDefCloseStyle(MraidView.this.getContext(), MraidView.this.P);
            Point clickPoint = Utils.getClickPoint(MraidView.this.r.e(), resolveDefCloseStyle.getHorizontalPosition().intValue(), resolveDefCloseStyle.getVerticalPosition().intValue());
            MraidView.this.a(clickPoint.x, clickPoint.y, this.f2977a, new a(clickPoint));
        }
    }

    public class i extends l {
        public i() {
            super(MraidView.this, (c) null);
        }

        public void a(boolean z) {
        }

        public void b(boolean z) {
            if (MraidView.this.k != null) {
                MraidView mraidView = MraidView.this;
                mraidView.a(mraidView.k);
            }
        }

        public void d(String str) {
            MraidView.this.h();
        }
    }

    public class j implements Runnable {
        public j() {
        }

        public void run() {
            MraidView.this.a((Runnable) null);
        }
    }

    public class k implements Runnable {
        public k() {
        }

        public void run() {
            MraidView.this.k.a(MraidView.this.q);
            MraidView.this.k.a(MraidView.this.w);
            MraidView.this.k.a(MraidView.this.k.f());
            MraidView.this.k.a(MraidView.this.i);
            MraidView.this.k.b(MraidView.this.A);
            MraidView.this.k.h();
        }
    }

    public abstract class l implements j.b {
        private l() {
        }

        public /* synthetic */ l(MraidView mraidView, c cVar) {
            this();
        }

        public void a() {
            MraidLog.d("MRAIDView", "Callback: onLoaded");
            MraidView.this.l();
        }

        public void a(int i) {
            MraidLog.d("MRAIDView", "Callback: onError (" + i + ")");
            MraidView.this.a(i);
        }

        public void a(c cVar) {
            MraidLog.d("MRAIDView", "Callback: onOrientation " + cVar);
            if (MraidView.this.j() || MraidView.this.i == h.EXPANDED) {
                MraidView.this.a(cVar);
            }
        }

        public void a(e eVar) {
            MraidLog.d("MRAIDView", "Callback: onResize (" + eVar + ")");
            MraidView.this.a(eVar);
        }

        public void a(String str) {
            MraidLog.d("MRAIDView", "Callback: onOpen (" + str + ")");
            MraidView.this.b(str);
        }

        public void b() {
            MraidLog.d("MRAIDView", "Callback: onClose");
            MraidView.this.f();
        }

        public void b(String str) {
            MraidLog.d("MRAIDView", "Callback: onExpand " + str);
            if (!MraidView.this.j()) {
                MraidView.this.a(str);
            }
        }

        public void c(String str) {
            MraidLog.d("MRAIDView", "Callback: playVideo " + str);
            try {
                String decode = URLDecoder.decode(str, "UTF-8");
                if (MraidView.this.u != null) {
                    MraidView.this.u.onPlayVideo(MraidView.this, decode);
                }
            } catch (UnsupportedEncodingException e2) {
                e2.printStackTrace();
            }
        }
    }

    private MraidView(Context context, Builder builder) {
        super(context);
        this.i = h.LOADING;
        this.I = new AtomicBoolean(false);
        this.J = new AtomicBoolean(false);
        this.K = new AtomicBoolean(false);
        this.L = false;
        this.M = false;
        this.N = false;
        MutableContextWrapper mutableContextWrapper = new MutableContextWrapper(context);
        this.f2959h = mutableContextWrapper;
        this.u = builder.listener;
        this.w = builder.f2960a;
        this.x = builder.f2961b;
        this.y = builder.f2962c;
        this.z = builder.f2963d;
        this.A = builder.f2964e;
        this.B = builder.k;
        this.C = builder.l;
        float o2 = builder.m;
        this.D = o2;
        this.E = builder.n;
        this.F = builder.o;
        this.G = builder.p;
        this.H = builder.q;
        MraidAdMeasurer mraidAdMeasurer = builder.mraidAdMeasurer;
        this.v = mraidAdMeasurer;
        this.P = builder.f2966g;
        this.Q = builder.f2967h;
        this.R = builder.i;
        IabElementStyle h2 = builder.j;
        this.S = h2;
        this.q = new b(builder.f2965f);
        this.r = new f(context);
        this.s = new k();
        this.p = new GestureDetector(context, new c());
        j jVar = new j(mutableContextWrapper, new d());
        this.j = jVar;
        addView(jVar.c(), new FrameLayout.LayoutParams(-1, -1, 17));
        if (o2 > 0.0f) {
            com.explorestack.iab.utils.j jVar2 = new com.explorestack.iab.utils.j((View.OnClickListener) null);
            this.U = jVar2;
            jVar2.a(context, (ViewGroup) this, h2);
            com.explorestack.iab.utils.l lVar = new com.explorestack.iab.utils.l(this, new e());
            this.T = lVar;
            lVar.a(o2);
        }
        this.O = new f();
        setCloseClickListener(this);
        if (mraidAdMeasurer != null) {
            mraidAdMeasurer.registerAdContainer(this);
            mraidAdMeasurer.registerAdView(jVar.c());
        }
    }

    public /* synthetic */ MraidView(Context context, Builder builder, c cVar) {
        this(context, builder);
    }

    private void setResizedViewSizeAndPosition(e eVar) {
        MraidLog.d("MRAIDView", "setResizedViewSizeAndPosition: " + eVar);
        if (this.l != null) {
            int dpToPx = Utils.dpToPx(getContext(), (float) eVar.f2992a);
            int dpToPx2 = Utils.dpToPx(getContext(), (float) eVar.f2993b);
            int dpToPx3 = Utils.dpToPx(getContext(), (float) eVar.f2994c);
            int dpToPx4 = Utils.dpToPx(getContext(), (float) eVar.f2995d);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(dpToPx, dpToPx2);
            Rect b2 = this.r.b();
            layoutParams.leftMargin = b2.left + dpToPx3;
            layoutParams.topMargin = b2.top + dpToPx4;
            this.l.setLayoutParams(layoutParams);
        }
    }

    public final MotionEvent a(int i2, int i3, int i4) {
        return MotionEvent.obtain(SystemClock.uptimeMillis(), SystemClock.uptimeMillis(), i2, (float) i3, (float) i4, 0);
    }

    public final void a(int i2) {
        if (this.u == null) {
            return;
        }
        if (this.x != CacheControl.PartialLoad || !this.I.get() || this.K.get() || i2 != 0) {
            this.u.onError(this, i2);
        } else {
            this.u.onError(this, 3);
        }
    }

    public final void a(int i2, int i3, j jVar, Runnable runnable) {
        if (!this.M) {
            a(jVar.c(), i2, i3);
            this.V = runnable;
            postDelayed(runnable, 150);
        }
    }

    public final void a(Activity activity) {
        Integer num = this.W;
        if (num != null) {
            activity.setRequestedOrientation(num.intValue());
            this.W = null;
        }
    }

    public final void a(View view) {
        if (view != null) {
            if (view instanceof ViewGroup) {
                ((ViewGroup) view).removeAllViews();
            }
            Utils.removeFromParent(view);
        }
    }

    public final void a(c cVar) {
        if (cVar != null) {
            Activity peekActivity = peekActivity();
            MraidLog.d("MRAIDView", "applyOrientation: " + cVar);
            if (peekActivity == null) {
                MraidLog.d("MRAIDView", "no any interacted activities");
                return;
            }
            b(peekActivity);
            peekActivity.setRequestedOrientation(cVar.a((Context) peekActivity));
        }
    }

    public final void a(e eVar) {
        h hVar = this.i;
        if (hVar == h.LOADING || hVar == h.HIDDEN || hVar == h.EXPANDED || this.w == d.INTERSTITIAL) {
            MraidLog.d("MRAIDView", "Callback: onResize (invalidate state: " + this.i + ")");
            return;
        }
        com.explorestack.iab.view.a aVar = this.l;
        if (aVar == null || aVar.getParent() == null) {
            View a2 = g.a(n(), (View) this);
            if (!(a2 instanceof ViewGroup)) {
                MraidLog.a("MRAIDView", "Can't add resized view because can't find required parent");
                return;
            }
            com.explorestack.iab.view.a aVar2 = new com.explorestack.iab.view.a(getContext());
            this.l = aVar2;
            aVar2.setCloseClickListener(this);
            ((ViewGroup) a2).addView(this.l);
        }
        i c2 = this.j.c();
        Utils.removeFromParent(c2);
        this.l.addView(c2);
        IabElementStyle resolveDefCloseStyle = Assets.resolveDefCloseStyle(getContext(), this.P);
        resolveDefCloseStyle.setHorizontalPosition(Integer.valueOf(eVar.f2996e.a() & 7));
        resolveDefCloseStyle.setVerticalPosition(Integer.valueOf(eVar.f2996e.a() & 112));
        this.l.setCloseStyle(resolveDefCloseStyle);
        this.l.setCloseVisibility(false, this.C);
        setResizedViewSizeAndPosition(eVar);
        setViewState(h.RESIZED);
    }

    public final void a(i iVar, int i2, int i3) {
        iVar.dispatchTouchEvent(a(0, i2, i3));
        iVar.dispatchTouchEvent(a(1, i2, i3));
    }

    public final void a(j jVar) {
        boolean z2 = !jVar.e() || this.F;
        com.explorestack.iab.view.a aVar = this.l;
        if (aVar != null || (aVar = this.m) != null) {
            aVar.setCloseVisibility(z2, this.C);
        } else if (j()) {
            setCloseVisibility(z2, this.N ? 0.0f : this.C);
        }
    }

    public final void a(com.explorestack.iab.view.a aVar, j jVar) {
        setCloseClickListener(this);
        aVar.setCloseStyle(this.P);
        aVar.setCountDownStyle(this.Q);
        a(jVar);
    }

    public final void a(Runnable runnable) {
        j jVar = this.k;
        if (jVar == null) {
            jVar = this.j;
        }
        i c2 = jVar.c();
        this.s.a(this, c2).a((Runnable) new a(c2, runnable));
    }

    public final void a(String str) {
        j jVar;
        if (!j()) {
            h hVar = this.i;
            if (hVar == h.DEFAULT || hVar == h.RESIZED) {
                if (str == null) {
                    jVar = this.j;
                } else {
                    try {
                        String decode = URLDecoder.decode(str, "UTF-8");
                        if (!decode.startsWith("http://") && !decode.startsWith("https://")) {
                            decode = this.y + decode;
                        }
                        j jVar2 = new j(this.f2959h, new i());
                        this.k = jVar2;
                        jVar2.c(decode);
                        jVar = jVar2;
                    } catch (UnsupportedEncodingException unused) {
                        return;
                    }
                }
                com.explorestack.iab.view.a aVar = this.m;
                if (aVar == null || aVar.getParent() == null) {
                    View a2 = g.a(n(), (View) this);
                    if (!(a2 instanceof ViewGroup)) {
                        MraidLog.a("MRAIDView", "Can't add resized view because can't find required parent");
                        return;
                    }
                    com.explorestack.iab.view.a aVar2 = new com.explorestack.iab.view.a(getContext());
                    this.m = aVar2;
                    aVar2.setCloseClickListener(this);
                    ((ViewGroup) a2).addView(this.m);
                }
                i c2 = jVar.c();
                Utils.removeFromParent(c2);
                this.m.addView(c2);
                a(this.m, jVar);
                a(jVar.b());
                setViewState(h.EXPANDED);
                MraidViewListener mraidViewListener = this.u;
                if (mraidViewListener != null) {
                    mraidViewListener.onExpand(this);
                }
            }
        }
    }

    public final void b(int i2, int i3, j jVar, Runnable runnable) {
        if (!this.M) {
            jVar.a(i2, i3);
            this.V = runnable;
            postDelayed(runnable, 150);
        }
    }

    public final void b(Activity activity) {
        this.W = Integer.valueOf(activity.getRequestedOrientation());
    }

    public final void b(View view) {
        Context n2 = n();
        DisplayMetrics displayMetrics = n2.getResources().getDisplayMetrics();
        this.r.a(displayMetrics.widthPixels, displayMetrics.heightPixels);
        int[] iArr = new int[2];
        View b2 = g.b(n2, (View) this);
        b2.getLocationOnScreen(iArr);
        this.r.c(iArr[0], iArr[1], b2.getWidth(), b2.getHeight());
        getLocationOnScreen(iArr);
        this.r.b(iArr[0], iArr[1], getWidth(), getHeight());
        view.getLocationOnScreen(iArr);
        this.r.a(iArr[0], iArr[1], view.getWidth(), view.getHeight());
        this.j.a(this.r);
        j jVar = this.k;
        if (jVar != null) {
            jVar.a(this.r);
        }
    }

    public void b(String str) {
        this.M = true;
        removeCallbacks(this.V);
        if (this.u != null && !str.startsWith("tel") && !str.startsWith("sms")) {
            setLoadingVisible(true);
            this.u.onOpenBrowser(this, str, this);
        }
    }

    public final void c(String str) {
        if (this.i == h.LOADING) {
            this.j.a(this.q);
            this.j.a(this.w);
            j jVar = this.j;
            jVar.a(jVar.f());
            this.j.b(this.A);
            b((View) this.j.c());
            setViewState(h.DEFAULT);
            m();
            setLoadingVisible(false);
            if (j()) {
                a((com.explorestack.iab.view.a) this, this.j);
            }
            MraidAdMeasurer mraidAdMeasurer = this.v;
            if (mraidAdMeasurer != null) {
                mraidAdMeasurer.onAdViewReady(this.j.c());
            }
            if (this.x == CacheControl.FullLoad && !this.E && !str.equals("data:text/html,<html></html>")) {
                l();
            }
        }
    }

    public boolean canBeClosed() {
        if (getOnScreenTimeMs() > g.f3006a || this.j.d()) {
            return true;
        }
        if (this.F || !this.j.e()) {
            return super.canBeClosed();
        }
        return false;
    }

    public void clickHandleCanceled() {
        setLoadingVisible(false);
    }

    public void clickHandleError() {
        setLoadingVisible(false);
    }

    public void clickHandled() {
        setLoadingVisible(false);
    }

    public final void d() {
        a((View) this.m);
        this.m = null;
        Activity peekActivity = peekActivity();
        if (peekActivity != null) {
            a(peekActivity);
        }
        j jVar = this.k;
        if (jVar != null) {
            jVar.a();
            this.k = null;
        } else {
            addView(this.j.c());
        }
        setViewState(h.DEFAULT);
    }

    public final void d(String str) {
        if (str == null && this.y == null) {
            a(0);
            return;
        }
        this.j.a(this.y, String.format("<script type='application/javascript'>%s</script>%s%s", new Object[]{g.b(), JsBridgeHandler.a(), g.d(str)}), "text/html", "UTF-8");
        this.j.a(MraidLog.a());
    }

    public void destroy() {
        this.u = null;
        this.o = null;
        this.s.a();
        Activity peekActivity = peekActivity();
        if (peekActivity != null) {
            a(peekActivity);
        }
        a((View) this.l);
        a((View) this.m);
        this.j.a();
        j jVar = this.k;
        if (jVar != null) {
            jVar.a();
        }
        com.explorestack.iab.utils.l lVar = this.T;
        if (lVar != null) {
            lVar.a();
        }
    }

    public final void e() {
        a((View) this.l);
        this.l = null;
        addView(this.j.c());
        setViewState(h.DEFAULT);
    }

    public void f() {
        if (this.M || !this.G) {
            Utils.onUiThread(new g());
        } else {
            i();
        }
    }

    public final void g() {
        if (!this.M && !TextUtils.isEmpty(this.z)) {
            b(this.z);
        }
    }

    public final void h() {
        if (this.k != null) {
            a((Runnable) new k());
        }
    }

    public final void i() {
        j jVar = this.k;
        if (jVar == null) {
            jVar = this.j;
        }
        h hVar = new h(jVar);
        Point defaultClickPoint = Utils.getDefaultClickPoint(this.r.e());
        a(defaultClickPoint.x, defaultClickPoint.y, jVar, hVar);
    }

    public boolean j() {
        return this.w == d.INTERSTITIAL;
    }

    public final boolean k() {
        return this.i != h.LOADING;
    }

    public final void l() {
        MraidViewListener mraidViewListener;
        if (!this.I.getAndSet(true) && (mraidViewListener = this.u) != null) {
            mraidViewListener.onLoaded(this);
        }
    }

    public void load(String str) {
        int i2 = b.f2971a[this.x.ordinal()];
        if (i2 != 1) {
            if (i2 == 2) {
                this.t = str;
                l();
                return;
            } else if (i2 == 3) {
                l();
            } else {
                return;
            }
        }
        d(str);
    }

    public final void m() {
        if (!this.J.getAndSet(true)) {
            this.j.h();
        }
    }

    public final Context n() {
        Activity peekActivity = peekActivity();
        return peekActivity == null ? getContext() : peekActivity;
    }

    public final void o() {
        setCloseClickListener(this.O);
        setCloseVisibility(true, this.B);
    }

    public void onCloseClick() {
        f();
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        MraidLog.d("MRAIDView", "onConfigurationChanged: " + Utils.orientationToString(configuration.orientation));
        Utils.onUiThread(new j());
    }

    public void onCountDownFinish() {
        if (!this.M && this.H && this.D == 0.0f) {
            i();
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.p.onTouchEvent(motionEvent)) {
            motionEvent.setAction(3);
        }
        return super.onTouchEvent(motionEvent);
    }

    public Activity peekActivity() {
        WeakReference<Activity> weakReference = this.o;
        if (weakReference != null) {
            return (Activity) weakReference.get();
        }
        return null;
    }

    public void setLastInteractedActivity(Activity activity) {
        if (activity != null) {
            this.o = new WeakReference<>(activity);
            this.f2959h.setBaseContext(activity);
        }
    }

    public void setLoadingVisible(boolean z2) {
        if (z2) {
            if (this.n == null) {
                com.explorestack.iab.utils.h hVar = new com.explorestack.iab.utils.h((View.OnClickListener) null);
                this.n = hVar;
                hVar.a(getContext(), (ViewGroup) this, this.R);
            }
            this.n.a(0);
            this.n.a();
            return;
        }
        com.explorestack.iab.utils.h hVar2 = this.n;
        if (hVar2 != null) {
            hVar2.a(8);
        }
    }

    public void setViewState(h hVar) {
        this.i = hVar;
        this.j.a(hVar);
        j jVar = this.k;
        if (jVar != null) {
            jVar.a(hVar);
        }
        if (hVar != h.HIDDEN) {
            a((Runnable) null);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0046, code lost:
        if (j() != false) goto L_0x0048;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0023, code lost:
        if (j() != false) goto L_0x0048;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void show(android.app.Activity r4) {
        /*
            r3 = this;
            java.util.concurrent.atomic.AtomicBoolean r0 = r3.K
            r1 = 1
            r0.set(r1)
            int[] r0 = com.explorestack.iab.mraid.MraidView.b.f2971a
            com.explorestack.iab.CacheControl r2 = r3.x
            int r2 = r2.ordinal()
            r0 = r0[r2]
            if (r0 == r1) goto L_0x0042
            r1 = 2
            if (r0 == r1) goto L_0x0030
            r1 = 3
            if (r0 == r1) goto L_0x0019
            goto L_0x0050
        L_0x0019:
            boolean r0 = r3.k()
            if (r0 == 0) goto L_0x0026
            boolean r0 = r3.j()
            if (r0 == 0) goto L_0x004d
            goto L_0x0048
        L_0x0026:
            boolean r0 = r3.j()
            if (r0 == 0) goto L_0x0050
            r3.o()
            goto L_0x0050
        L_0x0030:
            boolean r0 = r3.j()
            if (r0 == 0) goto L_0x0039
            r3.o()
        L_0x0039:
            java.lang.String r0 = r3.t
            r3.d((java.lang.String) r0)
            r0 = 0
            r3.t = r0
            goto L_0x0050
        L_0x0042:
            boolean r0 = r3.j()
            if (r0 == 0) goto L_0x004d
        L_0x0048:
            com.explorestack.iab.mraid.j r0 = r3.j
            r3.a((com.explorestack.iab.view.a) r3, (com.explorestack.iab.mraid.j) r0)
        L_0x004d:
            r3.m()
        L_0x0050:
            r3.setLastInteractedActivity(r4)
            com.explorestack.iab.mraid.j r4 = r3.j
            com.explorestack.iab.mraid.c r4 = r4.b()
            r3.a((com.explorestack.iab.mraid.c) r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.explorestack.iab.mraid.MraidView.show(android.app.Activity):void");
    }
}
