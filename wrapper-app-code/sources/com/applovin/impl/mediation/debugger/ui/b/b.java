package com.applovin.impl.mediation.debugger.ui.b;

import android.content.Context;
import com.applovin.communicator.AppLovinCommunicator;
import com.applovin.communicator.AppLovinCommunicatorMessage;
import com.applovin.communicator.AppLovinCommunicatorSubscriber;
import com.applovin.impl.mediation.debugger.a;
import com.applovin.impl.mediation.debugger.b.c.b;
import com.applovin.impl.mediation.debugger.ui.d.c;
import com.applovin.impl.mediation.debugger.ui.d.d;
import com.applovin.impl.sdk.e;
import com.applovin.impl.sdk.k;
import com.applovin.impl.sdk.n;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.sdk.utils.Utils;
import com.applovin.impl.sdk.utils.g;
import com.applovin.impl.sdk.v;
import com.applovin.sdk.AppLovinSdk;
import com.applovin.sdk.AppLovinSdkUtils;
import com.applovin.sdk.R;
import com.appodeal.ads.modules.common.internal.LogConstants;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

public class b extends d implements AppLovinCommunicatorSubscriber, a.C0144a {

    /* renamed from: a  reason: collision with root package name */
    private n f14806a;

    /* renamed from: b  reason: collision with root package name */
    private List<com.applovin.impl.mediation.debugger.b.a.a> f14807b;

    /* renamed from: d  reason: collision with root package name */
    private List<com.applovin.impl.mediation.debugger.b.a.a> f14808d;

    /* renamed from: e  reason: collision with root package name */
    private String f14809e;

    /* renamed from: f  reason: collision with root package name */
    private String f14810f;

    /* renamed from: g  reason: collision with root package name */
    private String f14811g;
    /* access modifiers changed from: private */

    /* renamed from: h  reason: collision with root package name */
    public com.applovin.impl.mediation.debugger.b.b.b f14812h;
    private final StringBuilder i = new StringBuilder("");
    private final AtomicBoolean j = new AtomicBoolean();
    private boolean k = false;
    private List<com.applovin.impl.mediation.debugger.b.c.b> l = new ArrayList();
    private List<com.applovin.impl.mediation.debugger.b.c.b> m = new ArrayList();
    private List<com.applovin.impl.mediation.debugger.b.c.b> n = new ArrayList();
    private List<com.applovin.impl.mediation.debugger.b.a.d> o = new ArrayList();
    private List<com.applovin.impl.mediation.debugger.b.a.d> p = new ArrayList();
    private List<com.applovin.impl.mediation.debugger.b.c.b> q = new ArrayList();
    private List<c> r = new ArrayList();
    /* access modifiers changed from: private */
    public List<c> s = new ArrayList();
    private List<c> t = new ArrayList();
    private List<c> u = new ArrayList();
    private List<c> v = new ArrayList();
    private List<c> w = new ArrayList();
    private List<c> x = new ArrayList();

    public enum a {
        AD_UNITS,
        SELECT_LIVE_NETWORKS,
        SELECT_TEST_MODE_NETWORKS,
        INITIALIZATION_AD_UNITS,
        f14821e
    }

    /* renamed from: com.applovin.impl.mediation.debugger.ui.b.b$b  reason: collision with other inner class name */
    public enum C0149b {
        APP_INFO,
        MAX,
        PRIVACY,
        ADS,
        INCOMPLETE_NETWORKS,
        COMPLETED_NETWORKS,
        MISSING_NETWORKS,
        f14830h
    }

    public b(Context context) {
        super(context);
    }

    private c a(String str) {
        c.a p2 = c.p();
        if (!this.f14806a.N().a()) {
            p2.a(this.f14883c);
        }
        StringBuilder sb = new StringBuilder();
        sb.append(StringUtils.isValidString(str) ? "" : "Select ");
        sb.append("Live Network");
        c.a a2 = p2.a(sb.toString());
        if (this.f14806a.N().a()) {
            str = "Enable";
        }
        return a2.b(str).b(-16776961).d("Ad loads are not supported while Test Mode is enabled. Please restart the app and make sure your GAID has not been enabled for test mode and that you are not on an emulator.").a(true).a();
    }

    private List<c> a(String str, String str2) {
        ArrayList arrayList = new ArrayList(3);
        c.a p2 = c.p();
        arrayList.add(p2.a("View Ad Units (" + this.f14807b.size() + ")").a(this.f14883c).a(true).a());
        arrayList.add(a(str));
        arrayList.add(b(str2));
        if (!this.f14808d.isEmpty()) {
            c.a p3 = c.p();
            arrayList.add(p3.a("Selective Init Ad Units (" + this.f14808d.size() + ")").a(this.f14883c).a(true).a());
        }
        return arrayList;
    }

    private void a(c.a aVar, String str) {
        aVar.c("MAX Ad Review").d(str).a(R.drawable.applovin_ic_x_mark).c(g.a(R.color.applovin_sdk_xmarkColor, this.f14883c)).a(true);
    }

    private void a(StringBuilder sb, String str) {
        String sb2 = sb.toString();
        if (sb2.length() + str.length() >= ((Integer) this.f14806a.a(com.applovin.impl.sdk.c.b.ao)).intValue()) {
            v.f("MediationDebuggerListAdapter", sb2);
            this.i.append(sb2);
            sb.setLength(1);
        }
        sb.append(str);
    }

    private void a(List<com.applovin.impl.mediation.debugger.b.c.b> list) {
        List<com.applovin.impl.mediation.debugger.b.c.b> list2;
        for (com.applovin.impl.mediation.debugger.b.c.b next : list) {
            if (!next.g()) {
                if (next.a() == b.a.INCOMPLETE_INTEGRATION || next.a() == b.a.INVALID_INTEGRATION) {
                    list2 = this.l;
                } else if (next.a() == b.a.COMPLETE) {
                    list2 = this.m;
                } else if (next.a() == b.a.MISSING) {
                    list2 = this.n;
                }
                list2.add(next);
            }
        }
    }

    private c b(String str) {
        c.a p2 = c.p();
        if (this.f14806a.N().a()) {
            p2.a(this.f14883c);
        }
        StringBuilder sb = new StringBuilder();
        sb.append(StringUtils.isValidString(str) ? "" : "Select ");
        sb.append("Test Mode Network");
        c.a a2 = p2.a(sb.toString());
        if (!this.f14806a.N().a()) {
            str = "Enable";
        }
        return a2.b(str).b(-16776961).d("Please re-launch the app to enable test mode. This will allow the selection of test mode networks.").a(true).a();
    }

    private c b(String str, String str2) {
        c.a a2 = c.p().a(str);
        if (StringUtils.isValidString(str2)) {
            a2.b(str2);
        } else {
            a2.a(R.drawable.applovin_ic_x_mark);
            a2.c(g.a(R.color.applovin_sdk_xmarkColor, this.f14883c));
        }
        return a2.a();
    }

    /* access modifiers changed from: private */
    public c b(boolean z) {
        return c.p().a("app-ads.txt").a(z ? R.drawable.applovin_ic_check_mark_bordered : R.drawable.applovin_ic_x_mark).c(g.a(z ? R.color.applovin_sdk_checkmarkColor : R.color.applovin_sdk_xmarkColor, this.f14883c)).a(false).a();
    }

    private void b(List<com.applovin.impl.mediation.debugger.b.a.a> list) {
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        for (com.applovin.impl.mediation.debugger.b.a.a e2 : list) {
            com.applovin.impl.mediation.debugger.b.a.c e3 = e2.e();
            for (com.applovin.impl.mediation.debugger.b.a.b a2 : e3.a()) {
                hashSet.add(a2.a());
            }
            for (com.applovin.impl.mediation.debugger.b.a.b a3 : e3.b()) {
                hashSet2.add(a3.a());
            }
        }
        this.o = new ArrayList(hashSet);
        this.p = new ArrayList(hashSet2);
        Collections.sort(this.o);
        Collections.sort(this.p);
    }

    private void c(List<com.applovin.impl.mediation.debugger.b.c.b> list) {
        for (com.applovin.impl.mediation.debugger.b.c.b next : list) {
            if (next.c() == b.C0146b.READY) {
                this.q.add(next);
            }
        }
    }

    private List<c> d(List<com.applovin.impl.mediation.debugger.b.c.b> list) {
        ArrayList arrayList = new ArrayList(list.size());
        for (com.applovin.impl.mediation.debugger.b.c.b aVar : list) {
            arrayList.add(new com.applovin.impl.mediation.debugger.ui.b.a.a(aVar, this.f14883c));
        }
        return arrayList;
    }

    private void p() {
        Map<String, String> metaData;
        StringBuilder sb = new StringBuilder("\n========== MEDIATION DEBUGGER ==========");
        sb.append("\n========== APP INFO ==========");
        sb.append("\nDev Build - " + Utils.isPubInDebugMode(this.f14883c, this.f14806a));
        StringBuilder sb2 = new StringBuilder();
        sb2.append("\nTest Mode - ");
        sb2.append(this.f14806a.N().a() ? "enabled" : LogConstants.MSG_AD_TYPE_DISABLED);
        sb.append(sb2.toString());
        sb.append("\nTarget SDK - " + this.f14806a.Y().h().get("target_sdk"));
        sb.append("\n========== MAX ==========");
        String str = AppLovinSdk.VERSION;
        String str2 = (String) this.f14806a.a(com.applovin.impl.sdk.c.b.dI);
        String a2 = e.a();
        sb.append("\nSDK Version - " + str);
        StringBuilder sb3 = new StringBuilder();
        sb3.append("\nPlugin Version - ");
        String str3 = "None";
        if (!StringUtils.isValidString(str2)) {
            str2 = str3;
        }
        sb3.append(str2);
        sb.append(sb3.toString());
        StringBuilder sb4 = new StringBuilder();
        sb4.append("\nAd Review Version - ");
        if (!StringUtils.isValidString(a2)) {
            a2 = "Disabled";
        }
        sb4.append(a2);
        sb.append(sb4.toString());
        if (this.f14806a.g() && (metaData = Utils.getMetaData(this.f14806a.q())) != null) {
            String str4 = metaData.get("UnityVersion");
            StringBuilder sb5 = new StringBuilder();
            sb5.append("\nUnity Version - ");
            if (StringUtils.isValidString(str4)) {
                str3 = str4;
            }
            sb5.append(str3);
            sb.append(sb5.toString());
        }
        sb.append("\n========== PRIVACY ==========");
        sb.append(k.a(this.f14883c));
        sb.append("\n========== NETWORKS ==========");
        for (com.applovin.impl.mediation.debugger.b.c.b z : this.m) {
            a(sb, z.z());
        }
        for (com.applovin.impl.mediation.debugger.b.c.b z2 : this.l) {
            a(sb, z2.z());
        }
        sb.append("\n========== AD UNITS ==========");
        for (com.applovin.impl.mediation.debugger.b.a.a f2 : this.f14807b) {
            a(sb, f2.f());
        }
        sb.append("\n========== END ==========");
        v.f("MediationDebuggerListAdapter", sb.toString());
        this.i.append(sb.toString());
    }

    private List<c> q() {
        String str;
        ArrayList arrayList = new ArrayList(5);
        try {
            str = this.f14883c.getPackageManager().getPackageInfo(this.f14883c.getPackageName(), 0).versionName;
        } catch (Throwable unused) {
            str = null;
        }
        arrayList.add(c.p().a("Package Name").b(this.f14883c.getPackageName()).a());
        c.a a2 = c.p().a("App Version");
        String str2 = "None";
        if (!StringUtils.isValidString(str)) {
            str = str2;
        }
        arrayList.add(a2.b(str).a());
        arrayList.add(c.p().a("OS").b(Utils.getAndroidOSInfo()).a());
        arrayList.add(c.p().a("Account").b(StringUtils.isValidString(this.f14811g) ? this.f14811g : str2).a());
        c.a a3 = c.p().a("Mediation Provider");
        if (StringUtils.isValidString(this.f14806a.u())) {
            str2 = this.f14806a.u();
        }
        arrayList.add(a3.b(str2).a());
        arrayList.add(c.p().a("OM SDK Version").b(this.f14806a.ao().c()).a());
        if (!n.B()) {
            arrayList.add(u());
        }
        return arrayList;
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x00c4  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private java.util.List<com.applovin.impl.mediation.debugger.ui.d.c> r() {
        /*
            r6 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = 4
            r0.<init>(r1)
            com.applovin.impl.mediation.debugger.ui.d.c$a r1 = com.applovin.impl.mediation.debugger.ui.d.c.p()
            java.lang.String r2 = "SDK Version"
            com.applovin.impl.mediation.debugger.ui.d.c$a r1 = r1.a((java.lang.String) r2)
            java.lang.String r2 = com.applovin.sdk.AppLovinSdk.VERSION
            com.applovin.impl.mediation.debugger.ui.d.c$a r1 = r1.b((java.lang.String) r2)
            com.applovin.impl.mediation.debugger.ui.d.c r1 = r1.a()
            r0.add(r1)
            com.applovin.impl.sdk.n r1 = r6.f14806a
            com.applovin.impl.sdk.c.b<java.lang.String> r2 = com.applovin.impl.sdk.c.b.dI
            java.lang.Object r1 = r1.a(r2)
            java.lang.String r1 = (java.lang.String) r1
            com.applovin.impl.mediation.debugger.ui.d.c$a r2 = com.applovin.impl.mediation.debugger.ui.d.c.p()
            java.lang.String r3 = "Plugin Version"
            com.applovin.impl.mediation.debugger.ui.d.c$a r2 = r2.a((java.lang.String) r3)
            boolean r3 = com.applovin.impl.sdk.utils.StringUtils.isValidString(r1)
            java.lang.String r4 = "None"
            if (r3 == 0) goto L_0x003a
            goto L_0x003b
        L_0x003a:
            r1 = r4
        L_0x003b:
            com.applovin.impl.mediation.debugger.ui.d.c$a r1 = r2.b((java.lang.String) r1)
            com.applovin.impl.mediation.debugger.ui.d.c r1 = r1.a()
            r0.add(r1)
            com.applovin.impl.mediation.debugger.ui.d.c$a r1 = com.applovin.impl.mediation.debugger.ui.d.c.p()
            java.lang.String r2 = "Ad Review Version"
            com.applovin.impl.mediation.debugger.ui.d.c$a r1 = r1.a((java.lang.String) r2)
            java.lang.String r2 = com.applovin.impl.sdk.e.a()
            boolean r3 = com.applovin.impl.sdk.utils.StringUtils.isValidString(r2)
            if (r3 == 0) goto L_0x0096
            java.lang.String r3 = com.applovin.impl.sdk.e.b()
            boolean r5 = com.applovin.impl.sdk.utils.StringUtils.isValidString(r3)
            if (r5 == 0) goto L_0x0092
            com.applovin.impl.sdk.n r5 = r6.f14806a
            java.lang.String r5 = r5.C()
            boolean r3 = r3.equals(r5)
            if (r3 == 0) goto L_0x0071
            goto L_0x0092
        L_0x0071:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "MAX Ad Review integrated with wrong SDK key. Please check that your "
            r2.<init>(r3)
            com.applovin.impl.sdk.n r3 = r6.f14806a
            boolean r3 = r3.g()
            if (r3 == 0) goto L_0x0083
            java.lang.String r3 = "SDK key is downloaded"
            goto L_0x0085
        L_0x0083:
            java.lang.String r3 = "Gradle plugin snippet is integrated"
        L_0x0085:
            r2.append(r3)
            java.lang.String r3 = " from the correct account."
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            goto L_0x0098
        L_0x0092:
            r1.b((java.lang.String) r2)
            goto L_0x009b
        L_0x0096:
            java.lang.String r2 = "Integrating MAX Ad review is OPTIONAL. This feature gives developers unprecedented transparency into the creatives the users see in their apps."
        L_0x0098:
            r6.a((com.applovin.impl.mediation.debugger.ui.d.c.a) r1, (java.lang.String) r2)
        L_0x009b:
            com.applovin.impl.mediation.debugger.ui.d.c r1 = r1.a()
            r0.add(r1)
            com.applovin.impl.sdk.n r1 = r6.f14806a
            boolean r1 = r1.g()
            if (r1 == 0) goto L_0x00ce
            com.applovin.impl.sdk.n r1 = r6.f14806a
            com.applovin.sdk.AppLovinSdkSettings r1 = r1.q()
            java.util.Map r1 = com.applovin.impl.sdk.utils.Utils.getMetaData(r1)
            if (r1 == 0) goto L_0x00ce
            java.lang.String r2 = "UnityVersion"
            java.lang.Object r1 = r1.get(r2)
            java.lang.String r1 = (java.lang.String) r1
            boolean r2 = com.applovin.impl.sdk.utils.StringUtils.isValidString(r1)
            if (r2 == 0) goto L_0x00c5
            r4 = r1
        L_0x00c5:
            java.lang.String r1 = "Unity Version"
            com.applovin.impl.mediation.debugger.ui.d.c r1 = r6.b(r1, r4)
            r0.add(r1)
        L_0x00ce:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.mediation.debugger.ui.b.b.r():java.util.List");
    }

    private List<c> s() {
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(new com.applovin.impl.mediation.debugger.ui.b.a.b(k.a(), true, this.f14883c));
        arrayList.add(new com.applovin.impl.mediation.debugger.ui.b.a.b(k.b(), false, this.f14883c));
        arrayList.add(new com.applovin.impl.mediation.debugger.ui.b.a.b(k.c(), true, this.f14883c));
        return arrayList;
    }

    private List<c> t() {
        return a((String) null, (String) null);
    }

    private c u() {
        return c.p().a("Java 8").a(R.drawable.applovin_ic_x_mark).c(g.a(R.color.applovin_sdk_xmarkColor, this.f14883c)).c("Upgrade to Java 8").d("For optimal performance, please enable Java 8 support. This will be required in a future SDK release. See: https://dash.applovin.com/documentation/mediation/android/getting-started/integration").a(true).a();
    }

    /* access modifiers changed from: protected */
    public int a(int i2) {
        return (i2 == C0149b.APP_INFO.ordinal() ? this.r : i2 == C0149b.MAX.ordinal() ? this.s : i2 == C0149b.PRIVACY.ordinal() ? this.t : i2 == C0149b.ADS.ordinal() ? this.u : i2 == C0149b.INCOMPLETE_NETWORKS.ordinal() ? this.v : i2 == C0149b.COMPLETED_NETWORKS.ordinal() ? this.w : this.x).size();
    }

    public void a() {
        AppLovinSdkUtils.runOnUiThread(new Runnable() {
            public void run() {
                b.this.s.add(b.this.b(false));
                b.this.notifyDataSetChanged();
            }
        });
    }

    public void a(final com.applovin.impl.mediation.debugger.b.b.a aVar) {
        AppLovinSdkUtils.runOnUiThread(new Runnable() {
            public void run() {
                List list = aVar.a().get(b.this.f14812h.a());
                b.this.s.add(b.this.b(list != null ? list.contains(b.this.f14812h) : false));
                b.this.notifyDataSetChanged();
            }
        });
    }

    public void a(List<com.applovin.impl.mediation.debugger.b.c.b> list, List<com.applovin.impl.mediation.debugger.b.a.a> list2, List<com.applovin.impl.mediation.debugger.b.a.a> list3, com.applovin.impl.mediation.debugger.b.b.b bVar, String str, String str2, String str3, n nVar) {
        this.f14806a = nVar;
        this.f14807b = list2;
        this.f14808d = list3;
        this.f14812h = bVar;
        this.f14809e = str;
        this.f14810f = str2;
        this.f14811g = str3;
        if (list != null && this.j.compareAndSet(false, true)) {
            nVar.D();
            if (v.a()) {
                nVar.D().b("MediationDebuggerListAdapter", "Populating networks...");
            }
            a(list);
            b(list2);
            c(this.m);
            this.r.addAll(q());
            this.s.addAll(r());
            this.t.addAll(s());
            this.u.addAll(t());
            this.v = d(this.l);
            this.w = d(this.m);
            this.x = d(this.n);
            ArrayList arrayList = new ArrayList(3);
            arrayList.add("privacy_setting_updated");
            arrayList.add("network_sdk_version_updated");
            arrayList.add("live_network_updated");
            arrayList.add("test_mode_network_updated");
            AppLovinCommunicator.getInstance(this.f14883c).subscribe((AppLovinCommunicatorSubscriber) this, (List<String>) arrayList);
            p();
        }
        AppLovinSdkUtils.runOnUiThread(new Runnable() {
            public void run() {
                b.this.notifyDataSetChanged();
            }
        });
    }

    public void a(boolean z) {
        this.k = z;
    }

    /* access modifiers changed from: protected */
    public c b(int i2) {
        return i2 == C0149b.APP_INFO.ordinal() ? new com.applovin.impl.mediation.debugger.ui.d.e("APP INFO") : i2 == C0149b.MAX.ordinal() ? new com.applovin.impl.mediation.debugger.ui.d.e("MAX") : i2 == C0149b.PRIVACY.ordinal() ? new com.applovin.impl.mediation.debugger.ui.d.e("PRIVACY") : i2 == C0149b.ADS.ordinal() ? new com.applovin.impl.mediation.debugger.ui.d.e("ADS") : i2 == C0149b.INCOMPLETE_NETWORKS.ordinal() ? new com.applovin.impl.mediation.debugger.ui.d.e("INCOMPLETE INTEGRATIONS") : i2 == C0149b.COMPLETED_NETWORKS.ordinal() ? new com.applovin.impl.mediation.debugger.ui.d.e("COMPLETED INTEGRATIONS") : new com.applovin.impl.mediation.debugger.ui.d.e("MISSING INTEGRATIONS");
    }

    public boolean b() {
        return this.j.get();
    }

    /* access modifiers changed from: protected */
    public List<c> c(int i2) {
        return i2 == C0149b.APP_INFO.ordinal() ? this.r : i2 == C0149b.MAX.ordinal() ? this.s : i2 == C0149b.PRIVACY.ordinal() ? this.t : i2 == C0149b.ADS.ordinal() ? this.u : i2 == C0149b.INCOMPLETE_NETWORKS.ordinal() ? this.v : i2 == C0149b.COMPLETED_NETWORKS.ordinal() ? this.w : this.x;
    }

    public boolean c() {
        return this.k;
    }

    public n d() {
        return this.f14806a;
    }

    /* access modifiers changed from: protected */
    public int e() {
        return C0149b.f14830h.ordinal();
    }

    public List<com.applovin.impl.mediation.debugger.b.a.a> f() {
        return this.f14807b;
    }

    public List<com.applovin.impl.mediation.debugger.b.a.a> g() {
        return this.f14808d;
    }

    public String getCommunicatorId() {
        return "MediationDebuggerListAdapter";
    }

    public String h() {
        return this.f14809e;
    }

    public String i() {
        return this.f14810f;
    }

    public List<com.applovin.impl.mediation.debugger.b.a.d> j() {
        return this.o;
    }

    public List<com.applovin.impl.mediation.debugger.b.a.d> k() {
        return this.p;
    }

    public List<com.applovin.impl.mediation.debugger.b.c.b> l() {
        return this.q;
    }

    public String m() {
        return this.i.toString();
    }

    public void onMessageReceived(AppLovinCommunicatorMessage appLovinCommunicatorMessage) {
        List<c> a2;
        if ("privacy_setting_updated".equals(appLovinCommunicatorMessage.getTopic())) {
            this.t = s();
        } else if ("network_sdk_version_updated".equals(appLovinCommunicatorMessage.getTopic())) {
            this.v = d(this.l);
            this.w = d(this.m);
        } else {
            if ("live_network_updated".equals(appLovinCommunicatorMessage.getTopic())) {
                a2 = a(appLovinCommunicatorMessage.getMessageData().getString("live_network", (String) null), (String) null);
            } else if ("test_mode_network_updated".equals(appLovinCommunicatorMessage.getTopic())) {
                a2 = a((String) null, appLovinCommunicatorMessage.getMessageData().getString("test_mode_network", (String) null));
            } else {
                return;
            }
            this.u = a2;
        }
        n();
    }

    public String toString() {
        return "MediationDebuggerListAdapter{isInitialized=" + this.j.get() + "}";
    }
}
