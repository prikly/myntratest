package com.bytedance.sdk.openadsdk.core.i;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.os.Build;
import android.preference.PreferenceManager;
import android.text.TextUtils;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.sdk.component.b.a.e;
import com.bytedance.sdk.component.d.d.g;
import com.bytedance.sdk.component.e.d.c;
import com.bytedance.sdk.component.utils.f;
import com.bytedance.sdk.component.utils.l;
import com.bytedance.sdk.component.utils.o;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.bytedance.sdk.openadsdk.core.h;
import com.bytedance.sdk.openadsdk.core.j;
import com.bytedance.sdk.openadsdk.core.m;
import com.bytedance.sdk.openadsdk.multipro.b;
import com.bytedance.sdk.openadsdk.utils.n;
import com.bytedance.sdk.openadsdk.utils.u;
import java.io.File;
import java.io.IOException;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicLong;
import org.json.JSONObject;

/* compiled from: SdkSettingsHelper */
public class d implements Runnable {

    /* renamed from: d  reason: collision with root package name */
    private static final AtomicLong f1242d = new AtomicLong(0);

    /* renamed from: e  reason: collision with root package name */
    private static volatile d f1243e;
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public static volatile boolean f1244f = false;

    /* renamed from: g  reason: collision with root package name */
    private static boolean f1245g = true;
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final b f1246a;

    /* renamed from: b  reason: collision with root package name */
    private final Context f1247b;

    /* renamed from: c  reason: collision with root package name */
    private final Executor f1248c;

    /* compiled from: SdkSettingsHelper */
    private class a extends BroadcastReceiver {
        private a() {
        }

        public void onReceive(Context context, Intent intent) {
            if (intent != null) {
                int intExtra = intent.getIntExtra(c.c1657027613239dc("b^opcZoc"), -1);
                if (intExtra == 1) {
                    long longExtra = intent.getLongExtra(c.c1657027613239dc("b^opcZrnel"), -1);
                    if (longExtra > 0) {
                        d.d().set(longExtra);
                    }
                } else if (intExtra == 2) {
                    try {
                        if (d.this.f1246a != null) {
                            d.this.f1246a.a();
                        }
                    } catch (Throwable unused) {
                    }
                }
            }
        }
    }

    private d(b bVar) {
        this.f1246a = bVar == null ? m.h() : bVar;
        this.f1247b = m.a();
        this.f1248c = Executors.newSingleThreadExecutor();
        if (b.c()) {
            try {
                this.f1247b.registerReceiver(new a(), new IntentFilter(com.bytedance.sdk.component.d.c.b.a.a1657027613264dc("cno-f|rblhdhi#auswgq}9k|nousyMEBGJR@T")));
            } catch (Throwable unused) {
            }
        }
    }

    public static int a(Context context) {
        if (context == null || !c(context)) {
            return -2;
        }
        return PreferenceManager.getDefaultSharedPreferences(context).getInt(com.bytedance.sdk.component.e.c.a.a1657027613243dc("I@@WGCY`lyxJ|}bfub"), -1);
    }

    public static d a(b bVar) {
        Class<d> cls = d.class;
        if (f1243e == null) {
            synchronized (cls) {
                if (f1243e == null) {
                    f1243e = new d(bVar);
                }
            }
        }
        return f1243e;
    }

    private JSONObject a(JSONObject jSONObject) {
        return f1245g ? com.bytedance.sdk.component.utils.a.a(jSONObject) : jSONObject;
    }

    public static void a() {
        try {
            Context a2 = m.a();
            File file = new File(Build.VERSION.SDK_INT >= 24 ? new File(a2.getDataDir(), com.bytedance.sdk.component.d.c.b.a.a1657027613264dc("sicqaaYwzllx")) : new File(a2.getDatabasePath(g.g1657027613257dc("1")).getParentFile().getParentFile(), g.g1657027613257dc("sicqaaYwzllx")), com.bytedance.sdk.component.d.c.b.a.a1657027613264dc("tu]p`nYtm}~bbj}!h|~"));
            if (file.exists()) {
                if (file.isFile()) {
                    String replace = file.getName().replace(com.bytedance.sdk.component.d.c.b.a.a1657027613264dc(".yoo"), "");
                    if (Build.VERSION.SDK_INT >= 24) {
                        a2.deleteSharedPreferences(replace);
                    } else {
                        a2.getSharedPreferences(replace, 0).edit().clear().apply();
                        f.c(file);
                    }
                }
            }
        } catch (Throwable unused) {
        }
    }

    public static void a(long j) {
        if (j > 0 && m.a() != null) {
            try {
                Intent intent = new Intent();
                intent.setAction(e.e1657027613270dc("cno-f|rblhdhi#auswgq}9k|nousyMEBGJR@T"));
                intent.putExtra(e.e1657027613270dc("b^opcZoc"), 1);
                intent.putExtra(e.e1657027613270dc("b^opcZrnel"), j);
                m.a().sendBroadcast(intent);
            } catch (Throwable unused) {
            }
        }
    }

    /* access modifiers changed from: private */
    public void a(String str, Map<String, String> map) {
        int i = 1;
        try {
            if (!TextUtils.isEmpty(str) && map != null) {
                int intValue = Integer.valueOf(map.get(c.c1657027613239dc("abvjr`+dgg~yca"))).intValue();
                long longValue = Long.valueOf(map.get(c.c1657027613239dc("tr"))).longValue();
                String str2 = map.get(c.c1657027613239dc("prv"));
                String a2 = com.bykv.vk.openvk.component.video.api.f.b.a(str + intValue + longValue);
                if (a2 != null && a2.equalsIgnoreCase(str2)) {
                    i = intValue;
                }
            }
        } catch (Throwable unused) {
        }
        e.a(i);
    }

    public static String b(Context context) {
        return context != null ? PreferenceManager.getDefaultSharedPreferences(context).getString(f.f1253b, "") : "";
    }

    public static void b() {
        if (m.a() != null) {
            try {
                Intent intent = new Intent();
                intent.setAction(e.e1657027613270dc("cno-f|rblhdhi#auswgq}9k|nousyMEBGJR@T"));
                intent.putExtra(e.e1657027613270dc("b^opcZoc"), 2);
                m.a().sendBroadcast(intent);
            } catch (Throwable unused) {
            }
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static /* synthetic */ boolean b(boolean r3) {
        /*
        L_0x0000:
            r0 = 94
            r1 = 75
            r2 = 93
        L_0x0006:
            switch(r0) {
                case 92: goto L_0x000e;
                case 93: goto L_0x0011;
                case 94: goto L_0x000a;
                default: goto L_0x0009;
            }
        L_0x0009:
            goto L_0x001c
        L_0x000a:
            r0 = 4
            if (r1 > r0) goto L_0x0016
            goto L_0x001c
        L_0x000e:
            switch(r1) {
                case 21: goto L_0x0016;
                case 22: goto L_0x0015;
                case 23: goto L_0x0015;
                default: goto L_0x0011;
            }
        L_0x0011:
            switch(r1) {
                case 91: goto L_0x0000;
                case 92: goto L_0x0016;
                case 93: goto L_0x0015;
                default: goto L_0x0014;
            }
        L_0x0014:
            goto L_0x0019
        L_0x0015:
            return r3
        L_0x0016:
            f1244f = r3
            goto L_0x001c
        L_0x0019:
            r1 = 91
            goto L_0x0011
        L_0x001c:
            r0 = 93
            r1 = 93
            goto L_0x0006
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.core.i.d.b(boolean):boolean");
    }

    private static boolean c(Context context) {
        if (context == null) {
            return true;
        }
        SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(context);
        return (defaultSharedPreferences.getInt(com.bytedance.sdk.component.e.c.a.a1657027613243dc("I@@WGCYDeyYogDJ"), RecyclerView.UNDEFINED_DURATION) == Integer.MIN_VALUE && defaultSharedPreferences.getInt(com.bytedance.sdk.component.e.c.a.a1657027613243dc("I@@WGCYDeyYog[k}cx}}"), RecyclerView.UNDEFINED_DURATION) == Integer.MIN_VALUE) ? false : true;
    }

    static /* synthetic */ AtomicLong d() {
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
        return f1242d;
    }

    private boolean f() {
        return TextUtils.isEmpty(h.d().f());
    }

    private JSONObject g() {
        JSONObject jSONObject = new JSONObject();
        int i = 1;
        u.a(jSONObject, true);
        try {
            int j = h.d().j();
            String d1657027613261dc = com.bytedance.sdk.component.d.d.d.d1657027613261dc("sdvwmka");
            l.b(d1657027613261dc, com.bytedance.sdk.component.d.d.d.d1657027613261dc("Sdvwmkat  $bJjbDavf5+") + m.h().x());
            jSONObject.put(com.bytedance.sdk.component.d.d.d.d1657027613261dc("mnffh"), Build.MODEL);
            jSONObject.put(com.bytedance.sdk.component.d.d.d.d1657027613261dc("ddtjg`Yda}s"), u.n());
            f h2 = m.h();
            if (h2.p(com.bytedance.sdk.component.d.d.d.d1657027613261dc("g`kg"))) {
                jSONObject.put(g.g1657027613257dc("g`kg"), com.com.bytedance.overseas.sdk.b.a.a().b());
            }
            jSONObject.put(com.bytedance.sdk.component.d.d.d.d1657027613261dc("gerq"), j);
            jSONObject.put(com.bytedance.sdk.component.d.d.d.d1657027613261dc("cnrse"), h.d().i());
            jSONObject.put(com.bytedance.sdk.component.d.d.d.d1657027613261dc("cbrb"), h.d().v());
            String d1657027613261dc2 = com.bytedance.sdk.component.d.d.d.d1657027613261dc("SeiPaqrnfnyCia~jb");
            l.c(d1657027613261dc2, com.bytedance.sdk.component.d.d.d.d1657027613261dc("cnrse%;") + h.d().i());
            if (h2.p(com.bytedance.sdk.component.d.d.d.d1657027613261dc("mba"))) {
                jSONObject.put(com.bytedance.sdk.component.d.d.d.d1657027613261dc("mba"), n.b());
            }
            jSONObject.put(com.bytedance.sdk.component.d.d.d.d1657027613261dc("cnlm[qwm"), u.p(this.f1247b));
            jSONObject.put(com.bytedance.sdk.component.d.d.d.d1657027613261dc("or"), 1);
            jSONObject.put(com.bytedance.sdk.component.d.d.d.d1657027613261dc("owgqw`gX~lxxeb`Pdhbv"), 1);
            jSONObject.put(com.bytedance.sdk.component.d.d.d.d1657027613261dc("or]uawungg"), String.valueOf(Build.VERSION.RELEASE));
            jSONObject.put(com.bytedance.sdk.component.d.d.d.d1657027613261dc("sei\\r`ttafd"), com.bytedance.sdk.component.d.d.d.d1657027613261dc("4/7-4+0"));
            jSONObject.put(com.bytedance.sdk.component.d.d.d.d1657027613261dc("l`ldqdab"), j.a());
            jSONObject.put(com.bytedance.sdk.component.d.d.d.d1657027613261dc("thof[iim"), u.q());
            jSONObject.put(com.bytedance.sdk.component.d.d.d.d1657027613261dc("p`ahebcXfhgn"), u.d());
            boolean c2 = u.c(this.f1247b, u.d());
            String d1657027613261dc3 = com.bytedance.sdk.component.d.d.d.d1657027613261dc("irCstiodi}cdbKa}uv`|a{r");
            l.c(d1657027613261dc3, com.bytedance.sdk.component.d.d.d.d1657027613261dc("irCstiodi}cdbKa}uv`|a{r-") + c2);
            String d1657027613261dc4 = com.bytedance.sdk.component.d.d.d.d1657027613261dc("pnqjplii");
            if (!c2) {
                i = 2;
            }
            jSONObject.put(d1657027613261dc4, i);
            jSONObject.put(com.bytedance.sdk.component.d.d.d.d1657027613261dc("aqr\\r`ttafd"), u.f());
            jSONObject.put(com.bytedance.sdk.component.d.d.d.d1657027613261dc("vdlgkw"), Build.MANUFACTURER);
            jSONObject.put(com.bytedance.sdk.component.d.d.d.d1657027613261dc("utkg"), j.c(this.f1247b));
            if (!(h.d() == null || h.d().f() == null)) {
                jSONObject.put(com.bytedance.sdk.component.d.d.d.d1657027613261dc("aqr\\ma"), h.d().f());
            }
            long currentTimeMillis = System.currentTimeMillis() / 1000;
            jSONObject.put(com.bytedance.sdk.component.d.d.d.d1657027613261dc("tr"), currentTimeMillis);
            String str = "";
            if (!(h.d() == null || h.d().f() == null)) {
                str = h.d().f().concat(String.valueOf(currentTimeMillis)).concat(com.bytedance.sdk.component.d.d.d.d1657027613261dc("4/7-4+0"));
            }
            jSONObject.put(com.bytedance.sdk.component.d.d.d.d1657027613261dc("rds\\wlai"), com.bytedance.sdk.component.utils.e.a(str));
            jSONObject.put(com.bytedance.sdk.component.d.d.d.d1657027613261dc("tbqwvlh`"), b(this.f1247b));
            jSONObject.put(com.bytedance.sdk.component.d.d.d.d1657027613261dc("tbd\\cavu"), a(this.f1247b));
            jSONObject.put(com.bytedance.sdk.component.d.d.d.d1657027613261dc("llv"), com.bytedance.sdk.openadsdk.utils.e.b());
            jSONObject.put(com.bytedance.sdk.component.d.d.d.d1657027613261dc("lnabh`Ykigm~mjk"), com.bytedance.sdk.openadsdk.utils.e.c());
            jSONObject.put(com.bytedance.sdk.component.d.d.d.d1657027613261dc("cicmj`j"), com.bytedance.sdk.component.d.d.d.d1657027613261dc("m`km"));
        } catch (Exception unused) {
        }
        return jSONObject;
    }

    public void a(boolean z) {
        try {
            if (!f()) {
                long currentTimeMillis = System.currentTimeMillis();
                if (z || currentTimeMillis - f1242d.get() >= TTAdConstant.AD_MAX_EVENT_TIME) {
                    f1242d.set(currentTimeMillis);
                    if (b.c()) {
                        a(currentTimeMillis);
                    }
                    this.f1248c.execute(this);
                }
            }
        } catch (Throwable th) {
            l.a(e.e1657027613270dc("SeiPaqrnfnyCia~jb"), e.e1657027613270dc("lncg$vbl(zoxd`hc1wafzd-8"), th);
        }
    }

    public void c() {
        com.bytedance.sdk.openadsdk.utils.e.g();
    }

    public void run() {
        if (!o.a(this.f1247b)) {
            try {
                this.f1246a.a();
            } catch (Throwable unused) {
            }
        } else if (!f()) {
            l.c(c.c1657027613239dc("SeiPaqrnfnyCia~jb"), c.c1657027613239dc("Fdv`l%ub|}cek-|jadw``5ecykn"));
            JSONObject g2 = g();
            com.bytedance.sdk.component.e.b.d b2 = com.bytedance.sdk.openadsdk.i.d.a().b().b();
            try {
                b2.a(com.bytedance.sdk.openadsdk.c.d.a(b2, u.g(c.c1657027613239dc("/`rj+db(}gcdb\"}k{>av`ayj5"))));
                b2.b(c.c1657027613239dc("Urgq)Dabf}"), u.b());
            } catch (Exception unused2) {
            }
            b2.c(a(g2).toString());
            b2.a((com.bytedance.sdk.component.e.a.a) new com.bytedance.sdk.component.e.a.a() {
                /* JADX WARNING: Can't fix incorrect switch cases order */
                /* JADX WARNING: Can't wrap try/catch for region: R(9:12|(2:14|(3:16|17|18))|21|22|23|24|(3:26|42|30)|39|(2:41|44)(1:45)) */
                /* JADX WARNING: Code restructure failed: missing block: B:37:?, code lost:
                    com.bytedance.sdk.openadsdk.core.i.d.b(true);
                 */
                /* JADX WARNING: Failed to process nested try/catch */
                /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x006e */
                /* JADX WARNING: Removed duplicated region for block: B:26:0x007d  */
                /* JADX WARNING: Removed duplicated region for block: B:31:0x0092  */
                /* Code decompiled incorrectly, please refer to instructions dump. */
                public void a(com.bytedance.sdk.component.e.b.c r6, com.bytedance.sdk.component.e.b r7) {
                    /*
                        r5 = this;
                        r6 = 5
                        if (r7 == 0) goto L_0x0082
                        boolean r0 = r7.f()
                        if (r0 == 0) goto L_0x0082
                        java.lang.String r0 = r7.d()
                        java.lang.CharSequence r0 = (java.lang.CharSequence) r0
                        boolean r0 = android.text.TextUtils.isEmpty(r0)
                        if (r0 != 0) goto L_0x0082
                        r0 = 0
                        org.json.JSONObject r1 = new org.json.JSONObject     // Catch:{ JSONException -> 0x0020 }
                        java.lang.String r2 = r7.d()     // Catch:{ JSONException -> 0x0020 }
                        r1.<init>(r2)     // Catch:{ JSONException -> 0x0020 }
                        goto L_0x0027
                    L_0x0020:
                        r1 = move-exception
                        org.json.JSONException r1 = (org.json.JSONException) r1
                        r1.printStackTrace()
                        r1 = r0
                    L_0x0027:
                        if (r1 == 0) goto L_0x0082
                        java.lang.String r2 = "cxrkaw"
                        java.lang.String r2 = com.bytedance.sdk.component.e.c.e.e1657027613237dc(r2)
                        r3 = -1
                        int r2 = r1.optInt(r2, r3)
                        r3 = 3
                        if (r2 != r3) goto L_0x0065
                        java.lang.String r0 = "mdqpebc"
                        java.lang.String r0 = com.bytedance.sdk.component.e.c.e.e1657027613237dc(r0)
                        java.lang.String r0 = r1.optString(r0)
                        java.lang.String r0 = com.bytedance.sdk.component.utils.a.b(r0)
                        r2 = r0
                        java.lang.CharSequence r2 = (java.lang.CharSequence) r2
                        boolean r2 = android.text.TextUtils.isEmpty(r2)
                        if (r2 != 0) goto L_0x0065
                        org.json.JSONObject r2 = new org.json.JSONObject     // Catch:{ all -> 0x0055 }
                        r2.<init>(r0)     // Catch:{ all -> 0x0055 }
                        r1 = r2
                        goto L_0x0065
                    L_0x0055:
                        r2 = move-exception
                        java.lang.String r3 = "SeiPaqrnfnyCia~jb"
                        java.lang.String r3 = com.bytedance.sdk.component.e.c.e.e1657027613237dc(r3)
                        java.lang.String r4 = "sdvwmka'lh~j,h|}c )4"
                        java.lang.String r4 = com.bytedance.sdk.component.e.c.e.e1657027613237dc(r4)
                        com.bytedance.sdk.component.utils.l.a(r3, r4, r2)
                    L_0x0065:
                        java.util.Map r7 = r7.c()     // Catch:{ all -> 0x006e }
                        com.bytedance.sdk.openadsdk.core.i.d r2 = com.bytedance.sdk.openadsdk.core.i.d.this     // Catch:{ all -> 0x006e }
                        r2.a(r0, r7)     // Catch:{ all -> 0x006e }
                    L_0x006e:
                        com.bytedance.sdk.openadsdk.core.i.d r7 = com.bytedance.sdk.openadsdk.core.i.d.this     // Catch:{ all -> 0x009d }
                        com.bytedance.sdk.openadsdk.core.i.b r7 = r7.f1246a     // Catch:{ all -> 0x009d }
                        r7.a(r1)     // Catch:{ all -> 0x009d }
                        boolean r7 = com.bytedance.sdk.openadsdk.core.i.d.f1244f     // Catch:{ all -> 0x009d }
                        if (r7 != 0) goto L_0x009e
                        r7 = 11
                        r0 = 11
                        goto L_0x00a8
                    L_0x0082:
                        com.bytedance.sdk.openadsdk.core.i.d r7 = com.bytedance.sdk.openadsdk.core.i.d.this     // Catch:{ all -> 0x00ab }
                        com.bytedance.sdk.openadsdk.core.i.b r7 = r7.f1246a     // Catch:{ all -> 0x00ab }
                        r7.a()     // Catch:{ all -> 0x00ab }
                        r7 = 64
                        r0 = 5
                    L_0x008e:
                        switch(r7) {
                            case 63: goto L_0x0098;
                            case 64: goto L_0x0092;
                            case 65: goto L_0x0098;
                            default: goto L_0x0091;
                        }
                    L_0x0091:
                        goto L_0x00a8
                    L_0x0092:
                        r7 = 4
                        if (r0 == r7) goto L_0x0098
                        if (r0 == r6) goto L_0x00ab
                        r6 = 6
                    L_0x0098:
                        r6 = 1
                        com.bytedance.sdk.openadsdk.core.i.d.b((boolean) r6)     // Catch:{ all -> 0x009d }
                        goto L_0x009e
                    L_0x009d:
                    L_0x009e:
                        boolean r6 = com.bytedance.sdk.openadsdk.multipro.b.c()
                        if (r6 == 0) goto L_0x00a7
                        com.bytedance.sdk.openadsdk.core.i.d.b()
                    L_0x00a7:
                        return
                    L_0x00a8:
                        r7 = 63
                        goto L_0x008e
                    L_0x00ab:
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.core.i.d.AnonymousClass1.a(com.bytedance.sdk.component.e.b.c, com.bytedance.sdk.component.e.b):void");
                }

                public void a(com.bytedance.sdk.component.e.b.c cVar, IOException iOException) {
                    try {
                        d.this.f1246a.a();
                    } catch (Throwable unused) {
                    }
                }
            });
        } else {
            return;
        }
        c();
    }
}
