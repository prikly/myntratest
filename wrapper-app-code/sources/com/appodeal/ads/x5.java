package com.appodeal.ads;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.DisplayCutout;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowInsets;
import android.view.animation.Animation;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.appodeal.ads.modules.common.internal.LogConstants;
import com.appodeal.ads.p;
import com.appodeal.ads.r5;
import com.appodeal.ads.segments.g;
import com.appodeal.ads.utils.Log;
import com.appodeal.ads.utils.d0;
import com.appodeal.ads.utils.o;
import com.appodeal.ads.z5;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;

public abstract class x5<AdRequestType extends z5<AdObjectType>, AdObjectType extends r5<AdRequestType, ?, ?, ?>> extends p<AdRequestType, AdObjectType, y5> {
    public static final Handler m = new Handler(Looper.getMainLooper());

    /* renamed from: a  reason: collision with root package name */
    public final String f17682a = getClass().getSimpleName();

    /* renamed from: b  reason: collision with root package name */
    public Integer f17683b;

    /* renamed from: c  reason: collision with root package name */
    public View f17684c;

    /* renamed from: d  reason: collision with root package name */
    public View f17685d;

    /* renamed from: e  reason: collision with root package name */
    public int f17686e = -1;

    /* renamed from: f  reason: collision with root package name */
    public a f17687f;

    /* renamed from: g  reason: collision with root package name */
    public a f17688g;

    /* renamed from: h  reason: collision with root package name */
    public WeakReference<Animator> f17689h;
    public x5<AdRequestType, AdObjectType>.c i;
    public boolean j = true;
    public final d k = new d(0);
    public final ConcurrentHashMap l = new ConcurrentHashMap();

    public static class a {
        public a() {
        }

        public /* synthetic */ a(int i) {
            this();
        }
    }

    public static class b extends e {

        /* renamed from: c  reason: collision with root package name */
        public final boolean f17690c;

        public b(Activity activity, boolean z) {
            super(activity);
            this.f17690c = z;
        }

        public final boolean a() {
            return !this.f17690c;
        }

        public final void onMeasure(int i, int i2) {
            int i3;
            int childCount = getChildCount();
            if (childCount == 0) {
                super.onMeasure(i, i2);
                return;
            }
            int i4 = 0;
            int i5 = 0;
            for (int i6 = 0; i6 < childCount; i6++) {
                View childAt = getChildAt(i6);
                int size = View.MeasureSpec.getSize(i);
                int size2 = View.MeasureSpec.getSize(i2);
                measureChild(childAt, View.MeasureSpec.makeMeasureSpec(size, 0), View.MeasureSpec.makeMeasureSpec(size2, 0));
                if (this.f17690c) {
                    if (childAt.getMeasuredWidth() > size2) {
                        measureChild(childAt, View.MeasureSpec.makeMeasureSpec(size2, RecyclerView.UNDEFINED_DURATION), View.MeasureSpec.makeMeasureSpec(size, 0));
                    }
                    i4 = Math.max(i4, childAt.getMeasuredHeight());
                    i3 = childAt.getMeasuredWidth();
                } else {
                    i4 = Math.max(i4, childAt.getMeasuredWidth());
                    i3 = childAt.getMeasuredHeight();
                }
                i5 = Math.max(i5, i3);
            }
            setMeasuredDimension(getPaddingRight() + getPaddingLeft() + i4, getPaddingBottom() + getPaddingTop() + i5);
        }
    }

    public final class c implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public final a f17691a = new a(0);

        /* renamed from: b  reason: collision with root package name */
        public final u<AdObjectType, AdRequestType, ?> f17692b;

        public c(u<AdObjectType, AdRequestType, ?> uVar) {
            this.f17692b = uVar;
        }

        public final void run() {
            Activity activity;
            x5 x5Var;
            View view;
            this.f17691a.getClass();
            if (!r0.l || (activity = n5.b()) == null) {
                activity = com.appodeal.ads.context.b.f16327b.f16328a.getActivity();
            }
            if (activity == null) {
                Log.debug(x5.this.f17682a, "Refresh", "skip: no running activities fund");
                x5 x5Var2 = x5.this;
                if (this == x5Var2.i) {
                    x5Var2.i = null;
                    return;
                }
                return;
            }
            d a2 = x5.this.a(activity);
            z5 z5Var = (z5) this.f17692b.f();
            boolean z = true;
            if (z5Var == null || (view = x5.this.f17684c) == null || !view.isShown() || a2.f17695b != f0.VISIBLE) {
                x5 x5Var3 = x5.this;
                Log.debug(x5Var3.f17682a, "Refresh", String.format("skip: %s / %s / %s", new Object[]{a2.f17695b, z5Var, x5Var3.f17684c}));
                x5Var = x5.this;
                if (this != x5Var.i) {
                    return;
                }
            } else {
                this.f17691a.getClass();
                if (com.appodeal.ads.utils.c.a(n5.b())) {
                    Log.debug(x5.this.f17682a, "Refresh", "postponed: ads activity is visible");
                    x5.m.postDelayed(this, 1000);
                    return;
                }
                String str = this.f17692b.e().f17249b;
                if (!z5Var.u && !z5Var.v && !z5Var.q.containsKey(str)) {
                    z = false;
                }
                if (!z) {
                    Log.debug(x5.this.f17682a, "Refresh", "skip: current ad request hasn't any loaded ad");
                    x5Var = x5.this;
                    if (this != x5Var.i) {
                        return;
                    }
                } else {
                    Log.debug(x5.this.f17682a, "Refresh", "requesting render");
                    x5 x5Var4 = x5.this;
                    if (this == x5Var4.i) {
                        x5Var4.i = null;
                    }
                    x5.this.a(activity, new y5(this.f17692b.e(), x5.this.b(activity), false, z5Var.f17084h), this.f17692b);
                    return;
                }
            }
            x5Var.i = null;
        }
    }

    public static class d {

        /* renamed from: a  reason: collision with root package name */
        public a f17694a;

        /* renamed from: b  reason: collision with root package name */
        public f0 f17695b;

        public d() {
            this.f17695b = f0.NEVER_SHOWN;
        }

        public /* synthetic */ d(int i) {
            this();
        }
    }

    public static class e extends FrameLayout {

        /* renamed from: b  reason: collision with root package name */
        public static final Rect f17696b = new Rect();

        /* renamed from: a  reason: collision with root package name */
        public final Rect f17697a = new Rect();

        public e(Context context) {
            super(context);
            setFitsSystemWindows(true);
        }

        public boolean a() {
            return true;
        }

        public final WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
            Rect rect;
            DisplayCutout displayCutout;
            r0 r0Var = r0.f17085a;
            if (!r0.m) {
                return windowInsets;
            }
            if (windowInsets.getSystemWindowInsetLeft() == 0 && windowInsets.getSystemWindowInsetTop() == 0 && windowInsets.getSystemWindowInsetRight() == 0 && windowInsets.getSystemWindowInsetBottom() == 0) {
                rect = f17696b;
            } else {
                Rect rect2 = this.f17697a;
                rect2.setEmpty();
                if (Build.VERSION.SDK_INT >= 28 && (displayCutout = windowInsets.getDisplayCutout()) != null) {
                    rect2.set(displayCutout.getSafeInsetLeft(), displayCutout.getSafeInsetTop(), displayCutout.getSafeInsetRight(), displayCutout.getSafeInsetBottom());
                }
                rect = this.f17697a;
                if (a()) {
                    Rect rect3 = this.f17697a;
                    int max = Math.max(rect3.left, rect3.right);
                    rect3.right = max;
                    rect3.left = max;
                }
            }
            fitSystemWindows(rect);
            return windowInsets;
        }

        public void onLayout(boolean z, int i, int i2, int i3, int i4) {
            super.onLayout(z, i, i2, i3, i4);
            if (z) {
                requestApplyInsets();
            }
        }
    }

    public class f extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        public final AdRequestType f17698a;

        /* renamed from: b  reason: collision with root package name */
        public final AdObjectType f17699b;

        /* renamed from: c  reason: collision with root package name */
        public final u<AdObjectType, AdRequestType, ?> f17700c;

        /* renamed from: d  reason: collision with root package name */
        public final View f17701d;

        /* renamed from: e  reason: collision with root package name */
        public final View f17702e;

        /* renamed from: f  reason: collision with root package name */
        public final boolean f17703f;

        /* renamed from: g  reason: collision with root package name */
        public final boolean f17704g;

        public f(AdRequestType adrequesttype, AdObjectType adobjecttype, u<AdObjectType, AdRequestType, ?> uVar, View view, View view2, boolean z, boolean z2) {
            this.f17698a = adrequesttype;
            this.f17699b = adobjecttype;
            this.f17700c = uVar;
            this.f17701d = view;
            this.f17702e = view2;
            this.f17703f = z;
            this.f17704g = z2;
        }

        public final void onAnimationCancel(Animator animator) {
            animator.removeAllListeners();
            View view = this.f17701d;
            if (view != null) {
                if (view.getAnimation() != null) {
                    this.f17701d.getAnimation().setAnimationListener((Animation.AnimationListener) null);
                }
                this.f17701d.clearAnimation();
                this.f17701d.animate().setListener((Animator.AnimatorListener) null);
            }
            x5 x5Var = x5.this;
            x5Var.f17689h = null;
            try {
                View view2 = this.f17701d;
                boolean z = this.f17703f;
                boolean z2 = this.f17704g;
                x5Var.getClass();
                x5.a(view2, z, z2);
            } catch (Exception e2) {
                Log.log(e2);
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
            	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
            */
        public final void onAnimationEnd(android.animation.Animator r8) {
            /*
                r7 = this;
                r8.removeAllListeners()
                android.view.View r8 = r7.f17701d
                r0 = 0
                if (r8 == 0) goto L_0x0025
                android.view.animation.Animation r8 = r8.getAnimation()
                if (r8 == 0) goto L_0x0017
                android.view.View r8 = r7.f17701d
                android.view.animation.Animation r8 = r8.getAnimation()
                r8.setAnimationListener(r0)
            L_0x0017:
                android.view.View r8 = r7.f17701d
                r8.clearAnimation()
                android.view.View r8 = r7.f17701d
                android.view.ViewPropertyAnimator r8 = r8.animate()
                r8.setListener(r0)
            L_0x0025:
                com.appodeal.ads.x5 r8 = com.appodeal.ads.x5.this
                r8.f17689h = r0
                AdRequestType r0 = r7.f17698a
                AdObjectType r1 = r7.f17699b
                com.appodeal.ads.u<AdObjectType, AdRequestType, ?> r2 = r7.f17700c
                android.view.View r3 = r7.f17702e
                r8.getClass()
                com.appodeal.ads.u5 r4 = new com.appodeal.ads.u5
                r4.<init>(r8, r2, r0, r1)
                int r8 = r2.q
                long r5 = (long) r8
                java.util.HashMap r8 = com.appodeal.ads.utils.d0.f17503a
                monitor-enter(r8)
                monitor-enter(r8)     // Catch:{ all -> 0x007c }
                java.lang.Object r0 = r8.get(r1)     // Catch:{ all -> 0x0079 }
                com.appodeal.ads.utils.d0$a r0 = (com.appodeal.ads.utils.d0.a) r0     // Catch:{ all -> 0x0079 }
                if (r0 == 0) goto L_0x004e
                r0.b()     // Catch:{ all -> 0x0079 }
                r8.remove(r1)     // Catch:{ all -> 0x0079 }
            L_0x004e:
                monitor-exit(r8)     // Catch:{ all -> 0x0079 }
                com.appodeal.ads.utils.d0$a r0 = new com.appodeal.ads.utils.d0$a     // Catch:{ all -> 0x007c }
                r0.<init>(r3, r5, r4)     // Catch:{ all -> 0x007c }
                r8.put(r1, r0)     // Catch:{ all -> 0x007c }
                r0.c()     // Catch:{ all -> 0x007c }
                monitor-exit(r8)     // Catch:{ all -> 0x007c }
                android.view.View r8 = r7.f17702e
                android.view.View r0 = r7.f17701d
                boolean r8 = r8.equals(r0)
                if (r8 != 0) goto L_0x0078
                com.appodeal.ads.x5 r8 = com.appodeal.ads.x5.this     // Catch:{ Exception -> 0x0074 }
                android.view.View r0 = r7.f17701d     // Catch:{ Exception -> 0x0074 }
                boolean r1 = r7.f17703f     // Catch:{ Exception -> 0x0074 }
                boolean r2 = r7.f17704g     // Catch:{ Exception -> 0x0074 }
                r8.getClass()     // Catch:{ Exception -> 0x0074 }
                com.appodeal.ads.x5.a((android.view.View) r0, (boolean) r1, (boolean) r2)     // Catch:{ Exception -> 0x0074 }
                goto L_0x0078
            L_0x0074:
                r8 = move-exception
                com.appodeal.ads.utils.Log.log(r8)
            L_0x0078:
                return
            L_0x0079:
                r0 = move-exception
                monitor-exit(r8)     // Catch:{ all -> 0x0079 }
                throw r0     // Catch:{ all -> 0x007c }
            L_0x007c:
                r0 = move-exception
                monitor-exit(r8)     // Catch:{ all -> 0x007c }
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.appodeal.ads.x5.f.onAnimationEnd(android.animation.Animator):void");
        }

        public final void onAnimationStart(Animator animator) {
            x5.this.f17689h = new WeakReference<>(animator);
        }
    }

    public x5(a aVar) {
        this.f17687f = aVar;
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
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    public static void a(com.appodeal.ads.x5 r18, android.app.Activity r19, com.appodeal.ads.z5 r20, com.appodeal.ads.r5 r21, com.appodeal.ads.a r22, com.appodeal.ads.a r23, com.appodeal.ads.u r24, boolean r25) {
        /*
            r10 = r18
            r11 = r19
            r12 = r20
            r13 = r21
            r0 = r22
            r1 = r23
            r14 = r24
            java.lang.String r2 = r10.f17682a
            java.lang.String r3 = "Display Ads"
            java.lang.String r4 = "start"
            com.appodeal.ads.utils.Log.debug(r2, r3, r4)
            android.view.View r6 = r10.f17684c
            if (r6 != 0) goto L_0x0035
            if (r25 == 0) goto L_0x0035
            com.appodeal.ads.networking.LoadingError r0 = com.appodeal.ads.networking.LoadingError.ShowFailed
            com.appodeal.ads.utils.ExchangeAd r1 = r13.i
            if (r1 == 0) goto L_0x002c
            com.appodeal.ads.networking.LoadingError r2 = com.appodeal.ads.networking.LoadingError.TimeoutError
            if (r0 != r2) goto L_0x002c
            r2 = 1005(0x3ed, float:1.408E-42)
            r1.trackError(r2)
        L_0x002c:
            UnifiedAdType r1 = r13.f16573f
            if (r1 == 0) goto L_0x029e
            r1.onError(r0)
            goto L_0x029e
        L_0x0035:
            if (r6 == 0) goto L_0x003b
            if (r25 == 0) goto L_0x003b
            r7 = r6
            goto L_0x003e
        L_0x003b:
            android.view.View r2 = r13.s
            r7 = r2
        L_0x003e:
            if (r7 != 0) goto L_0x0049
            com.appodeal.ads.b0<AdObjectType, AdRequestType, ?> r0 = r14.f17433d
            com.appodeal.ads.networking.LoadingError r1 = com.appodeal.ads.networking.LoadingError.NoFill
            r0.j(r12, r13)
            goto L_0x029e
        L_0x0049:
            r15 = 1
            r9 = 0
            if (r0 != r1) goto L_0x004f
            r2 = 1
            goto L_0x0050
        L_0x004f:
            r2 = 0
        L_0x0050:
            r3 = 0
            if (r6 == 0) goto L_0x006e
            android.view.ViewParent r4 = r6.getParent()
            boolean r4 = r4 instanceof android.widget.FrameLayout
            if (r4 == 0) goto L_0x006e
            android.view.ViewParent r4 = r6.getParent()
            android.widget.FrameLayout r4 = (android.widget.FrameLayout) r4
            java.lang.Object r5 = r4.getTag()
            java.lang.String r8 = "Appodeal"
            boolean r5 = r8.equals(r5)
            if (r5 == 0) goto L_0x006e
            r3 = r4
        L_0x006e:
            com.appodeal.ads.a r4 = com.appodeal.ads.a.VIEW
            r5 = 360(0x168, float:5.04E-43)
            if (r0 == r4) goto L_0x00c2
            if (r2 == 0) goto L_0x009b
            if (r3 == 0) goto L_0x009b
            android.view.ViewParent r2 = r3.getParent()
            if (r2 == 0) goto L_0x009b
            android.view.ViewParent r2 = r3.getParent()
            if (r2 != 0) goto L_0x0086
            r2 = 0
            goto L_0x0099
        L_0x0086:
            boolean r8 = r2 instanceof android.view.View
            if (r8 == 0) goto L_0x0091
            android.view.View r2 = (android.view.View) r2
            android.content.Context r2 = r2.getContext()
            goto L_0x0095
        L_0x0091:
            android.content.Context r2 = r3.getContext()
        L_0x0095:
            boolean r2 = r11.equals(r2)
        L_0x0099:
            if (r2 != 0) goto L_0x00e1
        L_0x009b:
            int r2 = r22.a()
            if (r2 == 0) goto L_0x00a5
            if (r2 == r5) goto L_0x00a5
            r2 = 1
            goto L_0x00a6
        L_0x00a5:
            r2 = 0
        L_0x00a6:
            com.appodeal.ads.x5$b r3 = new com.appodeal.ads.x5$b
            r3.<init>(r11, r2)
            android.widget.FrameLayout$LayoutParams r2 = new android.widget.FrameLayout$LayoutParams
            int r8 = r13.a(r11)
            r5 = -1
            r2.<init>(r5, r8)
            r3.setBackgroundColor(r9)
            r3.setLayoutParams(r2)
            java.lang.String r2 = "Appodeal"
            r3.setTag(r2)
            r8 = 1
            goto L_0x00e2
        L_0x00c2:
            int r2 = r10.f17686e
            android.view.View r2 = r11.findViewById(r2)
            if (r2 == 0) goto L_0x00cb
            goto L_0x00cd
        L_0x00cb:
            android.view.View r2 = r10.f17685d
        L_0x00cd:
            if (r2 == 0) goto L_0x00de
            boolean r3 = r10.a((android.view.View) r2)
            if (r3 == 0) goto L_0x00d6
            goto L_0x00de
        L_0x00d6:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Only BannerView.class and MrecView.class are supported as target container for position type == AdDisplayPosition.VIEW"
            r0.<init>(r1)
            throw r0
        L_0x00de:
            r3 = r2
            android.view.ViewGroup r3 = (android.view.ViewGroup) r3
        L_0x00e1:
            r8 = 0
        L_0x00e2:
            if (r3 != 0) goto L_0x00f6
            java.lang.String r0 = "Show Failed"
            java.lang.String r1 = "view not found"
            r14.a((java.lang.String) r0, (java.lang.String) r1)
            java.lang.String r0 = r10.f17682a
            java.lang.String r1 = "Display Ads"
            java.lang.String r2 = "View container not found"
            com.appodeal.ads.utils.Log.debug(r0, r1, r2)
            goto L_0x029e
        L_0x00f6:
            android.view.View r2 = r10.f17684c
            boolean r2 = r7.equals(r2)
            if (r2 == 0) goto L_0x0112
            android.view.ViewParent r2 = r7.getParent()
            if (r2 == 0) goto L_0x0112
            android.view.ViewParent r2 = r7.getParent()
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x0112
            if (r8 != 0) goto L_0x0112
            r2 = 1
            goto L_0x0113
        L_0x0112:
            r2 = 0
        L_0x0113:
            if (r2 == 0) goto L_0x015d
            r7.setVisibility(r9)
            r3.setVisibility(r9)
            com.appodeal.ads.x5<AdRequestType, AdObjectType>$c r0 = r10.i
            if (r0 == 0) goto L_0x0135
            com.appodeal.ads.q4 r1 = com.appodeal.ads.q4.f17047a
            boolean r1 = com.appodeal.ads.r0.l
            if (r1 != 0) goto L_0x0135
            com.appodeal.ads.x5$a r0 = r0.f17691a
            r0.getClass()
            com.appodeal.ads.context.b r0 = com.appodeal.ads.context.b.f16327b
            com.appodeal.ads.context.f r0 = r0.f16328a
            android.app.Activity r0 = r0.getActivity()
            if (r0 == r11) goto L_0x0135
            goto L_0x0136
        L_0x0135:
            r15 = 0
        L_0x0136:
            if (r15 != 0) goto L_0x0142
            boolean r0 = r24.k()
            if (r0 == 0) goto L_0x0145
            boolean r0 = r12.C
            if (r0 == 0) goto L_0x0145
        L_0x0142:
            r10.a((android.app.Activity) r11, r14, r12)
        L_0x0145:
            java.lang.String r0 = r10.f17682a
            java.lang.String r1 = "Skip actual showing because view already on screen: "
            java.lang.StringBuilder r1 = com.appodeal.ads.h0.a(r1)
            com.appodeal.ads.x5<AdRequestType, AdObjectType>$c r2 = r10.i
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            java.lang.String r2 = "Display Ads"
            com.appodeal.ads.utils.Log.debug(r0, r2, r1)
            goto L_0x029e
        L_0x015d:
            a((android.view.View) r7, (boolean) r15, (boolean) r15)
            UnifiedAdType r2 = r13.f16573f
            if (r2 == 0) goto L_0x0173
            UnifiedAdParamsType r5 = r13.f16574g
            if (r5 == 0) goto L_0x016c
            r2.onPrepareToShow(r11, r5)
            goto L_0x0173
        L_0x016c:
            UnifiedAdCallbackType r2 = r13.f16575h
            if (r2 == 0) goto L_0x0173
            r2.onAdShowFailed()
        L_0x0173:
            int r2 = r13.b(r11)
            int r5 = r13.a(r11)
            android.view.ViewParent r16 = r3.getParent()
            if (r16 != 0) goto L_0x01a7
            if (r0 == r4) goto L_0x01a7
            int r15 = r22.a()
            if (r15 == 0) goto L_0x018f
            r9 = 360(0x168, float:5.04E-43)
            if (r15 == r9) goto L_0x018f
            r9 = 1
            goto L_0x0190
        L_0x018f:
            r9 = 0
        L_0x0190:
            if (r9 == 0) goto L_0x019a
            android.widget.FrameLayout$LayoutParams r9 = new android.widget.FrameLayout$LayoutParams
            int r15 = r0.f16165c
            r9.<init>(r5, r2, r15)
            goto L_0x01a1
        L_0x019a:
            android.widget.FrameLayout$LayoutParams r9 = new android.widget.FrameLayout$LayoutParams
            int r15 = r0.f16165c
            r9.<init>(r2, r5, r15)
        L_0x01a1:
            r11.addContentView(r3, r9)
            r3.bringToFront()
        L_0x01a7:
            r22.getClass()
            android.widget.FrameLayout$LayoutParams r9 = new android.widget.FrameLayout$LayoutParams
            int r15 = r0.f16164b
            r9.<init>(r2, r5, r15)
            int r2 = r22.a()
            float r2 = (float) r2
            r7.setRotation(r2)
            r3.addView(r7, r9)
            r9 = 0
            r7.setVisibility(r9)
            r3.setVisibility(r9)
            r10.f17684c = r7
            r10.f17687f = r0
            r14.y = r12
            if (r0 != r1) goto L_0x0210
            if (r6 == 0) goto L_0x0210
            boolean r1 = r7.equals(r6)
            if (r1 != 0) goto L_0x0210
            boolean r1 = r10.j
            if (r1 == 0) goto L_0x0210
            r6.bringToFront()
            android.view.ViewPropertyAnimator r1 = r6.animate()
            r2 = 0
            android.view.ViewPropertyAnimator r1 = r1.alpha(r2)
            r2 = 800(0x320, double:3.953E-321)
            android.view.ViewPropertyAnimator r1 = r1.setDuration(r2)
            android.view.ViewPropertyAnimator r15 = r1.withLayer()
            com.appodeal.ads.x5$f r5 = new com.appodeal.ads.x5$f
            if (r0 == r4) goto L_0x01f3
            r0 = 1
            goto L_0x01f4
        L_0x01f3:
            r0 = 0
        L_0x01f4:
            r1 = r5
            r2 = r18
            r3 = r20
            r4 = r21
            r11 = r5
            r5 = r24
            r23 = r8
            r8 = r0
            r17 = 0
            r9 = r23
            r1.<init>(r3, r4, r5, r6, r7, r8, r9)
            android.view.ViewPropertyAnimator r0 = r15.setListener(r11)
            r0.start()
            goto L_0x0251
        L_0x0210:
            r23 = r8
            r17 = 0
            com.appodeal.ads.u5 r1 = new com.appodeal.ads.u5
            r1.<init>(r10, r14, r12, r13)
            int r2 = r14.q
            long r2 = (long) r2
            java.util.HashMap r5 = com.appodeal.ads.utils.d0.f17503a
            monitor-enter(r5)
            monitor-enter(r5)     // Catch:{ all -> 0x02a2 }
            java.lang.Object r8 = r5.get(r13)     // Catch:{ all -> 0x029f }
            com.appodeal.ads.utils.d0$a r8 = (com.appodeal.ads.utils.d0.a) r8     // Catch:{ all -> 0x029f }
            if (r8 == 0) goto L_0x022e
            r8.b()     // Catch:{ all -> 0x029f }
            r5.remove(r13)     // Catch:{ all -> 0x029f }
        L_0x022e:
            monitor-exit(r5)     // Catch:{ all -> 0x029f }
            com.appodeal.ads.utils.d0$a r8 = new com.appodeal.ads.utils.d0$a     // Catch:{ all -> 0x02a2 }
            r8.<init>(r7, r2, r1)     // Catch:{ all -> 0x02a2 }
            r5.put(r13, r8)     // Catch:{ all -> 0x02a2 }
            r8.c()     // Catch:{ all -> 0x02a2 }
            monitor-exit(r5)     // Catch:{ all -> 0x02a2 }
            boolean r1 = r7.equals(r6)
            if (r1 != 0) goto L_0x0251
            r15 = r23
            if (r0 == r4) goto L_0x0247
            r9 = 1
            goto L_0x0248
        L_0x0247:
            r9 = 0
        L_0x0248:
            a((android.view.View) r6, (boolean) r9, (boolean) r15)     // Catch:{ Exception -> 0x024c }
            goto L_0x0251
        L_0x024c:
            r0 = move-exception
            r1 = r0
            com.appodeal.ads.utils.Log.log(r1)
        L_0x0251:
            com.appodeal.ads.x5<AdRequestType, AdObjectType>$c r0 = r10.i
            if (r0 == 0) goto L_0x026e
            com.appodeal.ads.q4 r1 = com.appodeal.ads.q4.f17047a
            boolean r1 = com.appodeal.ads.r0.l
            if (r1 != 0) goto L_0x026e
            com.appodeal.ads.x5$a r0 = r0.f17691a
            r0.getClass()
            com.appodeal.ads.context.b r0 = com.appodeal.ads.context.b.f16327b
            com.appodeal.ads.context.f r0 = r0.f16328a
            android.app.Activity r0 = r0.getActivity()
            r1 = r19
            if (r0 == r1) goto L_0x0270
            r15 = 1
            goto L_0x0271
        L_0x026e:
            r1 = r19
        L_0x0270:
            r15 = 0
        L_0x0271:
            if (r15 != 0) goto L_0x027d
            boolean r0 = r24.k()
            if (r0 == 0) goto L_0x0280
            boolean r0 = r12.C
            if (r0 == 0) goto L_0x0280
        L_0x027d:
            r10.a((android.app.Activity) r1, r14, r12)
        L_0x0280:
            UnifiedAdType r0 = r13.f16573f
            if (r0 == 0) goto L_0x0287
            r0.onShow()
        L_0x0287:
            long r0 = r13.n
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto L_0x0295
            long r0 = java.lang.System.currentTimeMillis()
            r13.n = r0
        L_0x0295:
            java.lang.String r0 = r10.f17682a
            java.lang.String r1 = "Display Ads"
            java.lang.String r2 = "success"
            com.appodeal.ads.utils.Log.debug(r0, r1, r2)
        L_0x029e:
            return
        L_0x029f:
            r0 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x029f }
            throw r0     // Catch:{ all -> 0x02a2 }
        L_0x02a2:
            r0 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x02a2 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appodeal.ads.x5.a(com.appodeal.ads.x5, android.app.Activity, com.appodeal.ads.z5, com.appodeal.ads.r5, com.appodeal.ads.a, com.appodeal.ads.a, com.appodeal.ads.u, boolean):void");
    }

    public final void a(int i2) {
        this.f17686e = i2;
    }

    public final void a(FrameLayout frameLayout) {
        this.f17685d = frameLayout;
    }

    public final void a(boolean z) {
        this.j = z;
    }

    public final boolean a() {
        return this.j;
    }

    public final /* bridge */ /* synthetic */ boolean a(Activity activity, q qVar, u uVar) {
        return a((y5) qVar, uVar);
    }

    public abstract boolean a(View view);

    public final a b() {
        return this.f17687f;
    }

    public final a b(Activity activity) {
        a aVar = a(activity).f17694a;
        if (aVar != null) {
            return aVar;
        }
        a aVar2 = this.f17688g;
        return aVar2 != null ? aVar2 : this.f17687f;
    }

    public abstract void c(Activity activity);

    public static void a(z5 z5Var, b0 b0Var) {
        if (z5Var != null && !z5Var.F) {
            AdObjectType adobjecttype = z5Var.s;
            if (adobjecttype != null) {
                o.b(adobjecttype);
                ((r5) z5Var.s).k();
            }
            for (Map.Entry value : z5Var.q.entrySet()) {
                l lVar = (l) value.getValue();
                if (lVar != null) {
                    o.b(lVar);
                    lVar.k();
                }
            }
            b0Var.getClass();
            z5Var.a(false, true);
            b0Var.o(z5Var, null);
            z5Var.F = true;
            z5Var.y();
        }
    }

    public final long a(u<AdObjectType, AdRequestType, ?> uVar, AdRequestType adrequesttype) {
        AdObjectType adobjecttype;
        Integer num;
        int i2;
        if (adrequesttype == null || (adobjecttype = adrequesttype.s) == null) {
            return 0;
        }
        int impressionInterval = ((r5) adobjecttype).f16570c.getImpressionInterval();
        if (impressionInterval > 0) {
            num = Integer.valueOf(impressionInterval);
        } else {
            JSONObject optJSONObject = uVar.e().f17250c.optJSONObject("impression_interval");
            int i3 = -1;
            if (optJSONObject != null) {
                i3 = optJSONObject.optInt("banner", -1) * 1000;
            }
            if (i3 > 0) {
                i2 = Integer.valueOf(i3);
            } else {
                if (this.f17683b == null) {
                    i2 = 15000;
                }
                num = this.f17683b;
            }
            this.f17683b = i2;
            num = this.f17683b;
        }
        return Math.max(0, (adrequesttype.m + ((long) num.intValue())) - System.currentTimeMillis());
    }

    public final d a(Activity activity) {
        q4 q4Var = q4.f17047a;
        if (r0.l || activity == null) {
            return this.k;
        }
        d dVar = null;
        Iterator it = this.l.entrySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Map.Entry entry = (Map.Entry) it.next();
            if (((WeakReference) entry.getKey()).get() == activity) {
                dVar = (d) entry.getValue();
                break;
            }
        }
        if (dVar != null) {
            return dVar;
        }
        d dVar2 = new d();
        this.l.put(new WeakReference(activity), dVar2);
        return dVar2;
    }

    public final void a(Activity activity, q qVar, u uVar, p.a aVar) {
        y5 y5Var = (y5) qVar;
        uVar.a(LogConstants.EVENT_SHOW_FAILED, aVar.f17024a);
        if (aVar == p.a.f17021d || aVar == p.a.f17020c) {
            a(activity).f17694a = y5Var.f17738c;
        }
    }

    public final boolean a(y5 y5Var, u uVar) {
        Activity activity;
        y5 y5Var2 = y5Var;
        u uVar2 = uVar;
        Log.debug(this.f17682a, "onRenderRequested", "start");
        if (!r0.l || (activity = n5.b()) == null) {
            activity = com.appodeal.ads.context.b.f16327b.f16328a.getActivity();
        }
        Activity activity2 = activity;
        if (activity2 == null) {
            Log.debug(this.f17682a, "onRenderRequested", "Target activity can't be resolved");
            return false;
        }
        a aVar = this.f17687f;
        a aVar2 = y5Var2.f17738c;
        d a2 = a(activity2);
        g gVar = y5Var2.f17031a;
        boolean z = y5Var2.f17032b;
        z5 z5Var = (z5) uVar.f();
        if (z5Var == null) {
            Log.debug(this.f17682a, "onRenderRequested", "No previous loaded ads");
            Boolean bool = Boolean.FALSE;
            uVar2.a(LogConstants.EVENT_SHOW, String.format("isDebug: %s, isLoaded: %s, isLoading: %s, placement: '%s'", new Object[]{Boolean.valueOf(y5Var2.f17032b), bool, bool, gVar.f17249b}));
            if (!gVar.a(activity2, uVar2.f17435f, 0.0d)) {
                String str = this.f17682a;
                StringBuilder a3 = h0.a("Can't show for placement: ");
                a3.append(gVar.f17248a);
                Log.debug(str, "onRenderRequested", a3.toString());
                return false;
            } else if (z || !uVar.k()) {
                Log.debug(this.f17682a, "onRenderRequested", "Skipping cache because it's debug or not auto-cache");
                return false;
            } else {
                Log.debug(this.f17682a, "onRenderRequested", "Requesting cache");
                c(activity2);
                a2.f17695b = f0.VISIBLE;
                return true;
            }
        } else {
            String str2 = "Requesting cache";
            uVar2.a(LogConstants.EVENT_SHOW, String.format("isDebug: %s, isLoaded: %s, isLoading: %s, placement: '%s'", new Object[]{Boolean.valueOf(y5Var2.f17032b), Boolean.valueOf(z5Var.u), Boolean.valueOf(z5Var.u()), gVar.f17249b}));
            if (!gVar.a(activity2, uVar2.f17435f, z5Var.t)) {
                String str3 = this.f17682a;
                StringBuilder a4 = h0.a("Can't show for placement: ");
                a4.append(gVar.f17248a);
                Log.debug(str3, "onRenderRequested", a4.toString());
                return false;
            }
            z5 z5Var2 = (z5) uVar2.y;
            if (!z && !y5Var2.f17739d) {
                d a5 = a(activity2);
                f0 f0Var = a5.f17695b;
                f0 f0Var2 = f0.VISIBLE;
                if ((f0Var == f0Var2 || a5.f17694a != null) && !z5Var.f17084h && uVar.k()) {
                    if (!(a(uVar2, z5Var2) <= 0)) {
                        Log.debug(this.f17682a, "onRenderRequested", "Showing previous ads");
                        boolean a6 = a(activity2, uVar2, aVar2, aVar);
                        if (a6) {
                            a2.f17695b = f0Var2;
                        }
                        return a6;
                    }
                }
            }
            if (z5Var.u || z5Var.v || z5Var.q.containsKey(gVar.f17249b)) {
                AdObjectType a7 = z5Var.a(gVar.f17249b);
                z5Var.s = a7;
                r5 r5Var = (r5) a7;
                if (r5Var == null) {
                    return false;
                }
                View findViewById = activity2.findViewById(this.f17686e);
                if (findViewById == null) {
                    findViewById = this.f17685d;
                }
                if (findViewById != null && !a(findViewById)) {
                    throw new IllegalArgumentException("Only BannerView.class and MrecView.class are supported as target container for position type == AdDisplayPosition.VIEW");
                } else if (((ViewGroup) findViewById) == null && aVar2 == a.VIEW) {
                    uVar2.a(LogConstants.EVENT_SHOW_FAILED, LogConstants.MSG_VIEW_NOT_FOUND);
                    Log.debug(this.f17682a, "onRenderRequested", "View container not found");
                    return false;
                } else {
                    Log.debug(this.f17682a, "onRenderRequested", "Showing new ads");
                    activity2.runOnUiThread(new s5(this, activity2, z5Var, r5Var, aVar2, aVar, uVar));
                    a2.f17695b = f0.VISIBLE;
                    return true;
                }
            } else if (z5Var.u() || (z5Var.C && !uVar.k())) {
                Log.debug(this.f17682a, "onRenderRequested", "Trying to show previous ads");
                if (!a(activity2, uVar2, aVar2, aVar) && (z || !uVar.k())) {
                    return false;
                }
                a2.f17695b = f0.VISIBLE;
                return true;
            } else {
                Log.debug(this.f17682a, "onRenderRequested", "Trying to show previous ads");
                a(activity2, uVar2, aVar2, aVar);
                if (z || !uVar.k()) {
                    return false;
                }
                Log.debug(this.f17682a, "onRenderRequested", str2);
                c(activity2);
                a2.f17695b = f0.VISIBLE;
                return true;
            }
        }
    }

    public static void a(View view, boolean z, boolean z2) {
        if (view != null) {
            HashMap hashMap = d0.f17503a;
            synchronized (hashMap) {
                Iterator it = hashMap.entrySet().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    Map.Entry entry = (Map.Entry) it.next();
                    if (((d0.a) entry.getValue()).f17506b == view) {
                        ((d0.a) entry.getValue()).b();
                        d0.f17503a.remove(entry.getKey());
                        break;
                    }
                }
            }
            ViewGroup viewGroup = null;
            if (view.getParent() != null && (view.getParent() instanceof ViewGroup)) {
                viewGroup = (ViewGroup) view.getParent();
            }
            if (viewGroup != null) {
                if ((viewGroup instanceof BannerView) && z) {
                    viewGroup.setVisibility(8);
                }
                if ((viewGroup instanceof MrecView) && z) {
                    viewGroup.setVisibility(8);
                }
                viewGroup.removeView(view);
            }
            if (viewGroup != null && viewGroup.getTag() != null && viewGroup.getTag().equals("Appodeal") && z2) {
                ViewParent parent = viewGroup.getParent();
                if (parent instanceof ViewGroup) {
                    ((ViewGroup) parent).removeView(viewGroup);
                }
            }
        }
    }

    public final boolean a(Activity activity, y5 y5Var, u<AdObjectType, AdRequestType, ?> uVar) {
        d a2 = a(activity);
        if (!uVar.i) {
            if (uVar.k()) {
                a2.f17694a = y5Var.f17738c;
                uVar.l = y5Var.f17031a;
                Log.debug(this.f17682a, "render", "Appodeal is initializing, ads will be displayed right after it's will be loaded");
                return true;
            }
            Log.debug(this.f17682a, "render", "Appodeal hasn't been initialized yet, ads won't show");
            return false;
        } else if (y5Var.f17739d && a2.f17694a == null && a2.f17695b == f0.HIDDEN) {
            return false;
        } else {
            if (!com.appodeal.ads.utils.c.a(n5.b())) {
                a2.f17694a = null;
                this.f17688g = y5Var.f17738c;
                return b(activity, y5Var, uVar);
            } else if (uVar.k()) {
                a2.f17694a = y5Var.f17738c;
                uVar.l = y5Var.f17031a;
                Log.debug(this.f17682a, "render", "Fullscreen ads is showing, ads will be displayed right after it's will be closed");
                return true;
            } else {
                Log.debug(this.f17682a, "render", "Fullscreen ads is showing, ads won't show");
                return false;
            }
        }
    }

    public final boolean a(Activity activity, u uVar, a aVar, a aVar2) {
        Log.debug(this.f17682a, "performShowPreviousAds", "start");
        z5 z5Var = (z5) uVar.y;
        if (z5Var != null && z5Var.C && !z5Var.E) {
            if (aVar == a.VIEW) {
                View findViewById = activity.findViewById(this.f17686e);
                if (findViewById == null) {
                    findViewById = this.f17685d;
                }
                if (findViewById != null && !a(findViewById)) {
                    throw new IllegalArgumentException("Only BannerView.class and MrecView.class are supported as target container for position type == AdDisplayPosition.VIEW");
                } else if (((ViewGroup) findViewById) == null) {
                    uVar.a(LogConstants.EVENT_SHOW_FAILED, LogConstants.MSG_VIEW_NOT_FOUND);
                    Log.debug(this.f17682a, "performShowPreviousAds", "View container not found");
                    return false;
                }
            }
            r5 r5Var = (r5) z5Var.s;
            if (r5Var != null) {
                Log.debug(this.f17682a, "performShowPreviousAds", "Perform showing previous ads");
                activity.runOnUiThread(new t5(this, activity, z5Var, r5Var, aVar, aVar2, uVar));
                return true;
            }
            Log.debug(this.f17682a, "performShowPreviousAds", "Previous ads hasn't loaded object");
        }
        Log.debug(this.f17682a, "performShowPreviousAds", "Can't show previous ads, because current displaying ads is: null, wasn't shown or cleared");
        return false;
    }

    public final synchronized void a(Activity activity, u<AdObjectType, AdRequestType, ?> uVar, AdRequestType adrequesttype) {
        Log.debug(this.f17682a, "Toggle refresh", "start");
        x5<AdRequestType, AdObjectType>.c cVar = this.i;
        if (cVar != null) {
            q4 q4Var = q4.f17047a;
            if (!r0.l) {
                cVar.f17691a.getClass();
                if (com.appodeal.ads.context.b.f16327b.f16328a.getActivity() != activity) {
                    m.removeCallbacks(this.i);
                    Log.debug(this.f17682a, "Toggle refresh", "remove previous refresh runnable");
                }
            }
            Log.debug(this.f17682a, "Toggle refresh", "skip: already pending");
            return;
        }
        Log.debug(this.f17682a, "Toggle refresh", "create new refresh runnable");
        this.i = new c(uVar);
        long a2 = a(uVar, adrequesttype);
        String str = this.f17682a;
        Log.debug(str, "Toggle refresh", "expect in " + a2 + "ms");
        m.postDelayed(this.i, a2);
    }
}
