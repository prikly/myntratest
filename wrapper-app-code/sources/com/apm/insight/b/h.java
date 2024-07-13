package com.apm.insight.b;

import android.os.Looper;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import com.apm.insight.runtime.g;
import com.apm.insight.runtime.u;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.onesignal.outcomes.OSOutcomeConstants;
import com.onesignal.shortcutbadger.impl.NewHtcHomeBadger;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class h {

    /* renamed from: b  reason: collision with root package name */
    public static boolean f10476b = false;
    /* access modifiers changed from: private */
    public static int t = 2;

    /* renamed from: a  reason: collision with root package name */
    c f10477a;

    /* renamed from: c  reason: collision with root package name */
    private int f10478c;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public volatile int f10479d;

    /* renamed from: e  reason: collision with root package name */
    private int f10480e;

    /* renamed from: f  reason: collision with root package name */
    private int f10481f;

    /* renamed from: g  reason: collision with root package name */
    private f f10482g;
    /* access modifiers changed from: private */

    /* renamed from: h  reason: collision with root package name */
    public b f10483h;
    private long i;
    private long j;
    private int k;
    private long l;
    /* access modifiers changed from: private */
    public String m;
    /* access modifiers changed from: private */
    public String n;
    private e o;
    private volatile boolean p;
    private boolean q;
    /* access modifiers changed from: private */
    public final u r;
    /* access modifiers changed from: private */
    public volatile boolean s;
    /* access modifiers changed from: private */
    public Runnable u;

    private static class a {

        /* renamed from: a  reason: collision with root package name */
        long f10492a;

        /* renamed from: b  reason: collision with root package name */
        long f10493b;

        /* renamed from: c  reason: collision with root package name */
        long f10494c;

        /* renamed from: d  reason: collision with root package name */
        boolean f10495d;

        /* renamed from: e  reason: collision with root package name */
        int f10496e;

        /* renamed from: f  reason: collision with root package name */
        StackTraceElement[] f10497f;

        private a() {
        }

        /* access modifiers changed from: package-private */
        public void a() {
            this.f10492a = -1;
            this.f10493b = -1;
            this.f10494c = -1;
            this.f10496e = -1;
            this.f10497f = null;
        }
    }

    private static class b {

        /* renamed from: a  reason: collision with root package name */
        final int f10498a;

        /* renamed from: b  reason: collision with root package name */
        a f10499b;

        /* renamed from: c  reason: collision with root package name */
        final List<a> f10500c;

        /* renamed from: d  reason: collision with root package name */
        private int f10501d = 0;

        public b(int i) {
            this.f10498a = i;
            this.f10500c = new ArrayList(i);
        }

        /* access modifiers changed from: package-private */
        public a a() {
            a aVar = this.f10499b;
            if (aVar == null) {
                return new a();
            }
            this.f10499b = null;
            return aVar;
        }

        /* access modifiers changed from: package-private */
        public void a(a aVar) {
            int i;
            int size = this.f10500c.size();
            int i2 = this.f10498a;
            if (size < i2) {
                this.f10500c.add(aVar);
                i = this.f10500c.size();
            } else {
                int i3 = this.f10501d % i2;
                this.f10501d = i3;
                a aVar2 = this.f10500c.set(i3, aVar);
                aVar2.a();
                this.f10499b = aVar2;
                i = this.f10501d + 1;
            }
            this.f10501d = i;
        }
    }

    public interface c {
    }

    public static class d {

        /* renamed from: a  reason: collision with root package name */
        long f10502a;

        /* renamed from: b  reason: collision with root package name */
        long f10503b;

        /* renamed from: c  reason: collision with root package name */
        long f10504c;

        /* renamed from: d  reason: collision with root package name */
        long f10505d;

        /* renamed from: e  reason: collision with root package name */
        long f10506e;
    }

    public static class e {

        /* renamed from: a  reason: collision with root package name */
        public long f10507a;

        /* renamed from: b  reason: collision with root package name */
        long f10508b;

        /* renamed from: c  reason: collision with root package name */
        long f10509c;

        /* renamed from: d  reason: collision with root package name */
        int f10510d;

        /* renamed from: e  reason: collision with root package name */
        int f10511e;

        /* renamed from: f  reason: collision with root package name */
        long f10512f;

        /* renamed from: g  reason: collision with root package name */
        long f10513g;

        /* renamed from: h  reason: collision with root package name */
        String f10514h;
        public String i;
        String j;
        d k;

        private void a(JSONObject jSONObject) {
            jSONObject.put("block_uuid", this.j);
            jSONObject.put("sblock_uuid", this.j);
            jSONObject.put("belong_frame", this.k != null);
            d dVar = this.k;
            if (dVar != null) {
                jSONObject.put("vsyncDelayTime", this.f10509c - (dVar.f10502a / 1000000));
                jSONObject.put("doFrameTime", (this.k.f10503b / 1000000) - this.f10509c);
                jSONObject.put("inputHandlingTime", (this.k.f10504c / 1000000) - (this.k.f10503b / 1000000));
                jSONObject.put("animationsTime", (this.k.f10505d / 1000000) - (this.k.f10504c / 1000000));
                jSONObject.put("performTraversalsTime", (this.k.f10506e / 1000000) - (this.k.f10505d / 1000000));
                jSONObject.put("drawTime", this.f10508b - (this.k.f10506e / 1000000));
            }
        }

        public JSONObject a() {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("msg", h.a(this.f10514h));
                jSONObject.put("cpuDuration", this.f10513g);
                jSONObject.put(IronSourceConstants.EVENTS_DURATION, this.f10512f);
                jSONObject.put("type", this.f10510d);
                jSONObject.put(NewHtcHomeBadger.COUNT, this.f10511e);
                jSONObject.put("messageCount", this.f10511e);
                jSONObject.put("lastDuration", this.f10508b - this.f10509c);
                jSONObject.put("start", this.f10507a);
                jSONObject.put("end", this.f10508b);
                a(jSONObject);
            } catch (JSONException e2) {
                e2.printStackTrace();
            }
            return jSONObject;
        }

        /* access modifiers changed from: package-private */
        public void b() {
            this.f10510d = -1;
            this.f10511e = -1;
            this.f10512f = -1;
            this.f10514h = null;
            this.j = null;
            this.k = null;
            this.i = null;
        }
    }

    private static class f {

        /* renamed from: a  reason: collision with root package name */
        int f10515a;

        /* renamed from: b  reason: collision with root package name */
        int f10516b;

        /* renamed from: c  reason: collision with root package name */
        e f10517c;

        /* renamed from: d  reason: collision with root package name */
        List<e> f10518d = new ArrayList();

        f(int i) {
            this.f10515a = i;
        }

        /* access modifiers changed from: package-private */
        public e a(int i) {
            e eVar = this.f10517c;
            if (eVar != null) {
                eVar.f10510d = i;
                e eVar2 = this.f10517c;
                this.f10517c = null;
                return eVar2;
            }
            e eVar3 = new e();
            eVar3.f10510d = i;
            return eVar3;
        }

        /* access modifiers changed from: package-private */
        public List<e> a() {
            ArrayList arrayList = new ArrayList();
            int i = 0;
            if (this.f10518d.size() == this.f10515a) {
                for (int i2 = this.f10516b; i2 < this.f10518d.size(); i2++) {
                    arrayList.add(this.f10518d.get(i2));
                }
                while (i < this.f10516b - 1) {
                    arrayList.add(this.f10518d.get(i));
                    i++;
                }
            } else {
                while (i < this.f10518d.size()) {
                    arrayList.add(this.f10518d.get(i));
                    i++;
                }
            }
            return arrayList;
        }

        /* access modifiers changed from: package-private */
        public void a(e eVar) {
            int i;
            int size = this.f10518d.size();
            int i2 = this.f10515a;
            if (size < i2) {
                this.f10518d.add(eVar);
                i = this.f10518d.size();
            } else {
                int i3 = this.f10516b % i2;
                this.f10516b = i3;
                e eVar2 = this.f10518d.set(i3, eVar);
                eVar2.b();
                this.f10517c = eVar2;
                i = this.f10516b + 1;
            }
            this.f10516b = i;
        }
    }

    public h(int i2) {
        this(i2, false);
    }

    public h(int i2, boolean z) {
        this.f10478c = 0;
        this.f10479d = 0;
        this.f10480e = 100;
        this.f10481f = 200;
        this.i = -1;
        this.j = -1;
        this.k = -1;
        this.l = -1;
        this.p = false;
        this.q = false;
        this.s = false;
        this.u = new Runnable() {

            /* renamed from: b  reason: collision with root package name */
            private long f10486b = 0;

            /* renamed from: c  reason: collision with root package name */
            private long f10487c;

            /* renamed from: d  reason: collision with root package name */
            private int f10488d = -1;

            /* renamed from: e  reason: collision with root package name */
            private int f10489e = 0;

            /* renamed from: f  reason: collision with root package name */
            private int f10490f = 0;

            public void run() {
                long uptimeMillis = SystemClock.uptimeMillis();
                a a2 = h.this.f10483h.a();
                if (this.f10488d == h.this.f10479d) {
                    this.f10489e++;
                } else {
                    this.f10489e = 0;
                    this.f10490f = 0;
                    this.f10487c = uptimeMillis;
                }
                this.f10488d = h.this.f10479d;
                int i = this.f10489e;
                if (i > 0 && i - this.f10490f >= h.t && this.f10486b != 0 && uptimeMillis - this.f10487c > 700 && h.this.s) {
                    a2.f10497f = Looper.getMainLooper().getThread().getStackTrace();
                    this.f10490f = this.f10489e;
                }
                a2.f10495d = h.this.s;
                a2.f10494c = (uptimeMillis - this.f10486b) - 300;
                a2.f10492a = uptimeMillis;
                long uptimeMillis2 = SystemClock.uptimeMillis();
                this.f10486b = uptimeMillis2;
                a2.f10493b = uptimeMillis2 - uptimeMillis;
                a2.f10496e = h.this.f10479d;
                h.this.r.a(h.this.u, 300);
                h.this.f10483h.a(a2);
            }
        };
        this.f10477a = new c() {
        };
        if (z || f10476b) {
            u uVar = new u("looper_monitor");
            this.r = uVar;
            uVar.b();
            this.f10483h = new b(ms.bd.o.Pgl.c.COLLECT_MODE_FINANCE);
            this.r.a(this.u, 300);
            return;
        }
        this.r = null;
    }

    private static long a(int i2) {
        if (i2 < 0) {
            return 0;
        }
        try {
            return g.a(i2);
        } catch (Throwable unused) {
            return 0;
        }
    }

    public static String a(String str) {
        if (TextUtils.isEmpty(str)) {
            return "unknown message";
        }
        try {
            String[] split = str.split(":");
            String str2 = split.length == 2 ? split[1] : "";
            if (!str.contains("{") || !str.contains("}")) {
                String str3 = str;
            } else {
                String str4 = str.split("\\{")[0];
                try {
                    str = str4 + str.split("\\}")[1];
                } catch (Throwable unused) {
                    return str4;
                }
            }
            if (str.contains("@")) {
                String[] split2 = str.split("@");
                if (split2.length > 1) {
                    str = split2[0];
                }
            }
            if (str.contains("(") && str.contains(")") && !str.endsWith(" null")) {
                String[] split3 = str.split("\\(");
                if (split3.length > 1) {
                    str = split3[1];
                }
                str = str.replace(")", "");
            }
            if (str.startsWith(" ")) {
                str = str.replace(" ", "");
            }
            return str + str2;
        } catch (Throwable unused2) {
            return str;
        }
    }

    private void a(int i2, long j2, String str) {
        a(i2, j2, str, true);
    }

    private void a(int i2, long j2, String str, boolean z) {
        this.q = true;
        e a2 = this.f10482g.a(i2);
        a2.f10512f = j2 - this.i;
        if (z) {
            long currentThreadTimeMillis = SystemClock.currentThreadTimeMillis();
            a2.f10513g = currentThreadTimeMillis - this.l;
            this.l = currentThreadTimeMillis;
        } else {
            a2.f10513g = -1;
        }
        a2.f10511e = this.f10478c;
        a2.f10514h = str;
        a2.i = this.m;
        a2.f10507a = this.i;
        a2.f10508b = j2;
        a2.f10509c = this.j;
        this.f10482g.a(a2);
        this.f10478c = 0;
        this.i = j2;
    }

    /* access modifiers changed from: private */
    public void a(boolean z, long j2) {
        boolean z2;
        String str;
        int i2;
        h hVar;
        int i3 = this.f10479d + 1;
        this.f10479d = i3;
        this.f10479d = i3 & 65535;
        this.q = false;
        if (this.i < 0) {
            this.i = j2;
        }
        if (this.j < 0) {
            this.j = j2;
        }
        if (this.k < 0) {
            this.k = Process.myTid();
            this.l = SystemClock.currentThreadTimeMillis();
        }
        int i4 = this.f10481f;
        if (j2 - this.i > ((long) i4)) {
            long j3 = this.j;
            if (j2 - j3 > ((long) i4)) {
                if (z) {
                    if (this.f10478c == 0) {
                        a(1, j2, "no message running");
                    } else {
                        a(9, j3, this.m);
                        i2 = 1;
                        z2 = false;
                        str = "no message running";
                    }
                } else if (this.f10478c == 0) {
                    i2 = 8;
                    str = this.n;
                    z2 = true;
                } else {
                    hVar = this;
                    hVar.a(9, j3, this.m, false);
                    i2 = 8;
                    str = this.n;
                    z2 = true;
                    hVar.a(i2, j2, str, z2);
                }
                hVar = this;
                hVar.a(i2, j2, str, z2);
            } else {
                a(9, j2, this.n);
            }
        }
        this.j = j2;
    }

    private void e() {
        this.f10480e = 100;
        this.f10481f = ms.bd.o.Pgl.c.COLLECT_MODE_FINANCE;
    }

    static /* synthetic */ int f(h hVar) {
        int i2 = hVar.f10478c;
        hVar.f10478c = i2 + 1;
        return i2;
    }

    public e a(long j2) {
        e eVar = new e();
        eVar.f10514h = this.n;
        eVar.i = this.m;
        eVar.f10512f = j2 - this.j;
        eVar.f10513g = a(this.k) - this.l;
        eVar.f10511e = this.f10478c;
        return eVar;
    }

    public void a() {
        if (!this.p) {
            this.p = true;
            e();
            this.f10482g = new f(this.f10480e);
            this.o = new e() {
                public void a(String str) {
                    boolean unused = h.this.s = true;
                    String unused2 = h.this.n = str;
                    super.a(str);
                    h.this.a(true, e.f10467a);
                }

                public boolean a() {
                    return true;
                }

                public void b(String str) {
                    super.b(str);
                    h.f(h.this);
                    h.this.a(false, e.f10467a);
                    h hVar = h.this;
                    String unused = hVar.m = hVar.n;
                    String unused2 = h.this.n = "no message running";
                    boolean unused3 = h.this.s = false;
                }
            };
            i.a();
            i.a(this.o);
            k.a(k.a());
        }
    }

    /* access modifiers changed from: package-private */
    public void b() {
        a();
    }

    public JSONArray c() {
        JSONArray jSONArray = new JSONArray();
        try {
            List<e> a2 = this.f10482g.a();
            if (a2 == null) {
                return jSONArray;
            }
            int i2 = 0;
            for (e next : a2) {
                if (next != null) {
                    i2++;
                    jSONArray.put(next.a().put(OSOutcomeConstants.OUTCOME_ID, i2));
                }
            }
            return jSONArray;
        } catch (Throwable unused) {
        }
    }
}
