package com.bytedance.sdk.openadsdk.core.nativeexpress;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import com.bytedance.sdk.component.adexpress.b.d;
import com.bytedance.sdk.component.adexpress.b.e;
import com.bytedance.sdk.component.adexpress.b.g;
import com.bytedance.sdk.component.adexpress.b.h;
import com.bytedance.sdk.component.adexpress.b.i;
import com.bytedance.sdk.component.adexpress.b.k;
import com.bytedance.sdk.component.adexpress.b.l;
import com.bytedance.sdk.component.adexpress.b.n;
import com.bytedance.sdk.component.adexpress.b.o;
import com.bytedance.sdk.component.adexpress.dynamic.c;
import com.bytedance.sdk.component.adexpress.dynamic.c.f;
import com.bytedance.sdk.component.adexpress.theme.ThemeStatusBroadcastReceiver;
import com.bytedance.sdk.component.widget.SSWebView;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.TTAdDislike;
import com.bytedance.sdk.openadsdk.TTAdSdk;
import com.bytedance.sdk.openadsdk.TTDislikeDialogAbstract;
import com.bytedance.sdk.openadsdk.TTNativeExpressAd;
import com.bytedance.sdk.openadsdk.b.j;
import com.bytedance.sdk.openadsdk.b.u;
import com.bytedance.sdk.openadsdk.core.b.c;
import com.bytedance.sdk.openadsdk.core.bannerexpress.a;
import com.bytedance.sdk.openadsdk.core.m;
import com.bytedance.sdk.openadsdk.core.w;
import com.bytedance.sdk.openadsdk.core.x;
import com.bytedance.sdk.openadsdk.dislike.b;
import io.bidmachine.utils.IabUtils;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

public class NativeExpressView extends FrameLayout implements g, n, c, j {
    public static int p = 500;
    private u A;
    private String B;
    private a.C0004a C;
    /* access modifiers changed from: private */
    public AtomicBoolean D = new AtomicBoolean(false);
    private b E;
    private final ViewTreeObserver.OnScrollChangedListener F = new ViewTreeObserver.OnScrollChangedListener() {
        public void onScrollChanged() {
            NativeExpressView.this.s();
            NativeExpressView nativeExpressView = NativeExpressView.this;
            nativeExpressView.removeCallbacks(nativeExpressView.G);
            NativeExpressView nativeExpressView2 = NativeExpressView.this;
            nativeExpressView2.postDelayed(nativeExpressView2.G, 500);
        }
    };
    /* access modifiers changed from: private */
    public final Runnable G = new Runnable() {
        public void run() {
            if (x.a(NativeExpressView.this, 0, 5)) {
                NativeExpressView nativeExpressView = NativeExpressView.this;
                nativeExpressView.d(nativeExpressView.getVisibility());
                return;
            }
            NativeExpressView.this.d(8);
        }
    };
    private final Runnable H = new Runnable() {
        public void run() {
            NativeExpressView.this.d(0);
        }
    };
    private final Runnable I = new Runnable() {
        public void run() {
            NativeExpressView.this.d(8);
        }
    };
    private ThemeStatusBroadcastReceiver J;
    private o K;
    private i.a L;
    private List<i> M;
    private o N;
    private e O;
    private h P;
    private l Q;
    private SparseArray<c.a> R = new SparseArray<>();
    private float S = -1.0f;
    private float T = -1.0f;
    private float U = -1.0f;
    private float V = -1.0f;
    private long W = 0;

    /* renamed from: a  reason: collision with root package name */
    private boolean f1404a = true;

    /* renamed from: b  reason: collision with root package name */
    private int f1405b = 0;

    /* renamed from: c  reason: collision with root package name */
    private b f1406c;

    /* renamed from: d  reason: collision with root package name */
    private TTDislikeDialogAbstract f1407d;

    /* renamed from: e  reason: collision with root package name */
    private TTNativeExpressAd.ExpressAdInteractionListener f1408e;

    /* renamed from: f  reason: collision with root package name */
    protected final Context f1409f;

    /* renamed from: g  reason: collision with root package name */
    protected String f1410g = "embeded_ad";

    /* renamed from: h  reason: collision with root package name */
    protected AdSlot f1411h;
    /* access modifiers changed from: protected */
    public com.bytedance.sdk.openadsdk.core.e.n i;
    protected TTNativeExpressAd.ExpressVideoAdListener j;
    protected FrameLayout k;
    protected boolean l;
    protected boolean m = false;
    protected com.bytedance.sdk.component.adexpress.b.c n;
    protected boolean o = false;
    public boolean q = false;
    public j r = new j();
    protected com.bytedance.sdk.component.adexpress.b.b s;
    public d<? extends View> t;
    private e u;
    private f v;
    private final AtomicBoolean w = new AtomicBoolean(false);
    private String x = null;
    private float y;
    private float z;

    public void a() {
    }

    public void a(int i2) {
    }

    public void a(boolean z2) {
    }

    public void b() {
    }

    public void b(int i2) {
    }

    public long c() {
        return 0;
    }

    public int d() {
        return 0;
    }

    public void e() {
    }

    public void f() {
    }

    public void setTimeUpdate(int i2) {
    }

    public j getAdShowTime() {
        return this.r;
    }

    public void setClosedListenerKey(String str) {
        this.B = str;
        b bVar = this.E;
        if (bVar != null) {
            bVar.a(str);
        }
    }

    public String getClosedListenerKey() {
        return this.B;
    }

    public void setBannerClickClosedListener(a.C0004a aVar) {
        this.C = aVar;
    }

    public NativeExpressView(Context context, com.bytedance.sdk.openadsdk.core.e.n nVar, AdSlot adSlot, String str) {
        super(context);
        this.f1410g = str;
        this.f1409f = context;
        this.i = nVar;
        this.f1411h = adSlot;
        this.q = false;
        g();
    }

    public NativeExpressView(Context context, com.bytedance.sdk.openadsdk.core.e.n nVar, AdSlot adSlot, String str, boolean z2) {
        super(context);
        this.f1410g = str;
        this.f1409f = context;
        this.i = nVar;
        this.f1411h = adSlot;
        this.q = z2;
        g();
    }

    /* access modifiers changed from: protected */
    public void g() {
        this.J = new ThemeStatusBroadcastReceiver();
        AdSlot adSlot = this.f1411h;
        if (adSlot != null) {
            this.y = adSlot.getExpressViewAcceptedWidth();
            this.z = this.f1411h.getExpressViewAcceptedHeight();
            this.x = this.f1411h.getCodeId();
        }
        setBackgroundColor(0);
        if (this.i.ay()) {
            this.E = new b(this.f1409f, this, this.i);
            return;
        }
        h();
        this.M = new ArrayList();
        o();
        o oVar = this.N;
        if (oVar != null) {
            this.K = (o) oVar.d();
        }
    }

    public SSWebView getWebView() {
        o oVar = this.K;
        if (oVar == null) {
            return null;
        }
        return oVar.a();
    }

    private void h() {
        long j2;
        JSONObject a2 = com.bytedance.sdk.openadsdk.core.nativeexpress.a.a.a(this.y, this.z, this.m, this.i);
        boolean z2 = true;
        u uVar = new u(1, this.f1410g, this.i);
        this.A = uVar;
        this.P = new i(uVar, this.f1410g, this.i, this.x);
        boolean z3 = false;
        try {
            j2 = new JSONObject(this.i.G().g()).optLong("render_delay_time");
            try {
                if (com.bytedance.sdk.openadsdk.core.e.n.c(this.i) || m.h().j(this.x) != 1) {
                    z2 = false;
                }
                z3 = z2;
            } catch (Exception unused) {
            }
        } catch (Exception unused2) {
            j2 = 0;
        }
        this.Q = new l.a().a(this.f1410g).b(this.i.Y()).c(com.bytedance.sdk.openadsdk.utils.u.i(this.i)).d(this.i.ac()).a(a2).a(this.P).a(m.h().m()).a(this.i.ap()).b(this.i.t()).a(Math.min(Math.max(j2, 0), 10000)).c(this.i.L()).a(com.bytedance.sdk.openadsdk.core.nativeexpress.a.a.b(this.i)).b(z3).a();
    }

    private void o() {
        if (w()) {
            p();
            return;
        }
        try {
            q();
            o oVar = new o(this.f1409f, this.Q, this.J, this.A, this.i);
            this.K = oVar;
            o oVar2 = new o(this.f1409f, this.Q, oVar, this);
            this.N = oVar2;
            this.M.add(oVar2);
        } catch (Exception e2) {
            com.bytedance.sdk.component.utils.l.c("NativeExpressView", "NativeExpressView dynamicRender fail", e2);
        }
        e eVar = new e(this.f1409f, this.Q, new l(this, this.J, this.Q));
        this.O = eVar;
        this.M.add(eVar);
        this.L = new k(this.M, this.P);
    }

    private void p() {
        this.f1405b = this.i.q();
        try {
            q();
            r();
        } catch (Exception e2) {
            com.bytedance.sdk.component.utils.l.c("NativeExpressView", "NativeExpressView dynamicRender fail", e2);
        }
        boolean z2 = true;
        if (this.i.r() != 1) {
            z2 = false;
        }
        this.f1404a = z2;
        if (z2) {
            e eVar = new e(this.f1409f, this.Q, new l(this, this.J, this.Q));
            this.O = eVar;
            this.M.add(eVar);
        }
        this.L = new k(this.M, this.P);
    }

    private void q() {
        if (!TTAdSdk.isInitSuccess()) {
            com.bytedance.sdk.openadsdk.core.k.b();
        }
    }

    private void r() {
        com.bytedance.sdk.openadsdk.core.c.b.a aVar = new com.bytedance.sdk.openadsdk.core.c.b.a();
        int i2 = this.f1405b;
        if (i2 == 1) {
            com.bytedance.sdk.component.adexpress.b.b bVar = new com.bytedance.sdk.component.adexpress.b.b(this.f1409f, this.Q, this.J, this.q, new f(this.f1409f, com.bytedance.sdk.openadsdk.core.c.a.a(this.Q, this.i)), this, aVar);
            this.s = bVar;
            this.M.add(bVar);
        } else if (i2 == 2) {
            f fVar = new f(this.f1409f, com.bytedance.sdk.openadsdk.core.c.a.a(this.Q, this.i));
            o oVar = new o(this.f1409f, this.Q, this.J, this.A, this.i);
            this.K = oVar;
            this.N = new o(this.f1409f, this.Q, oVar, this);
            this.s = new com.bytedance.sdk.component.adexpress.b.b(this.f1409f, this.Q, this.J, this.q, fVar, this, aVar);
            this.M.add(this.N);
            this.M.add(this.s);
        } else if (i2 != 3) {
            o oVar2 = new o(this.f1409f, this.Q, this.J, this.A, this.i);
            this.K = oVar2;
            o oVar3 = new o(this.f1409f, this.Q, oVar2, this);
            this.N = oVar3;
            this.M.add(oVar3);
        } else {
            com.bytedance.sdk.component.adexpress.b.b bVar2 = new com.bytedance.sdk.component.adexpress.b.b(this.f1409f, this.Q, this.J, this.q, new com.bytedance.sdk.component.adexpress.dynamic.c.h(), this, aVar);
            this.s = bVar2;
            this.M.add(bVar2);
        }
    }

    public void setVideoAdListener(TTNativeExpressAd.ExpressVideoAdListener expressVideoAdListener) {
        this.j = expressVideoAdListener;
    }

    public void setOuterDislike(TTDislikeDialogAbstract tTDislikeDialogAbstract) {
        BackupView backupView;
        d<? extends View> dVar = this.t;
        if (!(dVar == null || !(dVar instanceof l) || (backupView = (BackupView) dVar.e()) == null)) {
            backupView.setDislikeOuter(tTDislikeDialogAbstract);
        }
        b bVar = this.E;
        if (bVar != null) {
            bVar.a(tTDislikeDialogAbstract);
        }
        this.f1407d = tTDislikeDialogAbstract;
    }

    public void setDislike(b bVar) {
        BackupView backupView;
        d<? extends View> dVar = this.t;
        if (!(dVar == null || !(dVar instanceof l) || (backupView = (BackupView) dVar.e()) == null)) {
            backupView.setDislikeInner(bVar);
        }
        b bVar2 = this.E;
        if (bVar2 != null) {
            bVar2.a((TTAdDislike) bVar);
        }
        this.f1406c = bVar;
    }

    public void setExpressInteractionListener(TTNativeExpressAd.ExpressAdInteractionListener expressAdInteractionListener) {
        this.f1408e = expressAdInteractionListener;
    }

    public void setClickCreativeListener(e eVar) {
        this.u = eVar;
    }

    public e getClickCreativeListener() {
        return this.u;
    }

    public f getClickListener() {
        return this.v;
    }

    public void setClickListener(f fVar) {
        this.v = fVar;
    }

    public void setBackupListener(com.bytedance.sdk.component.adexpress.b.c cVar) {
        this.n = cVar;
        e eVar = this.O;
        if (eVar != null) {
            eVar.a(cVar);
        }
    }

    public void i() {
        d<? extends View> dVar = this.t;
        if ((dVar instanceof o) && dVar != null) {
            ((o) dVar).j();
        }
    }

    public void d(int i2) {
        d<? extends View> dVar = this.t;
        if (dVar != null && (dVar instanceof o)) {
            ((o) dVar).a(i2);
        }
    }

    /* access modifiers changed from: protected */
    public void onWindowVisibilityChanged(int i2) {
        super.onWindowVisibilityChanged(i2);
        removeCallbacks(this.I);
        removeCallbacks(this.H);
        if (i2 == 0) {
            postDelayed(this.H, 50);
        } else {
            postDelayed(this.I, 50);
        }
    }

    public void onWindowFocusChanged(boolean z2) {
        super.onWindowFocusChanged(z2);
        if (Build.VERSION.SDK_INT < 28) {
            onWindowVisibilityChanged(z2 ? getVisibility() : 8);
        }
        s();
    }

    /* access modifiers changed from: private */
    public void s() {
        com.bytedance.sdk.component.utils.h.a().post(new Runnable() {
            public void run() {
                if (NativeExpressView.this.D.get()) {
                    NativeExpressView.this.r.a(System.currentTimeMillis(), x.a(NativeExpressView.this));
                }
            }
        });
    }

    public void j() {
        if (this.i.ay()) {
            b bVar = this.E;
            if (bVar == null) {
                a_(106);
                return;
            }
            bVar.a((n) this);
            this.E.a();
            return;
        }
        this.A.a();
        i.a aVar = this.L;
        if (aVar != null) {
            aVar.a((n) this);
        }
        this.L.a();
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        int i2;
        e eVar = this.u;
        if (eVar != null) {
            eVar.b(motionEvent.getDeviceId());
            this.u.a(motionEvent.getSource());
            this.u.c(motionEvent.getToolType(0));
        }
        f fVar = this.v;
        if (fVar != null) {
            fVar.b(motionEvent.getDeviceId());
            this.v.a(motionEvent.getSource());
            this.v.c(motionEvent.getToolType(0));
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.S = motionEvent.getRawX();
            this.T = motionEvent.getRawY();
            this.W = System.currentTimeMillis();
            i2 = 0;
        } else if (actionMasked == 1) {
            i2 = 3;
        } else if (actionMasked != 2) {
            i2 = actionMasked != 3 ? -1 : 4;
        } else {
            this.U += Math.abs(motionEvent.getX() - this.S);
            this.V += Math.abs(motionEvent.getY() - this.T);
            this.S = motionEvent.getX();
            this.T = motionEvent.getY();
            i2 = (System.currentTimeMillis() - this.W <= 200 || (this.U <= 8.0f && this.V <= 8.0f)) ? 2 : 1;
        }
        SparseArray<c.a> sparseArray = this.R;
        if (sparseArray != null) {
            sparseArray.put(motionEvent.getActionMasked(), new c.a(i2, (double) motionEvent.getSize(), (double) motionEvent.getPressure(), System.currentTimeMillis()));
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    /* JADX WARNING: type inference failed for: r24v0, types: [android.view.View] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a(android.view.View r24, int r25, com.bytedance.sdk.component.adexpress.b r26) {
        /*
            r23 = this;
            r0 = r23
            r1 = r24
            r2 = r25
            r3 = -1
            if (r2 == r3) goto L_0x01d2
            if (r26 != 0) goto L_0x000d
            goto L_0x01d2
        L_0x000d:
            java.util.HashMap r3 = new java.util.HashMap
            r3.<init>()
            com.bytedance.sdk.openadsdk.core.e.n r4 = r0.i
            boolean r4 = com.bytedance.sdk.openadsdk.core.e.p.i(r4)
            java.lang.String r5 = "click_scence"
            r6 = 1
            if (r4 == 0) goto L_0x0026
            r4 = 3
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r3.put(r5, r4)
            goto L_0x002d
        L_0x0026:
            java.lang.Integer r4 = java.lang.Integer.valueOf(r6)
            r3.put(r5, r4)
        L_0x002d:
            r4 = r26
            com.bytedance.sdk.openadsdk.core.e.j r4 = (com.bytedance.sdk.openadsdk.core.e.j) r4
            com.bytedance.sdk.openadsdk.core.nativeexpress.e r5 = r0.u
            if (r5 == 0) goto L_0x0041
            int r7 = r23.getDynamicShowType()
            r5.d((int) r7)
            com.bytedance.sdk.openadsdk.core.nativeexpress.e r5 = r0.u
            r5.a((java.util.Map<java.lang.String, java.lang.Object>) r3)
        L_0x0041:
            com.bytedance.sdk.openadsdk.core.nativeexpress.f r5 = r0.v
            if (r5 == 0) goto L_0x0051
            int r7 = r23.getDynamicShowType()
            r5.d((int) r7)
            com.bytedance.sdk.openadsdk.core.nativeexpress.f r5 = r0.v
            r5.a((java.util.Map<java.lang.String, java.lang.Object>) r3)
        L_0x0051:
            float r9 = r4.f1082a
            float r10 = r4.f1083b
            float r11 = r4.f1084c
            float r12 = r4.f1085d
            boolean r14 = r4.o
            android.util.SparseArray<com.bytedance.sdk.openadsdk.core.b.c$a> r3 = r4.n
            if (r3 == 0) goto L_0x0065
            int r5 = r3.size()
            if (r5 != 0) goto L_0x0067
        L_0x0065:
            android.util.SparseArray<com.bytedance.sdk.openadsdk.core.b.c$a> r3 = r0.R
        L_0x0067:
            r13 = r3
            java.lang.String r3 = r4.k
            r5 = 0
            if (r1 != 0) goto L_0x006f
            r8 = r0
            goto L_0x0076
        L_0x006f:
            if (r1 == r0) goto L_0x0075
            org.json.JSONObject r5 = a((android.view.View) r24)
        L_0x0075:
            r8 = r1
        L_0x0076:
            if (r4 == 0) goto L_0x0082
            r4.l = r2
            if (r5 == 0) goto L_0x0082
            org.json.JSONObject r1 = r4.m
            if (r1 != 0) goto L_0x0082
            r4.m = r5
        L_0x0082:
            switch(r2) {
                case 1: goto L_0x0190;
                case 2: goto L_0x0166;
                case 3: goto L_0x014c;
                case 4: goto L_0x009f;
                case 5: goto L_0x0097;
                case 6: goto L_0x0092;
                case 7: goto L_0x0087;
                default: goto L_0x0085;
            }
        L_0x0085:
            goto L_0x01d2
        L_0x0087:
            android.content.Context r1 = r0.f1409f
            com.bytedance.sdk.openadsdk.core.e.n r2 = r0.i
            java.lang.String r3 = r0.f1410g
            com.bytedance.sdk.openadsdk.activity.TTWebsiteActivity.a(r1, r2, r3)
            goto L_0x01d2
        L_0x0092:
            r23.a()
            goto L_0x01d2
        L_0x0097:
            boolean r1 = r0.q
            r1 = r1 ^ r6
            r0.a((boolean) r1)
            goto L_0x01d2
        L_0x009f:
            android.widget.FrameLayout r1 = r0.k
            if (r1 == 0) goto L_0x00b6
            r15 = 0
            r17 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r22 = 0
            android.view.MotionEvent r2 = android.view.MotionEvent.obtain(r15, r17, r19, r20, r21, r22)
            r1.dispatchTouchEvent(r2)
        L_0x00b6:
            com.bytedance.sdk.openadsdk.core.e.n r1 = r0.i
            if (r1 == 0) goto L_0x00c3
            int r1 = r1.h()
            if (r1 != r6) goto L_0x00c3
            if (r14 != 0) goto L_0x00c3
            return
        L_0x00c3:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Creativity....mAdType="
            r1.append(r2)
            java.lang.String r2 = r0.f1410g
            r1.append(r2)
            java.lang.String r2 = ",!mVideoPause="
            r1.append(r2)
            boolean r2 = r0.l
            r2 = r2 ^ r6
            r1.append(r2)
            java.lang.String r2 = "，isAutoPlay="
            r1.append(r2)
            com.bytedance.sdk.openadsdk.core.e.n r2 = r0.i
            boolean r2 = com.bytedance.sdk.openadsdk.utils.u.j((com.bytedance.sdk.openadsdk.core.e.n) r2)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            java.lang.String r2 = "ClickCreativeListener"
            com.bytedance.sdk.component.utils.l.b((java.lang.String) r2, (java.lang.String) r1)
            java.lang.String r1 = r0.f1410g
            java.lang.String r5 = "embeded_ad"
            boolean r1 = r5.equals(r1)
            if (r1 == 0) goto L_0x0127
            boolean r1 = r23.t()
            if (r1 == 0) goto L_0x0127
            boolean r1 = r0.l
            if (r1 != 0) goto L_0x0127
            com.bytedance.sdk.openadsdk.core.e.n r1 = r0.i
            boolean r1 = com.bytedance.sdk.openadsdk.utils.u.j((com.bytedance.sdk.openadsdk.core.e.n) r1)
            if (r1 == 0) goto L_0x0127
            java.lang.String r1 = "Creative...."
            com.bytedance.sdk.component.utils.l.b((java.lang.String) r2, (java.lang.String) r1)
            com.bytedance.sdk.openadsdk.core.nativeexpress.e r1 = r0.u
            if (r1 == 0) goto L_0x013d
            r1.a(r4)
            com.bytedance.sdk.openadsdk.core.nativeexpress.e r1 = r0.u
            r1.a((java.lang.String) r3)
            com.bytedance.sdk.openadsdk.core.nativeexpress.e r7 = r0.u
            r7.a(r8, r9, r10, r11, r12, r13, r14)
            goto L_0x013d
        L_0x0127:
            java.lang.String r1 = "normal...."
            com.bytedance.sdk.component.utils.l.b((java.lang.String) r2, (java.lang.String) r1)
            com.bytedance.sdk.openadsdk.core.nativeexpress.f r1 = r0.v
            if (r1 == 0) goto L_0x013d
            r1.a(r4)
            com.bytedance.sdk.openadsdk.core.nativeexpress.f r1 = r0.v
            r1.a((java.lang.String) r3)
            com.bytedance.sdk.openadsdk.core.nativeexpress.f r7 = r0.v
            r7.a(r8, r9, r10, r11, r12, r13, r14)
        L_0x013d:
            com.bytedance.sdk.openadsdk.TTNativeExpressAd$ExpressAdInteractionListener r1 = r0.f1408e
            if (r1 == 0) goto L_0x01d2
            com.bytedance.sdk.openadsdk.core.e.n r2 = r0.i
            int r2 = r2.L()
            r1.onAdClicked(r0, r2)
            goto L_0x01d2
        L_0x014c:
            com.bytedance.sdk.openadsdk.TTDislikeDialogAbstract r1 = r0.f1407d
            if (r1 == 0) goto L_0x0155
            r1.show()
            goto L_0x01d2
        L_0x0155:
            com.bytedance.sdk.openadsdk.dislike.b r1 = r0.f1406c
            if (r1 == 0) goto L_0x015e
            r1.showDislikeDialog()
            goto L_0x01d2
        L_0x015e:
            com.bytedance.sdk.openadsdk.core.e.n r1 = r0.i
            java.lang.String r2 = r0.B
            com.bytedance.sdk.openadsdk.activity.TTDelegateActivity.a((com.bytedance.sdk.openadsdk.core.e.n) r1, (java.lang.String) r2)
            goto L_0x01d2
        L_0x0166:
            int r1 = r4.p
            if (r1 <= 0) goto L_0x016d
            com.bytedance.sdk.openadsdk.core.y.a(r6)
        L_0x016d:
            com.bytedance.sdk.openadsdk.core.nativeexpress.e r1 = r0.u
            if (r1 == 0) goto L_0x017e
            r1.a(r4)
            com.bytedance.sdk.openadsdk.core.nativeexpress.e r1 = r0.u
            r1.a((java.lang.String) r3)
            com.bytedance.sdk.openadsdk.core.nativeexpress.e r7 = r0.u
            r7.a(r8, r9, r10, r11, r12, r13, r14)
        L_0x017e:
            com.bytedance.sdk.openadsdk.TTNativeExpressAd$ExpressAdInteractionListener r1 = r0.f1408e
            if (r1 == 0) goto L_0x018b
            com.bytedance.sdk.openadsdk.core.e.n r2 = r0.i
            int r2 = r2.L()
            r1.onAdClicked(r0, r2)
        L_0x018b:
            r1 = 0
            com.bytedance.sdk.openadsdk.core.y.a(r1)
            goto L_0x01d2
        L_0x0190:
            android.widget.FrameLayout r1 = r0.k
            if (r1 == 0) goto L_0x01a7
            r15 = 0
            r17 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r22 = 0
            android.view.MotionEvent r2 = android.view.MotionEvent.obtain(r15, r17, r19, r20, r21, r22)
            r1.dispatchTouchEvent(r2)
        L_0x01a7:
            com.bytedance.sdk.openadsdk.core.e.n r1 = r0.i
            if (r1 == 0) goto L_0x01b4
            int r1 = r1.h()
            if (r1 != r6) goto L_0x01b4
            if (r14 != 0) goto L_0x01b4
            return
        L_0x01b4:
            com.bytedance.sdk.openadsdk.core.nativeexpress.f r1 = r0.v
            if (r1 == 0) goto L_0x01c5
            r1.a(r4)
            com.bytedance.sdk.openadsdk.core.nativeexpress.f r1 = r0.v
            r1.a((java.lang.String) r3)
            com.bytedance.sdk.openadsdk.core.nativeexpress.f r7 = r0.v
            r7.a(r8, r9, r10, r11, r12, r13, r14)
        L_0x01c5:
            com.bytedance.sdk.openadsdk.TTNativeExpressAd$ExpressAdInteractionListener r1 = r0.f1408e
            if (r1 == 0) goto L_0x01d2
            com.bytedance.sdk.openadsdk.core.e.n r2 = r0.i
            int r2 = r2.L()
            r1.onAdClicked(r0, r2)
        L_0x01d2:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.core.nativeexpress.NativeExpressView.a(android.view.View, int, com.bytedance.sdk.component.adexpress.b):void");
    }

    public static JSONObject a(View view) {
        try {
            int[] iArr = new int[2];
            view.getLocationOnScreen(iArr);
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(IabUtils.KEY_WIDTH, view.getWidth());
            jSONObject.put(IabUtils.KEY_HEIGHT, view.getHeight());
            jSONObject.put("left", iArr[0]);
            jSONObject.put("top", iArr[1]);
            return jSONObject;
        } catch (Exception unused) {
            return null;
        }
    }

    private boolean t() {
        return com.bytedance.sdk.openadsdk.core.e.n.c(this.i);
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private int getAdSlotType() {
        /*
            r6 = this;
            java.lang.String r0 = r6.f1410g
            int r1 = r0.hashCode()
            r2 = 5
            r3 = 3
            r4 = 2
            r5 = 1
            switch(r1) {
                case -1695837674: goto L_0x004a;
                case -1364000502: goto L_0x0040;
                case -1263194568: goto L_0x0036;
                case -764631662: goto L_0x002c;
                case -712491894: goto L_0x0022;
                case 1844104722: goto L_0x0018;
                case 1912999166: goto L_0x000e;
                default: goto L_0x000d;
            }
        L_0x000d:
            goto L_0x0054
        L_0x000e:
            java.lang.String r1 = "draw_ad"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0054
            r0 = 1
            goto L_0x0055
        L_0x0018:
            java.lang.String r1 = "interaction"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0054
            r0 = 5
            goto L_0x0055
        L_0x0022:
            java.lang.String r1 = "embeded_ad"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0054
            r0 = 0
            goto L_0x0055
        L_0x002c:
            java.lang.String r1 = "fullscreen_interstitial_ad"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0054
            r0 = 3
            goto L_0x0055
        L_0x0036:
            java.lang.String r1 = "open_ad"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0054
            r0 = 6
            goto L_0x0055
        L_0x0040:
            java.lang.String r1 = "rewarded_video"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0054
            r0 = 2
            goto L_0x0055
        L_0x004a:
            java.lang.String r1 = "banner_ad"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0054
            r0 = 4
            goto L_0x0055
        L_0x0054:
            r0 = -1
        L_0x0055:
            switch(r0) {
                case 1: goto L_0x0061;
                case 2: goto L_0x005f;
                case 3: goto L_0x005c;
                case 4: goto L_0x005b;
                case 5: goto L_0x005a;
                case 6: goto L_0x0059;
                default: goto L_0x0058;
            }
        L_0x0058:
            return r2
        L_0x0059:
            return r3
        L_0x005a:
            return r4
        L_0x005b:
            return r5
        L_0x005c:
            r0 = 8
            return r0
        L_0x005f:
            r0 = 7
            return r0
        L_0x0061:
            r0 = 9
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.core.nativeexpress.NativeExpressView.getAdSlotType():int");
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        s();
        u();
        com.bytedance.sdk.component.utils.l.e("webviewpool", "onAttachedToWindow+++");
        getViewTreeObserver().addOnScrollChangedListener(this.F);
        com.bytedance.sdk.openadsdk.core.h.d().a(this.B, this.C);
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        super.onLayout(z2, i2, i3, i4, i5);
        s();
    }

    public void onFinishTemporaryDetach() {
        super.onFinishTemporaryDetach();
        com.bytedance.sdk.component.utils.l.e("webviewpool", "onFinishTemporaryDetach+++");
    }

    private void u() {
        List<i> list = this.M;
        if (list != null) {
            for (i next : list) {
                if (next != null) {
                    next.b();
                }
            }
        }
    }

    private void v() {
        List<i> list = this.M;
        if (list != null) {
            for (i next : list) {
                if (next != null) {
                    next.c();
                }
            }
        }
    }

    public void k() {
        o oVar = this.K;
        if (oVar != null && oVar.e() != null) {
            this.K.f();
        }
    }

    public void l() {
        try {
            if (this.E != null) {
                this.E.b();
            }
            removeAllViews();
            if (getParent() != null) {
                ((ViewGroup) getParent()).removeView(this);
            }
            if (this.M != null) {
                for (i a2 : this.M) {
                    a2.a();
                }
            }
            this.f1406c = null;
            this.f1407d = null;
            this.f1411h = null;
            this.i = null;
            this.f1408e = null;
            this.u = null;
            this.n = null;
            this.v = null;
            this.j = null;
        } catch (Throwable th) {
            com.bytedance.sdk.component.utils.l.c("NativeExpressView", "detach error", th);
        }
    }

    public void m() {
        try {
            if (this.k != null && this.k.getParent() != null) {
                removeView(this.k);
            }
        } catch (Throwable th) {
            com.bytedance.sdk.component.utils.l.a("NativeExpressView", "backupDestroy remove video container error", th);
        }
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        getViewTreeObserver().removeOnScrollChangedListener(this.F);
        com.bytedance.sdk.openadsdk.core.h.d().f(this.B);
        v();
        com.bytedance.sdk.component.utils.l.e("webviewpool", "onDetachedFromWindow===");
    }

    public void onStartTemporaryDetach() {
        super.onStartTemporaryDetach();
        com.bytedance.sdk.component.utils.l.e("webviewpool", "onStartTemporaryDetach===");
    }

    /* JADX WARNING: type inference failed for: r5v0, types: [com.bytedance.sdk.component.adexpress.b.d, com.bytedance.sdk.component.adexpress.b.d<? extends android.view.View>] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a(com.bytedance.sdk.component.adexpress.b.d<? extends android.view.View> r5, com.bytedance.sdk.component.adexpress.b.m r6) {
        /*
            r4 = this;
            java.util.concurrent.atomic.AtomicBoolean r0 = r4.D
            r1 = 1
            r0.set(r1)
            r4.t = r5
            int r0 = r5.c()
            r2 = 3
            r3 = 0
            if (r0 != r2) goto L_0x001d
            com.bytedance.sdk.openadsdk.core.e.n r0 = r4.i
            int r0 = r0.f()
            if (r0 != r1) goto L_0x001d
            com.bytedance.sdk.openadsdk.core.e.n r0 = r4.i
            r0.b((int) r3)
        L_0x001d:
            int r0 = r5.c()
            r1 = 2
            if (r0 == r1) goto L_0x0030
            int r0 = r5.c()
            if (r0 == 0) goto L_0x0030
            int r0 = r5.c()
            if (r0 != r2) goto L_0x007a
        L_0x0030:
            android.view.View r0 = r5.e()
            android.view.ViewParent r1 = r0.getParent()
            if (r1 == 0) goto L_0x0043
            android.view.ViewParent r1 = r0.getParent()
            android.view.ViewGroup r1 = (android.view.ViewGroup) r1
            r1.removeView(r0)
        L_0x0043:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1 = 0
        L_0x0049:
            int r2 = r4.getChildCount()
            if (r1 >= r2) goto L_0x0059
            android.view.View r2 = r4.getChildAt(r1)
            r0.add(r2)
            int r1 = r1 + 1
            goto L_0x0049
        L_0x0059:
            int r1 = r0.size()
            if (r3 >= r1) goto L_0x0073
            java.lang.Object r1 = r0.get(r3)
            boolean r1 = r1 instanceof com.bytedance.sdk.component.widget.SSWebView
            if (r1 == 0) goto L_0x0070
            java.lang.Object r1 = r0.get(r3)
            android.view.View r1 = (android.view.View) r1
            r4.removeView(r1)
        L_0x0070:
            int r3 = r3 + 1
            goto L_0x0059
        L_0x0073:
            android.view.View r5 = r5.e()
            r4.addView(r5)
        L_0x007a:
            com.bytedance.sdk.component.adexpress.b.h r5 = r4.P
            if (r5 == 0) goto L_0x0083
            com.bytedance.sdk.openadsdk.core.nativeexpress.i r5 = (com.bytedance.sdk.openadsdk.core.nativeexpress.i) r5
            r5.i()
        L_0x0083:
            com.bytedance.sdk.openadsdk.TTNativeExpressAd$ExpressAdInteractionListener r5 = r4.f1408e
            if (r5 == 0) goto L_0x0094
            double r0 = r6.b()
            float r0 = (float) r0
            double r1 = r6.c()
            float r6 = (float) r1
            r5.onRenderSuccess(r4, r0, r6)
        L_0x0094:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.core.nativeexpress.NativeExpressView.a(com.bytedance.sdk.component.adexpress.b.d, com.bytedance.sdk.component.adexpress.b.m):void");
    }

    public void a_(int i2) {
        h hVar = this.P;
        if (hVar != null) {
            if (!this.f1404a) {
                hVar.f();
            }
            this.P.g();
            ((i) this.P).i();
        }
        TTNativeExpressAd.ExpressAdInteractionListener expressAdInteractionListener = this.f1408e;
        if (expressAdInteractionListener != null) {
            expressAdInteractionListener.onRenderFail(this, com.bytedance.sdk.openadsdk.core.g.a(i2), i2);
        }
    }

    public boolean n() {
        d<? extends View> dVar = this.t;
        return dVar != null && dVar.c() == 1;
    }

    public int getDynamicShowType() {
        d<? extends View> dVar = this.t;
        if (dVar != null) {
            return dVar.c();
        }
        return 0;
    }

    public int getExpectExpressWidth() {
        return Float.valueOf(this.y).intValue();
    }

    public int getExpectExpressHeight() {
        return Float.valueOf(this.z).intValue();
    }

    public w getJsObject() {
        o oVar = this.K;
        if (oVar != null) {
            return oVar.p();
        }
        return null;
    }

    private boolean w() {
        return TextUtils.equals(this.f1410g, "fullscreen_interstitial_ad") || TextUtils.equals(this.f1410g, "rewarded_video") || o.b(this.f1410g);
    }

    public void a(CharSequence charSequence, int i2, int i3) {
        b(Integer.parseInt(String.valueOf(charSequence)), i2);
    }

    public void setSoundMute(boolean z2) {
        this.q = z2;
        com.bytedance.sdk.component.adexpress.b.b bVar = this.s;
        if (bVar != null && bVar.d() != null) {
            this.s.d().setSoundMute(z2);
        }
    }

    /* access modifiers changed from: protected */
    public void b(int i2, int i3) {
        int i4;
        if (TextUtils.equals(this.f1410g, "fullscreen_interstitial_ad")) {
            i4 = m.h().e(Integer.valueOf(this.x).intValue());
        } else if (TextUtils.equals(this.f1410g, "rewarded_video")) {
            i4 = m.h().f(this.x);
        } else {
            return;
        }
        if (i4 < 0) {
            i4 = 5;
        }
        int i5 = 0;
        int i6 = (i3 >= i4 || d() == 5) ? 1 : 0;
        if (i3 <= i4) {
            i5 = i4 - i3;
        }
        com.bytedance.sdk.component.adexpress.b.b bVar = this.s;
        if (bVar != null && bVar.d() != null) {
            this.s.d().a(String.valueOf(i2), i6, i5);
        }
    }
}
