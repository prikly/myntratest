package com.adcolony.sdk;

import android.content.Context;
import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import android.widget.VideoView;
import com.adcolony.sdk.e0;
import com.iab.omid.library.adcolony.adsession.AdSession;
import com.iab.omid.library.adcolony.adsession.FriendlyObstructionPurpose;
import com.onesignal.outcomes.OSOutcomeConstants;
import io.bidmachine.utils.IabUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import kotlin.KotlinVersion;

class c extends FrameLayout {

    /* renamed from: a  reason: collision with root package name */
    private HashMap<Integer, a1> f9947a;

    /* renamed from: b  reason: collision with root package name */
    private HashMap<Integer, y0> f9948b;

    /* renamed from: c  reason: collision with root package name */
    private HashMap<Integer, b1> f9949c;

    /* renamed from: d  reason: collision with root package name */
    private HashMap<Integer, u> f9950d;

    /* renamed from: e  reason: collision with root package name */
    private HashMap<Integer, a0> f9951e;

    /* renamed from: f  reason: collision with root package name */
    private HashMap<Integer, Boolean> f9952f;

    /* renamed from: g  reason: collision with root package name */
    private HashMap<Integer, View> f9953g;

    /* renamed from: h  reason: collision with root package name */
    private int f9954h;
    private int i;
    private int j;
    private int k;
    private String l;
    boolean m;
    boolean n;
    private float o = 0.0f;
    private double p = 0.0d;
    private int q = 0;
    private int r = 0;
    private ArrayList<j0> s;
    private ArrayList<String> t;
    private boolean u;
    private boolean v;
    private boolean w;
    private AdSession x;
    Context y;
    VideoView z;

    class a implements j0 {
        a() {
        }

        public void a(h0 h0Var) {
            if (c.this.i(h0Var)) {
                c cVar = c.this;
                cVar.a((View) cVar.c(h0Var), FriendlyObstructionPurpose.OTHER);
            }
        }
    }

    class b implements j0 {
        b() {
        }

        public void a(h0 h0Var) {
            if (c.this.i(h0Var)) {
                c.this.g(h0Var);
            }
        }
    }

    /* renamed from: com.adcolony.sdk.c$c  reason: collision with other inner class name */
    class C0093c implements j0 {

        /* renamed from: com.adcolony.sdk.c$c$a */
        class a implements Runnable {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ h0 f9958a;

            a(h0 h0Var) {
                this.f9958a = h0Var;
            }

            public void run() {
                c cVar = c.this;
                cVar.a((View) cVar.d(this.f9958a), FriendlyObstructionPurpose.OTHER);
            }
        }

        C0093c() {
        }

        public void a(h0 h0Var) {
            if (c.this.i(h0Var)) {
                z0.b((Runnable) new a(h0Var));
            }
        }
    }

    class d implements j0 {

        class a implements Runnable {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ h0 f9961a;

            a(h0 h0Var) {
                this.f9961a = h0Var;
            }

            public void run() {
                c.this.h(this.f9961a);
            }
        }

        d() {
        }

        public void a(h0 h0Var) {
            if (c.this.i(h0Var)) {
                z0.b((Runnable) new a(h0Var));
            }
        }
    }

    class e implements j0 {
        e() {
        }

        public void a(h0 h0Var) {
            if (c.this.i(h0Var)) {
                c cVar = c.this;
                cVar.a(cVar.b(h0Var), FriendlyObstructionPurpose.OTHER);
            }
        }
    }

    class f implements j0 {
        f() {
        }

        public void a(h0 h0Var) {
            if (c.this.i(h0Var)) {
                c.this.f(h0Var);
            }
        }
    }

    class g implements j0 {
        g() {
        }

        public void a(h0 h0Var) {
            if (c.this.i(h0Var)) {
                c cVar = c.this;
                cVar.a((View) cVar.a(h0Var), FriendlyObstructionPurpose.OTHER);
            }
        }
    }

    class h implements j0 {
        h() {
        }

        public void a(h0 h0Var) {
            if (c.this.i(h0Var)) {
                c.this.e(h0Var);
            }
        }
    }

    class i implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ boolean f9967a;

        i(boolean z) {
            this.f9967a = z;
        }

        public void run() {
            c cVar = c.this;
            if (!cVar.m) {
                cVar.a(this.f9967a);
                c.this.b(this.f9967a);
            }
        }
    }

    c(Context context, String str) {
        super(context);
        this.y = context;
        this.l = str;
        setBackgroundColor(-16777216);
    }

    /* access modifiers changed from: package-private */
    public a1 c(h0 h0Var) {
        int d2 = c0.d(h0Var.a(), OSOutcomeConstants.OUTCOME_ID);
        a1 a1Var = new a1(this.y, h0Var, d2, this);
        a1Var.d();
        this.f9947a.put(Integer.valueOf(d2), a1Var);
        this.f9953g.put(Integer.valueOf(d2), a1Var);
        return a1Var;
    }

    /* access modifiers changed from: package-private */
    public b1 d(h0 h0Var) {
        b1 b1Var;
        f1 a2 = h0Var.a();
        int d2 = c0.d(a2, OSOutcomeConstants.OUTCOME_ID);
        boolean b2 = c0.b(a2, "is_module");
        k b3 = a.b();
        if (b2) {
            b1Var = b3.B().get(Integer.valueOf(c0.d(a2, "module_id")));
            if (b1Var == null) {
                new e0.a().a("Module WebView created with invalid id").a(e0.f10045h);
                return null;
            }
            b1Var.b(h0Var, d2, this);
        } else {
            try {
                b1Var = b1.a(this.y, h0Var, d2, this);
            } catch (RuntimeException e2) {
                e0.a aVar = new e0.a();
                aVar.a(e2.toString() + ": during WebView initialization.").a(" Disabling AdColony.").a(e0.f10045h);
                AdColony.disable();
                return null;
            }
        }
        this.f9949c.put(Integer.valueOf(d2), b1Var);
        this.f9953g.put(Integer.valueOf(d2), b1Var);
        f1 b4 = c0.b();
        c0.b(b4, "module_id", b1Var.getWebViewModuleId());
        if (b1Var instanceof l0) {
            c0.b(b4, "mraid_module_id", ((l0) b1Var).getAdcModuleId());
        }
        h0Var.a(b4).c();
        return b1Var;
    }

    /* access modifiers changed from: package-private */
    public boolean e(h0 h0Var) {
        int d2 = c0.d(h0Var.a(), OSOutcomeConstants.OUTCOME_ID);
        View remove = this.f9953g.remove(Integer.valueOf(d2));
        a0 remove2 = this.f9951e.remove(Integer.valueOf(d2));
        if (remove == null || remove2 == null) {
            d c2 = a.b().c();
            String b2 = h0Var.b();
            c2.a(b2, "" + d2);
            return false;
        }
        removeView(remove2);
        return true;
    }

    /* access modifiers changed from: package-private */
    public boolean f(h0 h0Var) {
        TextView textView;
        int d2 = c0.d(h0Var.a(), OSOutcomeConstants.OUTCOME_ID);
        View remove = this.f9953g.remove(Integer.valueOf(d2));
        if (this.f9952f.remove(Integer.valueOf(d2)).booleanValue()) {
            textView = this.f9950d.remove(Integer.valueOf(d2));
        } else {
            textView = this.f9948b.remove(Integer.valueOf(d2));
        }
        if (remove == null || textView == null) {
            d c2 = a.b().c();
            String b2 = h0Var.b();
            c2.a(b2, "" + d2);
            return false;
        }
        removeView(textView);
        return true;
    }

    /* access modifiers changed from: package-private */
    public boolean g(h0 h0Var) {
        int d2 = c0.d(h0Var.a(), OSOutcomeConstants.OUTCOME_ID);
        View remove = this.f9953g.remove(Integer.valueOf(d2));
        a1 remove2 = this.f9947a.remove(Integer.valueOf(d2));
        if (remove == null || remove2 == null) {
            d c2 = a.b().c();
            String b2 = h0Var.b();
            c2.a(b2, "" + d2);
            return false;
        }
        if (remove2.c()) {
            remove2.j();
        }
        remove2.a();
        removeView(remove2);
        return true;
    }

    /* access modifiers changed from: package-private */
    public boolean h(h0 h0Var) {
        int d2 = c0.d(h0Var.a(), OSOutcomeConstants.OUTCOME_ID);
        k b2 = a.b();
        View remove = this.f9953g.remove(Integer.valueOf(d2));
        b1 remove2 = this.f9949c.remove(Integer.valueOf(d2));
        if (remove2 == null || remove == null) {
            d c2 = b2.c();
            String b3 = h0Var.b();
            c2.a(b3, "" + d2);
            return false;
        }
        if (remove2 instanceof k0) {
            b2.r().b((k0) remove2);
        }
        removeView(remove2);
        return true;
    }

    /* access modifiers changed from: package-private */
    public boolean i(h0 h0Var) {
        f1 a2 = h0Var.a();
        return c0.d(a2, "container_id") == this.j && c0.h(a2, "ad_session_id").equals(this.l);
    }

    /* access modifiers changed from: package-private */
    public void j(h0 h0Var) {
        Rect rect;
        this.f9947a = new HashMap<>();
        this.f9948b = new HashMap<>();
        this.f9949c = new HashMap<>();
        this.f9950d = new HashMap<>();
        this.f9951e = new HashMap<>();
        this.f9952f = new HashMap<>();
        this.f9953g = new HashMap<>();
        this.s = new ArrayList<>();
        this.t = new ArrayList<>();
        f1 a2 = h0Var.a();
        if (c0.b(a2, "transparent")) {
            setBackgroundColor(0);
        }
        this.j = c0.d(a2, OSOutcomeConstants.OUTCOME_ID);
        this.f9954h = c0.d(a2, IabUtils.KEY_WIDTH);
        this.i = c0.d(a2, IabUtils.KEY_HEIGHT);
        this.k = c0.d(a2, "module_id");
        this.n = c0.b(a2, "viewability_enabled");
        this.u = this.j == 1;
        k b2 = a.b();
        if (this.f9954h == 0 && this.i == 0) {
            if (this.w) {
                rect = b2.n().x();
            } else {
                rect = b2.n().w();
            }
            this.f9954h = rect.width();
            this.i = rect.height();
        } else {
            setLayoutParams(new FrameLayout.LayoutParams(this.f9954h, this.i));
        }
        this.s.add(a.a("VideoView.create", (j0) new a(), true));
        this.s.add(a.a("VideoView.destroy", (j0) new b(), true));
        this.s.add(a.a("WebView.create", (j0) new C0093c(), true));
        this.s.add(a.a("WebView.destroy", (j0) new d(), true));
        this.s.add(a.a("TextView.create", (j0) new e(), true));
        this.s.add(a.a("TextView.destroy", (j0) new f(), true));
        this.s.add(a.a("ImageView.create", (j0) new g(), true));
        this.s.add(a.a("ImageView.destroy", (j0) new h(), true));
        this.t.add("VideoView.create");
        this.t.add("VideoView.destroy");
        this.t.add("WebView.create");
        this.t.add("WebView.destroy");
        this.t.add("TextView.create");
        this.t.add("TextView.destroy");
        this.t.add("ImageView.create");
        this.t.add("ImageView.destroy");
        VideoView videoView = new VideoView(this.y);
        this.z = videoView;
        videoView.setVisibility(8);
        addView(this.z);
        setClipToPadding(false);
        if (this.n) {
            b(c0.b(h0Var.a(), "advanced_viewability"));
        }
    }

    /* access modifiers changed from: package-private */
    public int k() {
        return this.k;
    }

    /* access modifiers changed from: package-private */
    public HashMap<Integer, y0> l() {
        return this.f9948b;
    }

    /* access modifiers changed from: package-private */
    public HashMap<Integer, a1> m() {
        return this.f9947a;
    }

    /* access modifiers changed from: package-private */
    public HashMap<Integer, b1> n() {
        return this.f9949c;
    }

    /* access modifiers changed from: package-private */
    public boolean o() {
        return this.v;
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return false;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        MotionEvent motionEvent2 = motionEvent;
        int action = motionEvent.getAction() & KotlinVersion.MAX_COMPONENT_VALUE;
        if (action != 0 && action != 1 && action != 3 && action != 2 && action != 5 && action != 6) {
            return false;
        }
        k b2 = a.b();
        d c2 = b2.c();
        int x2 = (int) motionEvent.getX();
        int y2 = (int) motionEvent.getY();
        f1 b3 = c0.b();
        c0.b(b3, "view_id", -1);
        c0.a(b3, "ad_session_id", this.l);
        c0.b(b3, "container_x", x2);
        c0.b(b3, "container_y", y2);
        c0.b(b3, "view_x", x2);
        c0.b(b3, "view_y", y2);
        c0.b(b3, OSOutcomeConstants.OUTCOME_ID, this.j);
        if (action == 0) {
            new h0("AdContainer.on_touch_began", this.k, b3).c();
        } else if (action == 1) {
            if (!this.u) {
                b2.a(c2.d().get(this.l));
            }
            new h0("AdContainer.on_touch_ended", this.k, b3).c();
        } else if (action == 2) {
            new h0("AdContainer.on_touch_moved", this.k, b3).c();
        } else if (action == 3) {
            new h0("AdContainer.on_touch_cancelled", this.k, b3).c();
        } else if (action == 5) {
            int action2 = (motionEvent.getAction() & 65280) >> 8;
            c0.b(b3, "container_x", (int) motionEvent2.getX(action2));
            c0.b(b3, "container_y", (int) motionEvent2.getY(action2));
            c0.b(b3, "view_x", (int) motionEvent2.getX(action2));
            c0.b(b3, "view_y", (int) motionEvent2.getY(action2));
            new h0("AdContainer.on_touch_began", this.k, b3).c();
        } else if (action == 6) {
            int action3 = (motionEvent.getAction() & 65280) >> 8;
            c0.b(b3, "container_x", (int) motionEvent2.getX(action3));
            c0.b(b3, "container_y", (int) motionEvent2.getY(action3));
            c0.b(b3, "view_x", (int) motionEvent2.getX(action3));
            c0.b(b3, "view_y", (int) motionEvent2.getY(action3));
            c0.b(b3, "x", (int) motionEvent2.getX(action3));
            c0.b(b3, "y", (int) motionEvent2.getY(action3));
            if (!this.u) {
                b2.a(c2.d().get(this.l));
            }
            new h0("AdContainer.on_touch_ended", this.k, b3).c();
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    public boolean p() {
        return this.u;
    }

    /* access modifiers changed from: package-private */
    public boolean q() {
        return this.w;
    }

    /* access modifiers changed from: package-private */
    public a0 a(h0 h0Var) {
        int d2 = c0.d(h0Var.a(), OSOutcomeConstants.OUTCOME_ID);
        a0 a0Var = new a0(this.y, h0Var, d2, this);
        a0Var.a();
        this.f9951e.put(Integer.valueOf(d2), a0Var);
        this.f9953g.put(Integer.valueOf(d2), a0Var);
        return a0Var;
    }

    /* access modifiers changed from: package-private */
    public View b(h0 h0Var) {
        f1 a2 = h0Var.a();
        int d2 = c0.d(a2, OSOutcomeConstants.OUTCOME_ID);
        if (c0.b(a2, "editable")) {
            u uVar = new u(this.y, h0Var, d2, this);
            uVar.a();
            this.f9950d.put(Integer.valueOf(d2), uVar);
            this.f9953g.put(Integer.valueOf(d2), uVar);
            this.f9952f.put(Integer.valueOf(d2), Boolean.TRUE);
            return uVar;
        } else if (!c0.b(a2, "button")) {
            y0 y0Var = new y0(this.y, h0Var, d2, this);
            y0Var.a();
            this.f9948b.put(Integer.valueOf(d2), y0Var);
            this.f9953g.put(Integer.valueOf(d2), y0Var);
            this.f9952f.put(Integer.valueOf(d2), Boolean.FALSE);
            return y0Var;
        } else {
            y0 y0Var2 = new y0(this.y, 16974145, h0Var, d2, this);
            y0Var2.a();
            this.f9948b.put(Integer.valueOf(d2), y0Var2);
            this.f9953g.put(Integer.valueOf(d2), y0Var2);
            this.f9952f.put(Integer.valueOf(d2), Boolean.FALSE);
            return y0Var2;
        }
    }

    /* access modifiers changed from: package-private */
    public ArrayList<j0> i() {
        return this.s;
    }

    /* access modifiers changed from: package-private */
    public int c() {
        return this.j;
    }

    /* access modifiers changed from: private */
    public void a(boolean z2) {
        b1 b1Var;
        double d2;
        View view = (View) getParent();
        AdColonyAdView adColonyAdView = a.b().c().d().get(this.l);
        if (adColonyAdView == null) {
            b1Var = null;
        } else {
            b1Var = adColonyAdView.getWebView();
        }
        b1 b1Var2 = b1Var;
        Context a2 = a.a();
        boolean z3 = true;
        float a3 = g1.a(view, a2, true, z2, true, adColonyAdView != null);
        if (a2 == null) {
            d2 = 0.0d;
        } else {
            d2 = z0.a(z0.a(a2));
        }
        int a4 = z0.a((View) b1Var2);
        int b2 = z0.b((View) b1Var2);
        if (a4 == this.q && b2 == this.r) {
            z3 = false;
        }
        if (z3) {
            this.q = a4;
            this.r = b2;
            a(a4, b2, b1Var2);
        }
        if (!(this.o == a3 && this.p == d2 && !z3)) {
            a(a3, d2);
        }
        this.o = a3;
        this.p = d2;
    }

    /* access modifiers changed from: package-private */
    public void c(boolean z2) {
        this.u = z2;
    }

    /* access modifiers changed from: package-private */
    public HashMap<Integer, View> e() {
        return this.f9953g;
    }

    /* access modifiers changed from: package-private */
    public void e(boolean z2) {
        this.v = z2;
    }

    /* access modifiers changed from: package-private */
    public HashMap<Integer, Boolean> g() {
        return this.f9952f;
    }

    /* access modifiers changed from: package-private */
    public HashMap<Integer, a0> h() {
        return this.f9951e;
    }

    /* access modifiers changed from: package-private */
    public HashMap<Integer, u> f() {
        return this.f9950d;
    }

    /* access modifiers changed from: private */
    public void b(boolean z2) {
        z0.a((Runnable) new i(z2), 200);
    }

    /* access modifiers changed from: package-private */
    public int b() {
        return this.i;
    }

    /* access modifiers changed from: package-private */
    public void b(int i2) {
        this.f9954h = i2;
    }

    private void a(int i2, int i3, b1 b1Var) {
        float s2 = a.b().n().s();
        if (b1Var != null) {
            f1 b2 = c0.b();
            c0.b(b2, "app_orientation", z0.d(z0.f()));
            c0.b(b2, IabUtils.KEY_WIDTH, (int) (((float) b1Var.getCurrentWidth()) / s2));
            c0.b(b2, IabUtils.KEY_HEIGHT, (int) (((float) b1Var.getCurrentHeight()) / s2));
            c0.b(b2, "x", i2);
            c0.b(b2, "y", i3);
            c0.a(b2, "ad_session_id", this.l);
            new h0("MRAID.on_size_change", this.k, b2).c();
        }
    }

    /* access modifiers changed from: package-private */
    public int d() {
        return this.f9954h;
    }

    /* access modifiers changed from: package-private */
    public void d(boolean z2) {
        this.w = z2;
    }

    private void a(float f2, double d2) {
        f1 b2 = c0.b();
        c0.b(b2, OSOutcomeConstants.OUTCOME_ID, this.j);
        c0.a(b2, "ad_session_id", this.l);
        c0.a(b2, "exposure", (double) f2);
        c0.a(b2, "volume", d2);
        new h0("AdContainer.on_exposure_change", this.k, b2).c();
    }

    /* access modifiers changed from: package-private */
    public String a() {
        return this.l;
    }

    /* access modifiers changed from: package-private */
    public void a(int i2) {
        this.i = i2;
    }

    /* access modifiers changed from: package-private */
    public void a(AdSession adSession) {
        this.x = adSession;
        a((Map) this.f9953g);
    }

    /* access modifiers changed from: package-private */
    public void a(Map map) {
        if (this.x != null && map != null) {
            for (Map.Entry value : map.entrySet()) {
                a((View) value.getValue(), FriendlyObstructionPurpose.OTHER);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void a(View view, FriendlyObstructionPurpose friendlyObstructionPurpose) {
        AdSession adSession = this.x;
        if (adSession != null && view != null) {
            try {
                adSession.addFriendlyObstruction(view, friendlyObstructionPurpose, (String) null);
            } catch (RuntimeException unused) {
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void a(View view) {
        AdSession adSession = this.x;
        if (adSession != null && view != null) {
            try {
                adSession.removeFriendlyObstruction(view);
            } catch (RuntimeException unused) {
            }
        }
    }

    /* access modifiers changed from: package-private */
    public ArrayList<String> j() {
        return this.t;
    }
}
