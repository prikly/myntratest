package com.bytedance.sdk.openadsdk.core;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.View;
import android.webkit.JavascriptInterface;
import android.webkit.WebView;
import com.bytedance.JProtect;
import com.bytedance.sdk.component.a.r;
import com.bytedance.sdk.component.adexpress.b.j;
import com.bytedance.sdk.component.adexpress.d.b;
import com.bytedance.sdk.component.d.d.g;
import com.bytedance.sdk.component.utils.k;
import com.bytedance.sdk.component.utils.l;
import com.bytedance.sdk.component.utils.x;
import com.bytedance.sdk.component.widget.SSWebView;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.activity.TTWebsiteActivity;
import com.bytedance.sdk.openadsdk.b.u;
import com.bytedance.sdk.openadsdk.core.b.c;
import com.bytedance.sdk.openadsdk.core.e.j;
import com.bytedance.sdk.openadsdk.core.e.n;
import com.bytedance.sdk.openadsdk.core.e.o;
import com.bytedance.sdk.openadsdk.core.e.p;
import com.bytedance.sdk.openadsdk.core.n;
import com.bytedance.sdk.openadsdk.e.c;
import com.bytedance.sdk.openadsdk.e.d;
import com.bytedance.sdk.openadsdk.g.e;
import com.bytedance.sdk.openadsdk.g.h;
import com.bytedance.sdk.openadsdk.utils.i;
import com.bytedance.sdk.openadsdk.utils.v;
import java.lang.ref.WeakReference;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: TTAndroidObject */
public class w implements b, x.a, com.bytedance.sdk.openadsdk.e.b {

    /* renamed from: g  reason: collision with root package name */
    private static final Map<String, Boolean> f1695g;
    private com.bytedance.sdk.openadsdk.g.b A;
    private h B;
    private boolean C = true;
    /* access modifiers changed from: private */
    public List<n> D;
    private HashMap<String, i> E;
    private boolean F = false;
    private boolean G = false;
    private u H;
    private r I;
    private String J;
    private boolean K = false;
    /* access modifiers changed from: private */
    public com.bytedance.sdk.openadsdk.core.widget.a.a L;

    /* renamed from: a  reason: collision with root package name */
    protected Map<String, Object> f1696a;

    /* renamed from: b  reason: collision with root package name */
    boolean f1697b;

    /* renamed from: c  reason: collision with root package name */
    boolean f1698c = false;

    /* renamed from: d  reason: collision with root package name */
    private WeakReference<SSWebView> f1699d;

    /* renamed from: e  reason: collision with root package name */
    private x f1700e;

    /* renamed from: f  reason: collision with root package name */
    private String f1701f;

    /* renamed from: h  reason: collision with root package name */
    private WeakReference<Context> f1702h;
    private c i;
    private String j;
    private WeakReference<View> k;
    private String l;
    private int m;
    private String n;
    private int o;
    private boolean p = true;
    private n q;
    private j r;
    private com.bytedance.sdk.openadsdk.core.nativeexpress.j s;
    private JSONObject t;
    private d u;
    private com.bytedance.sdk.openadsdk.g.a v;
    private e w;
    private com.bytedance.sdk.openadsdk.g.d x;
    private JSONObject y;
    private com.bytedance.sdk.openadsdk.core.b.d z;

    /* compiled from: TTAndroidObject */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public String f1718a;

        /* renamed from: b  reason: collision with root package name */
        public String f1719b;

        /* renamed from: c  reason: collision with root package name */
        public String f1720c;

        /* renamed from: d  reason: collision with root package name */
        public JSONObject f1721d;

        /* renamed from: e  reason: collision with root package name */
        public int f1722e;
    }

    static {
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        f1695g = concurrentHashMap;
        concurrentHashMap.put(com.bytedance.sdk.component.e.c.a.a1657027613243dc("lne\\asci|"), Boolean.TRUE);
        f1695g.put(com.bytedance.sdk.component.e.c.a.a1657027613243dc("pskueqc"), Boolean.TRUE);
        f1695g.put(com.bytedance.sdk.component.e.c.a.a1657027613243dc("dhqseqeoWdoxlij"), Boolean.TRUE);
        f1695g.put(com.bytedance.sdk.component.e.c.a.a1657027613243dc("ctqwkhYb~ld"), Boolean.TRUE);
        f1695g.put(com.bytedance.sdk.component.e.c.a.a1657027613243dc("lne\\asci|V|8"), Boolean.TRUE);
    }

    public w(Context context) {
        this.f1702h = new WeakReference<>(context);
        this.f1700e = new x(Looper.getMainLooper(), this);
    }

    private void a(final a aVar, final JSONObject jSONObject) {
        if (aVar != null) {
            try {
                a(aVar.f1721d, (com.bytedance.sdk.openadsdk.g.c) new com.bytedance.sdk.openadsdk.g.c() {
                    public void a(boolean z, List<n> list) {
                        if (z) {
                            try {
                                jSONObject.put(g.g1657027613257dc("csgbplpb{"), w.b(list));
                                w.this.b(aVar.f1719b, jSONObject);
                            } catch (Exception unused) {
                            }
                        } else {
                            w.this.b(aVar.f1719b, jSONObject);
                        }
                    }
                });
            } catch (Exception unused) {
            }
        }
    }

    private void a(String str, boolean z2) {
        if (this.H != null && !TextUtils.isEmpty(str)) {
            if (z2) {
                this.H.a(str);
            } else {
                this.H.b(str);
            }
        }
    }

    @JProtect
    private void a(JSONObject jSONObject, int i2) throws Exception {
        String g1657027613239dc;
        String str;
        JSONArray jSONArray = new JSONArray();
        for (String put : q()) {
            jSONArray.put(put);
        }
        jSONObject.put(com.bytedance.sdk.component.e.c.g.g1657027613239dc("aqrMehc"), com.bytedance.sdk.openadsdk.common.a.a());
        jSONObject.put(com.bytedance.sdk.component.e.c.g.g1657027613239dc("iolfvDvwFhgn"), com.bytedance.sdk.openadsdk.common.a.e());
        jSONObject.put(com.bytedance.sdk.component.e.c.g.g1657027613239dc("ahf"), com.bytedance.sdk.openadsdk.common.a.b());
        jSONObject.put(com.bytedance.sdk.component.e.c.g.g1657027613239dc("seiF`lrngg"), com.bytedance.sdk.openadsdk.common.a.c());
        jSONObject.put(com.bytedance.sdk.component.e.c.g.g1657027613239dc("aqrUawungg"), com.bytedance.sdk.openadsdk.common.a.d());
        jSONObject.put(com.bytedance.sdk.component.e.c.g.g1657027613239dc("ndvW}uc"), com.bytedance.sdk.openadsdk.common.a.f());
        jSONObject.put(com.bytedance.sdk.component.e.c.g.g1657027613239dc("strskwrKaz~"), jSONArray);
        jSONObject.put(com.bytedance.sdk.component.e.c.g.g1657027613239dc("ddtjg`Oc"), com.bytedance.sdk.openadsdk.common.a.a(m.a()));
        if (com.bytedance.sdk.openadsdk.utils.e.b(m.a())) {
            g1657027613239dc = com.bytedance.sdk.component.e.c.g.g1657027613239dc("ddtjg`Ywdh~mcc");
            str = "AofqklbXXhn";
        } else {
            g1657027613239dc = com.bytedance.sdk.component.e.c.g.g1657027613239dc("ddtjg`Ywdh~mcc");
            str = "Aofqklb";
        }
        jSONObject.put(g1657027613239dc, com.bytedance.sdk.component.e.c.g.g1657027613239dc(str));
        jSONObject.put(com.bytedance.sdk.component.e.c.g.g1657027613239dc("ddtjg`Ysqyo"), Build.VERSION.RELEASE);
    }

    @JProtect
    private boolean a(String str, int i2, com.bytedance.sdk.openadsdk.core.e.j jVar) {
        HashMap<String, i> hashMap;
        i iVar;
        if (TextUtils.isEmpty(str) || (hashMap = this.E) == null || (iVar = hashMap.get(str)) == null) {
            return false;
        }
        iVar.a(i2, jVar);
        return true;
    }

    public static JSONArray b(List<n> list) {
        JSONArray jSONArray = new JSONArray();
        if (list == null) {
            return jSONArray;
        }
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            jSONArray.put(list.get(i2).ar());
        }
        return jSONArray;
    }

    /* access modifiers changed from: private */
    public void b(String str, JSONObject jSONObject) {
        try {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put(com.bytedance.sdk.component.d.c.b.a.a1657027613264dc("_^opcZr~xl"), com.bytedance.sdk.component.d.c.b.a.a1657027613264dc("c`nofdel"));
            jSONObject2.put(com.bytedance.sdk.component.d.c.b.a.a1657027613264dc("_^abhidfkbUbh"), str);
            if (jSONObject != null) {
                jSONObject2.put(com.bytedance.sdk.component.d.c.b.a.a1657027613264dc("_^rbvdkt"), jSONObject);
            }
            q(jSONObject2);
        } catch (Exception unused) {
        }
    }

    private void c(String str, JSONObject jSONObject) {
        try {
            if (!TextUtils.isEmpty(str)) {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put(com.bytedance.sdk.component.d.d.d.d1657027613261dc("_^opcZr~xl"), com.bytedance.sdk.component.d.d.d.d1657027613261dc("ewgmp"));
                jSONObject2.put(com.bytedance.sdk.component.d.d.d.d1657027613261dc("_^guakrXam"), str);
                if (jSONObject != null) {
                    jSONObject2.put(com.bytedance.sdk.component.d.d.d.d1657027613261dc("_^rbvdkt"), jSONObject);
                }
                q(jSONObject2);
            }
        } catch (Exception unused) {
        }
    }

    private void e(JSONObject jSONObject) throws Exception {
        if (!TextUtils.isEmpty(this.j)) {
            jSONObject.put(com.bytedance.sdk.component.d.c.b.a.a1657027613264dc("chf"), this.j);
        }
        if (!TextUtils.isEmpty(this.l)) {
            jSONObject.put(com.bytedance.sdk.component.d.c.b.a.a1657027613264dc("lne\\a}rui"), this.l);
        }
        if (!TextUtils.isEmpty(this.n)) {
            jSONObject.put(com.bytedance.sdk.component.d.c.b.a.a1657027613264dc("dnumhjgcW|xg"), this.n);
        }
        jSONObject.put(com.bytedance.sdk.component.d.c.b.a.a1657027613264dc("db"), TextUtils.isEmpty(m.h().w()) ? m.h().w() : com.bytedance.sdk.component.d.c.b.a.a1657027613264dc("SF"));
        jSONObject.put(com.bytedance.sdk.component.d.c.b.a.a1657027613264dc("l`ldqdab"), com.bytedance.sdk.openadsdk.utils.u.k(m.a()));
    }

    private void f(JSONObject jSONObject) throws Exception {
        if (!TextUtils.isEmpty(p.b(this.q))) {
            jSONObject.put(com.bytedance.sdk.component.e.c.d.d1657027613220dc("pmczegjbWz~r`h"), p.b(this.q));
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(8:4|5|6|(1:8)|9|10|(1:24)(2:12|(2:14|25)(2:15|23))|16) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0067 */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0071 A[Catch:{ Exception -> 0x008e }] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x008b A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void g(java.lang.String r9) {
        /*
            r8 = this;
            java.lang.String r0 = "TUCm`winlFhainz"
            java.lang.String r1 = new java.lang.String     // Catch:{ Exception -> 0x008e }
            r2 = 2
            byte[] r2 = android.util.Base64.decode(r9, r2)     // Catch:{ Exception -> 0x008e }
            r1.<init>(r2)     // Catch:{ Exception -> 0x008e }
            java.lang.String r2 = com.bytedance.sdk.component.d.d.d.d1657027613261dc(r0)     // Catch:{ Exception -> 0x008e }
            com.bytedance.sdk.component.utils.l.b((java.lang.String) r2, (java.lang.String) r1)     // Catch:{ Exception -> 0x008e }
            org.json.JSONArray r2 = new org.json.JSONArray     // Catch:{ Exception -> 0x008e }
            r2.<init>(r1)     // Catch:{ Exception -> 0x008e }
            int r1 = r2.length()     // Catch:{ Exception -> 0x008e }
            r3 = 0
        L_0x001d:
            if (r3 >= r1) goto L_0x00bf
            com.bytedance.sdk.openadsdk.core.w$a r4 = new com.bytedance.sdk.openadsdk.core.w$a     // Catch:{ Exception -> 0x008e }
            r4.<init>()     // Catch:{ Exception -> 0x008e }
            org.json.JSONObject r5 = r2.optJSONObject(r3)     // Catch:{ all -> 0x0067 }
            if (r5 == 0) goto L_0x0067
            java.lang.String r6 = "_^opcZr~xl"
            java.lang.String r6 = com.bytedance.sdk.component.d.d.d.d1657027613261dc(r6)     // Catch:{ all -> 0x0067 }
            r7 = 0
            java.lang.String r6 = r5.optString(r6, r7)     // Catch:{ all -> 0x0067 }
            r4.f1718a = r6     // Catch:{ all -> 0x0067 }
            java.lang.String r6 = "_^abhidfkbUbh"
            java.lang.String r6 = com.bytedance.sdk.component.d.d.d.d1657027613261dc(r6)     // Catch:{ all -> 0x0067 }
            java.lang.String r6 = r5.optString(r6, r7)     // Catch:{ all -> 0x0067 }
            r4.f1719b = r6     // Catch:{ all -> 0x0067 }
            java.lang.String r6 = "ftl`"
            java.lang.String r6 = com.bytedance.sdk.component.d.d.d.d1657027613261dc(r6)     // Catch:{ all -> 0x0067 }
            java.lang.String r6 = r5.optString(r6)     // Catch:{ all -> 0x0067 }
            r4.f1720c = r6     // Catch:{ all -> 0x0067 }
            java.lang.String r6 = "p`pbiv"
            java.lang.String r6 = com.bytedance.sdk.component.d.d.d.d1657027613261dc(r6)     // Catch:{ all -> 0x0067 }
            org.json.JSONObject r6 = r5.optJSONObject(r6)     // Catch:{ all -> 0x0067 }
            r4.f1721d = r6     // Catch:{ all -> 0x0067 }
            java.lang.String r6 = "JRQGO"
            java.lang.String r6 = com.bytedance.sdk.component.d.d.d.d1657027613261dc(r6)     // Catch:{ all -> 0x0067 }
            int r5 = r5.optInt(r6)     // Catch:{ all -> 0x0067 }
            r4.f1722e = r5     // Catch:{ all -> 0x0067 }
        L_0x0067:
            java.lang.String r5 = r4.f1718a     // Catch:{ Exception -> 0x008e }
            java.lang.CharSequence r5 = (java.lang.CharSequence) r5     // Catch:{ Exception -> 0x008e }
            boolean r5 = android.text.TextUtils.isEmpty(r5)     // Catch:{ Exception -> 0x008e }
            if (r5 != 0) goto L_0x008b
            java.lang.String r5 = r4.f1720c     // Catch:{ Exception -> 0x008e }
            java.lang.CharSequence r5 = (java.lang.CharSequence) r5     // Catch:{ Exception -> 0x008e }
            boolean r5 = android.text.TextUtils.isEmpty(r5)     // Catch:{ Exception -> 0x008e }
            if (r5 == 0) goto L_0x007c
            goto L_0x008b
        L_0x007c:
            com.bytedance.sdk.component.utils.x r5 = r8.f1700e     // Catch:{ Exception -> 0x008e }
            r6 = 11
            android.os.Message r5 = r5.obtainMessage(r6)     // Catch:{ Exception -> 0x008e }
            r5.obj = r4     // Catch:{ Exception -> 0x008e }
            com.bytedance.sdk.component.utils.x r4 = r8.f1700e     // Catch:{ Exception -> 0x008e }
            r4.sendMessage(r5)     // Catch:{ Exception -> 0x008e }
        L_0x008b:
            int r3 = r3 + 1
            goto L_0x001d
        L_0x008e:
            boolean r1 = com.bytedance.sdk.component.utils.l.a()
            if (r1 == 0) goto L_0x00b2
            java.lang.String r0 = com.bytedance.sdk.component.d.d.d.d1657027613261dc(r0)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "f`koaa&sg)zj~~k/zbpa}qqr8ti|<lkzUD\u0002"
            java.lang.String r2 = com.bytedance.sdk.component.d.d.d.d1657027613261dc(r2)
            r1.append(r2)
            r1.append(r9)
            java.lang.String r9 = r1.toString()
            com.bytedance.sdk.component.utils.l.d(r0, r9)
            goto L_0x00bf
        L_0x00b2:
            java.lang.String r9 = com.bytedance.sdk.component.d.d.d.d1657027613261dc(r0)
            java.lang.String r0 = "f`koaa&sg)zj~~k/zbpa}qqr8ti|<lkzUD"
            java.lang.String r0 = com.bytedance.sdk.component.d.d.d.d1657027613261dc(r0)
            com.bytedance.sdk.component.utils.l.d(r9, r0)
        L_0x00bf:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.core.w.g(java.lang.String):void");
    }

    private void g(JSONObject jSONObject) {
        u uVar;
        if (jSONObject != null && (uVar = this.H) != null) {
            uVar.b(jSONObject);
        }
    }

    private void h(JSONObject jSONObject) {
        com.bytedance.sdk.openadsdk.g.b bVar = this.A;
        if (bVar != null && jSONObject != null) {
            bVar.a(jSONObject.optBoolean(com.bytedance.sdk.component.d.c.b.a.a1657027613264dc("irPfjacu[|i"), false), jSONObject.optInt(com.bytedance.sdk.component.d.c.b.a.a1657027613264dc("cnff"), -1), jSONObject.optString(com.bytedance.sdk.component.d.c.b.a.a1657027613264dc("mre"), ""));
        }
    }

    private boolean h(String str) {
        return TextUtils.isEmpty(str) || !com.bytedance.sdk.component.d.d.d.d1657027613261dc("cmk`oZis`lx").equals(str) || k();
    }

    private String i(String str) {
        if (this.r != null) {
            return str;
        }
        int i2 = this.m;
        while (true) {
            char c2 = '^';
            char c3 = '}';
            while (true) {
                switch (c2) {
                    case '^':
                        break;
                    case '_':
                        switch (c3) {
                            case '^':
                            case '`':
                                break;
                            case '_':
                                break;
                        }
                    case '`':
                        break;
                }
                switch (c3) {
                    case '7':
                    case '9':
                        break;
                    case '8':
                        break;
                }
                c2 = '_';
                c3 = '_';
            }
        }
        return com.bytedance.sdk.openadsdk.utils.u.a(i2);
    }

    /* access modifiers changed from: private */
    public void i(JSONObject jSONObject) {
        if (this.s != null && jSONObject != null) {
            try {
                this.s.a(jSONObject.optBoolean(com.bytedance.sdk.component.e.d.c.c1657027613239dc("mtvf"), false));
            } catch (Exception unused) {
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0038, code lost:
        r0 = r1.length();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void j(java.lang.String r3) {
        /*
            r2 = this;
            if (r3 != 0) goto L_0x0003
            return
        L_0x0003:
            java.lang.String r0 = "bxvf`dhdm3%$"
            java.lang.String r0 = com.bytedance.sdk.component.e.c.g.g1657027613239dc(r0)
            boolean r0 = r3.startsWith(r0)
            if (r0 != 0) goto L_0x0010
            return
        L_0x0010:
            java.lang.String r0 = "bxvf`dhdm3%$hd}qeq{Kxsdkx}~3"
            java.lang.String r0 = com.bytedance.sdk.component.e.c.g.g1657027613239dc(r0)
            java.lang.String r1 = "bxvf`dhdm3%$|gyqew<gpbe}jowh2"
            java.lang.String r1 = com.bytedance.sdk.component.e.c.g.g1657027613239dc(r1)
            boolean r0 = r3.equals(r0)     // Catch:{ Exception -> 0x0064 }
            if (r0 == 0) goto L_0x0032
            android.webkit.WebView r3 = r2.o()     // Catch:{ Exception -> 0x0064 }
            if (r3 == 0) goto L_0x0064
            java.lang.String r0 = "j`tbwftnx}0_cxzfq~X@Vgs|4Dzxj|HpWFQ@\u000e\u000e"
            java.lang.String r0 = com.bytedance.sdk.component.e.c.g.g1657027613239dc(r0)     // Catch:{ Exception -> 0x0064 }
            com.bytedance.sdk.component.utils.k.a(r3, r0)     // Catch:{ Exception -> 0x0064 }
            goto L_0x0064
        L_0x0032:
            boolean r0 = r3.startsWith(r1)     // Catch:{ Exception -> 0x0064 }
            if (r0 == 0) goto L_0x0064
            int r0 = r1.length()     // Catch:{ Exception -> 0x0064 }
            r1 = 38
            int r1 = r3.indexOf(r1, r0)     // Catch:{ Exception -> 0x0064 }
            if (r1 > 0) goto L_0x0045
            return
        L_0x0045:
            java.lang.String r0 = r3.substring(r0, r1)     // Catch:{ Exception -> 0x0064 }
            int r1 = r1 + 1
            java.lang.String r3 = r3.substring(r1)     // Catch:{ Exception -> 0x0064 }
            java.lang.String r1 = "SBGMAZ@B\\JBZYH[J"
            java.lang.String r1 = com.bytedance.sdk.component.e.c.g.g1657027613239dc(r1)     // Catch:{ Exception -> 0x0064 }
            boolean r0 = r0.equals(r1)     // Catch:{ Exception -> 0x0064 }
            if (r0 == 0) goto L_0x0064
            int r0 = r3.length()     // Catch:{ Exception -> 0x0064 }
            if (r0 <= 0) goto L_0x0064
            r2.g((java.lang.String) r3)     // Catch:{ Exception -> 0x0064 }
        L_0x0064:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.core.w.j(java.lang.String):void");
    }

    /* access modifiers changed from: private */
    public void j(JSONObject jSONObject) {
        if (this.s != null && jSONObject != null) {
            try {
                this.s.a(jSONObject.optInt(com.bytedance.sdk.component.e.d.c.c1657027613239dc("sucwaQwm"), -1));
            } catch (Exception unused) {
            }
        }
    }

    private boolean k(JSONObject jSONObject) {
        com.bytedance.sdk.openadsdk.core.nativeexpress.j jVar = this.s;
        if (!(jVar == null || jSONObject == null)) {
            double c2 = (double) jVar.c();
            int d2 = this.s.d();
            try {
                jSONObject.put(com.bytedance.sdk.component.e.c.g.g1657027613239dc("ctpqakrSado"), c2 / 1000.0d);
                jSONObject.put(com.bytedance.sdk.component.e.c.g.g1657027613239dc("sucwa"), d2);
                String g1657027613239dc = com.bytedance.sdk.component.e.c.g.g1657027613239dc("TUCm`winlFhainz");
                l.b(g1657027613239dc, com.bytedance.sdk.component.e.c.g.g1657027613239dc("ctpqakrSado'yo{u+") + d2);
                return true;
            } catch (Exception unused) {
            }
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0118, code lost:
        switch(r2) {
            case 40: goto L_0x0118;
            case 41: goto L_0x011c;
            case 42: goto L_0x011f;
            default: goto L_0x011b;
        };
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x011c, code lost:
        switch(r1) {
            case 70: goto L_0x0102;
            case 71: goto L_0x0102;
            case 72: goto L_0x0112;
            default: goto L_0x011f;
        };
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x011f, code lost:
        r4 = '6';
        r2 = 'Q';
        r1 = '[';
     */
    @com.bytedance.JProtect
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void l(org.json.JSONObject r20) {
        /*
            r19 = this;
            r0 = r19
            r1 = r20
            com.bytedance.sdk.component.adexpress.b.j r2 = r0.r
            if (r2 == 0) goto L_0x0139
            if (r1 != 0) goto L_0x000c
            goto L_0x0139
        L_0x000c:
            com.bytedance.sdk.component.adexpress.b.m r2 = new com.bytedance.sdk.component.adexpress.b.m
            r2.<init>()
            r3 = 1
            r2.a((int) r3)
            java.lang.String r4 = "irPfjacu[|i"
            java.lang.String r4 = com.bytedance.sdk.component.d.d.d.d1657027613261dc(r4)     // Catch:{ Exception -> 0x0128 }
            boolean r4 = r1.optBoolean(r4)     // Catch:{ Exception -> 0x0128 }
            java.lang.String r5 = "AeQj~`"
            java.lang.String r5 = com.bytedance.sdk.component.d.d.d.d1657027613261dc(r5)     // Catch:{ Exception -> 0x0128 }
            org.json.JSONObject r5 = r1.optJSONObject(r5)     // Catch:{ Exception -> 0x0128 }
            java.lang.String r6 = "hdkdlq"
            java.lang.String r7 = "whfwl"
            r8 = 0
            if (r5 == 0) goto L_0x0042
            java.lang.String r8 = com.bytedance.sdk.component.d.d.d.d1657027613261dc(r7)     // Catch:{ Exception -> 0x0128 }
            double r8 = r5.optDouble(r8)     // Catch:{ Exception -> 0x0128 }
            java.lang.String r10 = com.bytedance.sdk.component.d.d.d.d1657027613261dc(r6)     // Catch:{ Exception -> 0x0128 }
            double r10 = r5.optDouble(r10)     // Catch:{ Exception -> 0x0128 }
            goto L_0x0043
        L_0x0042:
            r10 = r8
        L_0x0043:
            java.lang.String r5 = "vhffkLhag"
            java.lang.String r5 = com.bytedance.sdk.component.d.d.d.d1657027613261dc(r5)     // Catch:{ Exception -> 0x0128 }
            org.json.JSONObject r5 = r1.optJSONObject(r5)     // Catch:{ Exception -> 0x0128 }
            if (r5 == 0) goto L_0x00ca
            java.lang.String r12 = "x"
            java.lang.String r12 = com.bytedance.sdk.component.d.d.d.d1657027613261dc(r12)     // Catch:{ Exception -> 0x00c5 }
            double r12 = r5.optDouble(r12)     // Catch:{ Exception -> 0x00c5 }
            java.lang.String r14 = "y"
            java.lang.String r14 = com.bytedance.sdk.component.d.d.d.d1657027613261dc(r14)     // Catch:{ Exception -> 0x00c5 }
            double r14 = r5.optDouble(r14)     // Catch:{ Exception -> 0x00c5 }
            java.lang.String r7 = com.bytedance.sdk.component.d.d.d.d1657027613261dc(r7)     // Catch:{ Exception -> 0x00c5 }
            r16 = r4
            double r3 = r5.optDouble(r7)     // Catch:{ Exception -> 0x00c5 }
            java.lang.String r6 = com.bytedance.sdk.component.d.d.d.d1657027613261dc(r6)     // Catch:{ Exception -> 0x00c5 }
            double r6 = r5.optDouble(r6)     // Catch:{ Exception -> 0x00c5 }
            boolean r17 = r0.m(r5)     // Catch:{ Exception -> 0x00c5 }
            if (r17 == 0) goto L_0x00b6
            java.lang.String r17 = "bnpgawTfl`xXb~Cuwf"
            java.lang.String r0 = com.bytedance.sdk.component.d.d.d.d1657027613261dc(r17)     // Catch:{ Exception -> 0x00c5 }
            r17 = r10
            double r10 = r5.optDouble(r0)     // Catch:{ Exception -> 0x00c5 }
            float r0 = (float) r10     // Catch:{ Exception -> 0x00c5 }
            r2.a((float) r0)     // Catch:{ Exception -> 0x00c5 }
            java.lang.String r0 = "bnpgawTfl`xXb~]yvzg"
            java.lang.String r0 = com.bytedance.sdk.component.d.d.d.d1657027613261dc(r0)     // Catch:{ Exception -> 0x00c5 }
            double r10 = r5.optDouble(r0)     // Catch:{ Exception -> 0x00c5 }
            float r0 = (float) r10     // Catch:{ Exception -> 0x00c5 }
            r2.b((float) r0)     // Catch:{ Exception -> 0x00c5 }
            java.lang.String r0 = "bnpgawTfl`xNbz{|^vra"
            java.lang.String r0 = com.bytedance.sdk.component.d.d.d.d1657027613261dc(r0)     // Catch:{ Exception -> 0x00c5 }
            double r10 = r5.optDouble(r0)     // Catch:{ Exception -> 0x00c5 }
            float r0 = (float) r10     // Catch:{ Exception -> 0x00c5 }
            r2.c((float) r0)     // Catch:{ Exception -> 0x00c5 }
            java.lang.String r0 = "bnpgawTfl`xNbz{|@zs}b"
            java.lang.String r0 = com.bytedance.sdk.component.d.d.d.d1657027613261dc(r0)     // Catch:{ Exception -> 0x00c5 }
            double r10 = r5.optDouble(r0)     // Catch:{ Exception -> 0x00c5 }
            float r0 = (float) r10     // Catch:{ Exception -> 0x00c5 }
            r2.d((float) r0)     // Catch:{ Exception -> 0x00c5 }
            goto L_0x00b8
        L_0x00b6:
            r17 = r10
        L_0x00b8:
            r2.c((double) r12)     // Catch:{ Exception -> 0x00c5 }
            r2.d((double) r14)     // Catch:{ Exception -> 0x00c5 }
            r2.e(r3)     // Catch:{ Exception -> 0x00c5 }
            r2.f(r6)     // Catch:{ Exception -> 0x00c5 }
            goto L_0x00ce
        L_0x00c5:
            r1 = 101(0x65, float:1.42E-43)
            r0 = r19
            goto L_0x012a
        L_0x00ca:
            r16 = r4
            r17 = r10
        L_0x00ce:
            java.lang.String r0 = "mdqpebc"
            java.lang.String r0 = com.bytedance.sdk.component.d.d.d.d1657027613261dc(r0)     // Catch:{ Exception -> 0x0126 }
            r3 = 101(0x65, float:1.42E-43)
            java.lang.String r4 = com.bytedance.sdk.openadsdk.core.g.a(r3)     // Catch:{ Exception -> 0x0126 }
            java.lang.String r0 = r1.optString(r0, r4)     // Catch:{ Exception -> 0x0126 }
            java.lang.String r4 = "cnff"
            java.lang.String r4 = com.bytedance.sdk.component.d.d.d.d1657027613261dc(r4)     // Catch:{ Exception -> 0x0126 }
            int r1 = r1.optInt(r4, r3)     // Catch:{ Exception -> 0x0126 }
            r3 = r16
            r2.a((boolean) r3)     // Catch:{ Exception -> 0x0126 }
            r2.a((double) r8)     // Catch:{ Exception -> 0x0126 }
            r8 = r17
            r2.b((double) r8)     // Catch:{ Exception -> 0x0126 }
            r2.a((java.lang.String) r0)     // Catch:{ Exception -> 0x0126 }
            r2.b((int) r1)     // Catch:{ Exception -> 0x0126 }
            r0 = r19
            com.bytedance.sdk.component.adexpress.b.j r1 = r0.r     // Catch:{ Exception -> 0x0128 }
            r1.a(r2)     // Catch:{ Exception -> 0x0128 }
        L_0x0102:
            r1 = -84
            r3 = 17
            r2 = 17
        L_0x0108:
            if (r2 == r3) goto L_0x0110
        L_0x010a:
            switch(r1) {
                case 89: goto L_0x0102;
                case 90: goto L_0x0102;
                case 91: goto L_0x0139;
                default: goto L_0x010d;
            }
        L_0x010d:
            r1 = 90
            goto L_0x010a
        L_0x0110:
            r4 = 11
        L_0x0112:
            r4 = 56
        L_0x0114:
            switch(r4) {
                case 54: goto L_0x0108;
                case 55: goto L_0x0118;
                case 56: goto L_0x011f;
                default: goto L_0x0117;
            }
        L_0x0117:
            goto L_0x0112
        L_0x0118:
            switch(r2) {
                case 40: goto L_0x0118;
                case 41: goto L_0x011c;
                case 42: goto L_0x011f;
                default: goto L_0x011b;
            }
        L_0x011b:
            goto L_0x011f
        L_0x011c:
            switch(r1) {
                case 70: goto L_0x0102;
                case 71: goto L_0x0102;
                case 72: goto L_0x0112;
                default: goto L_0x011f;
            }
        L_0x011f:
            r4 = 54
            r2 = 81
            r1 = 91
            goto L_0x0114
        L_0x0126:
            r0 = r19
        L_0x0128:
            r1 = 101(0x65, float:1.42E-43)
        L_0x012a:
            r2.b((int) r1)
            java.lang.String r1 = com.bytedance.sdk.openadsdk.core.g.a(r1)
            r2.a((java.lang.String) r1)
            com.bytedance.sdk.component.adexpress.b.j r1 = r0.r
            r1.a(r2)
        L_0x0139:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.core.w.l(org.json.JSONObject):void");
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x003b  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0045  */
    /* JADX WARNING: Removed duplicated region for block: B:22:? A[ORIG_RETURN, RETURN, SYNTHETIC] */
    private boolean m(org.json.JSONObject r5) {
        /*
            r4 = this;
            java.lang.String r0 = "bnpgawTfl`xXb~Cuwf"
            java.lang.String r0 = com.bytedance.sdk.component.e.d.c.c1657027613239dc(r0)
            boolean r0 = r5.has(r0)
            r1 = 0
            r2 = 56
            r3 = 60
            if (r0 == 0) goto L_0x0034
            java.lang.String r0 = "bnpgawTfl`xNbz{|^vra"
            java.lang.String r0 = com.bytedance.sdk.component.e.d.c.c1657027613239dc(r0)
            boolean r0 = r5.has(r0)
            if (r0 == 0) goto L_0x0034
            java.lang.String r0 = "bnpgawTfl`xXb~]yvzg"
            java.lang.String r0 = com.bytedance.sdk.component.e.d.c.c1657027613239dc(r0)
            boolean r0 = r5.has(r0)
            if (r0 == 0) goto L_0x0034
            java.lang.String r0 = "bnpgawTfl`xNbz{|@zs}b"
            java.lang.String r0 = com.bytedance.sdk.component.e.d.c.c1657027613239dc(r0)
            boolean r5 = r5.has(r0)
            goto L_0x0043
        L_0x0034:
            r5 = 0
        L_0x0035:
            r0 = 41
        L_0x0037:
            switch(r0) {
                case 40: goto L_0x003b;
                case 41: goto L_0x0055;
                case 42: goto L_0x0035;
                default: goto L_0x003a;
            }
        L_0x003a:
            goto L_0x0035
        L_0x003b:
            switch(r3) {
                case 81: goto L_0x003f;
                case 82: goto L_0x0049;
                case 83: goto L_0x0047;
                default: goto L_0x003e;
            }
        L_0x003e:
            goto L_0x0055
        L_0x003f:
            switch(r2) {
                case 29: goto L_0x0047;
                case 30: goto L_0x0047;
                case 31: goto L_0x0043;
                default: goto L_0x0042;
            }
        L_0x0042:
            goto L_0x0049
        L_0x0043:
            if (r5 == 0) goto L_0x0034
            r5 = 1
            goto L_0x004d
        L_0x0047:
            r1 = r5
            goto L_0x0055
        L_0x0049:
            switch(r2) {
                case 39: goto L_0x004d;
                case 40: goto L_0x0034;
                case 41: goto L_0x0055;
                default: goto L_0x004c;
            }
        L_0x004c:
            goto L_0x0052
        L_0x004d:
            r0 = 40
            r3 = 83
            goto L_0x0037
        L_0x0052:
            r2 = 39
            goto L_0x0049
        L_0x0055:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.core.w.m(org.json.JSONObject):boolean");
    }

    private void n(JSONObject jSONObject) {
        if (jSONObject != null) {
            l.b(com.bytedance.sdk.component.e.d.c.c1657027613239dc("TUCm`winlFhainz"), com.bytedance.sdk.component.e.d.c.c1657027613239dc("TUCm`winlFhainz/xp|wxpdSaw{vu~JmABI"));
            try {
                Uri parse = Uri.parse(jSONObject.optString(com.bytedance.sdk.component.e.d.c.c1657027613239dc("tsc`oAgsi")));
                if (com.bytedance.sdk.component.e.d.c.c1657027613239dc("bxvf`dhdm").equals(parse.getScheme().toLowerCase())) {
                    i.a(parse, this);
                    char c2 = '(';
                    while (true) {
                        switch (c2) {
                            case ')':
                                return;
                            default:
                                c2 = ')';
                        }
                    }
                }
            } catch (Exception unused) {
            }
        }
    }

    private WebView o() {
        WeakReference<SSWebView> weakReference = this.f1699d;
        if (weakReference == null || weakReference.get() == null) {
            return null;
        }
        return ((SSWebView) this.f1699d.get()).getWebView();
    }

    private void o(JSONObject jSONObject) {
        if (jSONObject != null && this.u != null) {
            try {
                JSONArray optJSONArray = jSONObject.optJSONArray(com.bytedance.sdk.component.e.c.e.e1657027613237dc("tdobmUthl|iEi}"));
                if (optJSONArray == null || optJSONArray.length() <= 0) {
                    this.u.a(false, (JSONArray) null);
                    return;
                }
                this.u.a(true, optJSONArray);
                char c2 = '\'';
                while (true) {
                    switch (c2) {
                        case '&':
                            return;
                        default:
                            c2 = '&';
                    }
                }
            } catch (Exception unused) {
                this.u.a(false, (JSONArray) null);
            }
        }
    }

    @JProtect
    private JSONObject p() {
        try {
            View view = (View) this.k.get();
            View view2 = (View) this.f1699d.get();
            if (view != null) {
                if (view2 != null) {
                    int[] b2 = v.b(view);
                    int[] b3 = v.b(view2);
                    if (b2 != null) {
                        if (b3 != null) {
                            JSONObject jSONObject = new JSONObject();
                            jSONObject.put(com.bytedance.sdk.component.e.c.d.d1657027613220dc("x"), v.d(m.a(), (float) (b2[0] - b3[0])));
                            jSONObject.put(com.bytedance.sdk.component.e.c.d.d1657027613220dc("y"), v.d(m.a(), (float) (b2[1] - b3[1])));
                            jSONObject.put(com.bytedance.sdk.component.e.c.d.d1657027613220dc("w"), v.d(m.a(), (float) view.getWidth()));
                            jSONObject.put(com.bytedance.sdk.component.e.c.d.d1657027613220dc("h"), v.d(m.a(), (float) view.getHeight()));
                            jSONObject.put(com.bytedance.sdk.component.e.c.d.d1657027613220dc("irG{mvr"), true);
                            return jSONObject;
                        }
                    }
                    l.e(com.bytedance.sdk.component.e.c.d.d1657027613220dc("TUCm`winlFhainz"), com.bytedance.sdk.component.e.c.d.d1657027613220dc("sdv@hjubJ|~ccGav~2vfgye8iuhuiwpN\u0001MQ\u0004RCE~@O\\|B]FDX]]\u0014\\E\u0017VLVW"));
                    return null;
                }
            }
            l.e(com.bytedance.sdk.component.e.c.d.d1657027613220dc("TUCm`winlFhainz"), com.bytedance.sdk.component.e.c.d.d1657027613220dc("sdv@hjubJ|~ccGav~2vfgye8zvtox\\jTUMM\u0004LU\u0007F\\FG"));
            return null;
        } catch (Throwable th) {
            l.a(com.bytedance.sdk.component.e.c.d.d1657027613220dc("TUCm`winlFhainz"), com.bytedance.sdk.component.e.c.d.d1657027613220dc("sdv@hjubJ|~ccGav~2vfgye"), th);
            return null;
        }
    }

    private boolean p(JSONObject jSONObject) {
        try {
            jSONObject.put(com.bytedance.sdk.component.e.c.e.e1657027613237dc("csgbplpb{"), b(this.D));
            while (true) {
                char c2 = '_';
                char c3 = '_';
                while (true) {
                    switch (c2) {
                        case '^':
                            if (c3 != '\'') {
                                break;
                            } else {
                                continue;
                            }
                        case '_':
                            switch (c3) {
                                case '^':
                                case '`':
                                    continue;
                                case '_':
                                    break;
                            }
                        case '`':
                            break;
                    }
                    switch (c3) {
                        case '7':
                        case '8':
                        case '9':
                            break;
                    }
                    c2 = '^';
                    c3 = '}';
                }
            }
            return true;
        } catch (Exception unused) {
            return true;
        }
    }

    private List<String> q() {
        return Arrays.asList(new String[]{com.bytedance.sdk.openadsdk.b.i.i1657027613257dc("aqrJjci"), com.bytedance.sdk.openadsdk.b.i.i1657027613257dc("aeKmbj"), com.bytedance.sdk.openadsdk.b.i.i1657027613257dc("gdvWahvki}oBbka"), com.bytedance.sdk.openadsdk.b.i.i1657027613257dc("gdvWaHgnImy")});
    }

    private void q(JSONObject jSONObject) {
        WebView o2;
        if (jSONObject != null && (o2 = o()) != null) {
            String str = com.bytedance.sdk.component.d.c.b.a.a1657027613264dc("j`tbwftnx}0_cxzfq~X@Vgs|4Dt|p{LDoFWVG@MoXDAyAZDXS\\\u001c") + jSONObject.toString() + com.bytedance.sdk.component.d.c.b.a.a1657027613264dc(")");
            k.a(o2, str);
            if (l.a()) {
                l.a(com.bytedance.sdk.component.d.c.b.a.a1657027613264dc("TUCm`winlFhainz"), com.bytedance.sdk.component.d.c.b.a.a1657027613264dc("jr]nwb&") + str);
            }
        }
    }

    private JSONObject r(JSONObject jSONObject) {
        if (this.f1696a != null) {
            if (jSONObject == null) {
                jSONObject = new JSONObject();
            }
            try {
                JSONObject jSONObject2 = new JSONObject();
                String optString = jSONObject.optString(com.bytedance.sdk.component.e.c.d.d1657027613220dc("ae]f|qtfWmkm"), (String) null);
                if (optString != null) {
                    jSONObject2 = new JSONObject(optString);
                }
                for (Map.Entry next : this.f1696a.entrySet()) {
                    jSONObject2.put((String) next.getKey(), next.getValue());
                }
                jSONObject.put(com.bytedance.sdk.component.e.c.d.d1657027613220dc("ae]f|qtfWmkm"), jSONObject2.toString());
            } catch (Exception e2) {
                l.b(e2.toString());
            }
        }
        return jSONObject;
    }

    private void r() {
        h hVar = this.B;
        if (hVar != null) {
            hVar.a();
        }
    }

    private void s() {
        h hVar = this.B;
        if (hVar != null) {
            hVar.b();
        }
    }

    /* access modifiers changed from: private */
    public void t() {
        com.bytedance.sdk.openadsdk.core.nativeexpress.j jVar = this.s;
        if (jVar != null) {
            jVar.a();
            while (true) {
                char c2 = 15;
                while (true) {
                    switch (c2) {
                        case 13:
                        case 14:
                            return;
                        default:
                            c2 = 14;
                    }
                }
            }
        }
    }

    private void u() {
        WeakReference<Context> weakReference = this.f1702h;
        if (weakReference != null && weakReference.get() != null && !TextUtils.isEmpty(m.h().s())) {
            TTWebsiteActivity.a((Context) this.f1702h.get(), this.q, this.J);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x00a1 A[Catch:{ Exception -> 0x00c2 }] */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x00a2 A[Catch:{ Exception -> 0x00c2 }] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x00b0 A[Catch:{ Exception -> 0x00c2 }] */
    @com.bytedance.JProtect
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private org.json.JSONObject v() {
        /*
            r10 = this;
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
            com.bytedance.sdk.openadsdk.core.i.f r1 = com.bytedance.sdk.openadsdk.core.m.h()
            if (r1 == 0) goto L_0x00c2
            com.bytedance.sdk.openadsdk.core.e.n r1 = r10.q     // Catch:{ Exception -> 0x00c2 }
            int r1 = com.bytedance.sdk.openadsdk.utils.u.f((com.bytedance.sdk.openadsdk.core.e.n) r1)     // Catch:{ Exception -> 0x00c2 }
            com.bytedance.sdk.openadsdk.core.e.n r2 = r10.q     // Catch:{ Exception -> 0x00c2 }
            int r2 = com.bytedance.sdk.openadsdk.utils.u.e((com.bytedance.sdk.openadsdk.core.e.n) r2)     // Catch:{ Exception -> 0x00c2 }
            com.bytedance.sdk.openadsdk.core.i.f r3 = com.bytedance.sdk.openadsdk.core.m.h()     // Catch:{ Exception -> 0x00c2 }
            java.lang.String r4 = java.lang.String.valueOf(r1)     // Catch:{ Exception -> 0x00c2 }
            int r3 = r3.f((java.lang.String) r4)     // Catch:{ Exception -> 0x00c2 }
            com.bytedance.sdk.openadsdk.core.i.f r4 = com.bytedance.sdk.openadsdk.core.m.h()     // Catch:{ Exception -> 0x00c2 }
            int r4 = r4.e((int) r1)     // Catch:{ Exception -> 0x00c2 }
            com.bytedance.sdk.openadsdk.core.i.f r5 = com.bytedance.sdk.openadsdk.core.m.h()     // Catch:{ Exception -> 0x00c2 }
            java.lang.String r6 = java.lang.String.valueOf(r1)     // Catch:{ Exception -> 0x00c2 }
            boolean r5 = r5.c((java.lang.String) r6)     // Catch:{ Exception -> 0x00c2 }
            com.bytedance.sdk.openadsdk.core.e.n r6 = r10.q     // Catch:{ Exception -> 0x00c2 }
            boolean r6 = com.bytedance.sdk.openadsdk.core.e.n.c((com.bytedance.sdk.openadsdk.core.e.n) r6)     // Catch:{ Exception -> 0x00c2 }
            r7 = 1
            r8 = 0
            if (r6 != 0) goto L_0x0051
            com.bytedance.sdk.openadsdk.core.i.f r6 = com.bytedance.sdk.openadsdk.core.m.h()     // Catch:{ Exception -> 0x00c2 }
            java.lang.String r9 = java.lang.String.valueOf(r1)     // Catch:{ Exception -> 0x00c2 }
            int r6 = r6.j((java.lang.String) r9)     // Catch:{ Exception -> 0x00c2 }
            if (r6 != r7) goto L_0x0051
            r6 = 1
            goto L_0x0052
        L_0x0051:
            r6 = 0
        L_0x0052:
            r9 = 7
            if (r2 == r9) goto L_0x0063
            r9 = 8
            if (r2 != r9) goto L_0x005a
            goto L_0x0063
        L_0x005a:
            com.bytedance.sdk.openadsdk.core.i.f r2 = com.bytedance.sdk.openadsdk.core.m.h()     // Catch:{ Exception -> 0x00c2 }
            boolean r1 = r2.a((int) r1)     // Catch:{ Exception -> 0x00c2 }
            goto L_0x006b
        L_0x0063:
            com.bytedance.sdk.openadsdk.core.i.f r2 = com.bytedance.sdk.openadsdk.core.m.h()     // Catch:{ Exception -> 0x00c2 }
            boolean r1 = r2.b((int) r1)     // Catch:{ Exception -> 0x00c2 }
        L_0x006b:
            java.lang.String r2 = "vnk`aZehf}xd`"
            java.lang.String r2 = com.bytedance.sdk.component.e.c.g.g1657027613239dc(r2)     // Catch:{ Exception -> 0x00c2 }
            r0.put(r2, r1)     // Catch:{ Exception -> 0x00c2 }
            java.lang.String r1 = "rw]polvX|`gn"
            java.lang.String r1 = com.bytedance.sdk.component.e.c.g.g1657027613239dc(r1)     // Catch:{ Exception -> 0x00c2 }
            r0.put(r1, r3)     // Catch:{ Exception -> 0x00c2 }
            java.lang.String r1 = "fw]polvX{ae|"
            java.lang.String r1 = com.bytedance.sdk.component.e.c.g.g1657027613239dc(r1)     // Catch:{ Exception -> 0x00c2 }
            r0.put(r1, r5)     // Catch:{ Exception -> 0x00c2 }
            java.lang.String r1 = "iw]polvX|`gn"
            java.lang.String r1 = com.bytedance.sdk.component.e.c.g.g1657027613239dc(r1)     // Catch:{ Exception -> 0x00c2 }
            r0.put(r1, r4)     // Catch:{ Exception -> 0x00c2 }
            java.lang.String r1 = "simt[aotd`an"
            java.lang.String r1 = com.bytedance.sdk.component.e.c.g.g1657027613239dc(r1)     // Catch:{ Exception -> 0x00c2 }
            com.bytedance.sdk.openadsdk.core.e.n r2 = r10.q     // Catch:{ Exception -> 0x00c2 }
            if (r2 == 0) goto L_0x00a2
            com.bytedance.sdk.openadsdk.core.e.n r2 = r10.q     // Catch:{ Exception -> 0x00c2 }
            boolean r2 = r2.ap()     // Catch:{ Exception -> 0x00c2 }
            if (r2 == 0) goto L_0x00a2
            goto L_0x00a3
        L_0x00a2:
            r7 = 0
        L_0x00a3:
            r0.put(r1, r7)     // Catch:{ Exception -> 0x00c2 }
            java.lang.String r1 = "vhffkZgciy~jxdaa"
            java.lang.String r1 = com.bytedance.sdk.component.e.c.g.g1657027613239dc(r1)     // Catch:{ Exception -> 0x00c2 }
            com.bytedance.sdk.openadsdk.core.e.n r2 = r10.q     // Catch:{ Exception -> 0x00c2 }
            if (r2 == 0) goto L_0x00b6
            com.bytedance.sdk.openadsdk.core.e.n r2 = r10.q     // Catch:{ Exception -> 0x00c2 }
            int r8 = r2.t()     // Catch:{ Exception -> 0x00c2 }
        L_0x00b6:
            r0.put(r1, r8)     // Catch:{ Exception -> 0x00c2 }
            java.lang.String r1 = "sjks[fnffnoTxbQl|~av"
            java.lang.String r1 = com.bytedance.sdk.component.e.c.g.g1657027613239dc(r1)     // Catch:{ Exception -> 0x00c2 }
            r0.put(r1, r6)     // Catch:{ Exception -> 0x00c2 }
        L_0x00c2:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.core.w.v():org.json.JSONObject");
    }

    /* access modifiers changed from: private */
    public void w() {
        Context context;
        List<n> list = this.D;
        if (list != null && list.size() > 0) {
            this.E = new HashMap<>();
            View view = null;
            WeakReference<SSWebView> weakReference = this.f1699d;
            if (weakReference != null) {
                view = (View) weakReference.get();
            }
            WeakReference<Context> weakReference2 = this.f1702h;
            if (weakReference2 != null && (context = (Context) weakReference2.get()) != null) {
                for (n next : this.D) {
                    this.E.put(next.Y(), new i(context, next, view));
                }
            }
        }
    }

    private boolean x() {
        n nVar = this.q;
        if (nVar == null || nVar.ak() == null || p.a(this.q) || this.F || this.q.ak().optInt(com.bytedance.sdk.component.e.c.g.g1657027613239dc("p`pfjqYsqyo")) != 2) {
            return false;
        }
        int e2 = com.bytedance.sdk.openadsdk.utils.u.e(this.q);
        if (e2 != 8 && e2 != 7) {
            return false;
        }
        this.F = true;
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001a, code lost:
        switch(r2) {
            case 55: goto L_0x000f;
            case 56: goto L_0x000f;
            case 57: goto L_0x000f;
            default: goto L_0x001d;
        };
     */
    /* JADX WARNING: Removed duplicated region for block: B:5:0x0017  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void y() {
        /*
            r3 = this;
            com.bytedance.sdk.openadsdk.e.c r0 = r3.i
            r1 = 95
            if (r0 != 0) goto L_0x000f
            com.bytedance.sdk.openadsdk.core.e.n r0 = r3.q
            com.bytedance.sdk.openadsdk.e.a r0 = com.bytedance.sdk.openadsdk.e.a.a((com.bytedance.sdk.openadsdk.e.b) r3, (com.bytedance.sdk.openadsdk.core.e.n) r0)
            r3.i = r0
            goto L_0x0022
        L_0x000f:
            r0 = 94
            r2 = 125(0x7d, float:1.75E-43)
        L_0x0013:
            switch(r0) {
                case 94: goto L_0x001e;
                case 95: goto L_0x0017;
                case 96: goto L_0x001a;
                default: goto L_0x0016;
            }
        L_0x0016:
            goto L_0x000f
        L_0x0017:
            switch(r2) {
                case 94: goto L_0x0022;
                case 95: goto L_0x000f;
                case 96: goto L_0x0022;
                default: goto L_0x001a;
            }
        L_0x001a:
            switch(r2) {
                case 55: goto L_0x000f;
                case 56: goto L_0x000f;
                case 57: goto L_0x000f;
                default: goto L_0x001d;
            }
        L_0x001d:
            goto L_0x0027
        L_0x001e:
            r0 = 39
            if (r2 != r0) goto L_0x0027
        L_0x0022:
            r0 = 95
            r2 = 95
            goto L_0x0013
        L_0x0027:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.core.w.y():void");
    }

    public r a() {
        return this.I;
    }

    public w a(int i2) {
        this.o = i2;
        return this;
    }

    public w a(View view) {
        while (true) {
            char c2 = '^';
            char c3 = 'K';
            while (true) {
                switch (c2) {
                    case '\\':
                        switch (c3) {
                            case 21:
                                break;
                            case 22:
                                break;
                            case 23:
                                break;
                        }
                    case ']':
                        break;
                    case '^':
                        break;
                }
                c2 = ']';
                c3 = ']';
            }
            while (true) {
                switch (c3) {
                    case '[':
                    case '\\':
                        break;
                    case ']':
                        break;
                    default:
                        c3 = '[';
                }
            }
        }
        this.k = new WeakReference<>(view);
        return this;
    }

    public w a(j jVar) {
        this.r = jVar;
        return this;
    }

    public w a(SSWebView sSWebView) {
        String c1657027613239dc = com.bytedance.sdk.component.e.d.c.c1657027613239dc("wd`um`qwgff");
        l.e(c1657027613239dc, com.bytedance.sdk.component.e.d.c.c1657027613239dc("=<?vw`Ltj;*|ioXfuf2{uf~Tw}!") + sSWebView.hashCode());
        if (sSWebView == null && sSWebView.getWebView() == null) {
            return this;
        }
        try {
            r b2 = r.a(sSWebView.getWebView()).a((com.bytedance.sdk.component.a.a) new com.bytedance.sdk.openadsdk.f.a()).a(com.bytedance.sdk.component.e.d.c.c1657027613239dc("TnwwmdiM[Kxbhjk")).a((com.bytedance.sdk.component.a.l) new com.bytedance.sdk.component.a.l() {
                public <T> T a(String str, Type type) {
                    return null;
                }

                public <T> String a(T t) {
                    return null;
                }
            }).a(h.d().s()).b(true).a().b();
            this.I = b2;
            com.bytedance.sdk.openadsdk.f.a.e.a(b2, this);
            com.bytedance.sdk.openadsdk.f.a.a.a(this.I, this);
            com.bytedance.sdk.openadsdk.f.a.b.a(this.I, this);
            com.bytedance.sdk.openadsdk.f.a.c.a(this.I, this);
            com.bytedance.sdk.openadsdk.f.a.d.a(this.I, this);
        } catch (Exception unused) {
        }
        return this;
    }

    public w a(u uVar) {
        this.H = uVar;
        return this;
    }

    public w a(com.bytedance.sdk.openadsdk.core.b.d dVar) {
        this.z = dVar;
        return this;
    }

    public w a(n nVar) {
        this.q = nVar;
        return this;
    }

    public w a(com.bytedance.sdk.openadsdk.core.nativeexpress.j jVar) {
        this.s = jVar;
        return this;
    }

    public w a(d dVar) {
        this.u = dVar;
        return this;
    }

    public w a(com.bytedance.sdk.openadsdk.g.a aVar) {
        this.v = aVar;
        return this;
    }

    public w a(com.bytedance.sdk.openadsdk.g.b bVar) {
        this.A = bVar;
        return this;
    }

    public w a(com.bytedance.sdk.openadsdk.g.d dVar) {
        this.x = dVar;
        return this;
    }

    public w a(e eVar) {
        this.w = eVar;
        return this;
    }

    public w a(h hVar) {
        this.B = hVar;
        return this;
    }

    public w a(List<n> list) {
        this.D = list;
        return this;
    }

    public w a(Map<String, Object> map) {
        this.f1696a = map;
        return this;
    }

    public w a(JSONObject jSONObject) {
        this.t = jSONObject;
        return this;
    }

    public w a(boolean z2) {
        this.f1697b = z2;
        return this;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:182:0x042a, code lost:
        if (r5 != null) goto L_0x045c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:189:0x045a, code lost:
        if (r5 != null) goto L_0x045c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:190:0x045c, code lost:
        r3 = r5;
     */
    @com.bytedance.JProtect
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public org.json.JSONObject a(com.bytedance.sdk.openadsdk.core.w.a r22, int r23) throws java.lang.Exception {
        /*
            r21 = this;
            r0 = r21
            r1 = r22
            r2 = r23
            java.lang.String r3 = "c`no"
            java.lang.String r3 = com.bytedance.sdk.component.e.c.d.d1657027613220dc(r3)
            java.lang.String r4 = r1.f1718a
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto L_0x0016
            r1 = 0
            return r1
        L_0x0016:
            com.bytedance.sdk.openadsdk.core.h r3 = com.bytedance.sdk.openadsdk.core.h.d()
            boolean r3 = r3.s()
            java.lang.String r4 = "TUCm`winlFhainz"
            if (r3 == 0) goto L_0x0065
            java.lang.String r3 = com.bytedance.sdk.component.d.d.g.g1657027613257dc(r4)
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "[KQA)WCVU)|n~~g`~+"
            java.lang.String r6 = com.bytedance.sdk.component.d.d.g.g1657027613257dc(r6)
            r5.append(r6)
            r5.append(r2)
            java.lang.String r6 = " lgwljb="
            java.lang.String r6 = com.bytedance.sdk.component.d.d.g.g1657027613257dc(r6)
            r5.append(r6)
            java.lang.String r6 = r1.f1720c
            r5.append(r6)
            java.lang.String r6 = " qcqehu:"
            java.lang.String r6 = com.bytedance.sdk.component.d.d.g.g1657027613257dc(r6)
            r5.append(r6)
            org.json.JSONObject r6 = r1.f1721d
            if (r6 == 0) goto L_0x0059
            org.json.JSONObject r6 = r1.f1721d
            java.lang.String r6 = r6.toString()
            goto L_0x005b
        L_0x0059:
            java.lang.String r6 = ""
        L_0x005b:
            r5.append(r6)
            java.lang.String r5 = r5.toString()
            android.util.Log.d(r3, r5)
        L_0x0065:
            org.json.JSONObject r3 = new org.json.JSONObject
            r3.<init>()
            java.lang.String r5 = r1.f1720c
            int r6 = r5.hashCode()
            r7 = 3
            r8 = 0
            java.lang.String r9 = "oqgmTwoqijs"
            r10 = -1
            r11 = 1
            switch(r6) {
                case -2036781162: goto L_0x028b;
                case -1423303823: goto L_0x027d;
                case -1330994877: goto L_0x026e;
                case -1169135450: goto L_0x025f;
                case -1023873614: goto L_0x0250;
                case -844321441: goto L_0x0241;
                case -800853518: goto L_0x0232;
                case -794273169: goto L_0x0223;
                case -715147645: goto L_0x0214;
                case -511324706: goto L_0x0206;
                case -489318846: goto L_0x01f6;
                case -278382602: goto L_0x01e6;
                case -173752734: goto L_0x01d7;
                case 27837080: goto L_0x01c7;
                case 94756344: goto L_0x01b7;
                case 105049135: goto L_0x01a7;
                case 399543522: goto L_0x0197;
                case 402955465: goto L_0x0188;
                case 425443791: goto L_0x0178;
                case 442647767: goto L_0x0168;
                case 571273292: goto L_0x0158;
                case 650209982: goto L_0x0149;
                case 672928467: goto L_0x0139;
                case 711635577: goto L_0x0129;
                case 885131792: goto L_0x0119;
                case 1107374321: goto L_0x0109;
                case 1151744482: goto L_0x00f9;
                case 1237100796: goto L_0x00e9;
                case 1532142616: goto L_0x00d9;
                case 1634511418: goto L_0x00c9;
                case 1713585602: goto L_0x00b9;
                case 1731806400: goto L_0x00aa;
                case 1979895452: goto L_0x009b;
                case 2086000188: goto L_0x008b;
                case 2105008900: goto L_0x007b;
                default: goto L_0x0079;
            }
        L_0x0079:
            goto L_0x029a
        L_0x007b:
            java.lang.String r6 = "l`lgwfgwmVigene"
            java.lang.String r6 = com.bytedance.sdk.component.e.c.d.d1657027613220dc(r6)
            boolean r5 = r5.equals(r6)
            if (r5 == 0) goto L_0x029a
            r5 = 16
            goto L_0x029b
        L_0x008b:
            java.lang.String r6 = "sjksRlbbg"
            java.lang.String r6 = com.bytedance.sdk.component.d.d.g.g1657027613257dc(r6)
            boolean r5 = r5.equals(r6)
            if (r5 == 0) goto L_0x029a
            r5 = 20
            goto L_0x029b
        L_0x009b:
            java.lang.String r6 = "sdlgHja"
            java.lang.String r6 = com.bytedance.sdk.component.d.d.g.g1657027613257dc(r6)
            boolean r5 = r5.equals(r6)
            if (r5 == 0) goto L_0x029a
            r5 = 2
            goto L_0x029b
        L_0x00aa:
            java.lang.String r6 = "pmczegjbWz~r`h"
            java.lang.String r6 = com.bytedance.sdk.component.d.d.g.g1657027613257dc(r6)
            boolean r5 = r5.equals(r6)
            if (r5 == 0) goto L_0x029a
            r5 = 3
            goto L_0x029b
        L_0x00b9:
            java.lang.String r6 = "gdvMaqqhzbNjxl"
            java.lang.String r6 = com.bytedance.sdk.component.d.d.g.g1657027613257dc(r6)
            boolean r5 = r5.equals(r6)
            if (r5 == 0) goto L_0x029a
            r5 = 26
            goto L_0x029b
        L_0x00c9:
            java.lang.String r6 = "eof`ewbXdfko"
            java.lang.String r6 = com.bytedance.sdk.component.d.d.g.g1657027613257dc(r6)
            boolean r5 = r5.equals(r6)
            if (r5 == 0) goto L_0x029a
            r5 = 27
            goto L_0x029b
        L_0x00d9:
            java.lang.String r6 = "rdolr`Jhimcek"
            java.lang.String r6 = com.bytedance.sdk.component.d.d.g.g1657027613257dc(r6)
            boolean r5 = r5.equals(r6)
            if (r5 == 0) goto L_0x029a
            r5 = 10
            goto L_0x029b
        L_0x00e9:
            java.lang.String r6 = "rdlgawBnlOcee~f"
            java.lang.String r6 = com.bytedance.sdk.component.d.d.g.g1657027613257dc(r6)
            boolean r5 = r5.equals(r6)
            if (r5 == 0) goto L_0x029a
            r5 = 18
            goto L_0x029b
        L_0x00f9:
            java.lang.String r6 = "mtvfRlbbg"
            java.lang.String r6 = com.bytedance.sdk.component.d.d.g.g1657027613257dc(r6)
            boolean r5 = r5.equals(r6)
            if (r5 == 0) goto L_0x029a
            r5 = 21
            goto L_0x029b
        L_0x0109:
            java.lang.String r6 = "p`wpaRce^`o|Xdcjbb"
            java.lang.String r6 = com.bytedance.sdk.component.d.d.g.g1657027613257dc(r6)
            boolean r5 = r5.equals(r6)
            if (r5 == 0) goto L_0x029a
            r5 = 29
            goto L_0x029b
        L_0x0119:
            java.lang.String r6 = "gdvUkisjm"
            java.lang.String r6 = com.bytedance.sdk.component.d.d.g.g1657027613257dc(r6)
            boolean r5 = r5.equals(r6)
            if (r5 == 0) goto L_0x029a
            r5 = 9
            goto L_0x029b
        L_0x0129:
            java.lang.String r6 = "gdv@qwtbf}\\bhha\\dpfv"
            java.lang.String r6 = com.bytedance.sdk.component.d.d.g.g1657027613257dc(r6)
            boolean r5 = r5.equals(r6)
            if (r5 == 0) goto L_0x029a
            r5 = 23
            goto L_0x029b
        L_0x0139:
            java.lang.String r6 = "c`l`aiYcg~dgcljPqabLuq"
            java.lang.String r6 = com.bytedance.sdk.component.d.d.g.g1657027613257dc(r6)
            boolean r5 = r5.equals(r6)
            if (r5 == 0) goto L_0x029a
            r5 = 14
            goto L_0x029b
        L_0x0149:
            java.lang.String r6 = "gdvWahvki}oBbka"
            java.lang.String r6 = com.bytedance.sdk.component.d.d.g.g1657027613257dc(r6)
            boolean r5 = r5.equals(r6)
            if (r5 == 0) goto L_0x029a
            r5 = 4
            goto L_0x029b
        L_0x0158:
            java.lang.String r6 = "dxlbileSzhi`"
            java.lang.String r6 = com.bytedance.sdk.component.d.d.g.g1657027613257dc(r6)
            boolean r5 = r5.equals(r6)
            if (r5 == 0) goto L_0x029a
            r5 = 19
            goto L_0x029b
        L_0x0168:
            java.lang.String r6 = "sdlgV`qfzm"
            java.lang.String r6 = com.bytedance.sdk.component.d.d.g.g1657027613257dc(r6)
            boolean r5 = r5.equals(r6)
            if (r5 == 0) goto L_0x029a
            r5 = 11
            goto L_0x029b
        L_0x0178:
            java.lang.String r6 = "gdvMeqoqmZciN{|d~Wuaw"
            java.lang.String r6 = com.bytedance.sdk.component.d.d.g.g1657027613257dc(r6)
            boolean r5 = r5.equals(r6)
            if (r5 == 0) goto L_0x029a
            r5 = 33
            goto L_0x029b
        L_0x0188:
            java.lang.String r6 = "irTjargedl"
            java.lang.String r6 = com.bytedance.sdk.component.d.d.g.g1657027613257dc(r6)
            boolean r5 = r5.equals(r6)
            if (r5 == 0) goto L_0x029a
            r5 = 6
            goto L_0x029b
        L_0x0197:
            java.lang.String r6 = "gdv@hjubJ|~ccGav~"
            java.lang.String r6 = com.bytedance.sdk.component.d.d.g.g1657027613257dc(r6)
            boolean r5 = r5.equals(r6)
            if (r5 == 0) goto L_0x029a
            r5 = 8
            goto L_0x029b
        L_0x01a7:
            java.lang.String r6 = "uoqvfveuakoTm}~Pqu"
            java.lang.String r6 = com.bytedance.sdk.component.d.d.g.g1657027613257dc(r6)
            boolean r5 = r5.equals(r6)
            if (r5 == 0) goto L_0x029a
            r5 = 15
            goto L_0x029b
        L_0x01b7:
            java.lang.String r6 = "cmmpa"
            java.lang.String r6 = com.bytedance.sdk.component.d.d.g.g1657027613257dc(r6)
            boolean r5 = r5.equals(r6)
            if (r5 == 0) goto L_0x029a
            r5 = 34
            goto L_0x029b
        L_0x01c7:
            java.lang.String r6 = "dnumhjgcWhz{Slj"
            java.lang.String r6 = com.bytedance.sdk.component.d.d.g.g1657027613257dc(r6)
            boolean r5 = r5.equals(r6)
            if (r5 == 0) goto L_0x029a
            r5 = 13
            goto L_0x029b
        L_0x01d7:
            java.lang.String r6 = "gdvWaHgnImy"
            java.lang.String r6 = com.bytedance.sdk.component.d.d.g.g1657027613257dc(r6)
            boolean r5 = r5.equals(r6)
            if (r5 == 0) goto L_0x029a
            r5 = 5
            goto L_0x029b
        L_0x01e6:
            java.lang.String r6 = "sdlg[qcji`U{~bjzseMzpf"
            java.lang.String r6 = com.bytedance.sdk.component.d.d.g.g1657027613257dc(r6)
            boolean r5 = r5.equals(r6)
            if (r5 == 0) goto L_0x029a
            r5 = 24
            goto L_0x029b
        L_0x01f6:
            java.lang.String r6 = "gdvNeqcuahfFiyo"
            java.lang.String r6 = com.bytedance.sdk.component.d.d.g.g1657027613257dc(r6)
            boolean r5 = r5.equals(r6)
            if (r5 == 0) goto L_0x029a
            r5 = 25
            goto L_0x029b
        L_0x0206:
            java.lang.String r6 = com.bytedance.sdk.component.d.d.g.g1657027613257dc(r9)
            boolean r5 = r5.equals(r6)
            if (r5 == 0) goto L_0x029a
            r5 = 31
            goto L_0x029b
        L_0x0214:
            java.lang.String r6 = "gdvPgwcbfZcqi"
            java.lang.String r6 = com.bytedance.sdk.component.d.d.g.g1657027613257dc(r6)
            boolean r5 = r5.equals(r6)
            if (r5 == 0) goto L_0x029a
            r5 = 7
            goto L_0x029b
        L_0x0223:
            java.lang.String r6 = "aqrJjci"
            java.lang.String r6 = com.bytedance.sdk.component.d.d.g.g1657027613257dc(r6)
            boolean r5 = r5.equals(r6)
            if (r5 == 0) goto L_0x029a
            r5 = 0
            goto L_0x029b
        L_0x0232:
            java.lang.String r6 = "cmk`o@pbf}"
            java.lang.String r6 = com.bytedance.sdk.component.d.d.g.g1657027613257dc(r6)
            boolean r5 = r5.equals(r6)
            if (r5 == 0) goto L_0x029a
            r5 = 17
            goto L_0x029b
        L_0x0241:
            java.lang.String r6 = "wd`um`qX|`gnSy|nsz"
            java.lang.String r6 = com.bytedance.sdk.component.d.d.g.g1657027613257dc(r6)
            boolean r5 = r5.equals(r6)
            if (r5 == 0) goto L_0x029a
            r5 = 30
            goto L_0x029b
        L_0x0250:
            java.lang.String r6 = "oqgmEaJffmZjkhBf~za"
            java.lang.String r6 = com.bytedance.sdk.component.d.d.g.g1657027613257dc(r6)
            boolean r5 = r5.equals(r6)
            if (r5 == 0) goto L_0x029a
            r5 = 32
            goto L_0x029b
        L_0x025f:
            java.lang.String r6 = "cicmc`PnlleXxlzj"
            java.lang.String r6 = com.bytedance.sdk.component.d.d.g.g1657027613257dc(r6)
            boolean r5 = r5.equals(r6)
            if (r5 == 0) goto L_0x029a
            r5 = 22
            goto L_0x029b
        L_0x026e:
            java.lang.String r6 = "p`wpaRce^`o|"
            java.lang.String r6 = com.bytedance.sdk.component.d.d.g.g1657027613257dc(r6)
            boolean r5 = r5.equals(r6)
            if (r5 == 0) goto L_0x029a
            r5 = 28
            goto L_0x029b
        L_0x027d:
            java.lang.String r6 = "aeKmbj"
            java.lang.String r6 = com.bytedance.sdk.component.d.d.g.g1657027613257dc(r6)
            boolean r5 = r5.equals(r6)
            if (r5 == 0) goto L_0x029a
            r5 = 1
            goto L_0x029b
        L_0x028b:
            java.lang.String r6 = "st`pgwoemVk{|Rok"
            java.lang.String r6 = com.bytedance.sdk.component.d.d.g.g1657027613257dc(r6)
            boolean r5 = r5.equals(r6)
            if (r5 == 0) goto L_0x029a
            r5 = 12
            goto L_0x029b
        L_0x029a:
            r5 = -1
        L_0x029b:
            switch(r5) {
                case 0: goto L_0x0520;
                case 1: goto L_0x051c;
                case 2: goto L_0x048e;
                case 3: goto L_0x0489;
                case 4: goto L_0x045f;
                case 5: goto L_0x0458;
                case 6: goto L_0x044f;
                case 7: goto L_0x042d;
                case 8: goto L_0x0426;
                case 9: goto L_0x03e6;
                case 10: goto L_0x03dd;
                case 11: goto L_0x03d2;
                case 12: goto L_0x03af;
                case 13: goto L_0x0387;
                case 14: goto L_0x037c;
                case 15: goto L_0x0371;
                case 16: goto L_0x035a;
                case 17: goto L_0x0353;
                case 18: goto L_0x034c;
                case 19: goto L_0x0345;
                case 20: goto L_0x0340;
                case 21: goto L_0x0339;
                case 22: goto L_0x0332;
                case 23: goto L_0x032d;
                case 24: goto L_0x0326;
                case 25: goto L_0x0321;
                case 26: goto L_0x031c;
                case 27: goto L_0x0315;
                case 28: goto L_0x0310;
                case 29: goto L_0x030b;
                case 30: goto L_0x0304;
                case 31: goto L_0x02f4;
                case 32: goto L_0x02e0;
                case 33: goto L_0x02b2;
                case 34: goto L_0x02a0;
                default: goto L_0x029e;
            }
        L_0x029e:
            goto L_0x0525
        L_0x02a0:
            java.lang.String r5 = com.bytedance.sdk.component.e.c.d.d1657027613220dc(r4)
            java.lang.String r6 = "MDVKKAYDDFYN"
            java.lang.String r6 = com.bytedance.sdk.component.e.c.d.d1657027613220dc(r6)
            com.bytedance.sdk.component.utils.l.b((java.lang.String) r5, (java.lang.String) r6)
            r21.f()
            goto L_0x0525
        L_0x02b2:
            java.lang.String r5 = com.bytedance.sdk.component.e.c.d.d1657027613220dc(r4)
            java.lang.String r6 = "MDVKKAY@M]UEMYGYUNAZ@PITMJNTQBZ^t`"
            java.lang.String r6 = com.bytedance.sdk.component.e.c.d.d1657027613220dc(r6)
            com.bytedance.sdk.component.utils.l.b((java.lang.String) r5, (java.lang.String) r6)
            com.bytedance.sdk.openadsdk.core.e.n r5 = r0.q
            if (r5 == 0) goto L_0x0525
            java.lang.String r5 = r5.D()
            java.lang.CharSequence r5 = (java.lang.CharSequence) r5
            boolean r5 = android.text.TextUtils.isEmpty(r5)
            if (r5 != 0) goto L_0x0525
            java.lang.String r5 = "d`vb"
            java.lang.String r5 = com.bytedance.sdk.component.e.c.d.d1657027613220dc(r5)
            com.bytedance.sdk.openadsdk.core.e.n r6 = r0.q
            java.lang.String r6 = r6.D()
            r3.put(r5, r6)
            goto L_0x0525
        L_0x02e0:
            java.lang.String r5 = com.bytedance.sdk.component.e.c.d.d1657027613220dc(r4)
            java.lang.String r6 = "MDVKKAYHXLDTC]KAOPVLXTXSHX]^CQWQkr"
            java.lang.String r6 = com.bytedance.sdk.component.e.c.d.d1657027613220dc(r6)
            com.bytedance.sdk.component.utils.l.b((java.lang.String) r5, (java.lang.String) r6)
            org.json.JSONObject r5 = r1.f1721d
            r0.c((org.json.JSONObject) r5)
            goto L_0x0525
        L_0x02f4:
            java.lang.String r5 = com.bytedance.sdk.component.e.c.d.d1657027613220dc(r4)
            java.lang.String r6 = com.bytedance.sdk.component.e.c.d.d1657027613220dc(r9)
            com.bytedance.sdk.component.utils.l.b((java.lang.String) r5, (java.lang.String) r6)
            r21.u()
            goto L_0x0525
        L_0x0304:
            org.json.JSONObject r5 = r1.f1721d
            r0.g((org.json.JSONObject) r5)
            goto L_0x0525
        L_0x030b:
            r21.s()
            goto L_0x0525
        L_0x0310:
            r21.r()
            goto L_0x0525
        L_0x0315:
            org.json.JSONObject r5 = r1.f1721d
            r0.h((org.json.JSONObject) r5)
            goto L_0x0525
        L_0x031c:
            r0.a((com.bytedance.sdk.openadsdk.core.w.a) r1, (org.json.JSONObject) r3)
            goto L_0x0525
        L_0x0321:
            r0.p(r3)
            goto L_0x0525
        L_0x0326:
            org.json.JSONObject r5 = r1.f1721d
            r0.o(r5)
            goto L_0x0525
        L_0x032d:
            r0.k(r3)
            goto L_0x0525
        L_0x0332:
            org.json.JSONObject r5 = r1.f1721d
            r0.j((org.json.JSONObject) r5)
            goto L_0x0525
        L_0x0339:
            org.json.JSONObject r5 = r1.f1721d
            r0.i((org.json.JSONObject) r5)
            goto L_0x0525
        L_0x0340:
            r21.t()
            goto L_0x0525
        L_0x0345:
            org.json.JSONObject r5 = r1.f1721d
            r0.n(r5)
            goto L_0x0525
        L_0x034c:
            org.json.JSONObject r5 = r1.f1721d
            r0.l(r5)
            goto L_0x0525
        L_0x0353:
            org.json.JSONObject r5 = r1.f1721d
            r0.d((org.json.JSONObject) r5)
            goto L_0x0525
        L_0x035a:
            java.lang.ref.WeakReference<android.content.Context> r5 = r0.f1702h
            if (r5 == 0) goto L_0x0525
            java.lang.Object r5 = r5.get()
            android.content.Context r5 = (android.content.Context) r5
            if (r5 == 0) goto L_0x0525
            boolean r6 = r5 instanceof com.bytedance.sdk.openadsdk.core.video.c.b
            if (r6 == 0) goto L_0x0525
            com.bytedance.sdk.openadsdk.core.video.c.b r5 = (com.bytedance.sdk.openadsdk.core.video.c.b) r5
            r5.L()
            goto L_0x0525
        L_0x0371:
            com.bytedance.sdk.openadsdk.e.c r5 = r0.i
            if (r5 == 0) goto L_0x0525
            org.json.JSONObject r6 = r1.f1721d
            r5.a(r6)
            goto L_0x0525
        L_0x037c:
            com.bytedance.sdk.openadsdk.e.c r5 = r0.i
            if (r5 == 0) goto L_0x0525
            org.json.JSONObject r6 = r1.f1721d
            r5.b(r6)
            goto L_0x0525
        L_0x0387:
            r0.K = r11
            com.bytedance.sdk.openadsdk.core.b.d r5 = r0.z
            if (r5 == 0) goto L_0x0394
            boolean r6 = r0.C
            r5.a(r6)
            goto L_0x0525
        L_0x0394:
            com.bytedance.sdk.openadsdk.e.c r5 = r0.i
            if (r5 == 0) goto L_0x0525
            java.lang.ref.WeakReference<android.content.Context> r5 = r0.f1702h
            if (r5 == 0) goto L_0x0525
            java.lang.Object r5 = r5.get()
            android.content.Context r5 = (android.content.Context) r5
            if (r5 == 0) goto L_0x0525
            com.bytedance.sdk.openadsdk.e.c r6 = r0.i
            org.json.JSONObject r7 = r1.f1721d
            java.lang.String r8 = r0.J
            r6.a(r5, r7, r8)
            goto L_0x0525
        L_0x03af:
            r21.y()
            java.lang.ref.WeakReference<android.content.Context> r5 = r0.f1702h
            if (r5 == 0) goto L_0x0525
            java.lang.Object r5 = r5.get()
            r13 = r5
            android.content.Context r13 = (android.content.Context) r13
            if (r13 == 0) goto L_0x0525
            com.bytedance.sdk.openadsdk.e.c r12 = r0.i
            org.json.JSONObject r14 = r1.f1721d
            java.lang.String r15 = r0.l
            int r5 = r0.m
            boolean r6 = r0.p
            r16 = r5
            r17 = r6
            r12.a(r13, r14, r15, r16, r17)
            goto L_0x0525
        L_0x03d2:
            r0.f1698c = r11
            com.bytedance.sdk.openadsdk.g.e r5 = r0.w
            if (r5 == 0) goto L_0x0525
            r5.a()
            goto L_0x0525
        L_0x03dd:
            com.bytedance.sdk.openadsdk.g.d r5 = r0.x
            if (r5 == 0) goto L_0x0525
            r5.a()
            goto L_0x0525
        L_0x03e6:
            android.content.Context r5 = com.bytedance.sdk.openadsdk.core.m.a()
            java.lang.String r6 = "atfjk"
            java.lang.String r6 = com.bytedance.sdk.component.e.c.d.d1657027613220dc(r6)
            java.lang.Object r5 = r5.getSystemService(r6)
            android.media.AudioManager r5 = (android.media.AudioManager) r5
            if (r5 == 0) goto L_0x0418
            int r10 = r5.getStreamVolume(r7)
            java.lang.String r5 = com.bytedance.sdk.component.e.c.d.d1657027613220dc(r4)
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "Mtqjg%phd|gn,301.1Sfp|yZyw{|yo32\u001eBWQV@HS~FF^AH\u0013"
            java.lang.String r7 = com.bytedance.sdk.component.e.c.d.d1657027613220dc(r7)
            r6.append(r7)
            r6.append(r10)
            java.lang.String r6 = r6.toString()
            com.bytedance.sdk.component.utils.l.b((java.lang.String) r5, (java.lang.String) r6)
        L_0x0418:
            if (r10 > 0) goto L_0x041b
            r8 = 1
        L_0x041b:
            java.lang.String r5 = "eof`ewbXe|~n"
            java.lang.String r5 = com.bytedance.sdk.component.e.c.d.d1657027613220dc(r5)
            r3.put(r5, r8)
            goto L_0x0525
        L_0x0426:
            org.json.JSONObject r5 = r21.p()
            if (r5 == 0) goto L_0x0525
            goto L_0x045c
        L_0x042d:
            com.bytedance.sdk.openadsdk.g.a r5 = r0.v
            if (r5 == 0) goto L_0x0525
            int r5 = r5.b()
            com.bytedance.sdk.openadsdk.g.a r6 = r0.v
            int r6 = r6.a()
            java.lang.String r7 = "whfwl"
            java.lang.String r7 = com.bytedance.sdk.component.e.c.d.d1657027613220dc(r7)
            r3.put(r7, r5)
            java.lang.String r5 = "hdkdlq"
            java.lang.String r5 = com.bytedance.sdk.component.e.c.d.d1657027613220dc(r5)
        L_0x044a:
            r3.put(r5, r6)
            goto L_0x0525
        L_0x044f:
            java.lang.String r5 = "vhgtWqgs}z"
            java.lang.String r5 = com.bytedance.sdk.component.e.c.d.d1657027613220dc(r5)
            boolean r6 = r0.G
            goto L_0x044a
        L_0x0458:
            org.json.JSONObject r5 = r0.y
            if (r5 == 0) goto L_0x0525
        L_0x045c:
            r3 = r5
            goto L_0x0525
        L_0x045f:
            org.json.JSONObject r3 = r0.t
            if (r3 == 0) goto L_0x0485
            java.lang.String r5 = "sdvwmka"
            java.lang.String r5 = com.bytedance.sdk.component.d.d.g.g1657027613257dc(r5)
            org.json.JSONObject r6 = r21.v()
            r3.put(r5, r6)
            com.bytedance.sdk.openadsdk.core.e.n r3 = r0.q
            if (r3 == 0) goto L_0x0485
            org.json.JSONObject r3 = r0.t
            java.lang.String r5 = "eyvfjvohf"
            java.lang.String r5 = com.bytedance.sdk.component.d.d.g.g1657027613257dc(r5)
            com.bytedance.sdk.openadsdk.core.e.n r6 = r0.q
            org.json.JSONObject r6 = r6.aB()
            r3.put(r5, r6)
        L_0x0485:
            org.json.JSONObject r3 = r0.t
            goto L_0x0525
        L_0x0489:
            r0.f((org.json.JSONObject) r3)
            goto L_0x0525
        L_0x048e:
            org.json.JSONObject r5 = r1.f1721d
            if (r5 == 0) goto L_0x0525
            java.lang.String r6 = "eyvIwjh"
            java.lang.String r6 = com.bytedance.sdk.component.d.d.g.g1657027613257dc(r6)
            org.json.JSONObject r6 = r5.getJSONObject(r6)
            if (r6 == 0) goto L_0x0525
            java.lang.String r7 = "c`vfcjt~"
            java.lang.String r8 = com.bytedance.sdk.component.d.d.g.g1657027613257dc(r7)
            boolean r8 = r6.has(r8)
            if (r8 == 0) goto L_0x0525
            java.lang.String r8 = "t`e"
            java.lang.String r9 = com.bytedance.sdk.component.d.d.g.g1657027613257dc(r8)
            boolean r9 = r6.has(r9)
            if (r9 == 0) goto L_0x0525
            java.lang.String r9 = "l``fh"
            java.lang.String r10 = com.bytedance.sdk.component.d.d.g.g1657027613257dc(r9)
            boolean r10 = r6.has(r10)
            if (r10 == 0) goto L_0x0525
            java.lang.String r7 = com.bytedance.sdk.component.d.d.g.g1657027613257dc(r7)
            java.lang.String r13 = r6.getString(r7)
            java.lang.String r7 = com.bytedance.sdk.component.d.d.g.g1657027613257dc(r8)
            r6.getString(r7)
            java.lang.String r7 = com.bytedance.sdk.component.d.d.g.g1657027613257dc(r9)
            java.lang.String r15 = r6.getString(r7)
            java.lang.String r7 = "v`nva"
            java.lang.String r7 = com.bytedance.sdk.component.d.d.g.g1657027613257dc(r7)
            long r16 = r5.getLong(r7)
            java.lang.String r7 = "eyvUeisb"
            java.lang.String r7 = com.bytedance.sdk.component.d.d.g.g1657027613257dc(r7)
            long r18 = r5.getLong(r7)
            java.lang.String r5 = "u`]skiodq"
            java.lang.String r5 = com.bytedance.sdk.component.d.d.g.g1657027613257dc(r5)     // Catch:{ Exception -> 0x04fd }
            int r7 = r0.o     // Catch:{ Exception -> 0x04fd }
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)     // Catch:{ Exception -> 0x04fd }
            r6.putOpt(r5, r7)     // Catch:{ Exception -> 0x04fd }
            goto L_0x04fe
        L_0x04fd:
        L_0x04fe:
            java.lang.String r5 = "cmk`o"
            java.lang.String r5 = com.bytedance.sdk.component.d.d.g.g1657027613257dc(r5)
            boolean r5 = r5.equals(r15)
            if (r5 == 0) goto L_0x050e
            org.json.JSONObject r6 = r0.r(r6)
        L_0x050e:
            r20 = r6
            int r5 = r0.m
            java.lang.String r14 = com.bytedance.sdk.openadsdk.utils.u.a((int) r5)
            com.bytedance.sdk.openadsdk.core.e.n r12 = r0.q
            com.bytedance.sdk.openadsdk.b.e.a(r12, r13, r14, r15, r16, r18, r20)
            goto L_0x0525
        L_0x051c:
            r0.e((org.json.JSONObject) r3)
            goto L_0x0525
        L_0x0520:
            int r5 = r1.f1722e
            r0.a((org.json.JSONObject) r3, (int) r5)
        L_0x0525:
            if (r2 != r11) goto L_0x0568
            java.lang.String r5 = r1.f1719b
            java.lang.CharSequence r5 = (java.lang.CharSequence) r5
            boolean r5 = android.text.TextUtils.isEmpty(r5)
            if (r5 != 0) goto L_0x0568
            java.lang.String r1 = r1.f1719b
            r0.b((java.lang.String) r1, (org.json.JSONObject) r3)
            com.bytedance.sdk.openadsdk.core.h r1 = com.bytedance.sdk.openadsdk.core.h.d()
            boolean r1 = r1.s()
            if (r1 == 0) goto L_0x0568
            java.lang.String r1 = com.bytedance.sdk.component.e.c.d.d1657027613220dc(r4)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "[KQA)WUWU)|n~~g`~+"
            java.lang.String r5 = com.bytedance.sdk.component.e.c.d.d1657027613220dc(r5)
            r4.append(r5)
            r4.append(r2)
            java.lang.String r2 = " ecwe8"
            java.lang.String r2 = com.bytedance.sdk.component.e.c.d.d1657027613220dc(r2)
            r4.append(r2)
            r4.append(r3)
            java.lang.String r2 = r4.toString()
            android.util.Log.d(r1, r2)
        L_0x0568:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.core.w.a(com.bytedance.sdk.openadsdk.core.w$a, int):org.json.JSONObject");
    }

    public void a(Message message) {
        if (message != null && message.what == 11 && (message.obj instanceof a)) {
            try {
                a((a) message.obj, 1);
            } catch (Exception unused) {
            }
        }
    }

    public void a(String str) {
    }

    public void a(String str, JSONObject jSONObject) {
        c(str, jSONObject);
    }

    @JProtect
    public void a(JSONObject jSONObject, final com.bytedance.sdk.openadsdk.g.c cVar) {
        if (cVar != null) {
            try {
                if (this.q != null) {
                    if (!TextUtils.isEmpty(this.l)) {
                        int e2 = com.bytedance.sdk.openadsdk.utils.u.e(this.q);
                        AdSlot x2 = this.q.x();
                        o oVar = new o();
                        if (this.q.G() != null) {
                            oVar.f1146f = 2;
                        }
                        JSONObject ak = this.q.ak();
                        if (ak == null) {
                            ak = new JSONObject();
                        }
                        if (jSONObject != null) {
                            Iterator<String> keys = jSONObject.keys();
                            while (keys.hasNext()) {
                                String next = keys.next();
                                ak.put(next, jSONObject.opt(next));
                            }
                        }
                        oVar.f1148h = ak;
                        m.f().a(x2, oVar, e2, new n.a() {
                            public void a(int i, String str) {
                                cVar.a(false, (List<com.bytedance.sdk.openadsdk.core.e.n>) null);
                            }

                            public void a(com.bytedance.sdk.openadsdk.core.e.a aVar, com.bytedance.sdk.openadsdk.core.e.b bVar) {
                                if (aVar.b() == null || aVar.b().isEmpty()) {
                                    cVar.a(false, (List<com.bytedance.sdk.openadsdk.core.e.n>) null);
                                    bVar.a(-3);
                                    com.bytedance.sdk.openadsdk.core.e.b.a(bVar);
                                    return;
                                }
                                cVar.a(true, aVar.b());
                            }
                        });
                        return;
                    }
                }
                cVar.a(false, (List<com.bytedance.sdk.openadsdk.core.e.n>) null);
            } catch (Exception e3) {
                l.c(com.bytedance.sdk.component.d.d.d.d1657027613261dc("TUCm`winlFhainz"), com.bytedance.sdk.component.d.d.d.d1657027613261dc("gdv#eau'm{xd~"), e3);
            }
        }
    }

    public boolean a(Uri uri) {
        if (uri == null) {
            return false;
        }
        try {
            if (!com.bytedance.sdk.component.e.c.g.g1657027613239dc("bxvf`dhdm").equals(uri.getScheme())) {
                return false;
            }
            return f1695g.containsKey(uri.getHost());
        } catch (Exception unused) {
        }
    }

    @JavascriptInterface
    public String adInfo() {
        JSONObject jSONObject = new JSONObject();
        try {
            e(jSONObject);
        } catch (Exception unused) {
        }
        return jSONObject.toString();
    }

    @JavascriptInterface
    public String appInfo() {
        JSONObject jSONObject = new JSONObject();
        try {
            a(jSONObject, 0);
        } catch (Exception unused) {
        }
        return jSONObject.toString();
    }

    public w b(int i2) {
        this.m = i2;
        return this;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0018, code lost:
        switch(r1) {
            case 91: goto L_0x001c;
            case 92: goto L_0x0000;
            case 93: goto L_0x001c;
            default: goto L_0x001b;
        };
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0021, code lost:
        r1 = '[';
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.bytedance.sdk.openadsdk.core.w b(com.bytedance.sdk.component.widget.SSWebView r3) {
        /*
            r2 = this;
        L_0x0000:
            r0 = 93
            r1 = 93
        L_0x0004:
            switch(r0) {
                case 92: goto L_0x000c;
                case 93: goto L_0x0018;
                case 94: goto L_0x0008;
                default: goto L_0x0007;
            }
        L_0x0007:
            goto L_0x0000
        L_0x0008:
            r0 = 4
            if (r1 > r0) goto L_0x0010
            goto L_0x0000
        L_0x000c:
            switch(r1) {
                case 21: goto L_0x0000;
                case 22: goto L_0x0010;
                case 23: goto L_0x001c;
                default: goto L_0x000f;
            }
        L_0x000f:
            goto L_0x0018
        L_0x0010:
            java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference
            r0.<init>(r3)
            r2.f1699d = r0
            return r2
        L_0x0018:
            switch(r1) {
                case 91: goto L_0x001c;
                case 92: goto L_0x0000;
                case 93: goto L_0x001c;
                default: goto L_0x001b;
            }
        L_0x001b:
            goto L_0x0021
        L_0x001c:
            r0 = 94
            r1 = 75
            goto L_0x0004
        L_0x0021:
            r1 = 91
            goto L_0x0018
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.core.w.b(com.bytedance.sdk.component.widget.SSWebView):com.bytedance.sdk.openadsdk.core.w");
    }

    public w b(JSONObject jSONObject) {
        this.y = jSONObject;
        return this;
    }

    public w b(boolean z2) {
        this.G = z2;
        return this;
    }

    public void b() {
        r rVar = this.I;
        if (rVar != null) {
            rVar.a();
            this.I = null;
        }
    }

    public void b(Uri uri) {
        long j2;
        String str;
        JSONObject jSONObject;
        try {
            String host = uri.getHost();
            if (!com.bytedance.sdk.component.e.c.g.g1657027613239dc("lne\\asci|").equals(host) && !com.bytedance.sdk.component.e.c.g.g1657027613239dc("ctqwkhYb~ld").equals(host)) {
                if (!com.bytedance.sdk.component.e.c.g.g1657027613239dc("lne\\asci|V|8").equals(host)) {
                    if (!com.bytedance.sdk.component.e.c.g.g1657027613239dc("pskueqc").equals(host)) {
                        if (!com.bytedance.sdk.component.e.c.g.g1657027613239dc("dhqseqeoWdoxlij").equals(host)) {
                            l.d(com.bytedance.sdk.component.e.c.g.g1657027613239dc("TUCm`winlFhainz"), com.bytedance.sdk.component.e.c.g.g1657027613239dc("h`lghwSnz3*ecy.bqeq{4fu}t{;trmk"));
                            return;
                        }
                    }
                    j(uri.toString());
                    return;
                }
            }
            String queryParameter = uri.getQueryParameter(com.bytedance.sdk.component.e.c.g.g1657027613239dc("c`vfcjt~"));
            String queryParameter2 = uri.getQueryParameter(com.bytedance.sdk.component.e.c.g.g1657027613239dc("t`e"));
            this.J = queryParameter2;
            String queryParameter3 = uri.getQueryParameter(com.bytedance.sdk.component.e.c.g.g1657027613239dc("l``fh"));
            if (h(queryParameter3)) {
                long j3 = 0;
                try {
                    j2 = Long.parseLong(uri.getQueryParameter(com.bytedance.sdk.component.e.c.g.g1657027613239dc("v`nva")));
                } catch (Exception unused) {
                    j2 = 0;
                }
                try {
                    j3 = Long.parseLong(uri.getQueryParameter(com.bytedance.sdk.component.e.c.g.g1657027613239dc("eyv\\rdjrm")));
                } catch (Exception unused2) {
                }
                long j4 = j3;
                JSONObject jSONObject2 = null;
                String queryParameter4 = uri.getQueryParameter(com.bytedance.sdk.component.e.c.g.g1657027613239dc("eyvqe"));
                if (!TextUtils.isEmpty(queryParameter4)) {
                    try {
                        JSONObject jSONObject3 = new JSONObject(queryParameter4);
                        try {
                            jSONObject3.putOpt(com.bytedance.sdk.component.e.c.g.g1657027613239dc("u`]skiodq"), Integer.valueOf(this.o));
                        } catch (Exception unused3) {
                        }
                        jSONObject2 = jSONObject3;
                    } catch (Exception unused4) {
                    }
                }
                if (com.bytedance.sdk.component.e.c.g.g1657027613239dc("cmk`o").equals(queryParameter3)) {
                    jSONObject2 = r(jSONObject2);
                }
                if (!com.bytedance.sdk.component.e.c.g.g1657027613239dc("l`lgmkaXxlxmSh|}c").equals(queryParameter3)) {
                    if (!com.bytedance.sdk.component.e.c.g.g1657027613239dc("l`lgmkaXxlxmS~zndb").equals(queryParameter3)) {
                        str = i(queryParameter2);
                        jSONObject = jSONObject2;
                        com.bytedance.sdk.openadsdk.b.e.a(this.q, queryParameter, str, queryParameter3, j2, j4, jSONObject);
                    }
                }
                try {
                    jSONObject = new JSONObject();
                    for (String next : uri.getQueryParameterNames()) {
                        try {
                            if (com.bytedance.sdk.component.e.c.g.g1657027613239dc("eyvqe").equals(next)) {
                                jSONObject.put(com.bytedance.sdk.component.e.c.g.g1657027613239dc("ae]f|qtfWmkm"), new JSONObject(uri.getQueryParameter(next)).optString(com.bytedance.sdk.component.e.c.g.g1657027613239dc("ae]f|qtfWmkm")));
                            } else {
                                jSONObject.put(next, uri.getQueryParameter(next));
                            }
                        } catch (Exception unused5) {
                        }
                    }
                    str = this.f1701f;
                    com.bytedance.sdk.openadsdk.b.e.a(this.q, queryParameter, str, queryParameter3, j2, j4, jSONObject);
                } catch (Exception unused6) {
                }
            }
        } catch (Exception e2) {
            l.b(com.bytedance.sdk.component.e.c.g.g1657027613239dc("TUCm`winlFhainz"), com.bytedance.sdk.component.e.c.g.g1657027613239dc("h`lgh`Sua)osoh~{y~|)4"), e2);
        }
    }

    public void b(String str) {
    }

    public com.bytedance.sdk.openadsdk.core.e.n c() {
        return this.q;
    }

    public w c(String str) {
        this.f1701f = str;
        return this;
    }

    public w c(boolean z2) {
        this.C = z2;
        return this;
    }

    public void c(int i2) {
        com.bytedance.sdk.openadsdk.core.nativeexpress.j jVar = this.s;
        if (jVar != null) {
            jVar.b(i2);
        }
    }

    public void c(JSONObject jSONObject) {
        WeakReference<Context> weakReference;
        int optInt = jSONObject.optInt(com.bytedance.sdk.component.b.a.e.e1657027613270dc("l`lgmkaT|pfn"));
        String optString = jSONObject.optString(com.bytedance.sdk.component.b.a.e.e1657027613270dc("usn"));
        String optString2 = jSONObject.optString(com.bytedance.sdk.component.b.a.e.e1657027613270dc("f`nofdelW|xg"));
        if (!TextUtils.isEmpty(optString)) {
            if (optInt == 0) {
                if (o() != null) {
                    o().loadUrl(optString);
                }
            } else if (optInt == 1) {
                WeakReference<Context> weakReference2 = this.f1702h;
                if (weakReference2 != null && (weakReference2.get() instanceof Activity)) {
                    com.bytedance.sdk.openadsdk.utils.k.a((Activity) this.f1702h.get(), optString);
                }
            } else if (optInt == 2 && (weakReference = this.f1702h) != null && (weakReference.get() instanceof Activity) && !com.bytedance.sdk.openadsdk.utils.k.b((Activity) this.f1702h.get(), optString)) {
                com.bytedance.sdk.openadsdk.utils.k.a((Activity) this.f1702h.get(), optString2);
            }
        }
    }

    @JavascriptInterface
    public void changeVideoState(String str) {
        try {
            final JSONObject jSONObject = new JSONObject(str);
            if (Looper.myLooper() == Looper.getMainLooper()) {
                j(jSONObject);
            } else {
                new Handler(Looper.getMainLooper()).post(new Runnable() {
                    public void run() {
                        w.this.j(jSONObject);
                    }
                });
            }
        } catch (Exception unused) {
        }
    }

    @JavascriptInterface
    public void clickEvent(String str) {
        try {
            final JSONObject jSONObject = new JSONObject(str);
            if (Looper.myLooper() == Looper.getMainLooper()) {
                d(jSONObject);
            } else {
                new Handler(Looper.getMainLooper()).post(new Runnable() {
                    public void run() {
                        w.this.d(jSONObject);
                    }
                });
            }
        } catch (Exception unused) {
        }
    }

    public w d(String str) {
        this.j = str;
        return this;
    }

    public void d(JSONObject jSONObject) {
        double d2;
        double d3;
        double d4;
        double d5;
        double d6;
        double d7;
        String str;
        double d8;
        double d9;
        JSONObject jSONObject2;
        double d10;
        JSONObject jSONObject3 = jSONObject;
        if (jSONObject3 != null) {
            l.b(g.g1657027613257dc("TUCm`winlFhainz"), g.g1657027613257dc("TUCm`winlFhainz/xp|wxpU{qzq^jxpk"));
            try {
                String optString = jSONObject3.optString(g.g1657027613257dc("aeKg"));
                int optInt = jSONObject3.optInt(g.g1657027613257dc("asgbP|vb"), 1);
                String optString2 = jSONObject3.optString(g.g1657027613257dc("cmk`oDtbi]s{i"));
                JSONObject optJSONObject = jSONObject3.optJSONObject(g.g1657027613257dc("cmk`oLhag"));
                double d11 = 0.0d;
                if (optJSONObject != null) {
                    double optDouble = optJSONObject.optDouble(g.g1657027613257dc("dnum[}"), 0.0d);
                    d8 = optJSONObject.optDouble(g.g1657027613257dc("dnum[|"), 0.0d);
                    double optDouble2 = optJSONObject.optDouble(g.g1657027613257dc("uq]{"), 0.0d);
                    double optDouble3 = optJSONObject.optDouble(g.g1657027613257dc("uq]z"), 0.0d);
                    double optDouble4 = optJSONObject.optDouble(g.g1657027613257dc("dnum[qojm"), 0.0d);
                    double optDouble5 = optJSONObject.optDouble(g.g1657027613257dc("uq]wmhc"), 0.0d);
                    double optDouble6 = optJSONObject.optDouble(g.g1657027613257dc("btvwkkY"), 0.0d);
                    double optDouble7 = optJSONObject.optDouble(g.g1657027613257dc("btvwkkY~"), 0.0d);
                    double optDouble8 = optJSONObject.optDouble(g.g1657027613257dc("btvwkkYpam~c"), 0.0d);
                    double optDouble9 = optJSONObject.optDouble(g.g1657027613257dc("btvwkkYom`mcx"), 0.0d);
                    jSONObject2 = optJSONObject.optJSONObject(g.g1657027613257dc("rdawMk`h"));
                    d2 = optDouble9;
                    d11 = optDouble;
                    d9 = optDouble2;
                    d7 = optDouble4;
                    d6 = optDouble5;
                    d5 = optDouble6;
                    d4 = optDouble7;
                    d3 = optDouble8;
                    str = optString;
                    d10 = optDouble3;
                } else {
                    str = optString;
                    d10 = 0.0d;
                    d9 = 0.0d;
                    d8 = 0.0d;
                    d7 = 0.0d;
                    d6 = 0.0d;
                    d5 = 0.0d;
                    d4 = 0.0d;
                    d3 = 0.0d;
                    d2 = 0.0d;
                    jSONObject2 = null;
                }
                com.bytedance.sdk.openadsdk.core.e.j a2 = new j.a().d((float) d11).c((float) d8).b((float) d9).a((float) d10).b((long) d7).a((long) d6).c((int) d5).d((int) d4).e((int) d3).f((int) d2).a(optString2).a((SparseArray<c.a>) null).a(true).b(optInt).a(jSONObject2).a(jSONObject3.optInt(g.g1657027613257dc("cmk`oDtbiJkija}i"), -1)).a();
                if (this.r != null) {
                    this.r.a((View) null, optInt, a2);
                }
                a(str, optInt, a2);
                while (true) {
                    char c2 = 8;
                    while (true) {
                        if (c2 == 7) {
                            return;
                        }
                        if (c2 == 8 || c2 != 9) {
                            c2 = 7;
                        }
                    }
                }
            } catch (Exception unused) {
                com.bytedance.sdk.component.adexpress.b.j jVar = this.r;
                if (jVar != null) {
                    jVar.a((View) null, -1, (com.bytedance.sdk.component.adexpress.b) null);
                }
            }
        }
    }

    public void d(boolean z2) {
        this.f1698c = z2;
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x001d A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0023 A[LOOP:0: B:5:0x000e->B:12:0x0023, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x000a A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0012 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0015 A[SYNTHETIC] */
    public boolean d() {
        /*
            r3 = this;
            com.bytedance.sdk.openadsdk.core.e.n r0 = r3.q
            if (r0 == 0) goto L_0x0009
            boolean r0 = r0.o()
            goto L_0x0019
        L_0x0009:
            r0 = 0
        L_0x000a:
            r1 = 74
            r2 = 55
        L_0x000e:
            switch(r1) {
                case 72: goto L_0x000a;
                case 73: goto L_0x0012;
                case 74: goto L_0x0015;
                default: goto L_0x0011;
            }
        L_0x0011:
            goto L_0x0023
        L_0x0012:
            switch(r2) {
                case 94: goto L_0x001e;
                case 95: goto L_0x000a;
                case 96: goto L_0x000a;
                default: goto L_0x0015;
            }
        L_0x0015:
            switch(r2) {
                case 55: goto L_0x001d;
                case 56: goto L_0x0019;
                case 57: goto L_0x000a;
                default: goto L_0x0018;
            }
        L_0x0018:
            goto L_0x001e
        L_0x0019:
            if (r0 == 0) goto L_0x0009
            r0 = 1
            goto L_0x001e
        L_0x001d:
            return r0
        L_0x001e:
            r1 = 73
            r2 = 96
            goto L_0x000e
        L_0x0023:
            r1 = 72
            goto L_0x000e
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.core.w.d():boolean");
    }

    @JavascriptInterface
    public void dynamicTrack(String str) {
        try {
            n(new JSONObject(str));
        } catch (Exception unused) {
        }
    }

    public w e(String str) {
        this.l = str;
        return this;
    }

    public boolean e() {
        boolean z2 = this.f1698c;
        while (true) {
            char c2 = ']';
            char c3 = ']';
            while (true) {
                switch (c2) {
                    case '\\':
                        switch (c3) {
                            case 21:
                                break;
                            case 22:
                            case 23:
                                break;
                        }
                    case ']':
                        break;
                    case '^':
                        if (c3 > 4) {
                            break;
                        } else {
                            continue;
                        }
                }
                while (true) {
                    switch (c3) {
                        case '[':
                        case ']':
                            break;
                        case '\\':
                            break;
                        default:
                            c3 = '[';
                    }
                }
                c2 = '^';
                c3 = 'K';
            }
        }
        return z2;
    }

    public w f(String str) {
        this.n = str;
        return this;
    }

    public void f() {
        WeakReference<Context> weakReference = this.f1702h;
        if (weakReference != null && (weakReference.get() instanceof Activity) && com.bytedance.sdk.openadsdk.utils.k.a((Activity) this.f1702h.get())) {
            ((Activity) this.f1702h.get()).finish();
        }
    }

    public void g() {
        com.bytedance.sdk.openadsdk.core.nativeexpress.j jVar = this.s;
        if (jVar != null) {
            jVar.b();
            char c2 = '\\';
            while (true) {
                char c3 = 14;
                while (true) {
                    switch (c3) {
                        case 13:
                            break;
                        case 14:
                            break;
                        case 15:
                            switch (c2) {
                                case '_':
                                    return;
                            }
                    }
                    c3 = 15;
                    c2 = '_';
                }
            }
        }
    }

    @JavascriptInterface
    public String getCurrentVideoState() {
        JSONObject jSONObject = new JSONObject();
        k(jSONObject);
        return jSONObject.toString();
    }

    @JavascriptInterface
    public String getTemplateInfo() {
        a(com.bytedance.sdk.component.d.c.b.a.a1657027613264dc("gdvWahvki}oBbka"), true);
        try {
            if (this.t != null) {
                this.t.put(com.bytedance.sdk.component.d.c.b.a.a1657027613264dc("sdvwmka"), v());
                if (this.q != null) {
                    this.t.put(com.bytedance.sdk.component.d.c.b.a.a1657027613264dc("eyvfjvohf"), this.q.aB());
                }
            }
            a(com.bytedance.sdk.component.d.c.b.a.a1657027613264dc("gdvWahvki}oBbka"), false);
            return this.t.toString();
        } catch (Exception unused) {
            return "";
        }
    }

    @JProtect
    public void h() {
        a((JSONObject) null, (com.bytedance.sdk.openadsdk.g.c) new com.bytedance.sdk.openadsdk.g.c() {
            public void a(boolean z, List<com.bytedance.sdk.openadsdk.core.e.n> list) {
                List unused = w.this.D = list;
                w.this.w();
                w.this.i();
            }
        });
        while (true) {
            char c2 = ']';
            char c3 = ']';
            while (true) {
                switch (c2) {
                    case '\\':
                        switch (c3) {
                            case 21:
                            case 22:
                            case 23:
                                break;
                        }
                    case ']':
                        while (true) {
                            switch (c3) {
                                case '[':
                                case '\\':
                                case ']':
                                    break;
                                default:
                                    c3 = '[';
                            }
                        }
                    case '^':
                        if (c3 <= 4) {
                            continue;
                        } else {
                            return;
                        }
                }
                c2 = '^';
                c3 = 'K';
            }
        }
    }

    public void i() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(com.bytedance.sdk.component.e.c.g.g1657027613239dc("m`vfvlgk"), b(this.D));
            a(com.bytedance.sdk.component.e.c.g.g1657027613239dc("m`vfvlgkEl~j"), jSONObject);
        } catch (Exception unused) {
        }
    }

    @JavascriptInterface
    public void initRenderFinish() {
        l.b(com.bytedance.sdk.component.e.d.c.c1657027613239dc("TUCm`winlFhainz"), com.bytedance.sdk.component.e.d.c.c1657027613239dc("iokwV`hcm{Lbbd}g"));
        new Handler(Looper.getMainLooper()).post(new Runnable() {
            public void run() {
                if (w.this.L != null) {
                    w.this.L.a();
                }
            }
        });
    }

    public boolean j() {
        boolean z2 = this.K;
        while (true) {
            char c2 = '^';
            char c3 = 'K';
            while (true) {
                switch (c2) {
                    case '\\':
                        switch (c3) {
                            case 21:
                                break;
                            case 22:
                            case 23:
                                break;
                        }
                    case ']':
                        break;
                    case '^':
                        break;
                }
                c2 = ']';
                c3 = ']';
            }
            while (true) {
                switch (c3) {
                    case '[':
                    case '\\':
                    case ']':
                        break;
                    default:
                        c3 = '[';
                }
            }
        }
        return z2;
    }

    /* access modifiers changed from: package-private */
    public boolean k() {
        com.bytedance.sdk.openadsdk.core.e.n nVar = this.q;
        if (nVar != null) {
            int I2 = nVar.I();
            while (true) {
                char c2 = '_';
                char c3 = '_';
                while (true) {
                    switch (c2) {
                        case '^':
                            if (c3 != '\'') {
                                break;
                            } else {
                                continue;
                            }
                        case '_':
                            switch (c3) {
                                case '^':
                                case '`':
                                    continue;
                                case '_':
                                    if (I2 != 1) {
                                        break;
                                    } else {
                                        return true;
                                    }
                            }
                        case '`':
                            break;
                    }
                    switch (c3) {
                        case '7':
                        case '9':
                            break;
                        case '8':
                            break;
                    }
                    c2 = '^';
                    c3 = '}';
                }
            }
            return false;
        }
        return false;
    }

    public void l() {
        com.bytedance.sdk.openadsdk.e.c cVar = this.i;
        if (cVar != null) {
            cVar.a();
        }
        if (x()) {
            h();
        }
    }

    public void m() {
        com.bytedance.sdk.openadsdk.e.c cVar = this.i;
        if (cVar != null) {
            cVar.b();
            while (true) {
                char c2 = 15;
                while (true) {
                    switch (c2) {
                        case 13:
                        case 14:
                            return;
                        default:
                            c2 = 14;
                    }
                }
            }
        }
    }

    @JavascriptInterface
    public void muteVideo(String str) {
        try {
            final JSONObject jSONObject = new JSONObject(str);
            if (Looper.myLooper() == Looper.getMainLooper()) {
                i(jSONObject);
            } else {
                new Handler(Looper.getMainLooper()).post(new Runnable() {
                    public void run() {
                        w.this.i(jSONObject);
                    }
                });
            }
        } catch (Exception unused) {
            l.e(g.g1657027613257dc("TUCm`winlFhainz"), "");
        }
    }

    public void n() {
        com.bytedance.sdk.openadsdk.e.c cVar = this.i;
        if (cVar != null) {
            cVar.c();
            char c2 = '\\';
            while (true) {
                char c3 = 14;
                while (true) {
                    switch (c3) {
                        case 13:
                            break;
                        case 14:
                            break;
                        case 15:
                            switch (c2) {
                                case '_':
                                    return;
                            }
                    }
                    c3 = 15;
                    c2 = '_';
                }
            }
        }
    }

    @JavascriptInterface
    public void renderDidFinish(String str) {
        try {
            l(new JSONObject(str));
        } catch (Exception unused) {
        }
    }

    @JavascriptInterface
    public void skipVideo() {
        try {
            if (Looper.myLooper() == Looper.getMainLooper()) {
                t();
            } else {
                this.f1700e.post(new Runnable() {
                    public void run() {
                        w.this.t();
                    }
                });
            }
        } catch (Exception unused) {
        }
    }
}
