package com.applovin.impl.a.a;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.StateListDrawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.animation.AlphaAnimation;
import android.widget.FrameLayout;
import com.amazon.aps.shared.APSAnalytics;
import com.applovin.creative.MaxCreativeDebuggerActivity;
import com.applovin.impl.a.a.b.a.b;
import com.applovin.impl.mediation.c.c;
import com.applovin.impl.sdk.ad.e;
import com.applovin.impl.sdk.n;
import com.applovin.impl.sdk.utils.BundleUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.sdk.utils.Utils;
import com.applovin.impl.sdk.utils.j;
import com.applovin.impl.sdk.utils.l;
import com.applovin.impl.sdk.utils.p;
import com.applovin.impl.sdk.v;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.sdk.AppLovinSdk;
import com.applovin.sdk.AppLovinSdkUtils;
import com.appodeal.ads.modules.common.internal.LogConstants;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

public class a implements j.a {
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public static WeakReference<MaxCreativeDebuggerActivity> f13946f;
    /* access modifiers changed from: private */
    public static final AtomicBoolean l = new AtomicBoolean();
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final n f13947a;

    /* renamed from: b  reason: collision with root package name */
    private final Context f13948b;

    /* renamed from: c  reason: collision with root package name */
    private final List<com.applovin.impl.a.a.a.a> f13949c = new ArrayList(10);

    /* renamed from: d  reason: collision with root package name */
    private final Object f13950d = new Object();
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public final b f13951e;
    /* access modifiers changed from: private */

    /* renamed from: g  reason: collision with root package name */
    public WeakReference<View> f13952g = new WeakReference<>((Object) null);

    /* renamed from: h  reason: collision with root package name */
    private j f13953h;
    private p i;
    /* access modifiers changed from: private */
    public int j;
    private boolean k;

    public a(n nVar) {
        this.f13947a = nVar;
        this.f13948b = nVar.P();
        this.f13951e = new b(this.f13948b);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v2, resolved type: android.widget.Button} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v4, resolved type: android.widget.ImageButton} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v5, resolved type: android.widget.Button} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v6, resolved type: android.widget.Button} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private android.view.View a(android.app.Activity r6) {
        /*
            r5 = this;
            r0 = 40
            int r0 = com.applovin.sdk.AppLovinSdkUtils.dpToPx(r6, r0)
            int r1 = r0 / 10
            android.widget.FrameLayout$LayoutParams r2 = new android.widget.FrameLayout$LayoutParams
            r3 = 8388629(0x800015, float:1.1754973E-38)
            r2.<init>(r0, r0, r3)
            r2.setMargins(r1, r1, r1, r1)
            android.widget.ImageButton r0 = new android.widget.ImageButton     // Catch:{ all -> 0x0030 }
            r0.<init>(r6)     // Catch:{ all -> 0x0030 }
            android.content.res.Resources r3 = r6.getResources()     // Catch:{ all -> 0x0030 }
            int r4 = com.applovin.sdk.R.drawable.applovin_ic_white_small     // Catch:{ all -> 0x0030 }
            android.graphics.drawable.Drawable r3 = r3.getDrawable(r4)     // Catch:{ all -> 0x0030 }
            r0.setImageDrawable(r3)     // Catch:{ all -> 0x0030 }
            android.widget.ImageView$ScaleType r3 = android.widget.ImageView.ScaleType.FIT_CENTER     // Catch:{ all -> 0x0030 }
            r0.setScaleType(r3)     // Catch:{ all -> 0x0030 }
            int r3 = r1 * 2
            r0.setPadding(r1, r1, r1, r3)     // Catch:{ all -> 0x0030 }
            goto L_0x004b
        L_0x0030:
            android.widget.Button r0 = new android.widget.Button
            r0.<init>(r6)
            java.lang.String r1 = "ⓘ"
            r0.setText(r1)
            r1 = -1
            r0.setTextColor(r1)
            r1 = 0
            r0.setAllCaps(r1)
            r3 = 1101004800(0x41a00000, float:20.0)
            r4 = 2
            r0.setTextSize(r4, r3)
            r0.setPadding(r1, r1, r1, r1)
        L_0x004b:
            r0.setLayoutParams(r2)
            android.graphics.drawable.Drawable r1 = r5.k()
            r0.setBackground(r1)
            com.applovin.impl.a.a.a$6 r1 = new com.applovin.impl.a.a.a$6
            r1.<init>()
            r0.setOnClickListener(r1)
            boolean r1 = com.applovin.impl.sdk.utils.h.d()
            if (r1 == 0) goto L_0x006c
            r1 = 5
            int r6 = com.applovin.sdk.AppLovinSdkUtils.dpToPx(r6, r1)
            float r6 = (float) r6
            r0.setElevation(r6)
        L_0x006c:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.a.a.a.a(android.app.Activity):android.view.View");
    }

    private boolean c(Object obj) {
        MaxAdFormat b2 = obj instanceof e ? ((e) obj).getAdZone().b() : obj instanceof com.applovin.impl.mediation.a.a ? ((com.applovin.impl.mediation.a.a) obj).getFormat() : null;
        return b2 != null && b2.isFullscreenAd();
    }

    private Bundle d(Object obj) {
        Bundle a2 = this.f13947a.E().a(Utils.getAdServeId(obj));
        if (a2 == null) {
            return null;
        }
        for (String str : a2.keySet()) {
            Object obj2 = a2.get(str);
            a2.remove(str);
            BundleUtils.put(StringUtils.toHumanReadableString(str), obj2, a2);
        }
        return a2;
    }

    /* access modifiers changed from: private */
    public boolean h() {
        WeakReference<MaxCreativeDebuggerActivity> weakReference = f13946f;
        return (weakReference == null || weakReference.get() == null) ? false : true;
    }

    private void i() {
        this.f13947a.ai().a(new com.applovin.impl.sdk.utils.a() {
            public void onActivityCreated(Activity activity, Bundle bundle) {
                if (activity instanceof MaxCreativeDebuggerActivity) {
                    v.f("AppLovinSdk", "Started Creative Debugger");
                    if (!a.this.h() || a.f13946f.get() != activity) {
                        MaxCreativeDebuggerActivity maxCreativeDebuggerActivity = (MaxCreativeDebuggerActivity) activity;
                        WeakReference unused = a.f13946f = new WeakReference(maxCreativeDebuggerActivity);
                        maxCreativeDebuggerActivity.a(a.this.f13951e, a.this.f13947a.ai());
                    }
                    a.l.set(false);
                }
            }

            public void onActivityDestroyed(Activity activity) {
                if (activity instanceof MaxCreativeDebuggerActivity) {
                    v.f("AppLovinSdk", "Creative Debugger destroyed");
                    WeakReference unused = a.f13946f = null;
                }
            }
        });
    }

    /* access modifiers changed from: private */
    public void j() {
        if (this.f13952g.get() == null && !h()) {
            Activity a2 = this.f13947a.ai().a();
            if (a2 == null) {
                this.f13947a.D();
                if (v.a()) {
                    this.f13947a.D().e("AppLovinSdk", "Failed to display Creative Debugger button");
                    return;
                }
                return;
            }
            View findViewById = a2.findViewById(16908290);
            if (findViewById instanceof FrameLayout) {
                final FrameLayout frameLayout = (FrameLayout) findViewById;
                final View a3 = a(a2);
                frameLayout.addView(a3);
                AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
                alphaAnimation.setDuration(150);
                a3.startAnimation(alphaAnimation);
                final ViewTreeObserver viewTreeObserver = findViewById.getViewTreeObserver();
                final AnonymousClass4 r8 = new ViewTreeObserver.OnGlobalLayoutListener() {
                    public void onGlobalLayout() {
                        if (a3.getParent() == null && a.this.f13952g.get() != null) {
                            frameLayout.addView(a3);
                        }
                    }
                };
                viewTreeObserver.addOnGlobalLayoutListener(r8);
                final View view = a3;
                AppLovinSdkUtils.runOnUiThreadDelayed(new Runnable() {
                    public void run() {
                        frameLayout.removeView(view);
                        WeakReference unused = a.this.f13952g = new WeakReference((Object) null);
                        if (viewTreeObserver.isAlive()) {
                            viewTreeObserver.removeOnGlobalLayoutListener(r8);
                        }
                    }
                }, TimeUnit.SECONDS.toMillis(5));
                this.f13952g = new WeakReference<>(a3);
            }
        }
    }

    private Drawable k() {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(1);
        gradientDrawable.setColor(Color.rgb(5, 131, 170));
        GradientDrawable gradientDrawable2 = new GradientDrawable();
        gradientDrawable2.setShape(1);
        gradientDrawable2.setColor(Color.rgb(2, 98, 127));
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{16842919}, gradientDrawable2);
        stateListDrawable.addState(new int[0], gradientDrawable);
        return stateListDrawable;
    }

    public String a(com.applovin.impl.a.a.a.a aVar) {
        Object c2 = aVar.c();
        l lVar = new l();
        lVar.b("Ad Info:\n");
        if (c2 instanceof e) {
            e eVar = (e) c2;
            lVar.a(LogConstants.KEY_NETWORK, "APPLOVIN").a(eVar).b(eVar);
        } else if (c2 instanceof com.applovin.impl.mediation.a.a) {
            lVar.a((com.applovin.impl.mediation.a.a) c2);
        }
        lVar.a(this.f13947a);
        lVar.a("Epoch Timestamp (ms)", Long.valueOf(aVar.d()));
        lVar.a("\nDebug Info:\n").a("Platform", "fireos".equals(this.f13947a.Y().f()) ? "Fire OS" : APSAnalytics.OS_NAME).a("AppLovin SDK Version", AppLovinSdk.VERSION).a("Plugin Version", this.f13947a.a(com.applovin.impl.sdk.c.b.dI)).a("App Package Name", this.f13948b.getPackageName()).a("Device", String.format("%s %s (%s)", new Object[]{Build.BRAND, Build.MODEL, Build.DEVICE})).a("OS Version", Build.VERSION.RELEASE).a("AppLovin Random Token", this.f13947a.p()).a("Ad Review Version", com.applovin.impl.sdk.e.a()).a(d(c2));
        return lVar.toString();
    }

    public void a() {
        if (c() && this.f13953h == null) {
            j jVar = new j(this.f13947a, this);
            this.f13953h = jVar;
            jVar.a();
        }
    }

    public void a(com.applovin.impl.a.a.a.a aVar, Context context, boolean z) {
        Object c2 = aVar.c();
        String a2 = a(aVar);
        l lVar = new l();
        if (z) {
            lVar.b("Please describe the issue you had with this ad:\n\n\n\n");
        }
        lVar.b(a2);
        String b2 = this.f13947a.an().b(c2);
        if (b2 != null) {
            lVar.a("\nBid Response:\n");
            lVar.a(b2);
        }
        String str = "AppLovin Ad Report";
        Intent createChooser = Intent.createChooser(new Intent("android.intent.action.SEND").setType("text/plain").putExtra("android.intent.extra.SUBJECT", c2 instanceof e ? str : "MAX Ad Report").putExtra("android.intent.extra.TEXT", lVar.toString()).setPackage((String) null), "Share Ad Report");
        if (z) {
            try {
                Intent intent = new Intent("android.intent.action.SENDTO", Uri.parse("mailto:"));
                if (!(c2 instanceof e)) {
                    str = "MAX Ad Report";
                }
                context.startActivity(intent.putExtra("android.intent.extra.SUBJECT", str).putExtra("android.intent.extra.TEXT", lVar.toString()).setPackage("com.google.android.gm"));
                return;
            } catch (ActivityNotFoundException unused) {
            }
        }
        context.startActivity(createChooser);
    }

    public void a(Object obj) {
        if (!c() || obj == null) {
            return;
        }
        if (c.a(obj) && !c(obj)) {
            return;
        }
        if (!c.b(obj) || !c(obj)) {
            synchronized (this.f13950d) {
                this.f13949c.add(0, new com.applovin.impl.a.a.a.a(obj, System.currentTimeMillis()));
                if (this.f13949c.size() > 10) {
                    this.f13949c.remove(this.f13949c.size() - 1);
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0020, code lost:
        r3 = new com.applovin.impl.sdk.ad.c(r0, r2.f13947a).d();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String b(java.lang.Object r3) {
        /*
            r2 = this;
            boolean r0 = r3 instanceof com.applovin.impl.sdk.ad.e
            if (r0 == 0) goto L_0x000f
            com.applovin.impl.sdk.ad.e r3 = (com.applovin.impl.sdk.ad.e) r3
            org.json.JSONObject r3 = r3.getOriginalFullResponse()
            java.lang.String r3 = r3.toString()
            return r3
        L_0x000f:
            boolean r0 = r3 instanceof com.applovin.impl.mediation.a.a
            if (r0 == 0) goto L_0x0033
            r0 = r3
            com.applovin.impl.mediation.a.a r0 = (com.applovin.impl.mediation.a.a) r0
            java.lang.String r0 = r0.j()
            boolean r3 = com.applovin.impl.mediation.c.c.b((java.lang.Object) r3)
            if (r3 == 0) goto L_0x0032
            com.applovin.impl.sdk.ad.c r3 = new com.applovin.impl.sdk.ad.c
            com.applovin.impl.sdk.n r1 = r2.f13947a
            r3.<init>(r0, r1)
            org.json.JSONObject r3 = r3.d()
            if (r3 == 0) goto L_0x0032
            java.lang.String r3 = r3.toString()
            return r3
        L_0x0032:
            return r0
        L_0x0033:
            r3 = 0
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.a.a.a.b(java.lang.Object):java.lang.String");
    }

    public void b() {
        ArrayList arrayList;
        if (h() || !l.compareAndSet(false, true)) {
            v.i("AppLovinSdk", "Creative Debugger is already showing");
            return;
        }
        synchronized (this.f13950d) {
            arrayList = new ArrayList(this.f13949c);
        }
        this.f13951e.a(arrayList, this.f13947a);
        if (!this.k) {
            i();
            this.k = true;
        }
        Intent intent = new Intent(this.f13948b, MaxCreativeDebuggerActivity.class);
        intent.setFlags(268435456);
        v.f("AppLovinSdk", "Starting Creative Debugger...");
        this.f13948b.startActivity(intent);
    }

    public boolean c() {
        return ((Boolean) this.f13947a.a(com.applovin.impl.sdk.c.b.bP)).booleanValue() && this.f13947a.q().isCreativeDebuggerEnabled();
    }

    public void d() {
        if (this.j == 0) {
            this.i = p.a(TimeUnit.SECONDS.toMillis(3), this.f13947a, new Runnable() {
                public void run() {
                    int unused = a.this.j = 0;
                }
            });
        }
        int i2 = this.j;
        if (i2 % 2 == 0) {
            this.j = i2 + 1;
        }
    }

    public void e() {
        int i2 = this.j;
        if (i2 % 2 == 1) {
            this.j = i2 + 1;
        }
        if (this.j / 2 == 2) {
            AppLovinSdkUtils.runOnUiThread(new Runnable() {
                public void run() {
                    a.this.j();
                }
            });
            this.j = 0;
            this.i.d();
        }
    }
}
