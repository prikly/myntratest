package com.appodeal.ads;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.CompoundButton;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.Toast;
import com.appnext.ads.fullscreen.RewardedVideo;
import com.appodeal.ads.h2;
import com.appodeal.ads.native_ad.views.NativeAdViewContentStream;
import com.appodeal.ads.o1;
import com.appodeal.ads.o4;
import com.appodeal.ads.q1;
import com.appodeal.ads.t0;
import com.appodeal.ads.w2;
import java.util.ArrayList;

public class TestActivity extends Activity implements BannerCallbacks, InterstitialCallbacks, MrecCallbacks, NativeCallbacks, RewardedVideoCallbacks {

    /* renamed from: a  reason: collision with root package name */
    public int f16139a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f16140b;

    /* renamed from: c  reason: collision with root package name */
    public ListView f16141c;

    /* renamed from: d  reason: collision with root package name */
    public RelativeLayout f16142d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f16143e;

    /* renamed from: f  reason: collision with root package name */
    public NativeAdViewContentStream f16144f;

    /* renamed from: g  reason: collision with root package name */
    public NativeAd f16145g;

    /* renamed from: h  reason: collision with root package name */
    public r f16146h = null;
    public boolean i;
    public ProgressDialog j;
    public boolean k;

    public class a implements AdapterView.OnItemClickListener {
        public a() {
        }

        public final void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
            s sVar;
            q1.c cVar;
            ((com.appodeal.ads.utils.b) adapterView.getAdapter()).getClass();
            int i2 = m.b(6)[i];
            TestActivity testActivity = TestActivity.this;
            int a2 = com.appodeal.ads.utils.a.a(i2);
            testActivity.f16139a = a2;
            if (q4.d(a2)) {
                TestActivity testActivity2 = TestActivity.this;
                int i3 = testActivity2.f16139a;
                q4.b(i3, true);
                q4.a(i3, false);
                if (i3 == 1) {
                    testActivity2.e();
                    cVar = q1.a().f17037d;
                    sVar = new o1.c();
                    sVar.f17189a = true;
                    sVar.f17191c = true;
                    sVar.f17190b = testActivity2.f16140b;
                } else if (i3 == 2) {
                    testActivity2.e();
                    cVar = q1.a().f17038e;
                    sVar = new w2.a();
                    sVar.f17189a = true;
                    sVar.f17191c = true;
                    sVar.f17190b = testActivity2.f16140b;
                } else if (i3 == 4) {
                    testActivity2.e();
                    t0.d dVar = new t0.d();
                    dVar.f17189a = true;
                    dVar.f17191c = true;
                    dVar.f17190b = testActivity2.f16140b;
                    t0.a().b((Context) testActivity2, dVar);
                    return;
                } else if (i3 == 128) {
                    testActivity2.e();
                    o4.a aVar = new o4.a();
                    aVar.f17189a = true;
                    aVar.f17191c = true;
                    aVar.f17190b = testActivity2.f16140b;
                    o4.a().b((Context) testActivity2, aVar);
                    return;
                } else if (i3 == 256) {
                    testActivity2.e();
                    h2.d dVar2 = new h2.d();
                    dVar2.f17189a = true;
                    dVar2.f17191c = true;
                    dVar2.f17190b = testActivity2.f16140b;
                    h2.a().b((Context) testActivity2, dVar2);
                    return;
                } else if (i3 == 512) {
                    testActivity2.e();
                    Native.c().b(1);
                    Native.c().a(true, testActivity2.f16140b, true);
                    return;
                } else {
                    return;
                }
                cVar.a((Context) testActivity2, sVar);
                return;
            }
            TestActivity testActivity3 = TestActivity.this;
            Toast.makeText(testActivity3, com.appodeal.ads.utils.a.b(i2) + " isn't initialized", 0).show();
        }
    }

    public class b implements CompoundButton.OnCheckedChangeListener {
        public b() {
        }

        public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            TestActivity.this.f16140b = z;
        }
    }

    public class c implements AdapterView.OnItemClickListener {
        public c() {
        }

        /* JADX WARNING: type inference failed for: r1v0, types: [android.widget.AdapterView<?>, android.widget.AdapterView] */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void onItemClick(android.widget.AdapterView<?> r1, android.view.View r2, int r3, long r4) {
            /*
                r0 = this;
                android.widget.Adapter r1 = r1.getAdapter()
                java.lang.Object r1 = r1.getItem(r3)
                com.appodeal.ads.utils.k r1 = (com.appodeal.ads.utils.k) r1
                com.appodeal.ads.TestActivity r2 = com.appodeal.ads.TestActivity.this
                boolean r3 = r2.i
                if (r3 == 0) goto L_0x0012
                goto L_0x00c5
            L_0x0012:
                r2.e()
                com.appodeal.ads.r r3 = r2.f16146h
                r3.y()
                r3 = 1
                r2.k = r3
                int r2 = r2.f16139a
                r4 = 0
                if (r2 == r3) goto L_0x00aa
                r5 = 2
                if (r2 == r5) goto L_0x008e
                r5 = 4
                if (r2 == r5) goto L_0x0079
                r5 = 128(0x80, float:1.794E-43)
                if (r2 == r5) goto L_0x0064
                r5 = 256(0x100, float:3.59E-43)
                if (r2 == r5) goto L_0x004f
                r5 = 512(0x200, float:7.175E-43)
                if (r2 == r5) goto L_0x0036
                goto L_0x00c5
            L_0x0036:
                com.appodeal.ads.n2 r2 = com.appodeal.ads.Native.c()
                r2.f16835c = r4
                com.appodeal.ads.Native$a r2 = com.appodeal.ads.Native.a()
                AdRequestType r2 = r2.x
                com.appodeal.ads.t2 r2 = (com.appodeal.ads.t2) r2
                int r1 = r1.f17527g
                com.appodeal.ads.Native$a r5 = com.appodeal.ads.Native.a()
                r5.a(r2, (int) r1, (boolean) r4, (boolean) r3)
                goto L_0x00c5
            L_0x004f:
                com.appodeal.ads.TestActivity.a()
                com.appodeal.ads.h2$b r2 = com.appodeal.ads.h2.a()
                AdRequestType r2 = r2.x
                com.appodeal.ads.k2 r2 = (com.appodeal.ads.k2) r2
                int r1 = r1.f17527g
                com.appodeal.ads.h2$b r5 = com.appodeal.ads.h2.a()
                r5.a(r2, (int) r1, (boolean) r4, (boolean) r3)
                goto L_0x00c5
            L_0x0064:
                com.appodeal.ads.TestActivity.a()
                com.appodeal.ads.o4$b r2 = com.appodeal.ads.o4.a()
                AdRequestType r2 = r2.x
                com.appodeal.ads.n4 r2 = (com.appodeal.ads.n4) r2
                int r1 = r1.f17527g
                com.appodeal.ads.o4$b r5 = com.appodeal.ads.o4.a()
                r5.a(r2, (int) r1, (boolean) r4, (boolean) r3)
                goto L_0x00c5
            L_0x0079:
                com.appodeal.ads.TestActivity.a()
                com.appodeal.ads.t0$b r2 = com.appodeal.ads.t0.a()
                AdRequestType r2 = r2.x
                com.appodeal.ads.w0 r2 = (com.appodeal.ads.w0) r2
                int r1 = r1.f17527g
                com.appodeal.ads.t0$b r5 = com.appodeal.ads.t0.a()
                r5.a(r2, (int) r1, (boolean) r4, (boolean) r3)
                goto L_0x00c5
            L_0x008e:
                com.appodeal.ads.TestActivity.a()
                com.appodeal.ads.q1 r2 = com.appodeal.ads.q1.a()
                r2.c()
                com.appodeal.ads.w2$b r2 = com.appodeal.ads.w2.a()
                AdRequestType r2 = r2.x
                com.appodeal.ads.q5 r2 = (com.appodeal.ads.q5) r2
                int r1 = r1.f17527g
                com.appodeal.ads.w2$b r5 = com.appodeal.ads.w2.a()
                r5.a(r2, (int) r1, (boolean) r4, (boolean) r3)
                goto L_0x00c5
            L_0x00aa:
                com.appodeal.ads.TestActivity.a()
                com.appodeal.ads.q1 r2 = com.appodeal.ads.q1.a()
                r2.c()
                com.appodeal.ads.o1$a r2 = com.appodeal.ads.o1.a()
                AdRequestType r2 = r2.x
                com.appodeal.ads.r1 r2 = (com.appodeal.ads.r1) r2
                int r1 = r1.f17527g
                com.appodeal.ads.o1$a r5 = com.appodeal.ads.o1.a()
                r5.a(r2, (int) r1, (boolean) r4, (boolean) r3)
            L_0x00c5:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.appodeal.ads.TestActivity.c.onItemClick(android.widget.AdapterView, android.view.View, int, long):void");
        }
    }

    public class d implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Context f16150a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ String f16151b;

        public d(Context context, String str) {
            this.f16150a = context;
            this.f16151b = str;
        }

        public final void run() {
            Toast.makeText(this.f16150a, this.f16151b, 0).show();
        }
    }

    public static void a() {
        w0 w0Var = (w0) t0.a().f();
        k2 k2Var = (k2) h2.a().f();
        r1 r1Var = (r1) o1.a().f();
        q5 q5Var = (q5) w2.a().f();
        n4 n4Var = (n4) o4.a().f();
        if (w0Var != null) {
            w0Var.c();
            w0Var.y();
        }
        if (k2Var != null) {
            k2Var.c();
            k2Var.y();
        }
        if (r1Var != null) {
            r1Var.c();
            r1Var.y();
        }
        if (q5Var != null) {
            q5Var.c();
            q5Var.y();
        }
        if (n4Var != null) {
            n4Var.c();
            n4Var.y();
        }
    }

    public static void a(Context context, String str) {
        h5.f16458a.post(new d(context, str));
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v10, resolved type: com.appodeal.ads.BannerView} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v12, resolved type: com.appodeal.ads.MrecView} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v22, resolved type: com.appodeal.ads.BannerView} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v23, resolved type: com.appodeal.ads.BannerView} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x005d  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x00d6  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0137  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x01c9  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0210  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void b() {
        /*
            r14 = this;
            boolean r0 = r14.i
            if (r0 == 0) goto L_0x0007
            r14.e()
        L_0x0007:
            com.appodeal.ads.context.g r0 = com.appodeal.ads.context.g.f16345b
            android.content.Context r1 = r14.getApplicationContext()
            r0.setApplicationContext(r1)
            r0.setActivity(r14)
            int r0 = r14.f16139a
            r1 = 1
            com.appodeal.ads.q4.b((int) r0, (boolean) r1)
            int r0 = r14.f16139a
            r2 = 0
            com.appodeal.ads.q4.a((int) r0, (boolean) r2)
            int r0 = r14.f16139a
            r3 = 512(0x200, float:7.175E-43)
            r4 = 256(0x100, float:3.59E-43)
            r5 = 4
            if (r0 == r1) goto L_0x004f
            r6 = 2
            if (r0 == r6) goto L_0x004a
            if (r0 == r5) goto L_0x0045
            r6 = 128(0x80, float:1.794E-43)
            if (r0 == r6) goto L_0x0040
            if (r0 == r4) goto L_0x003b
            if (r0 == r3) goto L_0x0036
            goto L_0x0059
        L_0x0036:
            com.appodeal.ads.Native$a r0 = com.appodeal.ads.Native.a()
            goto L_0x0053
        L_0x003b:
            com.appodeal.ads.h2$b r0 = com.appodeal.ads.h2.a()
            goto L_0x0053
        L_0x0040:
            com.appodeal.ads.o4$b r0 = com.appodeal.ads.o4.a()
            goto L_0x0053
        L_0x0045:
            com.appodeal.ads.t0$b r0 = com.appodeal.ads.t0.a()
            goto L_0x0053
        L_0x004a:
            com.appodeal.ads.w2$b r0 = com.appodeal.ads.w2.a()
            goto L_0x0053
        L_0x004f:
            com.appodeal.ads.o1$a r0 = com.appodeal.ads.o1.a()
        L_0x0053:
            com.appodeal.ads.r r0 = r0.f()
            r14.f16146h = r0
        L_0x0059:
            com.appodeal.ads.r r0 = r14.f16146h
            if (r0 != 0) goto L_0x005f
            r14.f16139a = r2
        L_0x005f:
            android.widget.RelativeLayout r0 = new android.widget.RelativeLayout
            r0.<init>(r14)
            r6 = -1
            r0.setBackgroundColor(r6)
            r0.setClickable(r1)
            android.widget.TextView r1 = new android.widget.TextView
            r1.<init>(r14)
            float r7 = com.appodeal.ads.f1.l(r14)
            r8 = 1098907648(0x41800000, float:16.0)
            float r7 = r7 * r8
            int r7 = java.lang.Math.round(r7)
            r1.setPadding(r7, r2, r2, r2)
            android.widget.RelativeLayout$LayoutParams r7 = new android.widget.RelativeLayout$LayoutParams
            float r9 = com.appodeal.ads.f1.l(r14)
            r10 = 1111490560(0x42400000, float:48.0)
            float r9 = r9 * r10
            int r9 = java.lang.Math.round(r9)
            r7.<init>(r6, r9)
            r1.setTextSize(r8)
            r9 = 16
            r1.setGravity(r9)
            r1.setTextColor(r6)
            android.graphics.drawable.BitmapDrawable r11 = com.appodeal.ads.n5.d(r14)
            r1.setBackground(r11)
            int r11 = android.view.View.generateViewId()
            r1.setId(r11)
            r1.setLayoutParams(r7)
            r0.addView(r1)
            android.widget.ListView r7 = new android.widget.ListView
            r7.<init>(r14)
            r14.f16141c = r7
            r11 = 0
            r7.setDivider(r11)
            android.widget.ListView r7 = r14.f16141c
            r7.setDividerHeight(r2)
            android.widget.RelativeLayout$LayoutParams r7 = new android.widget.RelativeLayout$LayoutParams
            r7.<init>(r6, r6)
            int r12 = r1.getId()
            r13 = 3
            r7.addRule(r13, r12)
            android.widget.ListView r12 = r14.f16141c
            r12.setLayoutParams(r7)
            int r7 = r14.f16139a
            r12 = -2
            if (r7 != 0) goto L_0x0137
            java.lang.String r7 = "CHOOSE AD TYPE"
            r1.setText(r7)
            com.appodeal.ads.utils.b r7 = new com.appodeal.ads.utils.b
            r7.<init>(r14)
            android.widget.ListView r13 = r14.f16141c
            r13.setAdapter(r7)
            android.widget.ListView r7 = r14.f16141c
            com.appodeal.ads.TestActivity$a r13 = new com.appodeal.ads.TestActivity$a
            r13.<init>()
            r7.setOnItemClickListener(r13)
            android.widget.CheckBox r7 = new android.widget.CheckBox
            r7.<init>(r14)
            boolean r13 = r14.f16140b
            r7.setChecked(r13)
            java.lang.String r13 = "test"
            r7.setText(r13)
            r1.setTextColor(r6)
            r7.setTextSize(r8)
            r7.setGravity(r9)
            com.appodeal.ads.TestActivity$b r1 = new com.appodeal.ads.TestActivity$b
            r1.<init>()
            r7.setOnCheckedChangeListener(r1)
            android.widget.RelativeLayout$LayoutParams r1 = new android.widget.RelativeLayout$LayoutParams
            float r9 = com.appodeal.ads.f1.l(r14)
            float r9 = r9 * r10
            int r9 = java.lang.Math.round(r9)
            r1.<init>(r12, r9)
            r9 = 11
            r1.addRule(r9)
            float r9 = com.appodeal.ads.f1.l(r14)
            float r9 = r9 * r8
            int r8 = java.lang.Math.round(r9)
            r1.setMargins(r2, r2, r8, r2)
            r7.setLayoutParams(r1)
            r0.addView(r7)
            goto L_0x0165
        L_0x0137:
            java.lang.String r7 = "CHOOSE AD ITEM"
            r1.setText(r7)
            com.appodeal.ads.r r1 = r14.f16146h
            java.util.ArrayList r1 = r1.f17077a
            java.util.ArrayList r1 = com.appodeal.ads.c1.a((java.util.List) r1, (boolean) r2)
            java.util.Collections.reverse(r1)
            java.util.ArrayList r7 = new java.util.ArrayList
            java.util.LinkedHashSet r8 = new java.util.LinkedHashSet
            r8.<init>(r1)
            r7.<init>(r8)
            com.appodeal.ads.utils.a0 r1 = new com.appodeal.ads.utils.a0
            r1.<init>(r14, r7)
            android.widget.ListView r7 = r14.f16141c
            r7.setAdapter(r1)
            android.widget.ListView r1 = r14.f16141c
            com.appodeal.ads.TestActivity$c r7 = new com.appodeal.ads.TestActivity$c
            r7.<init>()
            r1.setOnItemClickListener(r7)
        L_0x0165:
            android.widget.ListView r1 = r14.f16141c
            r0.addView(r1)
            android.widget.RelativeLayout r1 = new android.widget.RelativeLayout
            r1.<init>(r14)
            r14.f16142d = r1
            android.widget.RelativeLayout$LayoutParams r1 = new android.widget.RelativeLayout$LayoutParams
            r1.<init>(r6, r6)
            android.widget.RelativeLayout r7 = r14.f16142d
            java.lang.String r8 = "#DD000000"
            int r8 = android.graphics.Color.parseColor(r8)
            r7.setBackgroundColor(r8)
            android.widget.RelativeLayout r7 = r14.f16142d
            r7.setLayoutParams(r1)
            android.widget.TextView r1 = new android.widget.TextView
            r1.<init>(r14)
            r1.setTextColor(r6)
            java.lang.String r7 = "Press back to hide"
            r1.setText(r7)
            android.widget.RelativeLayout$LayoutParams r7 = new android.widget.RelativeLayout$LayoutParams
            r7.<init>(r12, r12)
            r8 = 10
            r7.addRule(r8)
            r8 = 14
            r7.addRule(r8, r6)
            r9 = 50
            r7.setMargins(r9, r9, r9, r9)
            r1.setLayoutParams(r7)
            android.widget.RelativeLayout r7 = r14.f16142d
            r7.setOnTouchListener(r11)
            android.widget.RelativeLayout r7 = r14.f16142d
            r7.setFocusable(r2)
            android.widget.RelativeLayout r7 = r14.f16142d
            r7.setFocusableInTouchMode(r2)
            android.widget.RelativeLayout r2 = r14.f16142d
            r2.setOnClickListener(r11)
            android.widget.RelativeLayout r2 = r14.f16142d
            r2.addView(r1)
            int r1 = r14.f16139a
            r2 = 12
            if (r1 == r5) goto L_0x0210
            if (r1 == r4) goto L_0x01e5
            if (r1 == r3) goto L_0x01ce
            goto L_0x0224
        L_0x01ce:
            com.appodeal.ads.native_ad.views.NativeAdViewContentStream r1 = new com.appodeal.ads.native_ad.views.NativeAdViewContentStream
            r1.<init>(r14)
            r14.f16144f = r1
            android.widget.RelativeLayout$LayoutParams r1 = new android.widget.RelativeLayout$LayoutParams
            r1.<init>(r6, r12)
            r1.addRule(r2)
            android.widget.RelativeLayout r2 = r14.f16142d
            com.appodeal.ads.native_ad.views.NativeAdViewContentStream r3 = r14.f16144f
            r2.addView(r3, r1)
            goto L_0x0224
        L_0x01e5:
            com.appodeal.ads.MrecView r1 = com.appodeal.ads.q4.b((android.content.Context) r14)
            android.widget.RelativeLayout$LayoutParams r3 = new android.widget.RelativeLayout$LayoutParams
            float r4 = com.appodeal.ads.f1.l(r14)
            r6 = 1133903872(0x43960000, float:300.0)
            float r4 = r4 * r6
            int r4 = java.lang.Math.round(r4)
            float r6 = com.appodeal.ads.f1.l(r14)
            r7 = 1132068864(0x437a0000, float:250.0)
            float r6 = r6 * r7
            int r6 = java.lang.Math.round(r6)
            r3.<init>(r4, r6)
            r3.addRule(r2)
            r3.addRule(r8)
            r1.setLayoutParams(r3)
            goto L_0x021f
        L_0x0210:
            com.appodeal.ads.BannerView r1 = com.appodeal.ads.q4.a((android.content.Context) r14)
            android.widget.RelativeLayout$LayoutParams r3 = new android.widget.RelativeLayout$LayoutParams
            r3.<init>(r6, r12)
            r3.addRule(r2)
            r1.setLayoutParams(r3)
        L_0x021f:
            android.widget.RelativeLayout r2 = r14.f16142d
            r2.addView(r1)
        L_0x0224:
            android.widget.RelativeLayout r1 = r14.f16142d
            r1.setVisibility(r5)
            android.widget.RelativeLayout r1 = r14.f16142d
            r0.addView(r1)
            r14.setContentView(r0)
            com.appodeal.ads.q4.a((com.appodeal.ads.BannerCallbacks) r14)
            com.appodeal.ads.q4.a((com.appodeal.ads.MrecCallbacks) r14)
            com.appodeal.ads.q4.a((com.appodeal.ads.InterstitialCallbacks) r14)
            com.appodeal.ads.q4.a((com.appodeal.ads.RewardedVideoCallbacks) r14)
            com.appodeal.ads.q4.a((com.appodeal.ads.NativeCallbacks) r14)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appodeal.ads.TestActivity.b():void");
    }

    public final void c() {
        q4.b((Activity) this, 64);
        q4.b((Activity) this, 256);
        if (this.f16145g != null) {
            NativeAdViewContentStream nativeAdViewContentStream = this.f16144f;
            if (nativeAdViewContentStream != null) {
                this.f16142d.removeView(nativeAdViewContentStream);
                this.f16144f.unregisterViewForInteraction();
                this.f16144f = null;
            }
            this.f16145g = null;
        }
        this.f16141c.setVisibility(0);
        this.f16142d.setVisibility(4);
        this.f16143e = false;
        this.k = false;
    }

    public final void d() {
        ProgressDialog progressDialog = this.j;
        if (progressDialog != null) {
            progressDialog.hide();
            this.j.dismiss();
            this.j = null;
        }
        this.i = false;
    }

    public final void e() {
        d();
        this.i = true;
        ProgressDialog progressDialog = new ProgressDialog(this);
        this.j = progressDialog;
        progressDialog.setCancelable(false);
        this.j.setMessage("Loading");
        this.j.show();
    }

    public final void onBackPressed() {
        if (this.f16143e) {
            int i2 = this.f16139a;
            if (i2 == 4 || i2 == 256 || i2 == 512) {
                c();
            }
        } else if (this.f16139a != 0) {
            this.f16139a = 0;
            b();
        } else {
            q4.f17050d = null;
            finish();
            overridePendingTransition(0, 0);
        }
    }

    public final void onBannerClicked() {
        a(com.appodeal.ads.context.b.f16327b.f16328a.getApplicationContext(), "Banner clicked");
    }

    public final void onBannerExpired() {
        a(com.appodeal.ads.context.b.f16327b.f16328a.getApplicationContext(), "Banner expired");
    }

    public final void onBannerFailedToLoad() {
        if (this.k) {
            this.k = false;
            d();
            a(com.appodeal.ads.context.b.f16327b.f16328a.getApplicationContext(), "Banner failed to load");
        }
    }

    public final void onBannerLoaded(int i2, boolean z) {
        if (this.k) {
            d();
            if (q4.a((Activity) this, 64, RewardedVideo.VIDEO_MODE_DEFAULT)) {
                int i3 = this.f16139a;
                if (i3 == 4 || i3 == 256 || i3 == 512) {
                    this.f16142d.setVisibility(0);
                    this.f16142d.bringToFront();
                    this.f16143e = true;
                    return;
                }
                return;
            }
            a(com.appodeal.ads.context.b.f16327b.f16328a.getApplicationContext(), "Banner failed to load");
        }
    }

    public final void onBannerShowFailed() {
        a(com.appodeal.ads.context.b.f16327b.f16328a.getApplicationContext(), "Banner show failed");
    }

    public final void onBannerShown() {
        a(com.appodeal.ads.context.b.f16327b.f16328a.getApplicationContext(), "Banner shown");
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        r1 r1Var = (r1) o1.a().f();
        q5 q5Var = (q5) w2.a().f();
        if (q5Var != null) {
            q5Var.c();
            q5Var.y();
        }
        if (r1Var != null) {
            r1Var.c();
            r1Var.y();
        }
        q4.f17050d = this;
        if (bundle != null) {
            this.f16139a = bundle.getInt("adType");
            this.f16140b = bundle.getBoolean("test");
            this.i = bundle.getBoolean("spinnerShown");
        }
        b();
    }

    public final void onInterstitialClicked() {
        a(com.appodeal.ads.context.b.f16327b.f16328a.getApplicationContext(), "Interstitial clicked");
    }

    public final void onInterstitialClosed() {
        a(com.appodeal.ads.context.b.f16327b.f16328a.getApplicationContext(), "Interstitial closed");
        c();
    }

    public final void onInterstitialExpired() {
        a(com.appodeal.ads.context.b.f16327b.f16328a.getApplicationContext(), "Interstitial expired");
    }

    public final void onInterstitialFailedToLoad() {
        if (this.k) {
            this.k = false;
            d();
            a(com.appodeal.ads.context.b.f16327b.f16328a.getApplicationContext(), "Interstitial failed to load");
        }
    }

    public final void onInterstitialLoaded(boolean z) {
        if (this.k) {
            d();
            this.f16143e = true;
            q4.a((Activity) this, 3, RewardedVideo.VIDEO_MODE_DEFAULT);
        }
    }

    public final void onInterstitialShowFailed() {
        a(com.appodeal.ads.context.b.f16327b.f16328a.getApplicationContext(), "Interstitial show failed");
    }

    public final void onInterstitialShown() {
        a(com.appodeal.ads.context.b.f16327b.f16328a.getApplicationContext(), "Interstitial shown");
    }

    public final void onMrecClicked() {
        a(com.appodeal.ads.context.b.f16327b.f16328a.getApplicationContext(), "Mrec clicked");
    }

    public final void onMrecExpired() {
        a(com.appodeal.ads.context.b.f16327b.f16328a.getApplicationContext(), "Mrec expired");
    }

    public final void onMrecFailedToLoad() {
        if (this.k) {
            this.k = false;
            d();
            a(com.appodeal.ads.context.b.f16327b.f16328a.getApplicationContext(), "Mrec failed to load");
        }
    }

    public final void onMrecLoaded(boolean z) {
        if (this.k) {
            d();
            if (q4.a((Activity) this, 256, RewardedVideo.VIDEO_MODE_DEFAULT)) {
                int i2 = this.f16139a;
                if (i2 == 4 || i2 == 256 || i2 == 512) {
                    this.f16142d.setVisibility(0);
                    this.f16142d.bringToFront();
                    this.f16143e = true;
                    return;
                }
                return;
            }
            a(com.appodeal.ads.context.b.f16327b.f16328a.getApplicationContext(), "Mrec failed to load");
        }
    }

    public final void onMrecShowFailed() {
        a(com.appodeal.ads.context.b.f16327b.f16328a.getApplicationContext(), "Mrec show failed");
    }

    public final void onMrecShown() {
        a(com.appodeal.ads.context.b.f16327b.f16328a.getApplicationContext(), "Mrec shown");
    }

    public final void onNativeClicked(NativeAd nativeAd) {
        a(com.appodeal.ads.context.b.f16327b.f16328a.getApplicationContext(), "Native ad clicked");
    }

    public final void onNativeExpired() {
        a(com.appodeal.ads.context.b.f16327b.f16328a.getApplicationContext(), "Native ad expired");
    }

    public final void onNativeFailedToLoad() {
        if (this.k) {
            this.k = false;
            d();
            a(com.appodeal.ads.context.b.f16327b.f16328a.getApplicationContext(), "Native ad failed to load");
        }
    }

    public final void onNativeLoaded() {
        if (this.k) {
            d();
            ArrayList a2 = q4.a(1);
            if (a2.size() > 0) {
                int i2 = this.f16139a;
                if (i2 == 4 || i2 == 256 || i2 == 512) {
                    this.f16142d.setVisibility(0);
                    this.f16142d.bringToFront();
                    this.f16143e = true;
                }
                this.f16145g = (NativeAd) a2.get(0);
                this.f16144f = new NativeAdViewContentStream((Context) this, this.f16145g);
                RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
                layoutParams.addRule(12);
                this.f16142d.addView(this.f16144f, layoutParams);
                return;
            }
            a(com.appodeal.ads.context.b.f16327b.f16328a.getApplicationContext(), "Native ad failed to load");
        }
    }

    public final void onNativeShowFailed(NativeAd nativeAd) {
        a(com.appodeal.ads.context.b.f16327b.f16328a.getApplicationContext(), "Native show failed");
    }

    public final void onNativeShown(NativeAd nativeAd) {
        a(com.appodeal.ads.context.b.f16327b.f16328a.getApplicationContext(), "Native ad shown");
    }

    public final void onRewardedVideoClicked() {
        a(com.appodeal.ads.context.b.f16327b.f16328a.getApplicationContext(), "Rewarded video clicked");
    }

    public final void onRewardedVideoClosed(boolean z) {
        a(com.appodeal.ads.context.b.f16327b.f16328a.getApplicationContext(), "Rewarded video closed");
        c();
    }

    public final void onRewardedVideoExpired() {
        a(com.appodeal.ads.context.b.f16327b.f16328a.getApplicationContext(), "Rewarded video expired");
    }

    public final void onRewardedVideoFailedToLoad() {
        if (this.k) {
            this.k = false;
            d();
            a(com.appodeal.ads.context.b.f16327b.f16328a.getApplicationContext(), "Rewarded video failed to load");
        }
    }

    public final void onRewardedVideoFinished(double d2, String str) {
        a(com.appodeal.ads.context.b.f16327b.f16328a.getApplicationContext(), "Rewarded video finished");
    }

    public final void onRewardedVideoLoaded(boolean z) {
        if (this.k) {
            d();
            if (q4.a((Activity) this, 128, RewardedVideo.VIDEO_MODE_DEFAULT)) {
                this.f16143e = true;
            } else {
                a(com.appodeal.ads.context.b.f16327b.f16328a.getApplicationContext(), "Rewarded video failed to load");
            }
        }
    }

    public final void onRewardedVideoShowFailed() {
        a(com.appodeal.ads.context.b.f16327b.f16328a.getApplicationContext(), "Rewarded video show failed");
    }

    public final void onRewardedVideoShown() {
        a(com.appodeal.ads.context.b.f16327b.f16328a.getApplicationContext(), "Rewarded video shown");
    }

    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        c();
        bundle.putInt("adType", this.f16139a);
        bundle.putBoolean("test", this.f16140b);
        bundle.putBoolean("spinnerShown", this.i);
    }
}
