package com.bytedance.sdk.openadsdk.core.b;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.sdk.component.utils.l;
import com.bytedance.sdk.component.utils.o;
import com.bytedance.sdk.component.utils.t;
import com.bytedance.sdk.openadsdk.core.e.n;
import com.bytedance.sdk.openadsdk.core.m;
import com.bytedance.sdk.openadsdk.core.nativeexpress.e;
import com.bytedance.sdk.openadsdk.core.video.nativevideo.NativeVideoTsView;
import com.bytedance.sdk.openadsdk.utils.u;

/* compiled from: ClickCreativeListener */
public class a extends b {
    private boolean F = false;
    private boolean G = false;
    private int H;

    /* renamed from: a  reason: collision with root package name */
    private boolean f935a = true;

    public boolean b() {
        return false;
    }

    public boolean c() {
        return false;
    }

    public a(Context context, n nVar, String str, int i) {
        super(context, nVar, str, i);
    }

    public void a(boolean z) {
        this.f935a = z;
    }

    public void b(boolean z) {
        this.F = z;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:103:0x0208, code lost:
        if ((r2 instanceof com.bytedance.sdk.openadsdk.core.video.nativevideo.NativeVideoTsView) == false) goto L_0x020a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:105:0x0220, code lost:
        if (((java.lang.Boolean) r2.getTag(com.bytedance.sdk.component.utils.t.e(com.bytedance.sdk.openadsdk.core.m.a(), "tt_id_is_video_picture"))).booleanValue() != false) goto L_0x0222;
     */
    /* JADX WARNING: Removed duplicated region for block: B:117:0x0268  */
    /* JADX WARNING: Removed duplicated region for block: B:119:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a(android.view.View r24, float r25, float r26, float r27, float r28, android.util.SparseArray<com.bytedance.sdk.openadsdk.core.b.c.a> r29, boolean r30) {
        /*
            r23 = this;
            r11 = r23
            r10 = r24
            r9 = r30
            r2 = 2
            r0 = r23
            r1 = r24
            r3 = r25
            r4 = r26
            r5 = r27
            r6 = r28
            r7 = r29
            r8 = r30
            boolean r0 = r0.a(r1, r2, r3, r4, r5, r6, r7, r8)
            if (r0 == 0) goto L_0x001e
            return
        L_0x001e:
            boolean r0 = r23.i()
            java.lang.String r1 = "ClickCreativeListener"
            if (r0 == 0) goto L_0x0039
            boolean r0 = r23.d(r24)
            if (r0 == 0) goto L_0x0039
            boolean r0 = r11.G
            if (r0 != 0) goto L_0x0039
            java.lang.String r0 = "Intercept the native video view , Select the normal click event....."
            com.bytedance.sdk.component.utils.l.b((java.lang.String) r1, (java.lang.String) r0)
            super.a(r24, r25, r26, r27, r28, r29, r30)
            return
        L_0x0039:
            java.lang.String r0 = "Select creative area click event....."
            com.bytedance.sdk.component.utils.l.b((java.lang.String) r1, (java.lang.String) r0)
            android.content.Context r0 = r11.f939b
            if (r0 != 0) goto L_0x0048
            android.content.Context r0 = com.bytedance.sdk.openadsdk.core.m.a()
            r11.f939b = r0
        L_0x0048:
            android.content.Context r0 = r11.f939b
            if (r0 != 0) goto L_0x004d
            return
        L_0x004d:
            boolean r0 = r11.a(r10, r9)
            if (r0 != 0) goto L_0x0054
            return
        L_0x0054:
            org.json.JSONObject r0 = com.bytedance.sdk.openadsdk.core.nativeexpress.NativeExpressView.a((android.view.View) r24)
            com.bytedance.sdk.openadsdk.core.e.j r1 = r11.f940c
            r18 = -1
            if (r1 == 0) goto L_0x006b
            com.bytedance.sdk.openadsdk.core.e.j r0 = r11.f940c
            int r0 = r0.l
            com.bytedance.sdk.openadsdk.core.e.j r1 = r11.f940c
            org.json.JSONObject r1 = r1.m
            r16 = r0
            r17 = r1
            goto L_0x006f
        L_0x006b:
            r17 = r0
            r16 = -1
        L_0x006f:
            long r6 = r11.w
            long r4 = r11.x
            java.lang.ref.WeakReference r0 = r11.f944g
            if (r0 != 0) goto L_0x007c
            android.view.View r0 = r23.d()
            goto L_0x0084
        L_0x007c:
            java.lang.ref.WeakReference r0 = r11.f944g
            java.lang.Object r0 = r0.get()
            android.view.View r0 = (android.view.View) r0
        L_0x0084:
            r19 = r0
            java.lang.ref.WeakReference r0 = r11.f945h
            if (r0 != 0) goto L_0x008f
            android.view.View r0 = r23.e()
            goto L_0x0097
        L_0x008f:
            java.lang.ref.WeakReference r0 = r11.f945h
            java.lang.Object r0 = r0.get()
            android.view.View r0 = (android.view.View) r0
        L_0x0097:
            r20 = r0
            java.lang.String r12 = r23.f()
            android.content.Context r0 = r11.f939b
            float r13 = com.bytedance.sdk.openadsdk.utils.v.e((android.content.Context) r0)
            android.content.Context r0 = r11.f939b
            int r14 = com.bytedance.sdk.openadsdk.utils.v.g(r0)
            android.content.Context r0 = r11.f939b
            float r15 = com.bytedance.sdk.openadsdk.utils.v.f((android.content.Context) r0)
            r0 = r23
            r1 = r25
            r2 = r26
            r3 = r27
            r21 = r4
            r4 = r28
            r5 = r29
            r8 = r21
            r10 = r19
            r11 = r20
            com.bytedance.sdk.openadsdk.core.e.g r0 = r0.a(r1, r2, r3, r4, r5, r6, r8, r10, r11, r12, r13, r14, r15, r16, r17)
            r1 = r23
            r1.i = r0
            com.bytedance.sdk.openadsdk.core.e.n r0 = r1.f941d
            int r0 = r0.L()
            r2 = 4
            r3 = 3
            r4 = 1
            r5 = 2
            if (r0 == r5) goto L_0x0191
            if (r0 == r3) goto L_0x0191
            if (r0 == r2) goto L_0x0125
            r2 = 5
            if (r0 == r2) goto L_0x00e3
            r2 = r24
            r0 = -1
            goto L_0x0264
        L_0x00e3:
            java.lang.String r2 = r1.f942e
            java.lang.String r10 = r1.b((java.lang.String) r2)
            boolean r2 = android.text.TextUtils.isEmpty(r10)
            if (r2 != 0) goto L_0x0102
            android.content.Context r6 = r1.f939b
            com.bytedance.sdk.openadsdk.core.e.n r8 = r1.f941d
            com.bytedance.sdk.openadsdk.core.e.g r9 = r1.i
            r11 = 1
            java.util.Map r12 = r1.o
            if (r30 == 0) goto L_0x00fc
            r13 = 1
            goto L_0x00fd
        L_0x00fc:
            r13 = 2
        L_0x00fd:
            java.lang.String r7 = "click_call"
            com.bytedance.sdk.openadsdk.b.e.a((android.content.Context) r6, (java.lang.String) r7, (com.bytedance.sdk.openadsdk.core.e.n) r8, (com.bytedance.sdk.openadsdk.core.e.g) r9, (java.lang.String) r10, (boolean) r11, (java.util.Map<java.lang.String, java.lang.Object>) r12, (int) r13)
        L_0x0102:
            android.content.Context r2 = r24.getContext()
            com.bytedance.sdk.openadsdk.core.e.n r3 = r1.f941d
            java.lang.String r3 = r3.Q()
            boolean r11 = com.bytedance.sdk.openadsdk.utils.u.d(r2, r3)
            android.content.Context r6 = r1.f939b
            com.bytedance.sdk.openadsdk.core.e.n r8 = r1.f941d
            com.bytedance.sdk.openadsdk.core.e.g r9 = r1.i
            java.lang.String r10 = r1.f942e
            java.util.Map r12 = r1.o
            if (r30 == 0) goto L_0x011e
            r13 = 1
            goto L_0x011f
        L_0x011e:
            r13 = 2
        L_0x011f:
            java.lang.String r7 = "click"
            com.bytedance.sdk.openadsdk.b.e.a((android.content.Context) r6, (java.lang.String) r7, (com.bytedance.sdk.openadsdk.core.e.n) r8, (com.bytedance.sdk.openadsdk.core.e.g) r9, (java.lang.String) r10, (boolean) r11, (java.util.Map<java.lang.String, java.lang.Object>) r12, (int) r13)
            goto L_0x018d
        L_0x0125:
            com.bytedance.sdk.openadsdk.core.e.n r2 = r1.f941d
            boolean r2 = com.bytedance.sdk.openadsdk.core.e.p.a((com.bytedance.sdk.openadsdk.core.e.n) r2)
            if (r2 == 0) goto L_0x016b
            com.bytedance.sdk.openadsdk.TTNativeAd r2 = r1.k
            if (r2 != 0) goto L_0x0135
            com.bytedance.sdk.openadsdk.TTNativeExpressAd r2 = r1.p
            if (r2 == 0) goto L_0x016b
        L_0x0135:
            android.content.Context r6 = r1.f939b
            com.bytedance.sdk.openadsdk.core.e.n r7 = r1.f941d
            int r8 = r1.f943f
            com.bytedance.sdk.openadsdk.TTNativeAd r9 = r1.k
            com.bytedance.sdk.openadsdk.TTNativeExpressAd r10 = r1.p
            java.lang.String r11 = r1.f942e
            com.com.bytedance.overseas.sdk.a.c r12 = r1.n
            r13 = 1
            boolean r19 = com.bytedance.sdk.openadsdk.core.y.a((android.content.Context) r6, (com.bytedance.sdk.openadsdk.core.e.n) r7, (int) r8, (com.bytedance.sdk.openadsdk.TTNativeAd) r9, (com.bytedance.sdk.openadsdk.TTNativeExpressAd) r10, (java.lang.String) r11, (com.com.bytedance.overseas.sdk.a.c) r12, (boolean) r13)
            boolean r2 = r1.f935a
            if (r2 == 0) goto L_0x018d
            android.content.Context r14 = r1.f939b
            com.bytedance.sdk.openadsdk.core.e.n r2 = r1.f941d
            com.bytedance.sdk.openadsdk.core.e.g r3 = r1.i
            java.lang.String r6 = r1.f942e
            java.util.Map r7 = r1.o
            if (r30 == 0) goto L_0x015b
            r21 = 1
            goto L_0x015d
        L_0x015b:
            r21 = 2
        L_0x015d:
            java.lang.String r15 = "click"
            r16 = r2
            r17 = r3
            r18 = r6
            r20 = r7
            com.bytedance.sdk.openadsdk.b.e.a((android.content.Context) r14, (java.lang.String) r15, (com.bytedance.sdk.openadsdk.core.e.n) r16, (com.bytedance.sdk.openadsdk.core.e.g) r17, (java.lang.String) r18, (boolean) r19, (java.util.Map<java.lang.String, java.lang.Object>) r20, (int) r21)
            goto L_0x018d
        L_0x016b:
            com.com.bytedance.overseas.sdk.a.c r2 = r1.n
            if (r2 == 0) goto L_0x018d
            com.com.bytedance.overseas.sdk.a.c r2 = r1.n
            r2.d()
            boolean r2 = r1.f935a
            if (r2 == 0) goto L_0x018d
            android.content.Context r6 = r1.f939b
            com.bytedance.sdk.openadsdk.core.e.n r8 = r1.f941d
            com.bytedance.sdk.openadsdk.core.e.g r9 = r1.i
            java.lang.String r10 = r1.f942e
            r11 = 1
            java.util.Map r12 = r1.o
            if (r30 == 0) goto L_0x0187
            r13 = 1
            goto L_0x0188
        L_0x0187:
            r13 = 2
        L_0x0188:
            java.lang.String r7 = "click"
            com.bytedance.sdk.openadsdk.b.e.a((android.content.Context) r6, (java.lang.String) r7, (com.bytedance.sdk.openadsdk.core.e.n) r8, (com.bytedance.sdk.openadsdk.core.e.g) r9, (java.lang.String) r10, (boolean) r11, (java.util.Map<java.lang.String, java.lang.Object>) r12, (int) r13)
        L_0x018d:
            r2 = r24
            goto L_0x0264
        L_0x0191:
            if (r0 != r3) goto L_0x01d4
            com.bytedance.sdk.openadsdk.core.e.n r3 = r1.f941d
            java.lang.String r3 = r3.O()
            boolean r6 = android.text.TextUtils.isEmpty(r3)
            if (r6 != 0) goto L_0x01d4
            java.lang.String r6 = "play.google.com/store/apps/details?id="
            boolean r6 = r3.contains(r6)
            if (r6 == 0) goto L_0x01d4
            java.lang.String r6 = "?id="
            int r6 = r3.indexOf(r6)
            int r6 = r6 + r2
            java.lang.String r2 = r3.substring(r6)
            android.content.Context r3 = r1.f939b
            boolean r2 = com.com.bytedance.overseas.sdk.a.b.b(r3, r2)
            if (r2 == 0) goto L_0x01d4
            boolean r2 = r1.f935a
            if (r2 == 0) goto L_0x018d
            android.content.Context r6 = r1.f939b
            com.bytedance.sdk.openadsdk.core.e.n r8 = r1.f941d
            com.bytedance.sdk.openadsdk.core.e.g r9 = r1.i
            java.lang.String r10 = r1.f942e
            r11 = 1
            java.util.Map r12 = r1.o
            if (r30 == 0) goto L_0x01cd
            r13 = 1
            goto L_0x01ce
        L_0x01cd:
            r13 = 2
        L_0x01ce:
            java.lang.String r7 = "click"
            com.bytedance.sdk.openadsdk.b.e.a((android.content.Context) r6, (java.lang.String) r7, (com.bytedance.sdk.openadsdk.core.e.n) r8, (com.bytedance.sdk.openadsdk.core.e.g) r9, (java.lang.String) r10, (boolean) r11, (java.util.Map<java.lang.String, java.lang.Object>) r12, (int) r13)
            goto L_0x018d
        L_0x01d4:
            com.bytedance.sdk.openadsdk.TTNativeAd r2 = r1.k
            if (r2 != 0) goto L_0x01e0
            boolean r2 = r1.F
            if (r2 == 0) goto L_0x01dd
            goto L_0x01e0
        L_0x01dd:
            r2 = r24
            goto L_0x01f6
        L_0x01e0:
            android.content.Context r6 = r1.f939b
            com.bytedance.sdk.openadsdk.core.e.n r8 = r1.f941d
            com.bytedance.sdk.openadsdk.core.e.g r9 = r1.i
            java.lang.String r10 = r1.f942e
            r11 = 1
            java.util.Map r12 = r1.o
            if (r30 == 0) goto L_0x01ef
            r13 = 1
            goto L_0x01f0
        L_0x01ef:
            r13 = 2
        L_0x01f0:
            java.lang.String r7 = "click_button"
            com.bytedance.sdk.openadsdk.b.e.a((android.content.Context) r6, (java.lang.String) r7, (com.bytedance.sdk.openadsdk.core.e.n) r8, (com.bytedance.sdk.openadsdk.core.e.g) r9, (java.lang.String) r10, (boolean) r11, (java.util.Map<java.lang.String, java.lang.Object>) r12, (int) r13)
            goto L_0x01dd
        L_0x01f6:
            if (r2 == 0) goto L_0x020a
            int r3 = r24.getId()     // Catch:{ Exception -> 0x0226 }
            android.content.Context r6 = r1.f939b     // Catch:{ Exception -> 0x0226 }
            java.lang.String r7 = "tt_root_view"
            int r6 = com.bytedance.sdk.component.utils.t.e(r6, r7)     // Catch:{ Exception -> 0x0226 }
            if (r3 == r6) goto L_0x0222
            boolean r3 = r2 instanceof com.bytedance.sdk.openadsdk.core.video.nativevideo.NativeVideoTsView     // Catch:{ Exception -> 0x0226 }
            if (r3 != 0) goto L_0x0222
        L_0x020a:
            android.content.Context r3 = com.bytedance.sdk.openadsdk.core.m.a()     // Catch:{ Exception -> 0x0226 }
            java.lang.String r6 = "tt_id_is_video_picture"
            int r3 = com.bytedance.sdk.component.utils.t.e(r3, r6)     // Catch:{ Exception -> 0x0226 }
            java.lang.Object r3 = r2.getTag(r3)     // Catch:{ Exception -> 0x0226 }
            java.lang.Boolean r3 = (java.lang.Boolean) r3     // Catch:{ Exception -> 0x0226 }
            java.lang.Boolean r3 = (java.lang.Boolean) r3     // Catch:{ Exception -> 0x0226 }
            boolean r3 = r3.booleanValue()     // Catch:{ Exception -> 0x0226 }
            if (r3 == 0) goto L_0x0227
        L_0x0222:
            com.bytedance.sdk.openadsdk.core.y.a(r4)     // Catch:{ Exception -> 0x0226 }
            goto L_0x0227
        L_0x0226:
        L_0x0227:
            android.content.Context r6 = r1.f939b
            com.bytedance.sdk.openadsdk.core.e.n r7 = r1.f941d
            int r8 = r1.f943f
            com.bytedance.sdk.openadsdk.TTNativeAd r9 = r1.k
            com.bytedance.sdk.openadsdk.TTNativeExpressAd r10 = r1.p
            int r3 = r1.f943f
            java.lang.String r11 = com.bytedance.sdk.openadsdk.utils.u.a((int) r3)
            com.com.bytedance.overseas.sdk.a.c r12 = r1.n
            r13 = 1
            boolean r19 = com.bytedance.sdk.openadsdk.core.y.a((android.content.Context) r6, (com.bytedance.sdk.openadsdk.core.e.n) r7, (int) r8, (com.bytedance.sdk.openadsdk.TTNativeAd) r9, (com.bytedance.sdk.openadsdk.TTNativeExpressAd) r10, (java.lang.String) r11, (com.com.bytedance.overseas.sdk.a.c) r12, (boolean) r13)
            r3 = 0
            com.bytedance.sdk.openadsdk.core.y.a(r3)
            boolean r3 = r1.f935a
            if (r3 == 0) goto L_0x0264
            android.content.Context r14 = r1.f939b
            com.bytedance.sdk.openadsdk.core.e.n r3 = r1.f941d
            com.bytedance.sdk.openadsdk.core.e.g r6 = r1.i
            java.lang.String r7 = r1.f942e
            java.util.Map r8 = r1.o
            if (r30 == 0) goto L_0x0255
            r21 = 1
            goto L_0x0257
        L_0x0255:
            r21 = 2
        L_0x0257:
            java.lang.String r15 = "click"
            r16 = r3
            r17 = r6
            r18 = r7
            r20 = r8
            com.bytedance.sdk.openadsdk.b.e.a((android.content.Context) r14, (java.lang.String) r15, (com.bytedance.sdk.openadsdk.core.e.n) r16, (com.bytedance.sdk.openadsdk.core.e.g) r17, (java.lang.String) r18, (boolean) r19, (java.util.Map<java.lang.String, java.lang.Object>) r20, (int) r21)
        L_0x0264:
            com.bytedance.sdk.openadsdk.core.b.b$a r3 = r1.j
            if (r3 == 0) goto L_0x026d
            com.bytedance.sdk.openadsdk.core.b.b$a r3 = r1.j
            r3.a(r2, r0)
        L_0x026d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.core.b.a.a(android.view.View, float, float, float, float, android.util.SparseArray, boolean):void");
    }

    /* access modifiers changed from: protected */
    public boolean a() {
        if (this.f941d == null) {
            return true;
        }
        int c2 = m.h().c(u.f(this.f941d));
        int c3 = o.c(m.a());
        if (c2 == 1) {
            return u.e(c3);
        }
        if (c2 != 2) {
            if (c2 == 3) {
                return false;
            }
            if (c2 == 5 && !u.e(c3) && !u.g(c3)) {
                return false;
            }
            return true;
        } else if (u.f(c3) || u.e(c3) || u.g(c3)) {
            return true;
        } else {
            return false;
        }
    }

    private boolean g() {
        return n.c(this.f941d) && this.f941d.p() == 1;
    }

    private boolean d(View view) {
        if (view == null) {
            return false;
        }
        if (view instanceof NativeVideoTsView) {
            l.c("ClickCreativeListener", "NativeVideoTsView....");
            return true;
        } else if (view.getId() == t.e(this.f939b, "tt_video_ad_cover_center_layout") || view.getId() == t.e(this.f939b, "tt_video_ad_logo_image") || view.getId() == t.e(this.f939b, "tt_video_btn_ad_image_tv") || view.getId() == t.e(this.f939b, "tt_video_ad_name") || view.getId() == t.e(this.f939b, "tt_video_ad_button")) {
            l.c("ClickCreativeListener", "tt_video_ad_cover_center_layout....");
            return true;
        } else if (view.getId() == t.e(this.f939b, "tt_root_view") || view.getId() == t.e(this.f939b, "tt_video_play")) {
            l.c("ClickCreativeListener", "tt_root_view....");
            return true;
        } else if (!(view instanceof ViewGroup)) {
            return false;
        } else {
            int i = 0;
            while (true) {
                ViewGroup viewGroup = (ViewGroup) view;
                if (i >= viewGroup.getChildCount()) {
                    return false;
                }
                if (d(viewGroup.getChildAt(i))) {
                    return true;
                }
                i++;
            }
        }
    }

    private boolean h() {
        return this instanceof e;
    }

    private boolean i() {
        if (this.f941d == null || h()) {
            return false;
        }
        if (this.f941d.ad() != 5 && this.f941d.ad() != 15) {
            return false;
        }
        if (this.H == 0) {
            this.H = u.e(this.f941d);
        }
        StringBuilder sb = new StringBuilder();
        sb.append("!isViewVisibility()=");
        sb.append(!b());
        sb.append(",isAutoPlay()=");
        sb.append(a());
        sb.append(",!isCoverPageVisibility()=");
        sb.append(!c());
        l.b("ClickCreativeListener", sb.toString());
        if (this.H == 5 && g() && a() && !b() && !c()) {
            return false;
        }
        int i = this.H;
        if (i == 1 || i == 2 || i == 5) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private java.lang.String b(java.lang.String r8) {
        /*
            r7 = this;
            int r0 = r8.hashCode()
            java.lang.String r1 = "open_ad"
            r2 = 5
            r3 = 4
            r4 = 3
            r5 = 2
            r6 = 1
            switch(r0) {
                case -1695837674: goto L_0x003f;
                case -1263194568: goto L_0x0037;
                case -712491894: goto L_0x002d;
                case 1844104722: goto L_0x0023;
                case 1912999166: goto L_0x0019;
                case 2091589896: goto L_0x000f;
                default: goto L_0x000e;
            }
        L_0x000e:
            goto L_0x0049
        L_0x000f:
            java.lang.String r0 = "slide_banner_ad"
            boolean r8 = r8.equals(r0)
            if (r8 == 0) goto L_0x0049
            r8 = 3
            goto L_0x004a
        L_0x0019:
            java.lang.String r0 = "draw_ad"
            boolean r8 = r8.equals(r0)
            if (r8 == 0) goto L_0x0049
            r8 = 1
            goto L_0x004a
        L_0x0023:
            java.lang.String r0 = "interaction"
            boolean r8 = r8.equals(r0)
            if (r8 == 0) goto L_0x0049
            r8 = 4
            goto L_0x004a
        L_0x002d:
            java.lang.String r0 = "embeded_ad"
            boolean r8 = r8.equals(r0)
            if (r8 == 0) goto L_0x0049
            r8 = 0
            goto L_0x004a
        L_0x0037:
            boolean r8 = r8.equals(r1)
            if (r8 == 0) goto L_0x0049
            r8 = 5
            goto L_0x004a
        L_0x003f:
            java.lang.String r0 = "banner_ad"
            boolean r8 = r8.equals(r0)
            if (r8 == 0) goto L_0x0049
            r8 = 2
            goto L_0x004a
        L_0x0049:
            r8 = -1
        L_0x004a:
            if (r8 == 0) goto L_0x0060
            if (r8 == r6) goto L_0x0060
            java.lang.String r0 = "banner_call"
            if (r8 == r5) goto L_0x005f
            if (r8 == r4) goto L_0x005f
            if (r8 == r3) goto L_0x005c
            if (r8 == r2) goto L_0x005b
            java.lang.String r8 = ""
            return r8
        L_0x005b:
            return r1
        L_0x005c:
            java.lang.String r8 = "interaction_call"
            return r8
        L_0x005f:
            return r0
        L_0x0060:
            java.lang.String r8 = "feed_call"
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.core.b.a.b(java.lang.String):java.lang.String");
    }

    public void c(boolean z) {
        this.G = z;
    }
}
