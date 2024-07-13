package com.ironsource.mediationsdk.a;

import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import android.text.TextUtils;
import android.util.Base64;
import com.appodeal.ads.modules.common.internal.Constants;
import com.ironsource.environment.a;
import com.ironsource.environment.e.c;
import com.ironsource.mediationsdk.H;
import com.ironsource.mediationsdk.IronSourceSegment;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.model.p;
import com.ironsource.mediationsdk.sdk.e;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

public abstract class b {
    private int A = 1024;
    private int B = 5;
    private String C = "supersonic_sdk.db";
    private String D = IronSourceConstants.EVENTS_PROVIDER;
    private String E = IronSourceConstants.EVENTS_PLACEMENT_NAME;
    private final String F = "abt";
    private final String G = "mt";
    private a H;
    private int I = 5000;
    private int[] J;
    private Map<String, String> K = new HashMap();
    private p L;
    private final Object M = new Object();

    /* renamed from: a  reason: collision with root package name */
    public boolean f8401a;

    /* renamed from: b  reason: collision with root package name */
    boolean f8402b = false;

    /* renamed from: c  reason: collision with root package name */
    public boolean f8403c = false;

    /* renamed from: d  reason: collision with root package name */
    com.ironsource.b.a f8404d;

    /* renamed from: e  reason: collision with root package name */
    ArrayList<c> f8405e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f8406f = true;

    /* renamed from: g  reason: collision with root package name */
    int f8407g;

    /* renamed from: h  reason: collision with root package name */
    String f8408h;
    Context i;
    int j = 100;
    int k = 1;
    int[] l;
    int[] m;
    int[] n;
    Map<String, String> o = new HashMap();
    public String p = "";
    int q;
    String r;
    String s;
    Set<Integer> t;
    C0084b u;
    public IronSourceSegment v;
    private int w = 1;
    private int x = 100;
    private int y = 5000;
    private int z = Constants.VIDEO_MAX_DURATION;

    public enum a {
        NOT_SUPPORTED(-1),
        OFFERWALL(1),
        INTERSTITIAL(2),
        REWARDED_VIDEO(3),
        BANNER(8);
        

        /* renamed from: f  reason: collision with root package name */
        int f8422f;

        private a(int i) {
            this.f8422f = i;
        }
    }

    /* renamed from: com.ironsource.mediationsdk.a.b$b  reason: collision with other inner class name */
    class C0084b extends HandlerThread {

        /* renamed from: a  reason: collision with root package name */
        Handler f8423a;

        C0084b(String str) {
            super(str);
        }

        /* access modifiers changed from: package-private */
        public final void a(Runnable runnable) {
            this.f8423a.post(runnable);
        }
    }

    private ArrayList<c> a(ArrayList<c> arrayList, ArrayList<c> arrayList2, int i2) {
        ArrayList<c> arrayList3 = new ArrayList<>();
        try {
            ArrayList arrayList4 = new ArrayList();
            arrayList4.addAll(arrayList);
            arrayList4.addAll(arrayList2);
            Collections.sort(arrayList4, new Comparator<c>() {
                public final /* synthetic */ int compare(Object obj, Object obj2) {
                    return ((c) obj).b() >= ((c) obj2).b() ? 1 : -1;
                }
            });
            if (arrayList4.size() <= i2) {
                arrayList3.addAll(arrayList4);
            } else {
                arrayList3.addAll(arrayList4.subList(0, i2));
                this.f8404d.a(arrayList4.subList(i2, arrayList4.size()), this.s);
            }
        } catch (Exception e2) {
            IronLog ironLog = IronLog.INTERNAL;
            ironLog.error("CombinedEventList exception: " + e2.getMessage());
        }
        return arrayList3;
    }

    static /* synthetic */ void a(b bVar, c cVar, String str) {
        JSONObject d2 = cVar.d();
        if (d2 != null && d2.has(str)) {
            try {
                String optString = d2.optString(str, (String) null);
                if (optString != null) {
                    cVar.a(str, (Object) optString.substring(0, Math.min(optString.length(), 1024)));
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }

    private void a(String str) {
        a aVar = this.H;
        if (aVar == null || !aVar.c().equals(str)) {
            this.H = c.a(str, this.q);
        }
    }

    public static void a(Map<String, Object> map, int i2, String str) {
        map.put(IronSourceConstants.AUCTION_TRIALS, Integer.valueOf(i2));
        if (!TextUtils.isEmpty(str)) {
            map.put(IronSourceConstants.AUCTION_FALLBACK, str);
        }
    }

    static boolean a(int[] iArr) {
        return iArr != null && iArr.length > 0;
    }

    protected static int e(int i2) {
        a aVar;
        int i3 = a.NOT_SUPPORTED.f8422f;
        if (i2 == 15 || (i2 >= 300 && i2 < 400)) {
            aVar = a.OFFERWALL;
        } else if ((i2 >= 1000 && i2 < 2000) || (i2 >= 91000 && i2 < 92000)) {
            aVar = a.REWARDED_VIDEO;
        } else if ((i2 >= 2000 && i2 < 3000) || (i2 >= 92000 && i2 < 93000)) {
            aVar = a.INTERSTITIAL;
        } else if ((i2 < 3000 || i2 >= 4000) && (i2 < 93000 || i2 >= 94000)) {
            return i3;
        } else {
            aVar = a.BANNER;
        }
        return aVar.f8422f;
    }

    /* access modifiers changed from: private */
    public void e() {
        ArrayList<c> a2;
        this.f8402b = false;
        synchronized (this.M) {
            a2 = a(this.f8405e, this.f8404d.a(this.s), this.I);
            if (a2.size() > 0) {
                this.f8405e.clear();
                this.f8404d.b(this.s);
            }
        }
        if (a2.size() > 0) {
            this.f8407g = 0;
            JSONObject b2 = e.a().b();
            try {
                if (this.v != null) {
                    if (this.v.getAge() > 0) {
                        b2.put(IronSourceSegment.AGE, this.v.getAge());
                    }
                    if (!TextUtils.isEmpty(this.v.getGender())) {
                        b2.put(IronSourceSegment.GENDER, this.v.getGender());
                    }
                    if (this.v.getLevel() > 0) {
                        b2.put(IronSourceSegment.LEVEL, this.v.getLevel());
                    }
                    if (this.v.getIsPaying() != null) {
                        b2.put(IronSourceSegment.PAYING, this.v.getIsPaying().get());
                    }
                    if (this.v.getIapt() > 0.0d) {
                        b2.put(IronSourceSegment.IAPT, this.v.getIapt());
                    }
                    if (this.v.getUcd() > 0) {
                        b2.put(IronSourceSegment.USER_CREATION_DATE, this.v.getUcd());
                    }
                }
                if (this.L != null) {
                    String str = this.L.f8798b;
                    if (!TextUtils.isEmpty(str)) {
                        b2.put("segmentId", str);
                    }
                    JSONObject jSONObject = this.L.f8799c;
                    Iterator<String> keys = jSONObject.keys();
                    while (keys.hasNext()) {
                        String next = keys.next();
                        b2.put(next, jSONObject.get(next));
                    }
                }
            } catch (JSONException e2) {
                try {
                    e2.printStackTrace();
                } catch (JSONException e3) {
                    e3.printStackTrace();
                }
            }
            String str2 = this.p;
            if (!TextUtils.isEmpty(str2)) {
                b2.put("abt", str2);
            }
            String str3 = H.a().o;
            if (!TextUtils.isEmpty(str3)) {
                b2.put("mt", str3);
            }
            Map<String, String> map = this.K;
            if (!map.isEmpty()) {
                for (Map.Entry next2 : map.entrySet()) {
                    if (!b2.has((String) next2.getKey())) {
                        b2.put((String) next2.getKey(), next2.getValue());
                    }
                }
            }
            com.ironsource.environment.b.b bVar = new com.ironsource.environment.b.b();
            JSONObject a3 = bVar.f8040b.a(bVar.f8039a);
            Intrinsics.checkNotNullExpressionValue(a3, "mGlobalDataReader.getDataByKeys(mEventsKeyList)");
            Iterator<String> keys2 = a3.keys();
            while (keys2.hasNext()) {
                String next3 = keys2.next();
                b2.put(next3, a3.get(next3));
            }
            String a4 = this.H.a(a2, b2);
            if (TextUtils.isEmpty(a4)) {
                IronLog.INTERNAL.error("Failed to parse events. Saving them back to storage.");
                a(a2);
                return;
            }
            if (this.f8403c) {
                try {
                    a4 = Base64.encodeToString(a.AnonymousClass1.b(a4), 0);
                } catch (Exception e4) {
                    e4.printStackTrace();
                }
            }
            c.f8074a.c(new com.ironsource.b.b(new com.ironsource.b.c() {
                public final synchronized void a(final ArrayList<c> arrayList, final boolean z) {
                    b.this.u.a(new Runnable() {
                        public final void run() {
                            if (z) {
                                ArrayList<c> a2 = b.this.f8404d.a(b.this.s);
                                b.this.f8407g = a2.size() + b.this.f8405e.size();
                                return;
                            }
                            IronLog.INTERNAL.error("Failed to send events. Saving them back to storage.");
                            b.this.a((ArrayList<c>) arrayList);
                        }
                    });
                }
            }, a4, this.H.a(), a2));
        }
    }

    /* access modifiers changed from: package-private */
    public synchronized int a(c cVar) {
        return cVar.a() + Constants.VIDEO_MAX_DURATION;
    }

    /* access modifiers changed from: package-private */
    public final void a() {
        this.f8405e = new ArrayList<>();
        this.f8407g = 0;
        this.H = c.a(this.r, this.q);
        C0084b bVar = new C0084b(this.s + "EventThread");
        this.u = bVar;
        bVar.start();
        C0084b bVar2 = this.u;
        bVar2.f8423a = new Handler(bVar2.getLooper());
        this.f8408h = IronSourceUtils.getSessionId();
        this.t = new HashSet();
        b();
    }

    public final void a(int i2) {
        if (i2 > 0) {
            this.k = i2;
        }
    }

    public final synchronized void a(Context context, IronSourceSegment ironSourceSegment) {
        String defaultEventsFormatterType = IronSourceUtils.getDefaultEventsFormatterType(context, this.s, this.r);
        this.r = defaultEventsFormatterType;
        a(defaultEventsFormatterType);
        this.H.f8395c = IronSourceUtils.getDefaultEventsURL(context, this.s, (String) null);
        this.f8404d = com.ironsource.b.a.a(context, "supersonic_sdk.db", 5);
        c();
        this.l = IronSourceUtils.getDefaultOptOutEvents(context, this.s);
        this.m = IronSourceUtils.getDefaultOptInEvents(context, this.s);
        this.n = IronSourceUtils.getDefaultTriggerEvents(context, this.s);
        this.J = IronSourceUtils.getDefaultNonConnectivityEvents(context, this.s);
        this.v = ironSourceSegment;
        this.i = context;
    }

    public final synchronized void a(p pVar) {
        this.L = pVar;
    }

    public final void a(String str, Context context) {
        if (!TextUtils.isEmpty(str)) {
            a aVar = this.H;
            if (aVar != null) {
                aVar.f8395c = str;
            }
            IronSourceUtils.saveDefaultEventsURL(context, this.s, str);
        }
    }

    /* access modifiers changed from: protected */
    public void a(ArrayList<c> arrayList) {
        if (arrayList != null) {
            synchronized (this.M) {
                this.f8404d.a(arrayList, this.s);
                this.f8407g = this.f8404d.a(this.s).size() + this.f8405e.size();
            }
        }
    }

    public final void a(Map<String, String> map) {
        this.K.putAll(map);
    }

    public final void a(int[] iArr, Context context) {
        this.l = iArr;
        IronSourceUtils.saveDefaultOptOutEvents(context, this.s, iArr);
    }

    /* access modifiers changed from: package-private */
    public boolean a(int i2, int[] iArr) {
        if (!a(iArr)) {
            return false;
        }
        for (int i3 : iArr) {
            if (i2 == i3) {
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x002e, code lost:
        return a(r1.J) ? a(r3.a(), r1.J) : r1.t.contains(java.lang.Integer.valueOf(r3.a()));
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized boolean a(java.lang.String r2, com.ironsource.mediationsdk.a.c r3) {
        /*
            r1 = this;
            monitor-enter(r1)
            java.lang.String r0 = "none"
            boolean r2 = r2.equalsIgnoreCase(r0)     // Catch:{ all -> 0x002f }
            if (r2 != 0) goto L_0x000c
            r2 = 0
            monitor-exit(r1)
            return r2
        L_0x000c:
            int[] r2 = r1.J     // Catch:{ all -> 0x002f }
            boolean r2 = a((int[]) r2)     // Catch:{ all -> 0x002f }
            if (r2 == 0) goto L_0x001f
            int r2 = r3.a()     // Catch:{ all -> 0x002f }
            int[] r3 = r1.J     // Catch:{ all -> 0x002f }
            boolean r2 = r1.a((int) r2, (int[]) r3)     // Catch:{ all -> 0x002f }
            goto L_0x002d
        L_0x001f:
            java.util.Set<java.lang.Integer> r2 = r1.t     // Catch:{ all -> 0x002f }
            int r3 = r3.a()     // Catch:{ all -> 0x002f }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{ all -> 0x002f }
            boolean r2 = r2.contains(r3)     // Catch:{ all -> 0x002f }
        L_0x002d:
            monitor-exit(r1)
            return r2
        L_0x002f:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.mediationsdk.a.b.a(java.lang.String, com.ironsource.mediationsdk.a.c):boolean");
    }

    /* access modifiers changed from: protected */
    public void b() {
    }

    public final void b(int i2) {
        if (i2 > 0) {
            this.j = i2;
        }
    }

    public final synchronized void b(final c cVar) {
        this.u.a(new Runnable() {
            public final void run() {
                if (cVar != null && b.this.f8406f) {
                    cVar.a("eventSessionId", (Object) b.this.f8408h);
                    String connectionType = IronSourceUtils.getConnectionType(b.this.i);
                    if (b.this.g(cVar)) {
                        cVar.a("connectionType", (Object) connectionType);
                    }
                    if (b.this.a(connectionType, cVar)) {
                        c cVar = cVar;
                        cVar.a(b.this.a(cVar));
                    }
                    int e2 = b.e(cVar.a());
                    if (e2 != a.NOT_SUPPORTED.f8422f) {
                        cVar.a("adUnit", (Object) Integer.valueOf(e2));
                    }
                    b.a(b.this, cVar, IronSourceConstants.EVENTS_ERROR_REASON);
                    b.a(b.this, cVar, IronSourceConstants.EVENTS_EXT1);
                    if (!b.this.o.isEmpty()) {
                        for (Map.Entry next : b.this.o.entrySet()) {
                            if (!(cVar.d().has((String) next.getKey()) || next.getKey() == "eventId" || next.getKey() == "timestamp")) {
                                cVar.a((String) next.getKey(), next.getValue());
                            }
                        }
                    }
                    b bVar = b.this;
                    c cVar2 = cVar;
                    boolean z = false;
                    if (cVar2 != null ? b.a(bVar.l) ? !bVar.a(cVar2.a(), bVar.l) : b.a(bVar.m) ? bVar.a(cVar2.a(), bVar.m) : true : false) {
                        if (b.this.f(cVar)) {
                            JSONObject d2 = cVar.d();
                            if (!(d2 == null ? false : d2.has(IronSourceConstants.KEY_SESSION_DEPTH))) {
                                cVar.a(IronSourceConstants.KEY_SESSION_DEPTH, (Object) Integer.valueOf(b.this.e(cVar)));
                            }
                        }
                        if (!TextUtils.isEmpty(b.this.d(cVar.a())) && b.this.c(cVar)) {
                            c cVar3 = cVar;
                            cVar3.a(IronSourceConstants.EVENTS_PLACEMENT_NAME, (Object) b.this.d(cVar3.a()));
                        }
                        long firstSessionTimestamp = IronSourceUtils.getFirstSessionTimestamp(b.this.i);
                        if (firstSessionTimestamp != -1) {
                            cVar.a(IronSourceConstants.FIRST_SESSION_TIMESTAMP, (Object) Long.valueOf(firstSessionTimestamp));
                        }
                        try {
                            IronLog.EVENT.verbose(("{\"eventId\":" + cVar.a() + ",\"timestamp\":" + cVar.b() + "," + cVar.c().substring(1)).replace(",", "\n"));
                        } catch (Exception e3) {
                            e3.printStackTrace();
                        }
                        b.this.f8405e.add(cVar);
                        b.this.f8407g++;
                    }
                    boolean a2 = b.a(b.this.n) ? b.this.a(cVar.a(), b.this.n) : b.this.d(cVar);
                    if (!b.this.f8402b && a2) {
                        b.this.f8402b = true;
                    }
                    if (b.this.f8404d != null) {
                        b bVar2 = b.this;
                        if ((bVar2.f8407g >= bVar2.j || bVar2.f8402b) && bVar2.f8401a) {
                            b.this.e();
                            return;
                        }
                        b bVar3 = b.this;
                        ArrayList<c> arrayList = bVar3.f8405e;
                        if (arrayList != null && arrayList.size() >= bVar3.k) {
                            z = true;
                        }
                        if (z || a2) {
                            b.this.c();
                        }
                    }
                }
            }
        });
    }

    public final void b(String str, Context context) {
        if (!TextUtils.isEmpty(str)) {
            this.r = str;
            IronSourceUtils.saveDefaultEventsFormatterType(context, this.s, str);
            a(str);
        }
    }

    public final void b(Map<String, String> map) {
        this.o.putAll(map);
    }

    public final void b(int[] iArr, Context context) {
        this.m = iArr;
        IronSourceUtils.saveDefaultOptInEvents(context, this.s, iArr);
    }

    /* access modifiers changed from: package-private */
    public void c() {
        synchronized (this.M) {
            this.f8404d.a(this.f8405e, this.s);
            this.f8405e.clear();
        }
    }

    public final void c(int i2) {
        if (i2 > 0) {
            this.I = i2;
        }
    }

    public final void c(int[] iArr, Context context) {
        this.n = iArr;
        IronSourceUtils.saveDefaultTriggerEvents(context, this.s, iArr);
    }

    /* access modifiers changed from: protected */
    public abstract boolean c(c cVar);

    /* access modifiers changed from: protected */
    public abstract String d(int i2);

    public final void d() {
        e();
    }

    public final void d(int[] iArr, Context context) {
        this.J = iArr;
        IronSourceUtils.saveDefaultNonConnectivityEvents(context, this.s, iArr);
    }

    /* access modifiers changed from: protected */
    public abstract boolean d(c cVar);

    /* access modifiers changed from: protected */
    public abstract int e(c cVar);

    /* access modifiers changed from: protected */
    public boolean f(c cVar) {
        return (cVar.a() == 14 || cVar.a() == 114 || cVar.a() == 514 || cVar.a() == 140 || cVar.a() == 40 || cVar.a() == 41 || cVar.a() == 50 || cVar.a() == 51 || cVar.a() == 52) ? false : true;
    }

    /* access modifiers changed from: protected */
    public boolean g(c cVar) {
        return (cVar.a() == 40 || cVar.a() == 41 || cVar.a() == 50 || cVar.a() == 51 || cVar.a() == 52) ? false : true;
    }
}
