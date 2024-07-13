package com.bytedance.sdk.openadsdk.core.b;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.View;
import com.appodeal.ads.modules.common.internal.Constants;
import com.bykv.vk.openvk.component.video.api.d.c;
import com.bytedance.sdk.component.utils.t;
import com.bytedance.sdk.openadsdk.TTNativeAd;
import com.bytedance.sdk.openadsdk.TTNativeExpressAd;
import com.bytedance.sdk.openadsdk.b.e;
import com.bytedance.sdk.openadsdk.core.b.c;
import com.bytedance.sdk.openadsdk.core.e.g;
import com.bytedance.sdk.openadsdk.core.e.j;
import com.bytedance.sdk.openadsdk.core.e.n;
import com.bytedance.sdk.openadsdk.core.e.p;
import com.bytedance.sdk.openadsdk.core.h;
import com.bytedance.sdk.openadsdk.core.m;
import com.bytedance.sdk.openadsdk.core.y;
import com.bytedance.sdk.openadsdk.utils.u;
import com.bytedance.sdk.openadsdk.utils.v;
import com.com.bytedance.overseas.sdk.a.d;
import java.lang.ref.WeakReference;
import java.util.Map;
import org.json.JSONObject;

/* compiled from: ClickListener */
public class b extends c {
    private WeakReference<Activity> F;
    private boolean G;

    /* renamed from: a  reason: collision with root package name */
    private String f938a;

    /* renamed from: b  reason: collision with root package name */
    protected Context f939b;

    /* renamed from: c  reason: collision with root package name */
    public j f940c;

    /* renamed from: d  reason: collision with root package name */
    protected final n f941d;

    /* renamed from: e  reason: collision with root package name */
    protected final String f942e;

    /* renamed from: f  reason: collision with root package name */
    protected final int f943f;

    /* renamed from: g  reason: collision with root package name */
    protected WeakReference<View> f944g;

    /* renamed from: h  reason: collision with root package name */
    protected WeakReference<View> f945h;
    protected g i;
    protected a j;
    protected TTNativeAd k;
    protected c l;
    protected boolean m;
    protected com.com.bytedance.overseas.sdk.a.c n;
    protected Map<String, Object> o;
    protected TTNativeExpressAd p;
    protected com.bytedance.sdk.openadsdk.core.nativeexpress.a q;
    protected int r;

    /* compiled from: ClickListener */
    public interface a {
        void a(View view, int i);
    }

    public void a(com.com.bytedance.overseas.sdk.a.c cVar) {
        this.n = cVar;
    }

    public void a(com.bytedance.sdk.openadsdk.core.nativeexpress.a aVar) {
        this.q = aVar;
    }

    public void a(TTNativeAd tTNativeAd) {
        this.k = tTNativeAd;
    }

    public void a(TTNativeExpressAd tTNativeExpressAd) {
        this.p = tTNativeExpressAd;
    }

    public void d(boolean z) {
        this.m = z;
    }

    public void a(c cVar) {
        this.l = cVar;
    }

    public b(Context context, n nVar, String str, int i2) {
        this.m = false;
        this.r = 0;
        this.G = false;
        this.f939b = context;
        this.f941d = nVar;
        this.f942e = str;
        this.f943f = i2;
    }

    public b(Context context, n nVar, String str, int i2, boolean z) {
        this(context, nVar, str, i2);
        this.G = z;
    }

    public void a(a aVar) {
        this.j = aVar;
    }

    public void a(Activity activity) {
        if (activity != null) {
            this.F = new WeakReference<>(activity);
        }
    }

    public void a(View view) {
        if (view != null) {
            this.f944g = new WeakReference<>(view);
        }
    }

    public void b(View view) {
        if (view != null) {
            this.f945h = new WeakReference<>(view);
        }
    }

    public View d() {
        WeakReference<Activity> weakReference = this.F;
        if (weakReference == null || weakReference.get() == null) {
            return null;
        }
        return ((Activity) this.F.get()).findViewById(16908290);
    }

    public View e() {
        WeakReference<Activity> weakReference = this.F;
        if (weakReference == null || weakReference.get() == null) {
            return null;
        }
        return ((Activity) this.F.get()).findViewById(t.e(m.a(), "tt_top_dislike"));
    }

    public void a(Map<String, Object> map) {
        this.o = map;
    }

    public void a(int i2) {
        this.A = i2;
    }

    public void b(int i2) {
        this.z = i2;
    }

    public void c(int i2) {
        this.y = i2;
    }

    public void d(int i2) {
        this.r = i2;
    }

    public void a(View view, float f2, float f3, float f4, float f5, SparseArray<c.a> sparseArray, boolean z) {
        JSONObject jSONObject;
        int i2;
        View view2;
        View view3;
        n nVar;
        View view4 = view;
        boolean z2 = z;
        if (this.f939b == null) {
            this.f939b = m.a();
        }
        if ((this.G || !a(view, 1, f2, f3, f4, f5, sparseArray, z)) && this.f939b != null) {
            j jVar = this.f940c;
            if (jVar != null) {
                i2 = jVar.l;
                jSONObject = this.f940c.m;
            } else {
                jSONObject = null;
                i2 = -1;
            }
            long j2 = this.w;
            long j3 = this.x;
            WeakReference<View> weakReference = this.f944g;
            if (weakReference == null) {
                view2 = null;
            } else {
                view2 = (View) weakReference.get();
            }
            WeakReference<View> weakReference2 = this.f945h;
            if (weakReference2 == null) {
                view3 = null;
            } else {
                view3 = (View) weakReference2.get();
            }
            g a2 = a(f2, f3, f4, f5, sparseArray, j2, j3, view2, view3, f(), v.e(this.f939b), v.g(this.f939b), v.f(this.f939b), i2, jSONObject);
            this.i = a2;
            if (this.G) {
                e.a(this.f939b, Constants.CLICK, this.f941d, a2, this.f942e, true, this.o, z ? 1 : 2);
                return;
            }
            boolean z3 = z;
            a aVar = this.j;
            View view5 = view;
            if (aVar != null) {
                aVar.a(view5, -1);
            }
            if (a(view5, z3)) {
                boolean a3 = p.a(this.f941d);
                String a4 = a3 ? this.f942e : u.a(this.f943f);
                if (view5 != null) {
                    try {
                        if (((Boolean) view5.getTag(t.e(m.a(), "tt_id_is_video_picture"))).booleanValue()) {
                            y.a(true);
                        }
                    } catch (Exception unused) {
                    }
                }
                boolean a5 = y.a(this.f939b, this.f941d, this.f943f, this.k, this.p, a4, this.n, a3);
                y.a(false);
                if (a5 || (nVar = this.f941d) == null || nVar.ab() == null || this.f941d.ab().c() != 2) {
                    n nVar2 = this.f941d;
                    if (nVar2 != null && !a5 && TextUtils.isEmpty(nVar2.O()) && com.bytedance.sdk.openadsdk.b.b.a(this.f942e)) {
                        d.a(this.f939b, this.f941d, this.f942e).d();
                    }
                    e.a(this.f939b, Constants.CLICK, this.f941d, this.i, this.f942e, a5, this.o, z3 ? 1 : 2);
                }
            }
        }
    }

    public boolean a(View view, boolean z) {
        return a(view, this.f941d, z);
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x004f A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean a(android.view.View r4, com.bytedance.sdk.openadsdk.core.e.n r5, boolean r6) {
        /*
            r0 = 1
            if (r4 == 0) goto L_0x004f
            if (r5 != 0) goto L_0x0006
            goto L_0x004f
        L_0x0006:
            android.content.Context r1 = com.bytedance.sdk.openadsdk.core.m.a()
            java.lang.String r2 = "tt_id_click_tag"
            int r1 = com.bytedance.sdk.component.utils.t.e(r1, r2)
            java.lang.Object r1 = r4.getTag(r1)
            java.lang.String r1 = java.lang.String.valueOf(r1)
            android.content.Context r3 = com.bytedance.sdk.openadsdk.core.m.a()
            int r2 = com.bytedance.sdk.component.utils.t.e(r3, r2)
            java.lang.Object r2 = r4.getTag(r2)
            if (r2 == 0) goto L_0x0036
            boolean r2 = android.text.TextUtils.isEmpty(r1)
            if (r2 != 0) goto L_0x0036
            java.lang.String r4 = "click"
            boolean r4 = r4.equals(r1)
            if (r4 == 0) goto L_0x0035
            return r6
        L_0x0035:
            return r0
        L_0x0036:
            boolean r4 = c((android.view.View) r4)
            r1 = 0
            if (r4 == 0) goto L_0x0046
            int r4 = r5.i()
            if (r4 != r0) goto L_0x004f
            if (r6 != 0) goto L_0x004f
            return r1
        L_0x0046:
            int r4 = r5.h()
            if (r4 != r0) goto L_0x004f
            if (r6 != 0) goto L_0x004f
            return r1
        L_0x004f:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.core.b.b.a(android.view.View, com.bytedance.sdk.openadsdk.core.e.n, boolean):boolean");
    }

    /* access modifiers changed from: protected */
    public g a(float f2, float f3, float f4, float f5, SparseArray<c.a> sparseArray, long j2, long j3, View view, View view2, String str, float f6, int i2, float f7, int i3, JSONObject jSONObject) {
        float f8 = f2;
        float f9 = f3;
        float f10 = f4;
        float f11 = f5;
        long j4 = j2;
        long j5 = j3;
        SparseArray<c.a> sparseArray2 = sparseArray;
        return new g.a().f(f2).e(f3).d(f4).c(f5).b(j2).a(j3).b(v.a(view)).a(v.a(view2)).c(v.c(view)).d(v.c(view2)).d(this.y).e(this.z).f(this.A).a(sparseArray).b(h.d().b() ? 1 : 2).a(str).a(f6).c(i2).b(f7).a(i3).a(jSONObject).a();
    }

    /* access modifiers changed from: protected */
    public boolean a(View view, int i2, float f2, float f3, float f4, float f5, SparseArray<c.a> sparseArray, boolean z) {
        if (this.q == null) {
            return false;
        }
        int[] iArr = new int[2];
        int[] iArr2 = new int[2];
        WeakReference<View> weakReference = this.f945h;
        if (weakReference != null) {
            iArr = v.a((View) weakReference.get());
            iArr2 = v.c((View) this.f945h.get());
        }
        this.q.a(view, i2, new j.a().d(f2).c(f3).b(f4).a(f5).b(this.w).a(this.x).c(iArr[0]).d(iArr[1]).e(iArr2[0]).f(iArr2[1]).a(sparseArray).a(z).a());
        return true;
    }

    public static boolean c(View view) {
        return t.e(view.getContext(), "tt_reward_ad_download") == view.getId() || t.e(view.getContext(), "tt_reward_ad_download_backup") == view.getId() || t.e(view.getContext(), "tt_bu_download") == view.getId() || t.e(view.getContext(), "btn_native_creative") == view.getId() || t.e(view.getContext(), "tt_full_ad_download") == view.getId() || t.e(view.getContext(), "tt_playable_play") == view.getId();
    }

    public String f() {
        return this.f938a;
    }

    public void a(String str) {
        this.f938a = str;
    }
}
