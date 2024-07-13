package com.applovin.impl.adview.activity.a;

import android.app.Activity;
import android.view.View;
import com.applovin.impl.adview.m;
import com.applovin.impl.sdk.ad.e;
import com.applovin.impl.sdk.n;

public class c extends a {
    public c(e eVar, Activity activity, n nVar) {
        super(eVar, activity, nVar);
    }

    public /* bridge */ /* synthetic */ void a(View view) {
        super.a(view);
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x006b  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x00a0  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x00b7  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x014b  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0163  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x01a8  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x01b1  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x01d6  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0221  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0227  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a(android.widget.ImageView r20, com.applovin.impl.adview.m r21, com.applovin.impl.adview.t r22, com.applovin.impl.adview.a r23, android.widget.ProgressBar r24, android.view.View r25, com.applovin.adview.AppLovinAdView r26, android.widget.ImageView r27, android.view.ViewGroup r28) {
        /*
            r19 = this;
            r0 = r19
            r1 = r20
            r2 = r21
            r3 = r22
            r4 = r23
            r5 = r24
            r6 = r25
            r7 = r26
            r8 = r27
            r9 = r28
            com.applovin.impl.sdk.ad.e r10 = r0.f14026c
            com.applovin.impl.sdk.ad.e$d r10 = r10.aL()
            com.applovin.impl.sdk.ad.e$d r11 = com.applovin.impl.sdk.ad.e.d.TOP
            r14 = 80
            r15 = 48
            r12 = -2
            r13 = -1
            if (r10 != r11) goto L_0x002b
            android.widget.FrameLayout$LayoutParams r10 = new android.widget.FrameLayout$LayoutParams
            r10.<init>(r13, r12, r15)
        L_0x0029:
            r11 = 5
            goto L_0x0061
        L_0x002b:
            com.applovin.impl.sdk.ad.e r10 = r0.f14026c
            com.applovin.impl.sdk.ad.e$d r10 = r10.aL()
            com.applovin.impl.sdk.ad.e$d r11 = com.applovin.impl.sdk.ad.e.d.BOTTOM
            if (r10 != r11) goto L_0x003b
            android.widget.FrameLayout$LayoutParams r10 = new android.widget.FrameLayout$LayoutParams
            r10.<init>(r13, r12, r14)
            goto L_0x0029
        L_0x003b:
            com.applovin.impl.sdk.ad.e r10 = r0.f14026c
            com.applovin.impl.sdk.ad.e$d r10 = r10.aL()
            com.applovin.impl.sdk.ad.e$d r11 = com.applovin.impl.sdk.ad.e.d.LEFT
            if (r10 != r11) goto L_0x004c
            android.widget.FrameLayout$LayoutParams r10 = new android.widget.FrameLayout$LayoutParams
            r11 = 3
            r10.<init>(r12, r13, r11)
            goto L_0x0029
        L_0x004c:
            r11 = 3
            com.applovin.impl.sdk.ad.e r10 = r0.f14026c
            com.applovin.impl.sdk.ad.e$d r10 = r10.aL()
            com.applovin.impl.sdk.ad.e$d r11 = com.applovin.impl.sdk.ad.e.d.RIGHT
            if (r10 != r11) goto L_0x005e
            android.widget.FrameLayout$LayoutParams r10 = new android.widget.FrameLayout$LayoutParams
            r11 = 5
            r10.<init>(r12, r13, r11)
            goto L_0x0061
        L_0x005e:
            r11 = 5
            android.widget.FrameLayout$LayoutParams r10 = r0.f14028e
        L_0x0061:
            com.applovin.impl.sdk.ad.e r12 = r0.f14026c
            boolean r12 = r12.aI()
            r11 = 4
            r13 = 0
            if (r12 == 0) goto L_0x00a0
            android.widget.FrameLayout$LayoutParams r12 = r0.f14028e
            r7.setLayoutParams(r12)
            android.view.ViewGroup r12 = r0.f14027d
            r12.addView(r7)
            android.view.View r7 = new android.view.View
            android.app.Activity r12 = r0.f14025b
            r7.<init>(r12)
            android.widget.FrameLayout$LayoutParams r12 = r0.f14028e
            r7.setLayoutParams(r12)
            r12 = 254(0xfe, float:3.56E-43)
            int r12 = android.graphics.Color.argb(r12, r13, r13, r13)
            r7.setBackgroundColor(r12)
            com.applovin.impl.adview.activity.a.c$1 r12 = new com.applovin.impl.adview.activity.a.c$1
            r12.<init>()
            r7.setOnTouchListener(r12)
            android.view.ViewGroup r12 = r0.f14027d
            r12.addView(r7)
            r6.setLayoutParams(r10)
            android.view.ViewGroup r7 = r0.f14027d
            r7.addView(r6)
            goto L_0x00b5
        L_0x00a0:
            r6.setLayoutParams(r10)
            android.view.ViewGroup r10 = r0.f14027d
            r10.addView(r6)
            android.widget.FrameLayout$LayoutParams r6 = r0.f14028e
            r7.setLayoutParams(r6)
            android.view.ViewGroup r6 = r0.f14027d
            r6.addView(r7)
            r7.setVisibility(r11)
        L_0x00b5:
            if (r3 == 0) goto L_0x0149
            com.applovin.impl.sdk.ad.e r6 = r0.f14026c
            com.applovin.impl.adview.s r6 = r6.D()
            int r7 = r6.a()
            double r13 = (double) r7
            r16 = 4636737291354636288(0x4059000000000000, double:100.0)
            double r13 = r13 / r16
            int r7 = r6.b()
            double r10 = (double) r7
            double r10 = r10 / r16
            if (r9 == 0) goto L_0x00da
            int r7 = r28.getWidth()
            int r16 = r28.getHeight()
            r12 = r16
            goto L_0x00e9
        L_0x00da:
            android.app.Activity r7 = r0.f14025b
            android.graphics.Point r7 = com.applovin.impl.sdk.utils.h.a(r7)
            int r12 = r7.x
            int r7 = r7.y
            r18 = r12
            r12 = r7
            r7 = r18
        L_0x00e9:
            double r7 = (double) r7
            double r7 = r7 * r13
            int r7 = (int) r7
            double r12 = (double) r12
            double r12 = r12 * r10
            int r8 = (int) r12
            android.widget.FrameLayout$LayoutParams r10 = new android.widget.FrameLayout$LayoutParams
            int r11 = r6.d()
            r10.<init>(r7, r8, r11)
            android.app.Activity r7 = r0.f14025b
            int r8 = r6.c()
            int r7 = com.applovin.sdk.AppLovinSdkUtils.dpToPx(r7, r8)
            r10.setMargins(r7, r7, r7, r7)
            android.view.ViewGroup r7 = r0.f14027d
            r7.addView(r3, r10)
            float r7 = r6.i()
            r8 = 0
            int r7 = (r7 > r8 ? 1 : (r7 == r8 ? 0 : -1))
            if (r7 <= 0) goto L_0x012d
            r7 = 4
            r3.setVisibility(r7)
            float r7 = r6.i()
            long r10 = com.applovin.impl.sdk.utils.Utils.secondsToMillisLong(r7)
            long r12 = r6.g()
            com.applovin.impl.adview.activity.a.c$2 r7 = new com.applovin.impl.adview.activity.a.c$2
            r7.<init>(r3, r12)
            com.applovin.sdk.AppLovinSdkUtils.runOnUiThreadDelayed(r7, r10)
        L_0x012d:
            float r7 = r6.j()
            int r7 = (r7 > r8 ? 1 : (r7 == r8 ? 0 : -1))
            if (r7 <= 0) goto L_0x0149
            float r7 = r6.j()
            long r7 = com.applovin.impl.sdk.utils.Utils.secondsToMillisLong(r7)
            long r10 = r6.h()
            com.applovin.impl.adview.activity.a.c$3 r6 = new com.applovin.impl.adview.activity.a.c$3
            r6.<init>(r3, r10)
            com.applovin.sdk.AppLovinSdkUtils.runOnUiThreadDelayed(r6, r7)
        L_0x0149:
            if (r2 == 0) goto L_0x0161
            com.applovin.impl.sdk.ad.e r3 = r0.f14026c
            boolean r3 = r3.ac()
            if (r3 == 0) goto L_0x0155
            r12 = 3
            goto L_0x0156
        L_0x0155:
            r12 = 5
        L_0x0156:
            r3 = r12 | 48
            com.applovin.impl.sdk.ad.e r6 = r0.f14026c
            com.applovin.impl.sdk.ad.e$c r6 = r6.X()
            r0.a(r6, r3, r2)
        L_0x0161:
            if (r1 == 0) goto L_0x01a6
            android.app.Activity r2 = r0.f14025b
            com.applovin.impl.sdk.n r3 = r0.f14024a
            com.applovin.impl.sdk.c.b<java.lang.Integer> r6 = com.applovin.impl.sdk.c.b.cD
            java.lang.Object r3 = r3.a(r6)
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            int r2 = com.applovin.sdk.AppLovinSdkUtils.dpToPx(r2, r3)
            android.widget.FrameLayout$LayoutParams r3 = new android.widget.FrameLayout$LayoutParams
            com.applovin.impl.sdk.n r6 = r0.f14024a
            com.applovin.impl.sdk.c.b<java.lang.Integer> r7 = com.applovin.impl.sdk.c.b.cF
            java.lang.Object r6 = r6.a(r7)
            java.lang.Integer r6 = (java.lang.Integer) r6
            int r6 = r6.intValue()
            r3.<init>(r2, r2, r6)
            android.app.Activity r2 = r0.f14025b
            com.applovin.impl.sdk.n r6 = r0.f14024a
            com.applovin.impl.sdk.c.b<java.lang.Integer> r7 = com.applovin.impl.sdk.c.b.cE
            java.lang.Object r6 = r6.a(r7)
            java.lang.Integer r6 = (java.lang.Integer) r6
            int r6 = r6.intValue()
            int r2 = com.applovin.sdk.AppLovinSdkUtils.dpToPx(r2, r6)
            r3.setMargins(r2, r2, r2, r2)
            android.view.ViewGroup r2 = r0.f14027d
            r2.addView(r1, r3)
        L_0x01a6:
            if (r4 == 0) goto L_0x01af
            android.view.ViewGroup r1 = r0.f14027d
            android.widget.FrameLayout$LayoutParams r2 = r0.f14028e
            r1.addView(r4, r2)
        L_0x01af:
            if (r5 == 0) goto L_0x01d2
            android.widget.FrameLayout$LayoutParams r1 = new android.widget.FrameLayout$LayoutParams
            r2 = 20
            r3 = 80
            r4 = -1
            r1.<init>(r4, r2, r3)
            com.applovin.impl.sdk.n r2 = r0.f14024a
            com.applovin.impl.sdk.c.b<java.lang.Integer> r3 = com.applovin.impl.sdk.c.b.cI
            java.lang.Object r2 = r2.a(r3)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r3 = 0
            r1.setMargins(r3, r3, r3, r2)
            android.view.ViewGroup r2 = r0.f14027d
            r2.addView(r5, r1)
        L_0x01d2:
            r1 = r27
            if (r1 == 0) goto L_0x021f
            com.applovin.impl.sdk.ad.e r2 = r0.f14026c
            com.applovin.impl.b.a r2 = (com.applovin.impl.b.a) r2
            boolean r3 = r2.aQ()
            if (r3 == 0) goto L_0x021f
            android.app.Activity r3 = r0.f14025b
            com.applovin.impl.b.g r4 = r2.aP()
            int r4 = r4.c()
            int r3 = com.applovin.sdk.AppLovinSdkUtils.dpToPx(r3, r4)
            android.app.Activity r4 = r0.f14025b
            com.applovin.impl.b.g r2 = r2.aP()
            int r2 = r2.d()
            int r2 = com.applovin.sdk.AppLovinSdkUtils.dpToPx(r4, r2)
            android.app.Activity r4 = r0.f14025b
            com.applovin.impl.sdk.n r5 = r0.f14024a
            com.applovin.impl.sdk.c.b<java.lang.Integer> r6 = com.applovin.impl.sdk.c.b.ez
            java.lang.Object r5 = r5.a(r6)
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r5 = r5.intValue()
            int r4 = com.applovin.sdk.AppLovinSdkUtils.dpToPx(r4, r5)
            android.widget.FrameLayout$LayoutParams r5 = new android.widget.FrameLayout$LayoutParams
            r6 = 83
            r5.<init>(r3, r2, r6)
            r5.setMargins(r4, r4, r4, r4)
            android.view.ViewGroup r2 = r0.f14027d
            r2.addView(r1, r5)
        L_0x021f:
            if (r9 == 0) goto L_0x0227
            android.view.ViewGroup r1 = r0.f14027d
            r9.addView(r1)
            goto L_0x022e
        L_0x0227:
            android.app.Activity r1 = r0.f14025b
            android.view.ViewGroup r2 = r0.f14027d
            r1.setContentView(r2)
        L_0x022e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.adview.activity.a.c.a(android.widget.ImageView, com.applovin.impl.adview.m, com.applovin.impl.adview.t, com.applovin.impl.adview.a, android.widget.ProgressBar, android.view.View, com.applovin.adview.AppLovinAdView, android.widget.ImageView, android.view.ViewGroup):void");
    }

    public /* bridge */ /* synthetic */ void a(m mVar) {
        super.a(mVar);
    }

    public void a(m mVar, View view) {
        if (view != null) {
            view.setVisibility(0);
        }
        com.applovin.impl.sdk.utils.c.a(this.f14027d, view);
        if (mVar != null) {
            a(this.f14026c.X(), (this.f14026c.ab() ? 3 : 5) | 48, mVar);
        }
    }
}
