package com.appodeal.ads;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.appodeal.ads.Native;
import com.appodeal.ads.modules.common.internal.LogConstants;
import com.appodeal.ads.modules.common.internal.adtype.AdType;
import com.appodeal.ads.segments.g;
import com.appodeal.ads.segments.h;
import com.appodeal.ads.unified.UnifiedAdCallbackClickTrackListener;
import com.appodeal.ads.unified.UnifiedNativeAd;
import com.appodeal.ads.unified.UnifiedNativeCallback;
import com.appodeal.ads.utils.Log;
import com.appodeal.ads.utils.d0;
import com.appodeal.ads.utils.o;
import com.appodeal.ads.utils.p;
import com.appodeal.ads.utils.q;
import com.appodeal.ads.utils.s;
import com.explorestack.iab.vast.VastRequest;
import java.io.File;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Timer;

public final class l2 implements View.OnClickListener, NativeAd {

    /* renamed from: a  reason: collision with root package name */
    public final s2 f16577a;

    /* renamed from: b  reason: collision with root package name */
    public final UnifiedNativeAd f16578b;

    /* renamed from: c  reason: collision with root package name */
    public final UnifiedNativeCallback f16579c;

    /* renamed from: d  reason: collision with root package name */
    public final String f16580d;

    /* renamed from: e  reason: collision with root package name */
    public final String f16581e;

    /* renamed from: f  reason: collision with root package name */
    public final String f16582f;

    /* renamed from: g  reason: collision with root package name */
    public final String f16583g;

    /* renamed from: h  reason: collision with root package name */
    public final String f16584h;
    public final String i;
    public String j;
    public Bitmap k;
    public String l;
    public Bitmap m;
    public NativeAdView n;
    public g2 o;
    public ProgressDialog p;
    public Uri q;
    public VastRequest r;
    public Handler s;
    public Runnable t;
    public g u;
    public final double v;
    public boolean w;
    public final q x = new q();

    public class a implements q.b {
        public a() {
        }

        public final void onHandleError() {
            l2.this.f();
        }

        public final void onHandled() {
            l2.this.f();
        }

        public final void processClick(UnifiedAdCallbackClickTrackListener unifiedAdCallbackClickTrackListener) {
            l2 l2Var = l2.this;
            l2Var.f16579c.onAdClicked(l2Var.f16578b, unifiedAdCallbackClickTrackListener);
        }
    }

    public class b implements p.b {
    }

    public class c implements View.OnAttachStateChangeListener {
        public c() {
        }

        public final void onViewAttachedToWindow(View view) {
        }

        public final void onViewDetachedFromWindow(View view) {
            view.removeOnAttachStateChangeListener(this);
            l2.this.f();
        }
    }

    public l2(s2 s2Var, UnifiedNativeAd unifiedNativeAd, UnifiedNativeCallback unifiedNativeCallback) {
        this.f16577a = s2Var;
        this.f16578b = unifiedNativeAd;
        this.f16579c = unifiedNativeCallback;
        this.f16580d = a(25, unifiedNativeAd.getTitle());
        this.f16581e = a(100, unifiedNativeAd.getDescription());
        this.f16582f = a(25, unifiedNativeAd.getCallToAction());
        this.l = unifiedNativeAd.getImageUrl();
        this.j = unifiedNativeAd.getIconUrl();
        this.f16583g = unifiedNativeAd.getClickUrl();
        this.f16584h = unifiedNativeAd.getVideoUrl();
        this.i = unifiedNativeAd.getVastVideoTag();
        this.v = s2Var.getEcpm();
    }

    public static String a(int i2, String str) {
        if (str == null || str.length() <= i2) {
            return str;
        }
        String substring = str.substring(0, i2);
        if (str.charAt(i2) != ' ' && substring.lastIndexOf(" ") > 0) {
            substring = substring.substring(0, substring.lastIndexOf(" "));
        }
        return substring + "…";
    }

    public static void a(ImageView imageView, String str, Bitmap bitmap) {
        if (bitmap != null) {
            imageView.setImageBitmap(bitmap);
            return;
        }
        b bVar = new b();
        if (TextUtils.isEmpty(str) || imageView == null) {
            Log.log(LogConstants.KEY_NATIVE, LogConstants.EVENT_ASSETS_ERROR, "Target ImageView or ImagePath is invalid");
            return;
        }
        s sVar = s.f17568e;
        sVar.f17569a.execute(new p.a(imageView.getContext(), str, imageView, bVar));
    }

    public final int a() {
        UnifiedNativeAd unifiedNativeAd = this.f16578b;
        return unifiedNativeAd != null ? unifiedNativeAd.getAdId() : hashCode();
    }

    public final void a(ViewGroup viewGroup) {
        for (int i2 = 0; i2 < viewGroup.getChildCount(); i2++) {
            View childAt = viewGroup.getChildAt(i2);
            if (!(childAt instanceof g2)) {
                if (childAt instanceof Button) {
                    ((Button) childAt).setOnClickListener(this);
                }
                if (childAt instanceof ViewGroup) {
                    a((ViewGroup) childAt);
                }
            }
        }
    }

    public final void a(NativeMediaView nativeMediaView) {
        if (!this.f16578b.onConfigureMediaView(nativeMediaView)) {
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
            layoutParams.addRule(13, -1);
            g2 g2Var = new g2(nativeMediaView.getContext());
            this.o = g2Var;
            if (Native.f16127c != Native.MediaAssetType.ICON) {
                g2Var.setNativeAd(this);
            }
            nativeMediaView.removeAllViews();
            nativeMediaView.addView(this.o, layoutParams);
        }
    }

    public final Uri b() {
        return this.q;
    }

    public final VastRequest c() {
        return this.r;
    }

    public final boolean canShow(Context context, String str) {
        if (str != null) {
            return h.a(str).a(context, AdType.Native, this.v);
        }
        Log.log(new com.appodeal.ads.utils.exception_handler.a("Unable to check: placement = null"));
        return false;
    }

    public final boolean containsVideo() {
        return this.f16578b.containsVideo() || !TextUtils.isEmpty(this.f16584h) || !TextUtils.isEmpty(this.i);
    }

    public final String d() {
        return this.i;
    }

    public final void destroy() {
        Timer timer;
        o.b(this.f16577a);
        UnifiedNativeAd unifiedNativeAd = this.f16578b;
        if (unifiedNativeAd != null) {
            unifiedNativeAd.onDestroy();
        }
        NativeAdView nativeAdView = this.n;
        if (nativeAdView != null) {
            nativeAdView.setOnClickListener((View.OnClickListener) null);
            for (View next : nativeAdView.getClickableViews()) {
                if (!(next instanceof g2)) {
                    next.setOnClickListener((View.OnClickListener) null);
                }
            }
        }
        HashMap hashMap = d0.f17503a;
        synchronized (hashMap) {
            d0.a aVar = (d0.a) hashMap.get(this);
            if (aVar != null) {
                aVar.b();
                hashMap.remove(this);
            }
        }
        g2 g2Var = this.o;
        if (!(g2Var == null || (timer = g2Var.i) == null)) {
            timer.cancel();
            g2Var.i = null;
        }
        UnifiedNativeAd unifiedNativeAd2 = this.f16578b;
        if (unifiedNativeAd2 != null) {
            unifiedNativeAd2.onUnregisterForInteraction();
        }
        Bitmap bitmap = this.k;
        if (bitmap != null) {
            try {
                bitmap.recycle();
            } catch (Exception e2) {
                Log.log(LogConstants.KEY_NATIVE, LogConstants.EVENT_ASSETS, "bitmap recycling error");
                Log.log(e2);
            }
        }
        this.k = null;
        Bitmap bitmap2 = this.m;
        if (bitmap2 != null) {
            try {
                bitmap2.recycle();
            } catch (Exception e3) {
                Log.log(LogConstants.KEY_NATIVE, LogConstants.EVENT_ASSETS, "bitmap recycling error");
                Log.log(e3);
            }
        }
        this.m = null;
        Uri uri = this.q;
        if (uri != null && uri.getPath() != null) {
            File file = new File(this.q.getPath());
            if (file.exists()) {
                file.delete();
            }
            this.q = null;
        }
    }

    public final String e() {
        return this.f16584h;
    }

    public final void f() {
        Handler handler;
        ProgressDialog progressDialog = this.p;
        if (progressDialog != null && progressDialog.isShowing()) {
            this.p.dismiss();
            this.p = null;
        }
        Runnable runnable = this.t;
        if (runnable != null && (handler = this.s) != null) {
            handler.removeCallbacks(runnable);
            this.s = null;
            this.t = null;
        }
    }

    public final void g() {
        UnifiedNativeAd unifiedNativeAd = this.f16578b;
        if (unifiedNativeAd != null) {
            unifiedNativeAd.onAdVideoFinish();
        }
    }

    public final String getAdProvider() {
        return this.f16577a.f16571d;
    }

    public final String getAgeRestrictions() {
        return this.f16578b.getAgeRestriction();
    }

    public final String getCallToAction() {
        return !TextUtils.isEmpty(this.f16582f) ? this.f16582f : "Install";
    }

    public final String getDescription() {
        return this.f16581e;
    }

    public final double getPredictedEcpm() {
        return this.v;
    }

    public final View getProviderView(Context context) {
        return this.f16578b.obtainProviderView(context);
    }

    public final float getRating() {
        Float rating = this.f16578b.getRating();
        if (rating == null) {
            return 5.0f;
        }
        return rating.floatValue();
    }

    public final String getTitle() {
        return this.f16580d;
    }

    public final boolean isPrecache() {
        return this.f16577a.f16570c.isPrecache();
    }

    public final void onClick(View view) {
        this.f16578b.onAdClick(view);
        a(this.f16578b.getClickNotifyUrls());
        Context context = view.getContext();
        a(context);
        this.x.a(context, this.f16583g, this.f16578b.getTrackingPackageName(), this.f16578b.getTrackingPackageExpiry(), new a());
    }

    public static Map a(Rect rect, View view, HashMap hashMap) {
        int i2 = 0;
        if (hashMap.containsKey(view)) {
            if (view.getMeasuredHeight() > 0 && view.getMeasuredWidth() > 0) {
                i2 = 1;
            }
            if (i2 != 0 && view.isShown() && !n5.b(view) && rect.contains(n5.a(view))) {
                hashMap.remove(view);
            }
        } else if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            while (i2 < viewGroup.getChildCount()) {
                a(rect, viewGroup.getChildAt(i2), hashMap);
                i2++;
            }
        }
        return hashMap;
    }

    public final void a(List<String> list) {
        Long x2 = ((t2) this.f16577a.f16568a).x();
        g gVar = this.u;
        String a2 = gVar == null ? null : g.a(gVar);
        if (list != null) {
            for (String next : list) {
                if (next != null) {
                    if (next.contains("${APPODEALX_SEGMENT_ID}")) {
                        next = next.replace("${APPODEALX_SEGMENT_ID}", x2.toString());
                    }
                    if (a2 != null && next.contains("${APPODEALX_PLACEMENT_ID}")) {
                        next = next.replace("${APPODEALX_PLACEMENT_ID}", a2);
                    }
                    n5.a(next, s.f17568e);
                }
            }
        }
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index: 0, Size: 0
        	at java.util.ArrayList.rangeCheck(ArrayList.java:659)
        	at java.util.ArrayList.get(ArrayList.java:435)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    public final void a(com.appodeal.ads.NativeAdView r8, java.lang.String r9) {
        /*
            r7 = this;
            com.appodeal.ads.segments.g r9 = com.appodeal.ads.segments.h.a((java.lang.String) r9)
            r7.u = r9
            com.appodeal.ads.Native$a r9 = com.appodeal.ads.Native.a()
            com.appodeal.ads.segments.g r0 = r7.u
            r9.l = r0
            r8.deconfigureContainer()
            com.appodeal.ads.unified.UnifiedNativeAd r9 = r7.f16578b
            r9.onConfigure(r8)
            com.appodeal.ads.NativeAdView r9 = r7.n
            if (r9 != 0) goto L_0x001b
            goto L_0x003b
        L_0x001b:
            r0 = 0
            r9.setOnClickListener(r0)
            java.util.List r9 = r9.getClickableViews()
            java.util.Iterator r9 = r9.iterator()
        L_0x0027:
            boolean r1 = r9.hasNext()
            if (r1 == 0) goto L_0x003b
            java.lang.Object r1 = r9.next()
            android.view.View r1 = (android.view.View) r1
            boolean r2 = r1 instanceof com.appodeal.ads.g2
            if (r2 != 0) goto L_0x0027
            r1.setOnClickListener(r0)
            goto L_0x0027
        L_0x003b:
            r8.setOnClickListener(r7)
            java.util.List r9 = r8.getClickableViews()
            java.util.Iterator r9 = r9.iterator()
        L_0x0046:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto L_0x005a
            java.lang.Object r0 = r9.next()
            android.view.View r0 = (android.view.View) r0
            boolean r1 = r0 instanceof com.appodeal.ads.g2
            if (r1 != 0) goto L_0x0046
            r0.setOnClickListener(r7)
            goto L_0x0046
        L_0x005a:
            r7.a((android.view.ViewGroup) r8)
            r7.n = r8
            boolean r9 = r7.w
            if (r9 != 0) goto L_0x0095
            com.appodeal.ads.Native$a r9 = com.appodeal.ads.Native.a()
            int r9 = r9.q
            long r0 = (long) r9
            com.appodeal.ads.m2 r9 = new com.appodeal.ads.m2
            r9.<init>(r7)
            java.util.HashMap r2 = com.appodeal.ads.utils.d0.f17503a
            monitor-enter(r2)
            monitor-enter(r2)     // Catch:{ all -> 0x0092 }
            java.lang.Object r3 = r2.get(r7)     // Catch:{ all -> 0x008f }
            com.appodeal.ads.utils.d0$a r3 = (com.appodeal.ads.utils.d0.a) r3     // Catch:{ all -> 0x008f }
            if (r3 == 0) goto L_0x0081
            r3.b()     // Catch:{ all -> 0x008f }
            r2.remove(r7)     // Catch:{ all -> 0x008f }
        L_0x0081:
            monitor-exit(r2)     // Catch:{ all -> 0x008f }
            com.appodeal.ads.utils.d0$a r3 = new com.appodeal.ads.utils.d0$a     // Catch:{ all -> 0x0092 }
            r3.<init>(r8, r0, r9)     // Catch:{ all -> 0x0092 }
            r2.put(r7, r3)     // Catch:{ all -> 0x0092 }
            r3.c()     // Catch:{ all -> 0x0092 }
            monitor-exit(r2)     // Catch:{ all -> 0x0092 }
            goto L_0x0095
        L_0x008f:
            r8 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x008f }
            throw r8     // Catch:{ all -> 0x0092 }
        L_0x0092:
            r8 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0092 }
            throw r8
        L_0x0095:
            com.appodeal.ads.g2 r9 = r7.o
            if (r9 == 0) goto L_0x00e3
            java.lang.String r0 = com.appodeal.ads.g2.x
            java.lang.String r1 = "State"
            java.lang.String r2 = "onViewAppearOnScreen"
            com.appodeal.ads.utils.Log.log((java.lang.String) r0, (java.lang.String) r1, (java.lang.String) r2)
            r0 = 1
            r9.o = r0
            com.appodeal.ads.Native$NativeAdType r0 = com.appodeal.ads.Native.f16126b
            com.appodeal.ads.Native$NativeAdType r1 = com.appodeal.ads.Native.NativeAdType.Video
            if (r0 != r1) goto L_0x00be
            boolean r0 = r9.p
            if (r0 == 0) goto L_0x00b3
            r9.f()
            goto L_0x00be
        L_0x00b3:
            int r0 = r9.w
            r1 = 3
            if (r0 == r1) goto L_0x00be
            r0 = 4
            r9.w = r0
            r9.h()
        L_0x00be:
            boolean r9 = com.appodeal.ads.Native.f16129e
            if (r9 == 0) goto L_0x00e3
            com.appodeal.ads.Native$NativeAdType r9 = com.appodeal.ads.Native.f16126b
            com.appodeal.ads.Native$NativeAdType r0 = com.appodeal.ads.Native.NativeAdType.NoVideo
            if (r9 == r0) goto L_0x00e3
            com.appodeal.ads.g2 r9 = r7.o
            boolean r0 = r9.q
            if (r0 != 0) goto L_0x00cf
            goto L_0x00e3
        L_0x00cf:
            java.util.Timer r1 = new java.util.Timer
            r1.<init>()
            r9.i = r1
            com.appodeal.ads.f2 r2 = new com.appodeal.ads.f2
            r2.<init>(r9)
            r9 = 500(0x1f4, float:7.0E-43)
            long r5 = (long) r9
            r3 = 0
            r1.schedule(r2, r3, r5)
        L_0x00e3:
            com.appodeal.ads.unified.UnifiedNativeAd r9 = r7.f16578b
            r9.onRegisterForInteraction(r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appodeal.ads.l2.a(com.appodeal.ads.NativeAdView, java.lang.String):void");
    }

    public final void a(NativeIconView nativeIconView) {
        Context context = nativeIconView.getContext();
        View obtainIconView = this.f16578b.obtainIconView(context);
        ImageView imageView = obtainIconView;
        if (obtainIconView == null) {
            ImageView imageView2 = new ImageView(context);
            imageView2.setScaleType(ImageView.ScaleType.FIT_CENTER);
            imageView = imageView2;
            if (Native.f16127c != Native.MediaAssetType.IMAGE) {
                a(imageView2, this.j, this.k);
                imageView = imageView2;
            }
        }
        if (imageView.getParent() != null && (imageView.getParent() instanceof ViewGroup)) {
            ((ViewGroup) imageView.getParent()).removeView(imageView);
        }
        nativeIconView.removeAllViews();
        nativeIconView.addView(imageView, new FrameLayout.LayoutParams(-1, -1));
    }

    public final void a(Context context) {
        if (this.n != null && (context instanceof Activity)) {
            ProgressDialog progressDialog = this.p;
            if (progressDialog == null || !progressDialog.isShowing()) {
                Activity activity = (Activity) context;
                if ((activity == null || activity.getWindow() == null || !activity.getWindow().isActive() || activity.getWindow().getDecorView().getWindowToken() == null) ? false : true) {
                    Log.log(LogConstants.KEY_NATIVE, LogConstants.EVENT_SHOW_PROGRESS);
                    this.n.addOnAttachStateChangeListener(new c());
                    ProgressDialog show = ProgressDialog.show(activity, "", "Loading...");
                    this.p = show;
                    show.setProgressStyle(0);
                    this.p.setCancelable(false);
                    this.t = new Runnable() {
                        public final void run() {
                            l2.this.f();
                        }
                    };
                    Handler handler = new Handler(Looper.getMainLooper());
                    this.s = handler;
                    handler.postDelayed(this.t, 5000);
                }
            }
        }
    }
}
